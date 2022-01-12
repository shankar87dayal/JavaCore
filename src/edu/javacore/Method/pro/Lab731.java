package edu.javacore.Method.pro;

public class Lab731 {
	public static void main(String[] args) {
		Hello43 h = new Hello43();
		h.show(null);
		h.show("Ravi");
		h.show(h);
	}
}

class Hello43 {
	void show(String str) {
		System.out.println("Show (String)");
	}

	void show(Object str) {
		System.out.println("Show (object)");
	}
}
