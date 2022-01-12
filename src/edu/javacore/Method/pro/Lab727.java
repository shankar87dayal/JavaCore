package edu.javacore.Method.pro;

public class Lab727 {
	public static void main(String[] args) {
		Hello39 h = new Hello39();
		h.show('A', 'B');
	}
}

class Hello39 {
	void show(char a, int b) {
		System.out.println("show(char-int)");
	}

	void show(char a, long b) {
		System.out.println("show(char-long)");
	}
}
