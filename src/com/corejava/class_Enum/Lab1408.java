package com.corejava.class_Enum;

public class Lab1408 {
	public static void main(String[] args) {
		Direction_C_1 d = Direction_C_1.EAST;
		switch (d) {
		case EAST:
			System.out.println("EAST Direction Selected");
			break;

		case NORTH:
			System.out.println("NORTH Direction Selected");
			break;
		case WEST:
			System.out.println("WEST Direction Selected");
			break;
		case SOUTH:
			System.out.println("SOUTH Direction Selected");
			break;

		}
	}
}

enum Direction_C_1 {
	EAST, NORTH, WEST, SOUTH;
}