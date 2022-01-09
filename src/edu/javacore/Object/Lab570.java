package edu.javacore.Object;

public class Lab570 {
	public static void main(String[] args) {
		Hello28 h = new Hello28();
		System.out.println("Main: " + Hello28.a);
	}
}

class Hello28 {
	static int a;
	int b;
	static {
		a = 10;
		Hello28 h = new Hello28();
		h.b = 20;
		System.out.println("static Block:" + h.b + "\t" + h.a);
	}
}