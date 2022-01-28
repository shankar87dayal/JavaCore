package edu.javacore.interface_1;

interface Inter6 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

abstract class Hello5 implements Inter6 {
	public void m1()

	{
		System.out.println("Hello->m1(): " + a);
	}
}

class Hai extends Hello5 {
	public void m2() {
		System.out.println("Hello->m2(): " + b);
	}

	void m3() {
		System.out.println("Hai -> m3()");
	}
}

public class Lab965 {
	public static void main(String[] args) {
		Inter6 ref = new Hai();
		ref.m1();
		ref.m2();
		//ref.m3();
	}
}
