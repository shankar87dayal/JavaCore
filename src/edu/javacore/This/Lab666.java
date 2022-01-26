package edu.javacore.This;

public class Lab666 {
	public static void main(String[] args) {
		new Hello45();
	}
}

class Hello45 {
	int a = 10;
	Hello45 h = new Hello45();
	{
		System.out.println("IB");
	}
	static {
		System.out.println("SB");
	}
}
