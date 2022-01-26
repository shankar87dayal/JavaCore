package edu.javacore.Access_Modifier1;

public class Lab916 {
	public static void main(String[] args) {
		new B21().m1();
	}
}

class A21 {
	void m1() {
	}
}

class B21 extends A21 {
	private void m1() {
	}
}