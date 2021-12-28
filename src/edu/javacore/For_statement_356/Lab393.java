package edu.javacore.For_statement_356;

public class Lab393 {
	public static void main(String[] args) {
		int n = 5;
		char ch = 'A';
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n - r; c++) {
				System.out.print("  ");
			}
			for (int c = 0; c <= r; c++) {
				System.out.println(ch + " ");
			}
			System.out.println();
			ch++;
		}
	}
}
