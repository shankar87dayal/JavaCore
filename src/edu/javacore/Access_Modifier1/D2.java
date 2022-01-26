package edu.javacore.Access_Modifier1;

import edu.javacore.Access_Modifier.A2;

public class D2 extends A2 {
	public void showD2() {
		System.out.println("D->show()");
		System.out.println("#Direct#");
//	System.out.println(a);
//	System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("# D- Object  #");
		D2 ob = new D2();

//	System.out.println(ob.a);
//	System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);

		System.out.println("#super keyword #");

//	System.out.println(super.a);
//	System.out.println(super.b);
		System.out.println(super.c);
		System.out.println(super.d);

		System.out.println("# A- Object  #");

		A2 ob1 = new A2();
//	System.out.println(ob1.a);
//	System.out.println(ob1.b);
//	System.out.println(ob1.c);
		System.out.println(ob1.d);

	}
}
