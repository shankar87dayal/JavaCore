package edu.javacore.Access_Modifier1;

public class Lab909 {
	public static void main(String[] args) {
		B14 bobj = new B14();
		bobj.m1();
	}
}

class A14 {
	final void m1() {

	}
}

class B14 extends A14 {
	void m1() {
	}
}