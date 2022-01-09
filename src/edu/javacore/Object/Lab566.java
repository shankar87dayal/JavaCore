package edu.javacore.Object;

public class Lab566 {
	public static void main(String[] args) {
		Hello24 h = new Hello24();
		new Hello24();
	}
}

class Hello24 {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("static Block");
	}
}