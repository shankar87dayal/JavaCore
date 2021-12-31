package edu.javacore.Array.Dec.Construction_456;

public class Lab498 {
	public static void main(String[] args) {
		byte b = 99;
		char ch = 'A';
		float f1 = 123.456f;
		int arr[] = new int[4];
		arr[0] = b;
		arr[1] = ch;
		arr[2] = (int) f1;
		arr[3] = 101;
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
