package com.javacore.package_1;

public class Lab1036 {
	public static void main(String[] args) {
		Student_3 st1 = new Student_3(98, "shivam");
		Student_3 st2 = new Student_3(12, "bhai");
		System.out.println(st1);
		System.out.println(st2);
	}
}

class Student_3 {
	int sid;
	String name;

	Student_3(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public String toString() {
		return sid + "\t" + name;
	}
}