package com.corejava.class_I_O;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1426 {
	public static void main(String[] args) throws Exception {
		try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Student1 st = new Student1(99, "sri", 65799999);
			Student1.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Person {
	String name = "XXXX";
	long phone = 33333;
}

class Student1 extends Person implements Serializable {
	int sid;
	static int count = 3;

	Student1(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return sid + "\t" + name + "\t" + phone + "\t" + count;
	}
}