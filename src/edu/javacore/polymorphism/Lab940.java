package edu.javacore.polymorphism;

public class Lab940 {
	public static void main(String[] args) {
		B5 bobj = new B5();
		bobj.show();
	}
}

class A5 {
	int x = 10;
}

class B5 extends A5 {
	String x = "Ravi";

	void show() {
		B5 ref1 = this;
		A5 ref2 = this;
		System.out.println(ref1.x + "\t" + ref2.x);
	}
}
