package edu.javacore.For_statement_356;

public class Lab374 {
	public static void main(String[] args) {
		int i = 1;
		for (System.out.println("start"), System.out.println("begin"); i <= 5; i++, System.out
				.println("Updating"), System.out.println("Updating")) {
			System.out.println(i);
		}
	}
}
