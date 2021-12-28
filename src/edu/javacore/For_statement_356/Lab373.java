package edu.javacore.For_statement_356;

public class Lab373 {
	public static void main(String[] args) {
		int a;
		char ch;
		float f;
		String str;
		for (a = 5, ch = 'A', f = 12345.78f, str = ""; a > 0; a--, ch++, f /= 10, str += ch) {
			System.out.println(a + "\t" + ch + "\t" + f + "\t" + str);
		}
	}
}
