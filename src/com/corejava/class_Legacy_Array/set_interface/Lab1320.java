package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1320 {
	public static void main(String[] args) {
		System.out.println("\n\n **EMPLOYEE INFO**");
		TreeSet set = new TreeSet();
		set.add(new Employee1(87, "Sri"));
		set.add(new Employee1(99, "Dande"));
		set.add(new Employee1(12, "SD"));
		set.add(new Employee1(45, "Nivas"));
		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}

class Employee1 implements Comparable {
	int eid;
	String name;

	Employee1(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

	public int compareTo(Object obj) {
		if (obj instanceof Employee1) {
			Employee1 em = (Employee1) obj;
			return this.name.compareTo(em.name);
		}
		return 0;
	}

	public String toString() {
		return eid + "\t" + name;
	}
}