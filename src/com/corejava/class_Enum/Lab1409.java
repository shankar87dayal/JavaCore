package com.corejava.class_Enum;

public class Lab1409 {
	public static void main(String[] args) {
		Direction_C_2.EAST.show();
		Direction_C_2.WEST.show();
		Direction_C_2.NORTH.show();
		Direction_C_2.SOUTH.show();
	}
}

enum Direction_C_2 {
	EAST() {
		void show() {
			System.out.println("showing East Direction");
		}
	},
	WEST() {
		void show() {
			System.out.println("showing WEST Direction");
		}
	},
	NORTH() {
		void show() {
			System.out.println("showing NORTH Direction");
		}
	},
	SOUTH() {
		void show() {
			System.out.println("showing SOUTH Direction");
		}
	};
	abstract void show();
}
