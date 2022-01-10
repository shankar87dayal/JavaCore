package edu.javacore.Constructor;

public class Lab611 {
	public static void main(String[] args) {
		Student12 stu3 = new Student12(-05);
		stu3.show();
	}
}

class Student12 {
	int age = 18;

	Student12(int ag) {
		System.out.println("Student 1-arg constructor");
		age = ag;
	}

	void show() {
		System.out.println(age);
	}
}
