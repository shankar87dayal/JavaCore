package edu.javacore.innerclass_1;

import java.io.*;

abstract class Hello_2 {

};

class Hai_2 extends Hello_2 {
}

interface Ball1 {
}

interface Shape1 {
}

public class Lab1027 {
	public static void main(String[] args) {
		Hello_2 h2 = new Hai_2();
		Hello_2 h3 = new Hai_2();
		Hello_2 h4 = new Hello_2() {
		};
		Ball1 b2 = new Ball1() {
		};
		Cloneable c1 = new Cloneable() {
		};
		Serializable s1 = new Serializable() {
		};
		Shape sss = new Shape() {
		};
	}
}
