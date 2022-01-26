package edu.javacore.Access_Modifier1;

public class Lab911 {
	public static void main(String[] args) {
		B16 bobj = new B16();
		bobj.m1();
	}
}

class A16 {
	void m1() {

	}
}

class B16 extends A16 {
	static void m1() {
	}
}