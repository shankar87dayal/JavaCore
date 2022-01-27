package edu.javacore.polymorphism;

abstract class Shape4 {
	abstract void area();

}

class Square4 extends Shape4 {
}

public class Lab951 {
	public static void main(String[] args) {
		Shape4 sp = new Square4();
		sp.area();
	}
}
