package com.pacsun.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.IllegalObjectTypeException;
import com.ibm.as400.access.KeyedDataQueue;
import com.ibm.as400.access.ObjectDoesNotExistException;
import com.pacsun.util.StackTrace;

public class UpdateDWInventoryProcess {

	private Properties prop;
	private KeyedDataQueue responseDataQueue;

	private static final Logger log = Logger
			.getLogger(UpdateDWInventoryProcess.class);

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void run(String mode, String productId, String count,
			String reference, String dataQueueKey) throws Exception {
		try {

			String urlString = "";
			String secretPhrase = "";

			HttpClient client = new DefaultHttpClient();

			HttpPost post = new HttpPost(prop.getProperty(urlString));

			List nameValuePairs = new ArrayList(1);

			nameValuePairs.add(new BasicNameValuePair("secretPhrase", prop
					.getProperty(secretPhrase)));
			nameValuePairs.add(new BasicNameValuePair("mode", mode));
			nameValuePairs.add(new BasicNameValuePair("productID", productId));
			nameValuePairs.add(new BasicNameValuePair("count", count));
			nameValuePairs.add(new BasicNameValuePair("reference", reference));

			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			HttpResponse response = client.execute(post);

			int httpStatusCode = response.getStatusLine().getStatusCode();

			if (httpStatusCode == 200) {

				String xmlString = this.getResponseXml(response);

				SAXBuilder builder = new SAXBuilder();

				Document document = (Document) builder.build(new InputSource(
						new StringReader(xmlString)));

				Element rootNode = document.getRootElement();
				String status = rootNode.getChild("Status").getValue().trim();
				String inventoryCount = rootNode.getChild("InventoryCount")
						.getValue().trim();
				String errorMessage = rootNode.getChild("ErrorMessage")
						.getValue().trim();

				if (status.equalsIgnoreCase("success")) {
					if (mode.equalsIgnoreCase("Update")) {
						log.info("Inventory for product " + productId
								+ " has changed by " + count
								+ " unit(s). Reference=" + reference);
					} else {
						log.info("Inventory inquiry for product " + productId
								+ " was requested. Reference=" + reference);
					}

				} else {
					log.error("Inventory " + mode + " for product " + productId
							+ " has failed: Count=" + count + ", Reference="
							+ reference + ", Error message=\"" + errorMessage
							+ "\"");

				}

				this.sendStatusToAS400(dataQueueKey, status + inventoryCount);

			} else {
				String errorMessage = "";
				errorMessage = "Demandware inventory update webservice returned error!"
						+ " Http Status code= "
						+ httpStatusCode
						+ ", Reason phrase= "
						+ response.getStatusLine().getReasonPhrase()
						+ ", ProductId= "
						+ productId
						+ ", Count= "
						+ count
						+ ", Reference= " + reference;
				log.error(errorMessage);
				throw new Exception(errorMessage);

			}
		} catch (Exception e) {
			log.error(StackTrace.getStackTrace(e));
			throw new Exception();
		}
	}

	private void sendStatusToAS400(String dataQueueKey, String data)
			throws AS400SecurityException, ErrorCompletingRequestException,
			IOException, IllegalObjectTypeException, InterruptedException,
			ObjectDoesNotExistException {

		this.getResponseDataQueue().write(dataQueueKey, data);

	}

	public String getResponseXml(HttpResponse response) throws IOException {

		BufferedReader rd = null;
		StringBuilder stringBuilder = new StringBuilder();

		try {
			rd = new BufferedReader(new InputStreamReader(response.getEntity()
					.getContent()));
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuilder.append(line);
			}
		} catch (IllegalStateException e) {
			throw new IllegalStateException();
		} catch (IOException e) {
			throw new IOException();
		} finally {
			if (rd != null)
				rd.close();
		}

		return stringBuilder.toString();

	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public KeyedDataQueue getResponseDataQueue() {
		return responseDataQueue;
	}

	public void setResponseDataQueue(KeyedDataQueue responseDataQueue) {
		this.responseDataQueue = responseDataQueue;
	}

}
