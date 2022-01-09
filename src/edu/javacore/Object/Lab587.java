package edu.javacore.Object;

public class Lab587 {
	public static void main(String[] args) {
		Hello46 h = new Hello46();
	}
}

class Hello46 {
	{
		int a = 10;
		System.out.println("I.Blocl1: " + a);
	}
	{
		String a = "Raushan";
		System.out.println("I.Block2: " + a);
	}
}