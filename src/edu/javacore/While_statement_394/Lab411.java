package edu.javacore.While_statement_394;

public class Lab411 {
	public static void main(String[] args) {
		char ch = 'A';
		int r = 0;
		do {
			int c = 0;
			do {
				System.out.print(ch + " ");
				c++;
			} while (c <= r);
			System.out.println();
			r++;
		} while (r < 5);
	}
}
