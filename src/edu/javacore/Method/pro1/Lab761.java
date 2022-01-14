package edu.javacore.Method.pro1;

public class Lab761 {
	public static void main(String[] args) {
		Hello16 h = new Hello16();
		h.show("Ravi", 10);
	}
}

class Hello16 {
	void show(String str, int... arr1) {
		System.out.println("\nshow(String,int...)");
	}
}
