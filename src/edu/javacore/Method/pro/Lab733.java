package edu.javacore.Method.pro;

public class Lab733 {
	public static void main(String[] args) {
		Hello45 h = new Hello45();
		h.show(null);
	}
}

class Hello45 {
	void show(String str) {
		System.out.println("Show (String)");
	}

	void show(Hello45 str) {
		System.out.println("Show (Hello44)");
	}
}
