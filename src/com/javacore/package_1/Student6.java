package com.javacore.package_1;

public class Student6 implements Cloneable {
	int sid;

	Student6(int sid) {
		this.sid = sid;
	}

	public static void main(String[] args) throws Exception {
		Student6 st1 = new Student6(99);
		Student6 st2 = (Student6) st1.clone();
		System.out.println(st1 == st2);
		System.out.println(st1.sid);
		System.out.println(st2.sid);
	}
}
