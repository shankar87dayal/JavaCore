package edu.javacore.Constructor;

public class Lab605 {
	public static void main(String[] args) {
		Student6 stu1 = new Student6(98, "Raushan", "raushanroy549@gmail.com", 9060088064L);
		stu1.show();
		Student6 stu2 = new Student6(12,"Ravi", "ravi@gmaiil.com");
		stu2.show();
		Student6 stu3 = new Student6(05,"golu");
		stu3.show();
		Student6 stu4 = new Student6();
		stu4.show();
	}
}

class Student6 {
	int sid;
	String sname;
	String email;
	long phone;
	Student6(int id, String sn, String em, long ph){
		System.out.println("Student 4-arg constructor");
		sid=id;
		sname =sn;
		email =em;
		phone =ph;
	}
	Student6(int id, String sn, String em){
		System.out.println("Student 3-arg constructor");
		sid=id;
		sname =sn;
		email =em;
	}
	Student6(int id, String sn){
		System.out.println("Student 3-arg constructor");
		sid=id;
		sname =sn;
	}
    Student6() {
       System.out.println("Student default constructor");
    
    }
	

	void show() {
		System.out.println(sid + "\t" + sname +"\t"+email+"\t"+phone);
	}
}
