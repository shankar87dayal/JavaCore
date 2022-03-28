package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1323 {
	public static void main(String[] args) {
		TreeSet tset = new TreeSet(new NameComparator());
		tset.add(new Student5(88, "manish"));
		tset.add(new Student5(44, "Sri"));
		tset.add(new Student5(22, "Nivas"));
		tset.add(new Student5(99, "Rahul"));
		tset.add(new Student5(77, "Abhi"));
		Iterator it = tset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Student5 {
	int sid;
	String name;

	Student5(int sid, String name) {
		this.sid = sid;
		this.name = name;

	}

	public String toString() {
		return sid + "\t" + name;
	}
}

class NameComparator implements Comparator {
	public int compare(Object ob1, Object ob2) {
		if (ob1 instanceof Student5 && ob2 instanceof Student5) {
			Student5 s1 = (Student5) ob1;
			Student5 s2 = (Student5) ob2;
			return s1.name.compareTo(s2.name);
		}
		return 0;
	}
}

