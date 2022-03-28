package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1311 {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(new Long(65));
		set.add(new Byte((byte) 65));
		set.add(new Integer(65));
		set.add("A");
		System.out.println(set);
	}
}
