package edu.javacore.Access_Modifier;

public class A2 {
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;

	public void showA2() {
		System.out.println("A-> show()");
		System.out.println("#Direct#");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("# A- Object  #");
		A2 ob = new A2();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
	}
}
