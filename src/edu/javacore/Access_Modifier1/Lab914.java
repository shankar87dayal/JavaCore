package edu.javacore.Access_Modifier1;

public class Lab914 {
	public static void main(String[] args) {
		new B19().m1();
	}
}

class A19 {
	native void m1();

	void m2() {
	}
}

class B19 extends A19 {
	void m1() {
	}

	native void m2();
}