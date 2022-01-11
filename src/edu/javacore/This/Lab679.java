package edu.javacore.This;

public class Lab679 {
	public static void main(String[] args) {
		Happy8 h = new Happy8();
		System.out.println(h.a);
	}
}

class Happy8 {
	static final int a;
	static {
		System.out.println("ST Block: " + a);
	}
}
