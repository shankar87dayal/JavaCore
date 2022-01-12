package edu.javacore.Method.pro;

public class Lab724 {
	public static void main(String[] args) {
		Hello36 h = new Hello36();
		byte b = 20;
		h.add(b, 10);
		h.add(b, b);
	}
}

class Hello36 {
	void add( byte a, int b) {
		System.out.println("add(byte, int)");
	}
}
