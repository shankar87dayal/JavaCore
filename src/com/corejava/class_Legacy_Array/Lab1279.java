package com.corejava.class_Legacy_Array;

import java.util.Vector;

public class Lab1279 {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.addElement("Sri");
		v.addElement("vas");
		v.addElement("Dende");
		v.addElement("java");
		v.addElement("JSP");
		v.addElement("Servlets");
		v.addElement("EJB");
		v.addElement("JMS");
		v.addElement("JPA");
		v.addElement("XML");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.addElement("Database");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
