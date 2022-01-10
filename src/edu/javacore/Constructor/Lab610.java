package edu.javacore.Constructor;

public class Lab610 {
	public static void main(String[] args) {
		Student11 stu3 = new Student11(05, "golu");
		stu3.show();
	}
}

class Student11 {
	int sid;
	String sname;

	void Student11(int id, String sn) {
		System.out.println("Student 2-arg constructor");
		sid = id;
		sname = sn;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
