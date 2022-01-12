package edu.javacore.Method.pro;

public class Lab703 {
	public static void main(String[] args) {
		Hello15 h = new Hello15();
		h.show(10);
		System.out.println("Hello guys");
	}
}

class Hello15 {
	int show(int x) {
		System.out.println("show() ");
		return 12L;
	}
}
