package com.corejava.Pattern.Design;

public class Lab1212 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(Hello4.getHello4());
	}
}

class Hello4 {
	private static Hello4 h1 = new Hello4();
	private static Hello4 h2 = new Hello4();

	private Hello4() {
	}

	public static Hello4 getHello4() {
		if (Math.random() > 0.5)
			return h1;
		else
			return h2;

	}
}