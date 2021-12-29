package edu.javacore.While_statement_394;

public class Lab406 {
	public static void main(String[] args) {
		char ch = 'A';
		int r = 0;
		while (r < 5) {
			int c = 0;
			while (c <= r) {
				System.out.print(ch +" ");
				c++;
			}
			System.out.println();
			r++;
		}
	}
}
