package com.corejava.class_Enum;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Lab1410 {
	public static void main(String[] args) {
		Set<Direction_C_3> set = EnumSet.allOf(Direction_C_3.class);
		System.out.println(set);
		Map<Direction_C_3, Integer> map = new EnumMap<Direction_C_3, Integer>(Direction_C_3.class);
		map.put(Direction_C_3.EAST, 0);
		map.put(Direction_C_3.NORTH, 90);
		map.put(Direction_C_3.SOUTH, 270);
		map.put(Direction_C_3.WEST, 180);
		System.out.println(map);
	}
}

enum Direction_C_3 {
	EAST, NORTH, WEST, SOUTH;
}