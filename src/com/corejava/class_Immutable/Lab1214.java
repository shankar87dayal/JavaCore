package com.corejava.class_Immutable;

public class Lab1214 {
	public static void main(String[] args) {
		Student1 st = new Student1(98, "Raushan", 7488010511L);
		System.out.println(st);
	}
}

final class Student1 {
	private final int sid;
	private final String name;
	private final long phone;

	public Student1(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public String getname() {
		return name;
	}

	public long getphone() {
		return phone;
	}

	public String toString() {
		return "sid: " + sid + ",Name: " + name + ", Phone: " + phone;
	}

}