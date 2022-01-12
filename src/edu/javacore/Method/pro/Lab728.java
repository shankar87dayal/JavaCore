package edu.javacore.Method.pro;

public class Lab728 {
	public static void main(String[] args) {
		Hello40 h = new Hello40();
		h.show('A', 'B');
	}
}

class Hello40 {
	void show(int a, char b) {
		System.out.println("show(int, char)");
	}

	void show(long a, char b) {
		System.out.println("show(long,char)");
	}
}
