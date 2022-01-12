package edu.javacore.Method.pro;

public class Lab732 {
	public static void main(String[] args) {
		Hello44 h = new Hello44();
		h.show(null);
		h.show("Ravi");
		h.show(h);
	}
}

class Hello44 {
	void show(String str) {
		System.out.println("Show (String)");
	}

	void show(Object str) {
		System.out.println("Show (Hello44)");
	}
}
