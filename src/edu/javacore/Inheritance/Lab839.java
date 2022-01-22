package edu.javacore.Inheritance;

public class Lab839 {
	public static void main(String[] args) {
		new Hello29().show();

	}
}

class Hai29 {
}

class Hello29 extends Hai29 {
	void show() {
		System.out.println(Hello29.this);
		System.out.println(Hello29.super);
	}
}