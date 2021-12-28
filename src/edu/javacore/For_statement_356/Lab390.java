package edu.javacore.For_statement_356;

public class Lab390 {
	public static void main(String[] args) {
		char ch = 'A';
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols <=rows; cols++) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}
