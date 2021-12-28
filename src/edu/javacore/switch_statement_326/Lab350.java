package edu.javacore.switch_statement_326;

public class Lab350 {
	public static void main(String[] args) {
		char ch = 'A';
		if (ch >= 65 && ch <= 90) {
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("cheracter is vowel");
			default:
				System.out.println("cheracter is consonant");

			}
		} else {
			System.out.println("invalid albhabet");
		}
	}
}
