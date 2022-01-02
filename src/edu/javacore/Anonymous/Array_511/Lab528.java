package edu.javacore.Anonymous.Array_511;

public class Lab528 {
public static void main(String[] args) {
	int arr[][]=null;
	arr =new int[3][2];
	arr[0][0]=10;     arr[0][1]=20;
	arr[1][0]=30;     arr[1][1]=40;
	arr[2][0]=40;     arr[2][1]= 60;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("\t" + arr[i][j]);

			}
			System.out.println();

		}
	}
}
