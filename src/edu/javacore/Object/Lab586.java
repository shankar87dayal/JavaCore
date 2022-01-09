package edu.javacore.Object;

public class Lab586 {
	public static void main(String[] args) {
		Hello45 h = new Hello45();
		System.out.println("Main: " + h.a);
	}
}

class Hello45 {
	static int a = 10;
	static {
		System.out.println("s.Block1: " + a);
	}
	static {
		System.out.println("s.Block2: " + a);
	}
}
