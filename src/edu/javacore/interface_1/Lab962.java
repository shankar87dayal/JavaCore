package edu.javacore.interface_1;

interface Inter3 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

abstract class Hello2 implements Inter3 {
}

public class Lab962 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
