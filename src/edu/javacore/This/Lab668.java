package edu.javacore.This;

public class Lab668 {
	public static void main(String[] args) {
		new Hello47();
	}
}

class Hello47 {
	{
		System.out.println("IB");
	}

	Hello47() {
		new Hello47();
		System.out.println("DC");
	}
}
