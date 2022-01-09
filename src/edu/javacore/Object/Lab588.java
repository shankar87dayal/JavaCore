package edu.javacore.Object;

public class Lab588 {
	public static void main(String[] args) {
		Hello47 h = new Hello47();
	}
}

class Hello47 {
	{
		int a = 10;
		System.out.println("i.Block1: " + a);
	}
	{
		System.out.println("i.Block2: " + a);
	}
}
