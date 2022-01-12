package edu.javacore.Method.pro;

public class Lab722 {
	public static void main(String[] args) {
		Hello34 h = new Hello34();
		String a = h.add(10 , " Ravi");
		System.out.println(a);
		String b = h.add("Raushan ", 30);
		System.out.println(b);
	}
}

class Hello34 {
	String add(int a, String b) {
		System.out.println("add(int, string)");
		return a + b;
	}

	String add(String a, int b) {
		System.out.println("add(string ,int)");
		return a + b;
	}
}
