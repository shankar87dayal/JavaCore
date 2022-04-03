package com.corejava.class_I_O;

import java.io.BufferedInputStream;
import java.nio.Buffer;

public class Lab1406 {
	public static void main(String[] args) {
		System.out.println("Enter data");
		try (BufferedInputStream bis = new BufferedInputStream(System.in);) {
			while (true) {
				int asc = bis.read();
				if (asc == 13)
					break;
				char ch = (char) asc;
				System.out.println(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

