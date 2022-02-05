package com.corejava.memorymanagement;

public class Lab1049 {
	public static void main(String[] args) {
		Student1 st = new Student1("JLC- 001");
		new Student1("JLC- 001");
		System.runFinalizersOnExit(true);
		System.out.println("main completed");
	}
}

class Student1 {
	String sid;

	Student1(String sid) {
		this.sid = sid;
		System.out.println("Object Created with id: " + sid);
	}

	protected void finalize() {
		System.out.println("FINALIZE-" + sid);
	}
}