package edu.javacore.Method.pro;

public class Lab715 {
	public static void main(String[] args) {
		Hello27 h = new Hello27();
		h.show((byte)12);
	}
}

class Hello27 {
	void show(byte x) {
		System.out.println("show(byte)");
	}
}
