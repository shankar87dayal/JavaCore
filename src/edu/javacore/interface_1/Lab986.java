package edu.javacore.interface_1;

interface Inter_F_4 {
	void m1();
}

class Hello_13 implements Inter_F_4 {
	public void m1() {
		System.out.println("Hello-> m1()");
	}

	public void m2() {
		System.out.println("Hello-> m2()");
	}
}

public class Lab986 {
	public static void main(String[] args) {
		Inter_F_4 in1 = new Hello_13();
		Object obj = in1;
		System.out.println(in1.toString());
	}
}
