package edu.javacore.continue_statement_433;

public class Lab443 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			System.out.println(i);
			if (i == 3)
				continue;
			System.out.println("**AFTER");
		}
	}
}
