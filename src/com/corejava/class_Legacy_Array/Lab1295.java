package com.corejava.class_Legacy_Array;

import java.util.*;

public class Lab1295 {
public static void main(String[] args) {
	List list = new ArrayList();
	list.add("sri");
	list.add("Nivas");
	list.add("Dende");
	list.add("java");
	list.add("Nivas");
	list.add("JDBC");
	List list2 = list.subList(1,3);
	System.out.println(list);
	System.out.println(list2);
}
}
