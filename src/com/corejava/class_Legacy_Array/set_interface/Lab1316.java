package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1316 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		// ts.add(...) same as prevous lab
		System.out.println("--pollFirst/Last--");
		System.out.println(ts);
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		System.out.println("***lower<***");
		System.out.println(ts.lower(8));
		System.out.println(ts.lower(50));
		System.out.println(ts.lower(3));
		System.out.println(ts.lower(4));
		System.out.println("***higher()>***");
		System.out.println(ts.higher(8));
		System.out.println(ts.higher(50));
		System.out.println(ts.higher(3));
		System.out.println(ts.higher(4));
		System.out.println("***ceiling()>=***");
		System.out.println(ts.ceiling(8));
		System.out.println(ts.ceiling(10));
		System.out.println(ts.ceiling(11));
		System.out.println(ts.ceiling(12));
		System.out.println("***floor()<=***");
		System.out.println(ts.floor(8));
		System.out.println(ts.floor(10));
		System.out.println(ts.floor(11));
		System.out.println(ts.floor(12));
	}
}
