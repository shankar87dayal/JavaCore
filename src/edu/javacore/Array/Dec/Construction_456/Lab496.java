package edu.javacore.Array.Dec.Construction_456;

public class Lab496 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		Object obj = arr;
		int arr2[] = (int[]) obj;
		for (int i = 0; i < arr2.length; i++)
			System.out.println(arr2[i]);
	}
}
