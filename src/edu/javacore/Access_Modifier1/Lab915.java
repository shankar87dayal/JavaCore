package edu.javacore.Access_Modifier1;

public class Lab915 {
	public static void main(String[] args) {
		new B20().m1();
	}
}

class A20 {
	private void m1() {
	}
}

class B20 extends A20 {
	int m1()
	{
		return 0;
	}

}