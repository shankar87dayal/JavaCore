package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1322 {
	public static void main(String[] args) {
		TreeSet tset = new TreeSet(new SidComparator());
		tset.add(new Student4(88, "manish"));
		tset.add(new Student4(44, "Sri"));
		tset.add(new Student4(99, "Nivas"));
		tset.add(new Student4(77, "Abhi"));
		Iterator it = tset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class Student4 {
	int sid;
	String name;

	Student4(int sid, String name) {
		this.sid = sid;
		this.name = name;

	}

	public String toString() {
		return sid + "\t" + name;
	}
}

class SidComparator implements Comparator {
	public int compare(Object ob1, Object ob2) {
		if (ob1 instanceof Student4 && ob2 instanceof Student4) {
			Student4 s1 = (Student4) ob1;
			Student4 s2 = (Student4) ob2;
			return s1.sid - s2.sid;
		}
		return 0;
	}
}
