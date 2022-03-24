package com.corejava.class_Legacy_Array;

import java.util.ArrayList;
import java.util.Collection;

public class Lab1288 {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dende");
		System.out.println(col + "\t" + col.size());
		Collection col1 = new ArrayList();
		col1.add("java");
		col1.add("JDBC");
		col1.add("JSP");
		System.out.println(col1 + "\t" + col1.size());
		col.addAll(col1);
		System.out.println(col + "\t" + col.size());
	}

}
