package edu.javacore.Method.pro;

public class Lab706 {
	public static void main(String[] args) {
		Hello18 h = new Hello18();
		System.out.println(h.show(10));
	}
}

class Hello18 {
	boolean show(int x) {
		System.out.println("show() ");
		return true;
	}
}
