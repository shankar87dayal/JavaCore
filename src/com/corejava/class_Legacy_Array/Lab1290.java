package com.corejava.class_Legacy_Array;

import java.util.ArrayList;
import java.util.Collection;

public class Lab1290 {
	public static void main(String[] args) {
		Collection col1 = new ArrayList();
		col1.add("JDBC");
		col1.add("sri");
		col1.add("jsp");
		col1.add("sirnivas");
		col1.add("java");
		col1.add("Dende");
		Collection col2 = new ArrayList();
		col2.add("java");
		col2.add("JDBC");
		col2.add("JSP");
		System.out.println(col1);
		System.out.println(col2);
		System.out.println(col1.remove(col2));
		System.out.println(col1);
		System.out.println(col2);
	}
}
