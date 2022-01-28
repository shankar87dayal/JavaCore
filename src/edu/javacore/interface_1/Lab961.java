package edu.javacore.interface_1;

interface Inter2 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

class Hello1 implements Inter2 {
}

public class Lab961 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
