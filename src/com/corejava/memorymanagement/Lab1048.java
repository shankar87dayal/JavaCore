package com.corejava.memorymanagement;

public class Lab1048 {
	public static void main(String[] args) {
		Student st = new Student(88);
		st.finalize();
		System.out.println("sid: " + st.sid);
	}
}

class Student {
	int sid;

	public Student(int sid) {
		this.sid = sid;
	}

	public void finalize() {
		System.out.println("finalize: " + sid);
	}
}