package com.corejava.class_I_O;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Lab1428 {
	public static void main(String[] args) throws Exception {
		try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Address ad = new Address("33/1", "Mathikere");
			Student3 st = new Student3(99, "sri", 65799999, ad);
			Student3.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Address {
	String aid;
	String street;

	Address(String aid, String street) {
		this.aid = aid;
		this.street = street;
	}

	public String toString() {
		return aid + "\t" + street;
	}
}

class Student3 implements Serializable {
	int sid;
	transient String name = "XXXX";
	long phone = 33333;
	static int count = 3;
	Address add;

	Student3(int sid, String name, long phone, Address add) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}

	public String toString() {
		return sid + "\t" + name + "\t" + phone + "\t" + count + "\n" + add;
	}
}
