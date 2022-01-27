package edu.javacore.polymorphism;

import edu.javacore.Access_Modifier.C2;

public class Lab945 {
	public static void main(String[] args) {
		C2 cobj = new C2();
		cobj.show();
		B10 bref = cobj;
		bref.x = "Ravi";
		A10 aref = cobj;
		aref.x = 88;
		cobj.show();
	}
}

class A10 {
	int x = 99;
}

class B10 extends A10 {
	String x = "Raushan";
}

class C2 extends B10 {
	boolean x = false;

	void show() {
		char x = 'R';
		System.out.println(x);
		C2 cref = this;
		B10 bref = this;
		A10 aref = this;
		System.out.println(cref.x);
		System.out.println(bref.x);
		System.out.println(aref.x);
	}
}
