package edu.javacore.Object;

public class Lab595 {
	public static void main(String[] args) {
		Hello54 h = new Hello54();
		System.out.println("\n  Main: " + h.a);
	}
}

class Hello54 {
	{
		int a = 10;
		String a = "Raushan";
		System.out.println("I.Block: " + a);
	}
}