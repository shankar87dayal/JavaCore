package edu.javacore.Array.Dec.cons.and.initialization_505;

public class Lab505 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		System.out.println("Len: " + arr.length);
		for (int i = 0; i <= arr.length; i++)
			System.out.println("-----");
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
