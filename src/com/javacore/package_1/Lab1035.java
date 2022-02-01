package com.javacore.package_1;

public class Lab1035 {
	public static void main(String[] args) {
		Student_2 str1 = new Student_2(99, "ravi");
		System.out.println(str1);
		System.out.println("\n*** Default limplementation ***");
		String cname = str1.getClass().getName();
		int hc = str1.hashCode();
		String hx = Integer.toHexString(hc);
		String msg = cname + "@" + hx;
		System.out.println(msg);
	}
}

class Student_2 {
	int sid;
	String name;

	Student_2(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}
}