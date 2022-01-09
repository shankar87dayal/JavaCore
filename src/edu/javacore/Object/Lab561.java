package edu.javacore.Object;

public class Lab561 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello19.a);
	}
}

class Hello19 {
	static int a;
	{
		a = 10;
		System.out.println("Initialized: " + a);
	}
}