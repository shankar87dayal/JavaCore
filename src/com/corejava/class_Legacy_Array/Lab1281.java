package com.corejava.class_Legacy_Array;

import java.util.Vector;

public class Lab1281 {
	public static void main(String[] args) {
		Vector v = new Vector();
		Student1 st = new Student1(99);
		v.addElement(st);
		System.out.println(v.contains(new Student1(99)));
	}
}

class Student1 {
	int sid;

	Student1(int sid) {
		this.sid = sid;
	}

	public String toString() {
		return "" + sid;
	}

	public boolean equals(Object obj) {
		System.out.println("**equals()** ");
		return super.equals(obj);
	}
}
