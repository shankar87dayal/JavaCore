package com.corejava.class_Class_threads;

public class Lab1386 {
	public static void main(String[] args) {
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		MyThreadT th1 = new MyThreadT(h1);
		MyThreadT th2 = new MyThreadT(h1);
//	MyThreadT th2 = new MyThreadT(h2);
		th1.start();
		th2.start();

	}
}

class MyThreadT extends Thread {

	Hello h = null;

	MyThreadT(Hello h) {
		this.h = h;
	}
}

class Hello {
	synchronized void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + "- SHOW: " + i + "\t" + this);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}
