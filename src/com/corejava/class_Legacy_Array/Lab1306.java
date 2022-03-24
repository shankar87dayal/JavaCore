package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1306 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		list.add("java");
		list.add("JSP");
		list.add("JDBC");
		ListIterator lit = list.listIterator(2);
		do {
			int indx = lit.nextIndex();
			Object obj = lit.next();
			System.out.println(indx + "\t" + obj);

		} while (lit.hasNext());
		System.out.println();
		lit = list.listIterator(5);
		do {
			int indx = lit.previousIndex();
			Object obj = lit.previous();
			System.out.println(indx + "\t" + obj);
		} while (lit.hasNext());
	}
}
