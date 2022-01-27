package edu.javacore.polymorphism;

public class Lab937 {
	public static void main(String[] args) {
		B2 bobj = new B2();
		bobj.x = 99;
		System.out.println(bobj.x);
	}
}

class A2 {
	int x = 10;
}

class B2 extends A2 {
	String x = "Ravi";
}
