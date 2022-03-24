package com.corejava.class_Legacy_Array;

import java.util.ArrayList;
import java.util.Collection;

public class Lab1289 {
	public static void main(String[] args) {
		Collection col1 = new ArrayList();
		col1.add("JDBC");
		col1.add("JSP");
		col1.add("sirnivas");
		col1.add("java");
		col1.add("Dende");
		Collection col2 = new ArrayList();
		col2.add("java");
		col2.add("JDBC");
		col2.add("JSP");
		Collection col3 = new ArrayList();
		col3.add("java");
		col3.add("JDBC");
		col3.add("EJB");

		System.out.println(col1 + "\n" + col2 + "\n" + col3);
		System.out.println(col1.containsAll(col2));
		System.out.println(col1.containsAll(col3));
	}
}
