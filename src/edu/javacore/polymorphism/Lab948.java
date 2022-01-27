package edu.javacore.polymorphism;

class Shape1 {
	void area();

}

class Square1 extends Shape1 {
}

public class Lab948 {
	public static void main(String[] args) {
		Shape1 sp = new Shape1();
		sp.area();
	}
}
