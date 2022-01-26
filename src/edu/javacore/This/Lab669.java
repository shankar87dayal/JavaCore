package edu.javacore.This;

public class Lab669 {
	public static void main(String[] args) {
		new Hello48();
	}
}

class Hello48 {
	{
		System.out.println("IB");
	}

	Hello48() {
		new Hello47();
		System.out.println("DC");
	}

	Hello48(int a) {
		System.out.println("1- Args con");

	}
}
