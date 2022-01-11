package edu.javacore.This;

public class Lab652 {
	public static void main(String[] args) {
		Hello31 h = new Hello31();
		System.out.println("main: " + h.a);
	}
}

class Hello31 {
	{
		System.out.println("IB: " + this.a);
	}
	int a = 20;
	{
		System.out.println("IB1: " + this.a);
	}
}
