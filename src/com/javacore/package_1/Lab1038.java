package com.javacore.package_1;

public class Lab1038 {
	public static void main(String[] args) {
		Student_4 st1 = new Student_4(98, "sri");
		Student_4 st2 = new Student_4(12, "sri");
		Student_4 st3 = new Student_4(12, "Nivas");
		Student_4 st4 = st1;
		System.out.println("using == op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);

		System.out.println("using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));

	}
}

class Student_4 {
	int sid;
	String name;

	Student_4(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
}