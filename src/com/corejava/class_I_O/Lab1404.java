package com.corejava.class_I_O;

public class Lab1404 {
	public static void main(String[] args) throws Exception {
		System.out.println("ENter Data[* -> Exit]");
		int count = 0;
		while (true) {
			int asc = System.in.read();
			System.out.println(++count + "\t" + asc + "\t" + (char) asc);
			if (asc == '*')
				break;
		}
		System.out.println("\n AFTER LOOP");
		while (true) {
			int asc = System.in.read();
			System.out.println(++count + "\t" + asc + "\t" + (char) asc);
			if (asc == '*')
				break;
		}
	}
}
