package com.corejava.class_Enum;

public class Lab1407 {
	public static void main(String[] args) {
		Direction_2 arr[] = Direction_2.values();
		for (Direction_2 d : arr) {
			System.out.println(d.ordinal() + "\t" + d.name());
		}
		try {
			Direction_2 d = Direction_2.valueOf("east");
			System.out.println("** Direction found with the name ");
		} catch (IllegalArgumentException e) {
			System.out.println("** No direction found with the name:");
		}
		Direction_2 d = Direction_2.valueOf("EAST");
		System.out.println(d);
	}
}

enum Direction_2 {

	EAST(0), NORTH(90), WEST(180), SOUTH(270);
	int angle;

	Direction_2(int angle) {
		this.angle = angle;
		System.out.println("Direction_2() Def Cons**");
	}

	static {
		System.out.println("** Static Block in Direction_2 Class\n");
	}
}
