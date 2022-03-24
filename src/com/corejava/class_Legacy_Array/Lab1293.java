package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1293 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		System.out.println(list);
		list.set(1, "Java");
		System.out.println(list);
		Object obj = list.get(2);
		System.out.println(obj);
	}
}
