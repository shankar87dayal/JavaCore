package edu.javacore.Break_statement_419;

public class Lab427 {
	public static void main(String[] args) {
		final boolean b1 = true;
		for (; b1;) {
			System.out.println("Raushan");
			if (false)
				break;
		}
		System.out.println("AFTER");
	}
}
