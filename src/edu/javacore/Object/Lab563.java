package edu.javacore.Object;

public class Lab563 {
	public static void main(String[] args) {
		System.out.println(Hello21.a);
		System.out.println(Hello21.a);
	}
}

class Hello21 {
	static int a = 10;
	{
		System.out.println("instance Block");
	}
	static {
		System.out.println("static Block");
	}
}