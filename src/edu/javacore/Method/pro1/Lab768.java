package edu.javacore.Method.pro1;

public class Lab768 {
	public static void main(String[] args) {
		Hello23 h = new Hello23();
		h.show(10, 20);
	}
}

class Hello23 {
	void show(int...b) {
		System.out.println("show(int...)");
	}
}
