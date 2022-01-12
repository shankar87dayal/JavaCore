package edu.javacore.Method.pro;

public class Lab694 {
	public static void main(String[] args) {
		Student1 st = new Student1();
		st.setAge(-12);
		System.out.println(st.age);
	}
}

class Student1 {
	int age;
	void setAge(int age) {
		this.age =age;
	}
}
