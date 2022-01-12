package edu.javacore.Method.pro;

public class Lab721 {
	public static void main(String[] args) {
		Hello33 h = new Hello33();
		int a = h.add(10, 20);
		System.out.println(a);
		String b = h.add("Ravi ", 30);
		System.out.println(b);
	}
}

class Hello33 {
	int add(int a, int b) {
		System.out.println("add(int,int)");
		return a + b;
	}

	String add(String a, int b) {
		System.out.println("add(string ,int)");
		return a + b;
	}
}
