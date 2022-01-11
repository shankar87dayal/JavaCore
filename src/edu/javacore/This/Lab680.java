package edu.javacore.This;

public class Lab680 {
	public static void main(String[] args) {
		Happy9 h = new Happy9();
		System.out.println(h.a);
	}
}

class Happy9 {
	static final int a;
	static {
		System.out.println("ST Block: " + Happy9.a);
		a = 10;
	}
}
