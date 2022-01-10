package edu.javacore.Constructor;

public class Lab604 {
	public static void main(String[] args) {
		Student5 stu1 = new Student5();
		stu1.show();
		Student5 stu2 = new Student5(12,"Ravi");
		stu2.show();
	}
}

class Student5 {
	int sid;
	String sname;
    Student5() {
       System.out.println("Student default constructor");
    
    }
	Student5(int id, String sn){
		System.out.println("Student 2-arg constructor");
		sid=id;
		sname =sn;
	}

	void show() {
		System.out.println(sid + "\t" + sname);
	}
}
