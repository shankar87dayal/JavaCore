package edu.javacore.interface_1;

interface Inter1 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

class Hello extends Inter1 {
}

public class Lab960 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
