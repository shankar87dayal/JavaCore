package com.javacore.wrapper.class_1;

public class Lab1174 {
	public static void main(String[] args) {
		Character ch1 = new Character('A');
		Character ch2 = new Character('D');
		Character ch3 = new Character('A');
		Character ch4 = new Character('a');
		System.out.println("--compareTo(Character)--");
		System.out.println(ch1.compareTo(ch2));
		System.out.println(ch1.compareTo(ch3));
		System.out.println(ch1.compareTo(ch4));
		System.out.println("--compare(Character,Character)--");
		System.out.println(Character.compare(ch1, ch2));
		System.out.println(Character.compare(ch1, ch3));
		System.out.println(Character.compare(ch1, ch4));
	}
}
