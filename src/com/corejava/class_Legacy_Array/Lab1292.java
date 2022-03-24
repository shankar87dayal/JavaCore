package com.corejava.class_Legacy_Array;

import java.awt.List;
import java.util.*;

public class Lab1292 {
	public static void main(String[] args) {
		List list = new List();
		list.add("sri");
		list.add("Nivas");
		list.add("Dende");
		System.out.println(list);
		list.add(1, "java");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}
}
