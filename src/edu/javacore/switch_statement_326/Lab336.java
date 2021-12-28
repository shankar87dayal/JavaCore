package edu.javacore.switch_statement_326;

public class Lab336 {
	public static void main(String[] args) {
		int a = 98;
		final int x = 96;
		switch (a) {
		case 98:
			System.out.println("val - 98");
		case x:
			System.out.println("final variable - x");
		}
	}
}
