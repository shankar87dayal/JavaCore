package edu.javacore.This;

public class Lab655 {
	public static void main(String[] args) {
		Hello34 h = new Hello34();
		System.out.println("main: " + h.a);
	}
}

class Hello34 {
	public Hello34() {
		System.out.println("con: " + a);
	}

	int a = 10;
}