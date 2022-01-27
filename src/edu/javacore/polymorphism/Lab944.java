package edu.javacore.polymorphism;

public class Lab944 {
	public static void main(String[] args) {
		C1 cobj = new C1();
		cobj.show();
	}
}

class A9 {
	int x = 99;
}

class B9 extends A9 {
	String x = "Ravi";
}

class C1 extends B9 {
	boolean x = false;

	void show() {
		char x = 'R';
		System.out.println(x);
		C1 cref = this;
		B9 bref = this;
		A9 aref = this;
		System.out.println(cref.x);
		System.out.println(bref.x);
		System.out.println(aref.x);
	}
}
