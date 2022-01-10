package edu.javacore.This;

public class Lab614 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.show();
	}
}

class Hello {
	int a = 10;

	void show() {
		System.out.println(a);
	}
}