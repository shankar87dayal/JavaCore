package com.corejava.class_I_O;

import java.io.*;

public class Lab1425 {
	public static void main(String[] args) throws Exception {
		try (FileInputStream fis = new FileInputStream("D:\\info.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			Object obj = ois.readObject();
			System.out.println(obj);
			System.out.println("Object Deserialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
