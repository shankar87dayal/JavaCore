package edu.javacore.continue_statement_433;

public class Lab440 {
	public static void main(String[] args) {
		sd: for (int i = 0; i < 5; i++, System.out.println("\n" + i)) {
			System.out.println("\n" + i);
			jlc: for (int j = 0; j < 5; j++, System.out.println("j++")) {
				if (i == 3)
					continue jlc;
			}
		}
	}
}
