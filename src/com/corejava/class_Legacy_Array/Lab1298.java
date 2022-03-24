package com.corejava.class_Legacy_Array;

import java.util.Enumeration;
import java.util.Vector;

public class Lab1298 {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Sri");
		v.addElement("Nivas");
		v.addElement("Dande");
		v.addElement("SD");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());

		}
	}
}
