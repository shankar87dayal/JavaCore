package edu.javacore.Method.pro1;

public class Lab759 {
	public static void main(String[] args) {
		Hello14 h = new Hello14();
		h.show(10);
	}
}

class Hello14 {
	void show(int... arr1) {
		System.out.println("\nshow(int...)");
	}

	void show(int[] arr1) {
		System.out.println("\nshow(int[])");
	}
}
