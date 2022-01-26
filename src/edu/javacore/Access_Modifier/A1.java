package edu.javacore.Access_Modifier;

public class A1 {
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;

	public void showA1() {
		System.out.println("A-> show()");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
