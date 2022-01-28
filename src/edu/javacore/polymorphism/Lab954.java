package edu.javacore.polymorphism;

abstract class Person2 {
	abstract void sleeping();
}

abstract class Student2 extends Person2 {
	void sleeping() {
		System.out.println("Student2->sleeping() ");
	}
}

class CurrentStudent1 extends Student2 {
}

public class Lab954 {
	public static void main(String[] args) {
		Person2 pob = new CurrentStudent1();
		pob.sleeping();
	}

}
