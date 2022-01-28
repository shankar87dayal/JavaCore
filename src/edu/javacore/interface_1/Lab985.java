package edu.javacore.interface_1;

interface Inter_F_3 {
	void m1();
}

class Hello_12 implements Inter_F_3 {
	public void m1() {
		System.out.println("Hello-> m1()");
	}

	public void m2() {
		System.out.println("Hello-> m2()");
	}
}

public class Lab985 {
	public static void main(String[] args) {
		Inter_F_3 in1 = new Hello_12();
		in1.m2();
	}
}
