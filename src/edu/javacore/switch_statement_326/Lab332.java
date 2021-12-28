package edu.javacore.switch_statement_326;

public class Lab332 {
	public static void main(String[] args) {
		Course c = Course.CORE;
		switch (c) {
		case ADV:
			System.out.println("100% placement gurantee");
		case CORE:
			System.out.println("No placement gurantee");
		}

	}
}

enum Course {
	CORE, ADV;
}
