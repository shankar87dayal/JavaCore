package com.javacore.wrapper.class_1;

public class Lab1175 {
public static void main(String[] args) {
	Character ch1 = new Character('A');
	Character ch2 = new Character('D');
	Character ch3 = new Character('A');
	Character ch4 = new Character('a');
	System.out.println("--hashCode()--");
	System.out.println(ch1.hashCode());
	System.out.println(ch2.hashCode());
	System.out.println(ch3.hashCode());
	System.out.println(ch4.hashCode());
	System.out.println("-- equals --");
	System.out.println(ch1.equals(ch2));
	System.out.println(ch1.equals(ch2));
	System.out.println(ch1.equals(ch2));
}
}
