package edu.javacore.This;

public class Lab654 {
	public static void main(String[] args) {
		Hello33 h = new Hello33();
		System.out.println("main: " + h.a);
	}
}

class Hello33 {
	int a = 10;
	{
		System.out.println("IB: " + a);
		System.out.println("IB: " + this.b);
	}
	int b = 20;
	{
		System.out.println("IB1: " + a);
		System.out.println("IB1: " + b);
	}
}
