package edu.javacore.Break_statement_419;

public class Lab428 {
	public static void main(String[] args) {
		sd: for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		for (int i = 10; i < 15; i++) {
			System.out.println(i);
			break sd;
		}
	}
}
