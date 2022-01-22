package edu.javacore.Inheritance;

public class Lab851 {
	public static void main(String[] args) {
		new B31();
	}
}

class A31 {
	A31(Object obj) {
		System.out.println("A(Object) cons");
	}
}

class B31 extends A31 {
	B31() {
		super(this);
		System.out.println("B21() D.C");
	}
}