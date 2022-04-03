package com.corejava.class_I_O;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Lab1427 {
	public static void main(String[] args) throws Exception {
		try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Student2 st = new Student2(99, "sri", 65799999);
			Student2.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Student2 implements Serializable {
	int sid;
	transient String name = "XXXX";
	long phone = 33333;
	static int count = 3;

	Student2(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return sid + "\t" + name + "\t" + phone + "\t" + count;
	}
}