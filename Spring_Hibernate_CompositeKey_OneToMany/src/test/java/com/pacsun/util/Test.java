package com.pacsun.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> orderHeaderList = new ArrayList<String>();
		orderHeaderList.add("1");
		orderHeaderList.add("2");
		orderHeaderList.add("3");

		int totalSize = orderHeaderList.size();
		int batchSize = (int) Math.round(totalSize / 5 + 0.5);
		System.out.println("batchSize=" + batchSize);
		int quota = 0;
		int i = 0;

		Iterator<String> IT = orderHeaderList.iterator();
		List<String> orderHeaderList1 = new ArrayList<String>();

		try {
			while (IT.hasNext()) {
				String orderHeader = (String) IT.next();
				orderHeaderList1.add(orderHeader);
				i++;
				quota = i % batchSize;
				if (quota == 0) {
					System.out.println(orderHeaderList1);
					orderHeaderList1 = new ArrayList<String>();
				}

			}
		} finally {
			if (orderHeaderList1.size() > 0) {
				System.out.println(orderHeaderList1);
			}
		}
		System.out.println("");

	}
}
