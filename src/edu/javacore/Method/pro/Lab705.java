package edu.javacore.Method.pro;

public class Lab705 {
	public static void main(String[] args) {
		Hello17 h = new Hello17();
		System.out.println(h.show(10));
	}
}

class Hello17 {
	int show(int x) {
		System.out.println("show() ");
		return x + 1;
	}
}
