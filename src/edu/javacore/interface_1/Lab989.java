package edu.javacore.interface_1;

interface Inter_F_7 {
}

class A12 implements Inter_F_7 {
}

class B12 extends A12 {
}

class C12 extends A12 {
}

public class Lab989 {
	public static void main(String[] args) {
		Inter_F_7 arr[] = null;
		arr = new B12[3];
		arr[0] = new A12();
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
