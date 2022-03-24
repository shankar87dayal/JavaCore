package com.corejava.Pattern.Design;

public class Lab1209 {
	public static void main(String[] args) {
		Hello1 h = Hello1.getHello1();
		System.out.println(h);
		System.out.println(Hello1.getHello1());
		System.out.println(Hello1.getHello1());
	}
}

class Hello1 {
	private static Hello1 INS = null;
	static {
		INS = new Hello1();
	}

	private Hello1() {
	}

	public static Hello1 getHello1() {
		return INS;
	}
}
