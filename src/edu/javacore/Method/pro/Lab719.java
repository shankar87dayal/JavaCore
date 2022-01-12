package edu.javacore.Method.pro;

public class Lab719 {
	public static void main(String[] args) {
		Hello31 h = new Hello31();
		int a = h.add(10, 20);
		System.out.println(a);
		h.add(10, 20);
	}
}

class Hello31 {
	int add(int a, int b) {
		System.out.println("add()int,int");
		return a + b;
	}

	void add(int a, int b) {
		System.out.println("add(int , int)");
	}
}