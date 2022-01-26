package edu.javacore.Access_Modifier;

public class B2 extends A2 {
	public void showB2() {
		System.out.println("B-> show()");
		System.out.println("# Direct #");
		// System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("# A- Object  #");
		A2 ob = new A2();
		// System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		B2 ob1 = new B2();
		// System.out.println(ob1.a);
		System.out.println(ob1.b);
		System.out.println(ob1.c);
		System.out.println(ob1.d);

	}
}
