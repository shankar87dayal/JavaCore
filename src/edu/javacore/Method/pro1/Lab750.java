package edu.javacore.Method.pro1;

public class Lab750 {
	public static void main(String[] args) {
		Hello5 h = new Hello5();
		h.sum(12, 23);
		h.sum(12, 32, 43);
	}
}

class Hello5 {
	void sum(int a, int b) {
		System.out.println("-sum(int, int )");
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println("-sum(int, int,int )");
		System.out.println(a + b + c);
	}
}