package edu.javacore.Inheritance;

public class Lab818 {
	public static void main(String[] args) {
		Hello15 hello = new Hello15();
	}
}

class Hai15 {
	{
		System.out.println("Hai->I.B");
	}
}

class Hello15 extends Hai15 {
	{
		System.out.println("Hello-> I.B");
	}
}
