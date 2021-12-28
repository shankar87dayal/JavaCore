package edu.javacore.switch_statement_326;

public class Lab340 {
	public static void main(String[] args) {
		int a = 10;
		final int x = 20;
		switch (a) {
		case 10:
			System.out.println("ten");
		case x:
			System.out.println("twenty");
		case 'A':
			System.out.println("char -A");
		case 10 + 20 + 15:
			System.out.println("CONSTANT EXPR");
		}
	}
}
