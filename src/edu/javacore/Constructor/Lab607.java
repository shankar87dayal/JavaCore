package edu.javacore.Constructor;

public class Lab607 {
	public static void main(String[] args) {
		Student8 stu3 = new Student8(05,"golu");
		stu3.show();
	}
	}
	class Student8 {
		int sid;
		String sname;
		Student8(int id, String sn){
			System.out.println("Student 2-arg constructor");
			sid=id;
			sname =sn;
		}
		Student8(String y, int x){
			System.out.println("Student 2-arg constructor");
			sname =y;
			sid=x;

		}
		void show() {
			System.out.println(sid + "\t" + sname);
		}
}
