package edu.javacore.polymorphism;

abstract class Shape3 {
	abstract void area();
}

public class Lab950 {
	public static void main(String[] args) {
		Shape3 sp = new Shape3();
		sp.area();
	}
}
