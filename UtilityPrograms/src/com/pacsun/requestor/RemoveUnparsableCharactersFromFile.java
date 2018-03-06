package com.pacsun.requestor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class RemoveUnparsableCharactersFromFile {

	public static void main(String[] args) {
		String bufferString = null;
		try {
			String infile = "C:/temp/Demandware/ProductionCustomerExport_07062017.xml";
			String outfile = "C:/temp/Demandware/ProductionCustomerExport_07062017NEW.xml";
			// String infile = "C:/temp/Demandware/Test.xml";
			// String outfile = "C:/temp/Demandware/TestNEW.xml";

			// Open a stream of bytes to read the file bytes into the program
			FileInputStream instream = new FileInputStream(infile);
			// A stream of bytes from the program to the destination
			FileOutputStream outstream = new FileOutputStream(outfile);
			OutputStreamWriter bufferedWriter = new OutputStreamWriter(outstream, "UTF-8");
			byte[] buffer = new byte[4096];
			int bytesRead;
			int counter = 0;

			// Write the bytes from the inputstream to the outputstream
			while ((bytesRead = instream.read(buffer)) != -1) {

				bufferString = new String(buffer);
				if (bufferString.contains("&#")) {
					counter++;
					bufferString = bufferString.replace("&#", "  ");
					System.out.println(counter + " unparsable strings found in xml file.");
				}

				bufferString = bufferString.replaceAll("55357;", "");
				bufferString = bufferString.replaceAll("56859;", "");
				bufferString = bufferString.replaceAll("56832;", "");
				bufferString = bufferString.replaceAll("55356;", "");
				bufferString = bufferString.replaceAll("57313;", "");
				bufferString = bufferString.replaceAll("56401;", "");

				bufferString = bufferString.replaceAll("[^\\w\\s<>(){}~%^!&*+-/:;.',$#=?@\"]", "");

				bufferString = bufferString.replaceAll("address-id=\"\"", "address-id=\"temp\"");
				bufferString = bufferString.replaceAll("address-id=\" +\"", "address-id=\"temp\"");
				bufferString = bufferString.replaceAll("address-id=\"- juliaan \"",
						"address-id=\"temp\"");
				bufferString = bufferString.replaceAll("address-id=\" Mr. Chris Dowling\"",
						"address-id=\"temp\"");
				bufferString = bufferString.replaceAll("address-id=\"Teterboro \"",
						"address-id=\"temp\"");
				bufferString = bufferString.replaceAll("address-id=\"Home \"",
						"address-id=\"temp\"");
				bufferString = bufferString.replaceAll("address-id=\"Gramps     \"",
						"address-id=\"temp\"");
				bufferString = bufferString.replaceAll("address-id=\"Home     \"",
						"address-id=\"temp\"");

				// bufferedWriter.write(bufferString, 0, bytesRead);
				bufferedWriter.write(bufferString, 0, bufferString.length());

			}
			System.out.println("Total " + counter + " unparsable strings found in xml file.");
			// Finally close both streams to save garbage disposal memory
			instream.close();
			bufferedWriter.close();
			outstream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			System.out.println("bufferString:" + bufferString);
			e.printStackTrace();
		}

	}

}
