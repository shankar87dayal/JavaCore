package edu.javacore.This;

public class Lab642 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello21.b);
	}
}

class Hello21 {
	static {
		System.out.println("SB: " + Hello21.b);
	}
	static int b = 20;
}
