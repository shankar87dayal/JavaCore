package edu.javacore.This;

public class Lab673 {
	public static void main(String[] args) {
		Happy2 h = new Happy2();
		System.out.println(h.a);
	}
}

class Happy2 {
	final int a;

	public Happy2() {
		a = 10;
	}
}
