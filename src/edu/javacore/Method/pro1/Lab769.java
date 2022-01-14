package edu.javacore.Method.pro1;

public class Lab769 {
	public static void main(String[] args) {
		Hello24 h = new Hello24();
		h.show(10, 20);
	}
}

class Hello24 {
	void show(int...b) {
		System.out.println("show(int...)");
	}
	void show(int a, int b) {
		System.out.println("m1(int,int)");
	}
}
