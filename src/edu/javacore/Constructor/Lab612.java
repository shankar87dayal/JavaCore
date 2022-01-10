package edu.javacore.Constructor;

public class Lab612 {
	public static void main(String[] args) {
		Student13 stu3 = new Student13(-05);
		stu3.show();
	}
}

class Student13 {
	int age = 18;

	Student13(int ag) {
		System.out.println("Student 1-arg constructor");
		if(ag<18)
			return;
		age = ag;
	}

	void show() {
		System.out.println(age);
	}
}
