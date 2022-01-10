package edu.javacore.Constructor;

public class Lab601 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.sid =98; 
		stu.sname ="Raushan";
		stu.show();
	}
}

class Student2 {
	int sid;
	String sname;
	Student2() {
		System.out.println("Student default constructor");
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
