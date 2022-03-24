package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1303 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		list.add("java");
		list.add("JSP");
		list.add("JDBC");
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	}
}
