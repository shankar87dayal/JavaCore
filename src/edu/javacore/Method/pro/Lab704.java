package edu.javacore.Method.pro;

public class Lab704 {
	public static void main(String[] args) {
		Hello16 h = new Hello16();
		h.show(10);
		System.out.println("Hello guys");
	}
}

class Hello16 {
	int show(int x) {
		System.out.println("show() ");
		return 'A';
	}
}
