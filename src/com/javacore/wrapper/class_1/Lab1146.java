package com.javacore.wrapper.class_1;

public class Lab1146 {
	public static void main(String[] args) {
		short s1 = 126;
		short s2 = 130;
		short s3 = 126;
		Short sref1 = new Short(s1);
		Short sref2 = new Short(s2);
		Short sref3 = new Short(s3);
		System.out.println("-- hashcode()--");
		System.out.println(sref1.hashCode());
		System.out.println(sref2.hashCode());
		System.out.println(sref3.hashCode());
		System.out.println("--equals--");
		System.out.println(sref1.equals(sref2));
		System.out.println(sref1.equals(sref3));

	}

}
