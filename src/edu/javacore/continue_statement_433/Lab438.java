package edu.javacore.continue_statement_433;

public class Lab438 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\n" + i);
			for (int j = 1; j <= 5; j++, System.out.println("j++")) {
				if (i == 3)
					continue;
				System.out.println("Raushan" + j);
			}
		}
	}

}
