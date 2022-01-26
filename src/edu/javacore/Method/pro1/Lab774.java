package edu.javacore.Method.pro1;

public class Lab774 {
	public static void main(String[] args) {
		Hello29 h = new Hello29();
		h.show(null);
	}
}

class Hello29 {
	void show(int...b) {
		System.out.println("show(int...)");
	}
}
