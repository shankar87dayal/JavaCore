package edu.javacore.This;

public class Lab619 {
	public static void main(String[] args) {
		Student1 stu1 = new Student1(98,"Raushan");
		stu1.show();
		Student1 stu2 = new Student1(12,"Ravi");
		stu2.show();
	}
}

class Student1 {
	int sid;
	String sname;
	Student1(int sid, String sname){
		System.out.println("Student 2-arg constructor");
		this.sid=sid;
		this.sname =sname;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
