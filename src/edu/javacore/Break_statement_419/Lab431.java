package edu.javacore.Break_statement_419;

public class Lab431 {
	public static void main(String[] args) {
		int ab = 10;
		jlc: {
			System.out.println("jlc block starts");
			sd: {
				System.out.println("sd block starts");
				if (ab == 10)
					break jlc;
				System.out.println("sd block ends");
			}
			System.out.println("jlc block ends");
		}
		System.out.println("completed");
	}
}
