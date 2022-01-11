package edu.javacore.This;

public class Lab641 {
	public static void main(String[] args) {
		System.out.println(Hello20.b);
	}
}

class Hello20 {
	static {
		System.out.println(b);
	}
	static int b=20
}