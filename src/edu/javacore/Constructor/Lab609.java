package edu.javacore.Constructor;

public class Lab609 {
	public static void main(String[] args) {
		Student10 stu3 = new Student10();
		stu3.Student10(05,"golu");
		stu3.show();
	}
	}
	class Student10 {
		int sid;
		String sname;
		 void Student10(int id, String sn){
			System.out.println("Student 2-arg constructor");
			sid=id;
			sname =sn;
		}
		public Student10() {
			System.out.println("Student Default constructor");
		}
		
		void show() {
			System.out.println(sid + "\t" + sname);
		}
}
