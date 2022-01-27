package edu.javacore.polymorphism;

public class Lab946 {
	public static void main(String[] args) {
		A11 aobj = new A11();
		aobj.x = "HELLO";
		System.out.println(aobj.x);
	}

}

class A11 {
}

class B11 extends A11 {
	String x = "Ravi";
}