package edu.javacore.interface_1;

interface Inter_F_2 {
	void m1();
}

class Hello_11 implements Inter_F_2 {
	public void m1() {
		System.out.println("Hello-> m1()");
	}

	public void m2() {
		System.out.println("Hello-> m2()");
	}
}

public class Lab984 {
	public static void main(String[] args) {
		Inter_F_2 in1 = new Hello_11();
		in1.m1();
	}
}
