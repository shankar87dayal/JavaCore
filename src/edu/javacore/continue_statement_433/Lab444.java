package edu.javacore.continue_statement_433;

public class Lab444 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			if (i == 3)
				continue;
			i++;
			System.out.println("**AFTER");
		}
	}
}
