package edu.javacore.Method.pro1;

public class Lab760 {
	public static void main(String[] args) {
		Hello15 h = new Hello15();
		h.show(10,"Ravi");
	}
}

class Hello15 {
	void show(int... arr1,String str) {
		System.out.println("\nshow(int...,String)");
	}
}
