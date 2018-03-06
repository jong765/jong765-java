package com.pacsun.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountTagInFile {

	public static void main(String[] args) {
		try {
			String infile = "C:/temp/DWprodActiveCustomers.xml";

			// Open a stream of bytes to read the file bytes into the program
			FileInputStream instream = new FileInputStream(infile);
			byte[] buffer = new byte[4096];
			int bytesRead;
			int counter = 0;
			// Write the bytes from the inputstream to the outputstream
			while ((bytesRead = instream.read(buffer)) != -1) {

				String bufferString = new String(buffer);
				if (bufferString.contains("gigyaUID")) {
					counter++;
					System.out.println(counter + " gigyaUID found in xml file.");
				}

			}
			System.out.println("Total " + counter + " gigyaUID found in xml file.");
			// Finally close both streams to save garbage disposal memory
			instream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
