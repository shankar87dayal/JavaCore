package edu.javacore.Inheritance;

public class Lab837 {
	public static void main(String[] args) {
		new Hello27().show();
	}
}

class Hai27 {
}

class Hello27 extends Hai27 {
	void show() {
		System.out.println(this);
		System.out.println(super);
	}
}