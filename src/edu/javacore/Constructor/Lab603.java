package edu.javacore.Constructor;

public class Lab603 {
	public static void main(String[] args) {
		Student4 stu1 = new Student4(98,"Raushan");
		stu1.show();
		Student4 stu2 = new Student4(12,"Ravi");
		stu2.show();
	}
}

class Student4 {
	int sid;
	String sname;
	Student4(int id, String sn){
		System.out.println("Student 2-arg constructor");
		sid=id;
		sname =sn;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
