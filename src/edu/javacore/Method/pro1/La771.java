package edu.javacore.Method.pro1;

public class La771 {
	public static void main(String[] args) {
		Hello26 h = new Hello26();
		h.show(null);
	}
}

class Hello26 {
	void show(int...b) {
		System.out.println("show(int...)");
	}
	void show(String...valas) {
		System.out.println("m1(String...)");
	}
}
