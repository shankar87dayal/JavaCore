package edu.javacore.Access_Modifier1;

public class Lab913 {
	public static void main(String[] args) {
		B.m1();
	}
}

class A18 {
	void m1() {
	}

	static void m2() {
	}
}

class B18 extends A18 {
	void m1() {
	}

	static void m2() {
	}
}