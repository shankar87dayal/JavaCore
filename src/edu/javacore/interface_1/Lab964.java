package edu.javacore.interface_1;

interface Inter5 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

class Hello4 implements Inter5 {
	public void m1()

	{
		System.out.println("Hello->m1(): " + a);
	}

	public void m2() {
		System.out.println("Hello->m2(): " + b);
	}
}

public class Lab964 {
	public static void main(String[] args) {
		Inter5 ref = null;
		// ref =new Inter4();
		ref = new Hello4();
		ref.m1();
		ref.m2();
	}
}
