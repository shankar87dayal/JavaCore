package edu.javacore.interface_1;

interface Inter_F_6 {
}

class A11 implements Inter_F_6 {
}

class B11 extends A11 {
}

class C11 extends A11 {
}

public class Lab988 {
	public static void main(String[] args) {
		Inter_F_6 arr[] = new A11[3];
		arr[0] = new A11();
		arr[1] = new B11();
		arr[2] = new C11();
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
