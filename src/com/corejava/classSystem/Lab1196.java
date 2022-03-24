package com.corejava.classSystem;

import java.util.Enumeration;
import java.util.Properties;

public class Lab1196 {
	public static void main(String[] args) {
		System.out.println("\n** ACCESSING ALL PROPERTIES");
		Properties p = System.getProperties();
		Enumeration enm = p.propertyNames();
		while (enm.hasMoreElements()) {
			String PName = enm.nextElement().toString();
			String val = System.getProperty(PName);
			System.out.println(PName + "\t:\t" + val);

		}
	}
}
