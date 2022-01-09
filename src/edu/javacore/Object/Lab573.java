package edu.javacore.Object;

public class Lab573 {
	public static void main(String[] args) {
		Hello31 h = new Hello31();
		System.out.println("Hello Raushan");
	}
}

class Hello31 {
	{
		System.out.println("iib1");
	}
	{
		System.out.println("iib2");
	}
}