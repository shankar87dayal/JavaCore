package edu.javacore.This;

public class Lab639 {
	public static void main(String[] args) {
		System.out.println(Heii.b);
	}
}

class Heii{
	static {
		b = 10;
	}
	static int b = 90;
}
