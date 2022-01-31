package com.javacore.package_1;

public class Lab1032 {
	public static void main(String[] args) {
		System.out.println("\n*** with Student");
		Student1 st1 = new Student1(99, 3216469257l);
		Student1 st2 = new Student1(86, 72164659257l);
		Student1 st3 = new Student1(96, 521646975257l);
		Student1 st4 = st1;

		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());

		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st3 == st4);
	}
}

class Student1 {
	int sid;
	long phone;

	Student1(int sid, long phone) {
		this.sid = sid;
		this.phone = phone;

	}
}