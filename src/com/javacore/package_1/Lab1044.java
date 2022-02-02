package com.javacore.package_1;

public class Lab1044 {
	public static void main(String[] args) {
		Hello2 h1 = new Hello2(99);
		Hello2 h2 = h1.clone();
		System.out.println(h1 == h2);
		System.out.println(h1.a);
		System.out.println(h2.a);
	}
}

class Hello2 {
	int a;

	Hello2(int a) {
		this.a = a;
	}

	public Hello2 clone() {
		return new Hello2(this.a);
	}
}
