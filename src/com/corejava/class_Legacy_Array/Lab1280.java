package com.corejava.class_Legacy_Array;

import java.util.Vector;

public class Lab1280 {
	public static void main(String[] args) {
		Vector v = new Vector();
		Student st = new Student(99);
		v.addElement(st);
		System.out.println(v);
		st.sid = 88;
		System.out.println(v);
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
