package edu.javacore.This;

public class Lab650 {
	public static void main(String[] args) {
		Hello29 h = new Hello29();
		System.out.println(h.a);
	}
}

class Hello29 {
	{
		System.out.println(this.a);
	}
	int a = 20;
}
