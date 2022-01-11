package edu.javacore.This;

public class Lab670 {
	public static void main(String[] args) {
		new Hello49();
	}
}

class Hello49 {
	{
		System.out.println("IB");
	}

	Hello49() {
		new Hello47();
		System.out.println("DC");
	}

	Hello49(int a) {
		this();
		System.out.println("1- Args con");
	}

}
