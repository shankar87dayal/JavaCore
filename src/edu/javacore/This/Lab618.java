package edu.javacore.This;

import edu.javacore.Constructor.Student4;

public class Lab618 {
	public static void main(String[] args) {
		Student stu1 = new Student(98,"Raushan");
		stu1.show();
		Student stu2 = new Student(12,"Ravi");
		stu2.show();
	}
}

class Student {
	int sid;
	String sname;
	Student(int sid, String sname){
		System.out.println("Student 2-arg constructor");
		sid=sid;
		sname =snname;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
