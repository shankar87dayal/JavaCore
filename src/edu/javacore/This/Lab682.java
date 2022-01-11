package edu.javacore.This;

public class Lab682 {
	public static void main(String[] args) {
		System.out.println(Happy11.a);
	}
}

class Happy11 {
	static final int a;
	static {
		a = 10;
		System.out.println("ST Block: ");
	}
}
