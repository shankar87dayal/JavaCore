package edu.javacore.This;

public class Lab674 {
	public static void main(String[] args) {
		Happy3 h = new Happy3();
		System.out.println(h.a);
	}
}

class Happy3 {
	final int a;
	 Happy3() {
		a = 10;
	}
	 Happy3(int a) {}
}
