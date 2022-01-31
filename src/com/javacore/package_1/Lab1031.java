package com.javacore.package_1;

public class Lab1031 {
	public static void main(String[] args) {
		showClassinfo("Ravi");
		Student stu = new Student();
		showClassinfo(stu);
		Object obj = new Object();
		showClassinfo(obj);
	}

	static void showClassinfo(Object obj) {
		Class cls = obj.getClass();
		System.out.println("Class Name:" + cls.getName());
		Class scls = cls.getSuperclass();
		if (scls != null)
			System.out.println("super class:" + scls.getName());
		else
			System.out.println("No super class");
	}
}

class person {
}

class Student extends person {
}
