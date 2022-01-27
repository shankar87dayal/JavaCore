package edu.javacore.polymorphism;

public class Lab943 {
	public static void main(String[] args) {
		C cobj = new C();
		cobj.show();
	}
}

class A8 {
	int x = 99;
}

class B8 extends A8 {
	String x = "Ravi";
}

class C extends B8 {
	boolean x = false;

	void show() {
		char x = 'R';
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}