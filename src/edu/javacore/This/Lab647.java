package edu.javacore.This;

public class Lab647 {
	public static void main(String[] args) {
		Hello26 h = new Hello26();
		System.out.println(h.a);
	}
}

class Hello26 {
	{
		a = 90;
	}
	int a = 20;
}