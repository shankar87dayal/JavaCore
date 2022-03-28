package com.corejava.class_Legacy_Array.set_interface;

import java.util.TreeSet;

public class Lab1321 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Student3(99, "Sri"));
	}
}

class Student3 {
	int sid;
	String name;

	Student3(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public String toString() {
		return sid + "\t" + name;

	}
}