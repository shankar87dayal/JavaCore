package edu.javacore.Method.pro1;

public class Lab755 {
	public static void main(String[] args) {
		Hello10 h = new Hello10();
		h.show();

	}
}

class Hello10 {
	void show(int a, int... arr) {
		System.out.println("\nshow(int,int...)");

	}
}