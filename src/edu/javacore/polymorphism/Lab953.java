package edu.javacore.polymorphism;

abstract class Person1 {
	abstract void sleeping();

	abstract void walking();

}

abstract class Student1 extends Person1 {
	void sleeping() {
		System.out.println("Student1->sleeping() ");
	}
}

class CurrentStudent extends Student1 {
	void walking() {
		System.out.println("CurrentStudent->walking() ");
	}
}

public class Lab953 {
	public static void main(String[] args) {
		Person1 pob = new CurrentStudent();
		pob.sleeping();
		pob.walking();
	}
}
