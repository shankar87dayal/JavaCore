package edu.javacore.This;

public class Lab624 {
	public static void main(String[] args) {
		Student2 stu1 = new Student2(98, "Raushan", "raushanroy549@gmail.com", 7488010510L);
		stu1.show();
	}
}

class Student2 {
	int sid;
	String name;
	long phone;
	String email;

	Student2() {
		System.out.println("student 0-Arg constructor");
	}

	Student2(int sid) {
		this.sid = sid;
		System.out.println("student 1-Arg constructor");
	}

	Student2(int sid, String name) {
		System.out.println("student 2-Arg constructor");
		this.sid = sid;
		this.name = name;
	}

	Student2(int sid, String name, String email) {
		System.out.println("student 3-Arg constructor");
		this.sid = sid;
		this.name = name;
		this.email = email;

	}

	Student2(int sid, String name, String email, long phone) {
		System.out.println("student 4-Arg constructor");
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	void show() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phone);
	}
}