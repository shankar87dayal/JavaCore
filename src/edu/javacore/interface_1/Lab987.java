package edu.javacore.interface_1;

interface Inter_F_5 {
}

class A10 implements Inter_F_5 {
}

class B10 extends A10 {
}

class C10 extends A10 {
}

public class Lab987 {
	public static void main(String[] args) {
		Inter_F_5 arr[] = new Inter_F_5[3];
		arr[0] = new A10();
		arr[1] = new B10();
		arr[2] = new C10();
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
