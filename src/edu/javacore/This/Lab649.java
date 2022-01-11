package edu.javacore.This;

public class Lab649 {
	public static void main(String[] args) {
		Hello28 h = new Hello28();
		System.out.println(h.a);
	}
}

class Hello28 {
	{
		System.out.println(a);
	}
	int a = 20;
}
