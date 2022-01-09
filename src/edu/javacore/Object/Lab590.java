package edu.javacore.Object;

public class Lab590 {
public static void main(String[] args) {
	System.out.println("Main: " +Hello50.a);
}
}
class Hello50{
	static {
		int a=10;
		System.out.println("s.Block1: " + a);
	}
}