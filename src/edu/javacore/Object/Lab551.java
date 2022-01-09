package edu.javacore.Object;

public class Lab551 {
	public static void main(String[] args) {
		Hello11 h1 = new Hello11();
		System.out.println(h1.b);
		h1.b = 99;
		System.out.println(h1.b);
	}
}

class Hello11 {
	static int b;
}