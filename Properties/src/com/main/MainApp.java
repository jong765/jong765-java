package com.main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MainApp {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("properties/db.properties");
		Properties p = new Properties();
		p.load(fr);

		System.out.println(p.getProperty("system"));
		System.out.println(p.getProperty("timeout"));

		Properties p2 = System.getProperties();
		Set set = p2.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
