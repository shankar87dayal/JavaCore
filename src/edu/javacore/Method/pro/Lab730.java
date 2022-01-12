package edu.javacore.Method.pro;

public class Lab730 {
	public static void main(String[] args) {
		Hello42 h = new Hello42();
		h.show('A', 'B');
	}
}

class Hello42 {
	void show(int a, int b) {
		System.out.println("show(int-int)");
	}

	void show(long a, char b) {
		System.out.println("show(long-char)");
	}
}
