package com.corejava.stringclass_1;

import javax.naming.Name;

public class Lab1110 {
	public static void main(String[] args) {
		String names[] = { "parshuram", "Ray", "sushila", "Ray", "shankar", "Dayal", "khushboo", "Raushan", "hariom",
				"shviam", "kumar" };
		System.out.println("\n NAMEs");
		for (int i = 0; i < names.length; i++) {
			String nm = names[i];
			System.out.println(nm);
		}
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				String t1 = names[i];
				String t2 = names[j];
				int res = t1.compareTo(t2);
				if (res > 0) {
					names[i] = t2;
					names[j] = t1;
				}
			}
		}
		System.out.println("\n NAMES IN SORTED ORDER");
		for (int i = 0; i < names.length; i++) {
			String nm = names[i];
			System.out.println(nm);
		}
	}
}
