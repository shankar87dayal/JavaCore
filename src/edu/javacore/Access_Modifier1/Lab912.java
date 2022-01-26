package edu.javacore.Access_Modifier1;

public class Lab912 {
	public static void main(String[] args) {
		new B17().m1();
	}
}

class A17 {
	static void m1() {
	}
}

class B17 extends A17 {
	void m1() {
	}
}