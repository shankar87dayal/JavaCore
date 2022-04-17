package com.corejava.class_Enum;

public class Lab1403 {
	public static void main(String[] args) {
		Course c1 = Course.JAVA;
		System.out.println(c1);
		System.out.println(Course.JDBC);
		System.out.println(Course.SERVLETS);
		System.out.println(Course.SPRING);
		Course c2 = Course.SPRING;
		c2.setId(4);
		c2.setName("SPRING");
		c2.setFacultyName("Dande");
		c2.setDuration(3);
		c2.setFee(5000);
		System.out.println(c2);

	}
}

class Course {
	public static Course JAVA = new Course(1, "java", "DK", 2, 3000.0);
	public static Course JDBC = new Course(2, "JDBC", "sri", 1, 4000.0);
	public static Course SERVLETS = new Course(3, "SERVLETS", "Nivas", 1, 4000);
	public static Course SPRING = new Course();
	private int id;
	private String name;
	private String facultyName;
	private int duration;
	private double fee;

	Course() {
	}

	public Course(int id, String name, String facultyName, int duration, double fee) {
		this.id = id;
		this.name = name;
		this.facultyName = facultyName;
		this.duration = duration;
		this.fee = fee;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
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
		return (id + "\t" + name + "\t" + facultyName + "\t" + duration + "\t" + fee);
	}
}