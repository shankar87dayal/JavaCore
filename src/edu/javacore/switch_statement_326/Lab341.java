package edu.javacore.switch_statement_326;

public class Lab341 {
	public static void main(String[] args) {
		int a = 10;
		final int x = 20;
		switch (a) {
		case 10:
			System.out.println("ten"); break;
		case x:
			System.out.println("twenty");break;
		case 'A':
			System.out.println("char -A");break;
		case 10 + 20 + 15:
			System.out.println("CONSTANT EXPR");break;
		}
	}
}
