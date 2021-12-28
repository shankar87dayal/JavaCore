package edu.javacore.For_statement_356;

public class Lab389 {
	public static void main(String[] args) {
		int val = 2147483640;
		for (; val > 200; val++) {
			System.out.println(val);
		}
		System.out.println("After loop: " + val);
	}
}
