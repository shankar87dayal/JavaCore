package edu.javacore.Constructor;

public class Lab602 {
	public static void main(String[] args) {
		Student3 stu = new Student3();
		stu.sid =98; 
		stu.sname ="Raushan";
		stu.show();
	}
}

class Student3 {
	int sid;
	String sname;
	Student3(int id, String sn){
		System.out.println("Student 2-arg constructor");
		sid=id;
		sname =sn;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
