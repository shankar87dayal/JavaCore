package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1329 {
	public static void main(String[] args) {
		Map map = new LinkedHashMap();
		map.put("eid", new Integer(99));
		map.put("name", "Srinivas");
		map.put("phone", new Long(65799999L));
		map.put("valid", new Boolean(true));
		System.out.println("\n**KEYS");
		Set keys = map.keySet();
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			Object key = it.next();
			System.out.println(key);

		}
		System.out.println("\n** VALUES");
		Collection col = map.values();
		Iterator it1 = col.iterator();
		while (it1.hasNext()) {
			Object val = it1.next();
			System.out.println(val);
		}

	}
}
