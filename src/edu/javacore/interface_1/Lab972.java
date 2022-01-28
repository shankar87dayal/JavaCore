package edu.javacore.interface_1;

interface InterF1 {
	void show();
}

class A1 {
	public void show() {
		System.out.println("A1-> show()");
	}
}

class B1 extends A1 implements InterF1 {
}

public class Lab972 {
	public static void main(String[] args) {
		B1 ref = new B1();
		ref.show();
	}
}
