package edu.javacore.Method.pro;

public class Lab734 {
	public static void main(String[] args) {
		Hello46 h = new Hello46();
		h.show(null);
	}
}

class Hello46 {
	void show(String str) {
		System.out.println("Show (String)");
	}

	void show(char[] str) {
		System.out.println("Show (char[])");
	}
}
