package com.corejava.class_Class_threads;

public class Lab1381 {
	public static void main(String[] args) {
		MyThread_2 t1 = new MyThread_2();
		t1.setPriority(10);
		System.out.println(t1);

	}
}

class MyThread_2 extends Thread {

}
