package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1319 {
	public static void main(String[] args) {
		System.out.println("** STUENT INFO**");
		TreeSet set = new TreeSet();
		set.add(new Student2(87, "Sri"));
		set.add(new Student2(99, "Dande"));
		set.add(new Student2(12, "SD"));
		set.add(new Student2(45, "Nivas"));
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}

class Student2 implements Comparable {
	int sid;
	String name;

	Student2(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public int compareTo(Object obj) {
		if (obj instanceof Student2) {
			Student2 st = (Student2) obj;
			return this.sid - st.sid;
		}
		return 0;
	}

	public String toString() {
		return sid + "\t" + name;
	}

}