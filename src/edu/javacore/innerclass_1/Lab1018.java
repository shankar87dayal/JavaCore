package edu.javacore.innerclass_1;

abstract class Person {
	public abstract void sleeping();
}

class Student extends Person {
	public void sleeping() {
		System.out.println("Student->sleeping()");
	}
}

public class Lab1018 {
	public static void main(String[] args) {
		Person p = new Person() {
		};
	}
}
