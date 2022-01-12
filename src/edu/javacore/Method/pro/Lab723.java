package edu.javacore.Method.pro;

public class Lab723 {
	public static void main(String[] args) {
		Hello35 h = new Hello35();
		byte b = 20;
		h.add(10, b);
		h.add(b, b);
	}
}

class Hello35 {
	void add(int a, byte b) {
		System.out.println("add(int,byte)");
	}
}