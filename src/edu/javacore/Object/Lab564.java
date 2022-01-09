package edu.javacore.Object;

public class Lab564 {
	public static void main(String[] args) {
		Hello22 h = null;
		System.out.println("Ref created");
	}
}

class Hello22 {
	static int a = 10;
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("static Block");
	}
}
