package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1334 {
	public static void main(String[] args) {
		Map map = new TreeMap();
		map.put("sid: ", "JLC-099");
		map.put("name: ", "sriivas");
		Map map2 = new TreeMap();
		map2.put("MKR", "MATHIKERE");
		map2.put("BTM", "BTM Layout");
		System.out.println(map);
		System.out.println(map2);
		map.putAll(map2);
		System.out.println(map);
		System.out.println(map2);
	}
}
