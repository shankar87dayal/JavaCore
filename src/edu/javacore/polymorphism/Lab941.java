package edu.javacore.polymorphism;

public class Lab941 {
	public static void main(String[] args) {
		B6 bobj = new B6();
		bobj.x = "Ravi";
		A6 aobj = new A6();
		aobj.x = 88;
		bobj.show();

	}
}

class A6 {
	int x = 10;
}

class B6 extends A6 {
	String x = "Raushan";

	void show() {
		System.out.println(x);
		System.out.println(super.x);
	}
}