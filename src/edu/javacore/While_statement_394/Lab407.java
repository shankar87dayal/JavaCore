package edu.javacore.While_statement_394;

public class Lab407 {
	public static void main(String[] args) {
		char ch = 'A';
		int r = 0;
		while (r < 5) {
			int c = 0;
			while (c <= r) {
				System.out.print(ch + " ");
				c++;
				ch++;
			}
			System.out.println();
			r++;
		}
	}
}
