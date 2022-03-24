package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1285 {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("SD");
		col.add("Dende");
		Object arr[] = col.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i] = "jlc";
		}
		System.out.println(col);
	}
}
