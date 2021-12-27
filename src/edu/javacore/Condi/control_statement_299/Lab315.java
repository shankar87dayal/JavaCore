package edu.javacore.Condi.control_statement_299;

public class Lab315 {
	public static void main(String[] args) {
		int a = 0;
		if (a++ == 0)
			System.out.println("zero");
		else if (a++ == 1)
			System.out.println("one");
		else
			System.out.println("not matching");
		System.out.println(a);
	}
}
