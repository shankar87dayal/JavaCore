package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1326 {
	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		System.out.println(map);
		System.out.println("Size:" + map.size());
		System.out.println("IS EMPTY:" + map.isEmpty());
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", new Long(65799999L));
		map.put("valid", new Boolean(true));
		System.out.println(map);
		System.out.println("Size:" + map.size());
		System.out.println("IS EMPTY:" + map.isEmpty());
	}
}
