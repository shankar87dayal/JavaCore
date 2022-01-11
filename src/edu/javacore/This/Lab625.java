package edu.javacore.This;

public class Lab625 {
	public static void main(String[] args) {
		Student3 stu1 = new Student3(98, "Raushan", "raushanroy549@gmail.com", 7488010510L);
		stu1.show();
	}
}

class Student3 {
	int sid;
	String name;
	long phone;
	String email;

	Student3() {
		System.out.println("student 0-Arg constructor");
	}

	Student3(int sid) {
		this();
		this.sid = sid;
		System.out.println("student 1-Arg constructor");
	}

	Student3(int sid, String name) {
		this(sid);
		System.out.println("student 2-Arg constructor");
		this.name = name;
	}

	Student3(int sid, String name, String email) {
		this(sid, name);
		System.out.println("student 3-Arg constructor");
		this.email = email;

	}

	Student3(int sid, String name, String email, long phone) {
		this(sid, name, email);
		System.out.println("student 4-Arg constructor");
		this.phone = phone;
	}

	void show() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
	}
}
