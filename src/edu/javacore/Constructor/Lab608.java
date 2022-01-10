package edu.javacore.Constructor;

public class Lab608 {
	public static void main(String[] args) {
		Student9 stu3 = new Student9();
		stu3 = Student9(05,"golu");
		stu3.show();
	}
	}
	class Student9 {
		int sid;
		String sname;
		Student9(int id, String sn){
			System.out.println("Student 2-arg constructor");
			sid=id;
			sname =sn;
		}
		public Student9() {
			System.out.println("Student Default constructor");
		}
		
		void show() {
			System.out.println(sid + "\t" + sname);
		}
}
