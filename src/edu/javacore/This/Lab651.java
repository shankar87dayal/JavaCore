package edu.javacore.This;

public class Lab651 {
	public static void main(String[] args) {
		Hello30 h = new Hello30();
		System.out.println("main: " + h.a);
	}
}

class Hello30 {
	{
		System.out.println("IB: " + this.a);
	}
	int a = 20;
	{
		System.out.println("IB1: " + a);
	}
}
