package com.corejava.memorymanagement;

public class Lab1045 {
	public static void main(String[] args) {
		System.out.println("** MAIN STARTED **");
		Runtime rt = Runtime.getRuntime();
		System.out.println("T: " + rt.totalMemory());
		System.out.println("M: " + rt.maxMemory());
	}
}
