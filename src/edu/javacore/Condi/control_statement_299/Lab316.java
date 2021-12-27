package edu.javacore.Condi.control_statement_299;

public class Lab316 {
	public static void main(String[] args) {
		int a = 1;
		if (++a == 1)
			System.out.println("one");

		else if (++a == 2)
			System.out.println("two");
		else
			System.out.println("not matching");
		System.out.println(a);
	}
}
