package com.corejava.classRuntime;

import java.math.BigInteger;

public class Lab1205 {
	public static void main(String[] args) {
		BigInteger bint1 = new BigInteger("4");
		System.out.println(bint1.bitCount());// Number of total bits Allocated
		long val = 9223372036854775807L; // max Value
		long val2 = 100;
		long res = val + val2;
		System.out.println(res);

	}
}
