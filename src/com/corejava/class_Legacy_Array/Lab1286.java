package com.corejava.class_Legacy_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab1286 {
	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("SD");
		col.add("Dende");
		Iterator it = col.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
			if (obj.equals("sri"))
				it.remove();

		}
		System.out.println(col);
	}
}