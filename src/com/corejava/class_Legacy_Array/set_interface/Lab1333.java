package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;;

public class Lab1333 {
	public static void main(String[] args) {
		System.out.println("\n**TreeMap");
		Map map = new TreeMap();
		map.put("sid: ", "JLC-099");
		map.put("name: ", "sri");
		map.put("email: ", "sri@jlc.com");
		map.put("phone: ", "65799999");
		map.put("add: ", "Mathikere");
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it .next());
		}
	}
}
