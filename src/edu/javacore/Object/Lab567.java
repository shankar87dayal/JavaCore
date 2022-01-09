package edu.javacore.Object;

public class Lab567 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello25.a);
	}
}

class Hello25 {
	static int a;
	{
		a = 10;
		System.out.println("Instance Block");
	}
}