package edu.javacore.polymorphism;

public class Lab936 {
	public static void main(String[] args) {
		A1 aobj = new B1();
		aobj.x = 99;
		System.out.println(aobj.x);
	}
}

class A1 {
	int x = 10;
}

class B1 extends A1 {
	String x = "Ravi";
}
