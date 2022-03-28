package com.corejava.class_Legacy_Array.set_interface;

import java.util.*;

public class Lab1324 {
public static void main(String[] args) {
	//TreeSet tset = new TreeSet();
	TreeSet tset = new TreeSet(new StringDescComparator());
	tset.add("manish");
	tset.add("Sri");
	tset.add("Nivas");
	tset.add("Abhi");
	tset.add("DK");
	Iterator it = tset.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
} 
class StringDescComparator implements Comparator{
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof String && ob2 instanceof String) {
			String s1 = (String)ob1;
			String s2 = (String)ob2;
			return s2.compareTo(s1); 
			//return s1.compareTo(s2);
		}
		return 0;
	}
}