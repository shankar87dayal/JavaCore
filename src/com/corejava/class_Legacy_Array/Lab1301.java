package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1301 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		Iterator it = list.iterator();
		int size = list.size();
		//list.remove("Sri");
		for (int i = 0; i < size; i++)
			System.out.println(it.next());
		System.out.println("main completed");
	}
}
