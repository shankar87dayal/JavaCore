package edu.javacore.Constructor;

public class Lab606 {
public static void main(String[] args) {
	Student7 stu3 = new Student7(05,"golu");
	stu3.show();
}
}
class Student7 {
	int sid;
	String sname;
	Student7(int id, String sn){
		System.out.println("Student 2-arg constructor");
		sid=id;
		sname =sn;
	}
	Student7(int x, String y){
		System.out.println("Student 2-arg constructor");
		sid=x;
		sname =y;
	}
	void show() {
		System.out.println(sid + "\t" + sname);
	}
}