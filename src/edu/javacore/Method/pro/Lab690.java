package edu.javacore.Method.pro;

public class Lab690 {
	public static void main(String[] args) {
		Hello6 h = new Hello6();
		h.show();
	}
}

class Hello6 {
	int a;
	static int b;

	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}