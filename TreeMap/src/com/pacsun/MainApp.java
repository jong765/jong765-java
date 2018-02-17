package com.pacsun;

import java.util.TreeSet;

public class MainApp {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(41);
		treeSet.add(5);
		treeSet.add(19);
		treeSet.add(1);
		treeSet.add(41);

		System.out.println(treeSet);
	}
}
