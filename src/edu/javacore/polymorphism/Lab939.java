package edu.javacore.polymorphism;

public class Lab939 {
	public static void main(String[] args) {
		B4 bobj = new B4();
		bobj.show();
		System.out.println(bobj.x);
	}
}

class A4 {
	int x = 10;
}

class B4 extends A4 {
	String x = "Ravi";

	void show() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
