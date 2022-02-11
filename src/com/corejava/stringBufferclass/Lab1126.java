package com.corejava.stringBufferclass;

public class Lab1126 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JLC");
		sb.insert(2, null);
		System.out.println(sb);
	}
}
