package edu.javacore.Object;

public class Lab589 {
	public static void main(String[] args) {
		Hello48 h = new Hello48();
		System.out.println("Main: " + h.a);
	}
}

class Hello48 {
	{
		int a = 10;
		System.out.println("i.Block1: " + a);
	}
}
