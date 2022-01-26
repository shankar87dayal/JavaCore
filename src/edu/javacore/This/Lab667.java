package edu.javacore.This;

public class Lab667 {
	public static void main(String[] args) {
		new Hello46();
	}
}

class Hello46 {
	{
		System.out.println("IB");
	}

	Hello46() {
		System.out.println("DC");
		new Hello46();
	}
}
