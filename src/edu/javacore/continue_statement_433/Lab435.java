package edu.javacore.continue_statement_433;

public class Lab435 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5)
				continue;
			System.out.println("**AFTER");
		}
	}
}
