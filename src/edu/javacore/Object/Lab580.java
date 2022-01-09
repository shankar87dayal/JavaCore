package edu.javacore.Object;

public class Lab580 {
	public static void main(String[] args) {
		Hello38 h = new Hello38();
	}
}

class Hello38 {
	int a = 10;
	static int b = 20;
	{
		int c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}