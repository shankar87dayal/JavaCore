package edu.javacore.Inheritance;

public class Lab835 {
	public static void main(String[] args) {
		new C22().show();
	}
}

class A22 {
	int a = 10;
}

class B22 extends A22 {
	String a = "Ravi";

}

class C22 extends B22 {
	boolean a = true;

	void show() {
		float a = 99.99f;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(super.super.a);
	}
}
