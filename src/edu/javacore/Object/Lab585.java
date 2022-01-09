package edu.javacore.Object;

public class Lab585 {
	public static void main(String[] args) {
		Hello44 h = new Hello44();
		System.out.println("Main: " + h.a);
	}
}

class Hello44 {
	int a = 10;
	{
		System.out.println("i.Block1: " + a);
	}
	{
		System.out.println("i.Block2: " + a);
	}
}