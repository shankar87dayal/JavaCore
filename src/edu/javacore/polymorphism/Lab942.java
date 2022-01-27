package edu.javacore.polymorphism;

public class Lab942 {
	public static void main(String[] args) {
		B7 bobj = new B7();
		((A7) bobj).x = 99;
//	A7 aobj = new A7();
//	aobj.x = 88;
		System.out.println(bobj.x + "\t" + ((A7) bobj).x);
	}
}

class A7 {
	int x = 10;
}

class B7 extends A7 {
	String x = "Ravi";
}