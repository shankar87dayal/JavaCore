package edu.javacore.Inheritance;

public class Lab840 {
	public static void main(String[] args) {
		new Hello30().show();

	}
}

class Hai30 {
	private int a;
}

class Hello30 extends Hai30 {
	String a;

	void show() {
		System.out.println(a);
		System.out.println(super.a);
	}
}
