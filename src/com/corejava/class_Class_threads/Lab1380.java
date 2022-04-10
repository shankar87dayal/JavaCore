package com.corejava.class_Class_threads;

public class Lab1380 {
	public static void main(String[] args) {
		MyThread_1 t1 = new MyThread_1();
		t1.setPriority(0);
		t1.setPriority(11);

	}
}

class MyThread_1 extends Thread {

}