package com.corejava.class_Immutable;

public class Lab1216 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sri");
		long arr[] = new long[] { 31903290L, 65799999L };
		Student3 st = new Student3(98, sb, arr);
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

final class Student3 {
	private final int sid;
	private final StringBuilder name;
	private final long[] phone;

	Student3(int sid, StringBuilder name, long[] phone) {
		this.sid = sid;
		this.name = new StringBuilder(name);
		this.phone = new long[phone.length];
		System.arraycopy(phone, 0, this.phone, 0, phone.length);
	}

	public int getSid() {
		return sid;
	}

	public StringBuilder getname() {
		return name;
	}

	public long[] getphone() {
		long arr[] = new long[phone.length];
		System.arraycopy(phone, 0, arr, 0, phone.length);
		return arr;
	}

	public String toString() {
		String Msg = sid + "," + name;
		for (long val : phone)
			Msg += "," + val;
		return Msg;
	}
}
