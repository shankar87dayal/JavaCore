package edu.javacore.This;

public class Lab648 {
	public static void main(String[] args) {
		Hello27 h = new Hello27();
		System.out.println(h.a);
	}
}

class Hello27 {
	{
	this.a = 90;
	}
	int a = 20;
}
