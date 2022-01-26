package edu.javacore.Access_Modifier1;

public class Lab901 {
	public static void main(String[] args) {
		B obj = new B(99);
		System.out.println(obj.getx());

	}
}

class A7 {
	private int x;

	A7(int x) {
		this.x = x;
	}

	int getx() {
		return this.x;
	}
}

class B extends A7 {
	B(int x) {
		super(x);
	}
}
