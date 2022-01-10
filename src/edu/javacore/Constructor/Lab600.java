package edu.javacore.Constructor;

public class Lab600 {
	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.sid =98; 
		stu.sname ="Raushan";
		stu.show();
	}
}

class Student1 {
	int sid;
	String sname;

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
