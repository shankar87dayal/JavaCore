package edu.javacore.Method.pro1;

public class Lab772 {
	public static void main(String[] args) {
		Hello27 h = new Hello27();
		h.show(null,null);
	}
}

class Hello27 {
	void show(int...b) {
		System.out.println("show(int...)");
	}
	void show(String...valas) {
		System.out.println("m1(String...)");
	}
}
