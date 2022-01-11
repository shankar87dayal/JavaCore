package edu.javacore.This;

public class Lab659 {
	public static void main(String[] args) {
		System.out.println("main: " + Hello38.a);
	}
}

class Hello38 {
	 static int a = 10;
	 {
		System.out.println("IB: " + this);
		Hello38 h1 = new Hello38();

	}
}
