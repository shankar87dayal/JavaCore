package edu.javacore.polymorphism;

abstract class Shape5 {
	abstract void area();

}

class Square5 extends Shape5 {
	void area() {
		System.out.println("Square5-> area()");
	}
}

public class Lab952 {
	public static void main(String[] args) {
		Shape5 sp = new Square5();
		sp.area();
	}
}
