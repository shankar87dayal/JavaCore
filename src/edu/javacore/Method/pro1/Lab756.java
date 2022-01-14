package edu.javacore.Method.pro1;

public class Lab756 {
	public static void main(String[] args) {
		Hello11 h = new Hello11();
		h.show(10);
		h.show(10, 20);
		h.show(10, 20, 30);

	}
}

class Hello11 {
	void show(int a, int... arr) {
		System.out.println("\nshow(int,int...)");

	}
}
