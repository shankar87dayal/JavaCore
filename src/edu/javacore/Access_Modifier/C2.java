package edu.javacore.Access_Modifier;

public class C2 {
	public void showC2() {
		System.out.println("C->show()");
		A2 a1 = new A2();
		System.out.println("#A- Object#");
//	 System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	}
}
