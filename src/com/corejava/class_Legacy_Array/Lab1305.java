package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1305 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		list.add("java");
		list.add("JSP");
		list.add("JDBC");
		ListIterator lit = list.listIterator();
		System.out.println("FORWORD ORDER");
		while (lit.hasNext()) {
			int index = lit.nextIndex();
			Object obj = lit.next();
			System.out.println(index + "\t" + obj);
		}
		System.out.println("REVERSE ORDER");
		while (lit.hasPrevious()) {
			int index = lit.previousIndex();
			Object obj = lit.previous();
			System.out.println(index + "\t" + obj);
		}
	}
}
