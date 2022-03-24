package com.corejava.Pattern.Design;

public class Lab1210 {
	public static void main(String[] args) {
		Hello2 h = Hello2.getHello2();
		System.out.println(h);
		System.out.println(Hello2.getHello2());
		System.out.println(Hello2.getHello2());
	}
}

class Hello2 {
	private static Hello2 INS = null;

	private Hello2() {
	}

	public static Hello2 getHello2() {
		if (INS == null)
			INS = new Hello2();
		return INS;
	}
}
