package edu.javacore.polymorphism;

abstract class Person11 {
	public abstract void sleeping();
}

class Student21 extends Person11 {
	void sleeping() {
		System.out.println("Student21-> sleeping");
	}
}

public class Lab955 {
	public static void main(String[] args) {
		Student21 st = new Student21();
		st.sleeping();
	}

}
