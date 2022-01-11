package edu.javacore.This;

public class Lab658 {
	public static void main(String[] args) {
		Hello37 h = new Hello37();
		System.out.println("main: " + h.a);
	}
}

class Hello37 {
	int a = 10;
	static {
		String a = "Ravi";
		Hello37 h1 = new Hello37();
		System.out.println("SB: " + a + "\t" + h1.a);
	}
}
