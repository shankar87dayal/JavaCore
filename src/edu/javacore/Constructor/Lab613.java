package edu.javacore.Constructor;

public class Lab613 {
	public static void main(String[] args) {
		Student14 stu3 = new Student14(-05);
		stu3.show();
	}
}

class Student14 {
	int age = 18;

	Student14(int ag) {
		System.out.println("Student 1-arg constructor");
		if(ag<18)
			return 0;
		age = ag;
	}

	void show() {
		System.out.println(age);
	}
}
