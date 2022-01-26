package edu.javacore.Method.pro;

public class DecompilerExample01 {

	static final int defaultValue= 10;
	public static void main(String[] args) {
		DecompilerExample01 decompileObject = new DecompilerExample01();
		System.out.println("Value of defaultValue is "+defaultValue);
		decompileObject.sum(200, 300);
		
	}

	static void sum(int firstNumber, int secondNumber) {
		System.out.println(firstNumber+secondNumber);
	}
}
