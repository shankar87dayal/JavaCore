package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1294 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		list.add("java");
		list.add("Nivas");
		list.add("JDBC");
		System.out.println(list);
		int x = list.indexOf("Nivas");
		System.out.println(x);
		int y = list.lastIndexOf("Nivas");
		System.out.println(y);
	}

}
