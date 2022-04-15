package com.corejava.class_Class_threads;

public class Lab1388 {
	public static void main(String[] args) {
		Hello_2 h1 = new Hello_2();
		Hello_2 h2 = new Hello_2();
		MyThreadT_2 th1 = new MyThreadT_2(h1);
		MyThreadT_2 th2 = new MyThreadT_2(h1);
//	MyThreadT_2 th2 = new MyThreadT_2(h2);
		th1.start();
		th2.start();

	}
}

class MyThreadT_2 extends Thread {

	Hello_2 h = null;

	MyThreadT_2(Hello_2 h) {
		this.h = h;
	}
}

class Hello_2 {
	synchronized static void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + "- SHOW: " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}
