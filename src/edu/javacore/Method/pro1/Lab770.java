package edu.javacore.Method.pro1;

public class Lab770 {
	public static void main(String[] args) {
		Hello25 h = new Hello25();
		h.show(10, 20);
	}
}

class Hello25 {
	void show(int...b) {
		System.out.println("show(int...)");
	}
	void show(long a, long b) {
		System.out.println("show(Long , Long)");
	}
}
