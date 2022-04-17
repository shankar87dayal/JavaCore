package com.corejava.class_Enum;

public class Lab1405 {
	public static void main(String[] args) {
		Course_1 c1 = Course_1.JAVA;
		System.out.println(c1);
		System.out.println(Course_1.JDBC);
		System.out.println(Course_1.SERVLETS);
		System.out.println(Course_1.SPRING);
		Course_1 c2 = Course_1.SPRING;
		c2.setFacultyName("Dande");
		c2.setDuration(3);
		c2.setFee(5000);
		System.out.println(c2);

	}
}

enum Course_1 {
	JAVA("DK", 2, 3000.0), JDBC("sri", 1, 4000.0), SERVLETS("Nivas", 1, 4000), SPRING;
	private String facultyName;
	private int duration;
	private double fee;

	Course_1() {
	}

	private Course_1(String facultyName, int duration, double fee) {
		this.facultyName = facultyName;
		this.duration = duration;
		this.fee = fee;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String toString() {
		return ordinal() + "\t" + name() + "\t" + facultyName + "\t" + duration + "\t" + fee;
	}
}