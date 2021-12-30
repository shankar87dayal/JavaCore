package edu.javacore.Array.Dec_446;

public class Lab455 {
	public static void main(String[] args) {
		boolean arr[];
		arr = new boolean[3];
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		System.out.println("----");
		arr[0]=true;
		arr[1]=true;
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
