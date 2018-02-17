package com.main;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileUtils {

	static Logger log = LoggerFactory.getLogger(FileUtils.class);

	public static String readFile(String filePath) {
		StringBuilder builder = new StringBuilder();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			while ((line = reader.readLine()) != null) {
				builder.append(line);
				builder.append(System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			log.error("File reader failed for file '" + filePath + "':\n ");
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				log.error("File reader failed for file '" + filePath + "':\n ");
			}
		}
		return builder.toString();
	}

	public static void writeFile(String fileName, String content, boolean bOverwrite) {
		File file = new File(fileName);

		BufferedOutputStream os = null;
		StandardOpenOption soo;

		try {
			if (file.exists()) {
				if (!bOverwrite) {
					soo = APPEND;
					log.debug("Appending to existing file.");
				} else {
					soo = TRUNCATE_EXISTING;
					log.debug("Overwriting exsiting file.");
				}
			} else {
				log.debug("Creating new file because it does not exist");
				soo = CREATE;
			}

			os = new BufferedOutputStream(Files.newOutputStream(Paths.get(file.getAbsolutePath()),
					soo));
			os.write(content.getBytes());
			os.flush();
			os.close();
		} catch (IOException e) {
			log.error("Unable to write '" + content + "' to file '" + fileName + "':\n");
		} finally {
			try {
				if (os != null)
					os.close();
			} catch (IOException e1) {
				log.warn("Can't close the output writer. Moving on with life.");
			}
		}

	}

	public static boolean moveFile(String fromFullFileName, String toFullFileName) {

		File fromFile = new File(fromFullFileName);

		if (fromFile.renameTo(new File(toFullFileName))) {
			return true;
		} else {
			return false;
		}
	}

	public static File[] listFiles(String folderPath, final String filePrefix,
			final String fileExtension) {
		FilenameFilter fileNameFilter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				boolean selected = false;
				String lowercaseName = name.toLowerCase();
				if (filePrefix != null) {
					if (lowercaseName.startsWith(filePrefix.toLowerCase())) {
						selected = true;
					} else
						selected = false;
				}

				if (selected && fileExtension != null) {
					if (lowercaseName.endsWith(fileExtension.toLowerCase())) {
						selected = true;
					} else {
						selected = false;
					}
				}
				return selected;
			}
		};
		File[] fileList = new File(folderPath).listFiles(fileNameFilter);
		return fileList;
	}
}
