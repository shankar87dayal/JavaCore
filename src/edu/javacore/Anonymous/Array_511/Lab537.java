package edu.javacore.Anonymous.Array_511;

public class Lab537 {
	public static void main(String[] args) {
		int arr[][] = null;
		arr = new int[3][];
		int tmp[] = { 99, 88, 66, 77, 55 };
		System.out.println("Len: " + arr.length);
		arr[0] = new int[4];
		arr[1] = new int[] { 10, 20, 30 };
		arr[2] = tmp;
		for (int ar[] : arr) {
			for (int a : ar) {
				System.out.println("\t" + a);
				System.out.println();

			}
		}

	}
}
