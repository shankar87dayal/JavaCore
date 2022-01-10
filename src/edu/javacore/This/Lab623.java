package edu.javacore.This;

public class Lab623 {
	public static void main(String[] args) {
		Hello7 h = new Hello7(99);
		h.show();
	}
}

class Hello7 {
	int a;

	Hello7() {
		System.out.println("Hello DC");
	}

	Hello7(int a) {
		this();
		System.out.println("Hello 1-Arg Con");
		this.a = a;

	}

	void show() {
		System.out.println(a);
	}
}