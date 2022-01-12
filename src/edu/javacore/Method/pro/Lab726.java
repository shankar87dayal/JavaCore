package edu.javacore.Method.pro;

public class Lab726 {
	public static void main(String[] args) {
		Hello38 h = new Hello38();
		byte b = 20;
		h.add(b, b);
	}
}

class Hello38 {
	void add( byte a, int b) {
		System.out.println("add(byte, int)");
	}
	void add(int a, byte b) {
		System.out.println("add(int, byte)");
	}
}
