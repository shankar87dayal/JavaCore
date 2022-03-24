package com.corejava.Pattern.Design;

public class Lab1211 {
	public static void main(String[] args) {
		Hello3 h = Hello3.getHello3();
		System.out.println(h);
		System.out.println(Hello3.getHello3());
		System.out.println(Hello3.getHello3());
		Hello3 h2 = (Hello3) h.clone();
		System.out.println(h2);
	}
}

class Hello3 {
	private static Hello3 INS = new Hello3();

	private Hello3() {
	}

	public static Hello3 getHello3() {
		return INS;
	}

	protected Object clone() {
		return this;
	}
}
