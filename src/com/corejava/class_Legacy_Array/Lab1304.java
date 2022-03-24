package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1304 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		list.add("jaVa");
		list.add("JSP");
		list.add("JDBC");
		ListIterator lit = list.listIterator();
		System.out.println(list);
		while (lit.hasNext()) {
			String obj = lit.next().toString();
			System.out.println(obj);
			if (obj.equals("Nivas"))
				lit.remove();
			else if (obj.equalsIgnoreCase("Java"))
				lit.set("corejava");
			else if (obj.equals("JSP"))
				lit.add("Servlets ");

		}
		System.out.println(list);

	}
}
