package edu.javacore.Inheritance;

public class Lab834 {
	public static void main(String[] args) {
		new C21().show();
	}
}

class A21 {
	int a = 10;
}

class B21 extends A21 {
	String a = "Ravi";

}

class C21 extends B21 {
	boolean a = true;

	void show() {
		float a = 99.99f;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}