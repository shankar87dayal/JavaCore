package com.corejava.class_Immutable;

public class Lab1215 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sri");
		long arr[] = new long[] {31903290L, 65799999L};
		Student2 st = new Student2(98, sb, arr);
		System.out.println(st);
		System.out.println("\n modifying the sb and arr");
		sb.append("Nivas");
		arr[0] = 78787878;
		System.out.println(st);
		System.out.println("\n Accessing name and phone and modifying");
		StringBuilder sb1 = st.getname();
		long arr2[] = st.getphone();
		sb.append("Dande");
		arr[1] = 96969696;
		System.out.println(st);
	}
}

final class Student2 {
	private final int sid;
	private final StringBuilder name;
	private final long[] phone;

	Student2(int sid, StringBuilder name, long[] phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}

	public int getSid() {
		return sid;
	}

	public StringBuilder getname() {
		return name;
	}

	public long[] getphone() {
		return phone;
	}

	public String toString() {
		String msg = "Sid:" + sid + ",Name:" + name +",Phone Numbers:";
		for (long phoneNumber : phone) {
			msg = msg + "," + phoneNumber;
		}
		return msg;
	}
}