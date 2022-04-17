package com.corejava.class_Enum;

public class Lab1406 {
	public static void main(String[] args) {
		Direction_1 d1 = null;
//	d1= new Direction_1("EAST",0);
		d1 = Direction_1.EAST;
		System.out.println(d1);
		System.out.println(Direction_1.NORTH);
		System.out.println(Direction_1.WEST);
		System.out.println(Direction_1.SOUTH);

	}
}

enum Direction_1 {

	EAST, NORTH, WEST, SOUTH;
	Direction_1() {
		System.out.println("Direction() Def Cons**");
	}

	static {
		System.out.println("** Static Block in Direction_1 Class");
	}
}
