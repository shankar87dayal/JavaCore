package edu.javacore.switch_statement_326;

public class Lab346 {
	public static void main(String[] args) {
		int a = 23;
		switch (a) {
		case 10:
			System.out.println("ten");
			break;
		default:
			System.out.println("DEFAULT");
		case 10 + 10:
			System.out.println("twenty");
			break;
		}
	}
}
