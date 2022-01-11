package edu.javacore.This;

public class Lab653 {
	public static void main(String[] args) {
		Hello32 h = new Hello32();
		System.out.println("main: " + h.a);
	}
}

class Hello32 {
	int a = 10;
	{
		System.out.println("IB: " + this.a);
		System.out.println("IB: " + this.b);
	}
	int b = 20;
	{
		System.out.println("IB1: " + this.a);
		System.out.println("IB1: " + this.b);
	}
}
