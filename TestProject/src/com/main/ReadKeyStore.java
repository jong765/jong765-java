package com.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Iterator;

public class ReadKeyStore {

	public static void main(String[] args) throws KeyStoreException, NoSuchAlgorithmException,
			CertificateException, IOException, InvalidAlgorithmParameterException {
		String fileName = "file/cacerts";

		FileInputStream fis = new FileInputStream(fileName);
		KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
		String password = "changeit";
		keystore.load(fis, password.toCharArray());

		// This class retrieves the most-trusted CAs from the keystore
		PKIXParameters params = new PKIXParameters(keystore);

		// Get the set of trust anchors, which contain the most-trusted CA
		// certificates

		String fileName1 = "file/javaKeyStore3.txt";

		Iterator<TrustAnchor> it = params.getTrustAnchors().iterator();
		while (it.hasNext()) {
			TrustAnchor ta = (TrustAnchor) it.next();
			// Get certificate
			X509Certificate cert = ta.getTrustedCert();

			String content = cert.getIssuerDN().getName() + "| " + cert.getNotBefore() + "| "
					+ cert.getNotAfter() + "\n";

			FileUtils.writeFile(fileName1, content, false);
		}

	}
}
