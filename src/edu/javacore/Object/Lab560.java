package edu.javacore.Object;

public class Lab560 {
	public static void main(String[] args) {
		Hello18 h = new Hello18();
		System.out.println("Main:" + h.a);
	}
}

class Hello18 {
	int a;
	{
		a = 10;
		System.out.println("initialized : " + a);
	}
}