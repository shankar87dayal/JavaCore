package edu.javacore.Object;

public class Lab565 {
	public static void main(String[] args) {
		Hello23 h = null;
		System.out.println("Ref Created");
		h = new Hello23();
	}
}

class Hello23 {

	{
		System.out.println("Instance Block");

	}
	static {
		System.out.println("static Block");
	}
}