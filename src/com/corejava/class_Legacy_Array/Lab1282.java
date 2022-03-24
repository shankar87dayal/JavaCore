package com.corejava.class_Legacy_Array;

import java.util.Vector;

public class Lab1282 {
	public static void main(String[] args) {
		Vector v = new Vector();
		Student2 st = new Student2(99);
		v.addElement(st);
		System.out.println(v.contains(new Student2(99)));
	}
}

class Student2 {
	int sid;

	Student2(int sid) {
		this.sid = sid;
	}

	public String toString() {
		return "" + sid;
	}

	public boolean equals(Object obj) {
		System.out.println("**equals()** ");
		if (obj instanceof Student2) {
			Student2 st = (Student2) obj;
			return this.sid == st.sid;
		}
		return false;
	}
}
