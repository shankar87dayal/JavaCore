package edu.javacore.Object;

public class Lab555 {
	public static void main(String[] args) {
		new Hello15().b = 99;
		System.out.println(new Hello15().b);
	}
}

class Hello15 {
	static int b;
}