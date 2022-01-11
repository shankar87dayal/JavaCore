package edu.javacore.This;

public class Lab665 {
	public static void main(String[] args) {
		new Hello44();
	}
}

class Hello44 {
	int a = 10;
	Hello44 h;
	{
		System.out.println("IB");
	}
	static {
		System.out.println("SB");
	}
}
