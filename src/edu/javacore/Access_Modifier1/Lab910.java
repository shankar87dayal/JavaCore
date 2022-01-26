package edu.javacore.Access_Modifier1;

public class Lab910 {
	public static void main(String[] args) {
		B15 bobj = new B15();
		bobj.m1();
	}
}

class A15 {
	void m1() {

	}
}

class B15 extends A15 {
	final void m1() {

	}
}