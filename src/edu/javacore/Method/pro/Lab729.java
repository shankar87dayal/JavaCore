package edu.javacore.Method.pro;

public class Lab729 {
	public static void main(String[] args) {
		Hello41 h = new Hello41();
		h.show('A', 'B');
	}
}

class Hello41 {
	void show(int a, int b) {
		System.out.println("show(int-int)");
	}

	void show(long a, long b) {
		System.out.println("show(long-char)");
	}
}
