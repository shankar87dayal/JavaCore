package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1312 {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		System.out.println(set);
	}
}

class Student {
	int sid;

	Student(int sid) {
		this.sid = sid;
	}

	public String toString() {
		return "" + sid;
	}
}
