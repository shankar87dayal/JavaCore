package edu.javacore.This;

public class Lab621 {
	public static void main(String[] args) {
		Hello5 h2 = new Hello5(99);
		h2.show();
	}
}

class Hello5 {
	int a;

	  Hello5() {
		System.out.println("Hello DC");
	}

	Hello5(int a) {
		System.out.println("Hello 1-Arg con");
		this.a = a;
		Hello5();
	}

	void show() {
		System.out.println(a);
	}
}
