package edu.javacore.polymorphism;

class Shape2 {
	abstract void area();

}

class Square2 extends Shape2 {
}

public class Lab949 {
	public static void main(String[] args) {
		Shape2 sp = new Shape2();
		sp.area();
	}
}
