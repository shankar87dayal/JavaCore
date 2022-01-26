package edu.javacore.Method.pro1;

public class Lab773 {
	public static void main(String[] args) {
		Hello28 h = new Hello28();
		h.show(null);
	}
}

class Hello28 {
	void show(int...b) {
		System.out.println("show(int...)");
	}
	void show(String valas) {
		System.out.println("m1(String)");
	}
}
