package edu.javacore.This;

public class Lab681 {
	public static void main(String[] args) {
		System.out.println(Happy10.a);
	}
}

class Happy10 {
	static final int a = 10;
	static {
		System.out.println("ST Block: ");
	}
}
