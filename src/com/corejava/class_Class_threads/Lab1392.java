package com.corejava.class_Class_threads;

import java.util.ArrayList;

public class Lab1392 {
	public static void main(String[] args) {
		Hello_C3 h1 = new Hello_C3();
		MyThreadT_C3 th1 = new MyThreadT_C3(h1);
		MyThreadT_C3 th2 = new MyThreadT_C3(h1);
		th1.start();
		th2.start();
	}
}

class MyThreadT_C3 extends Thread {
	Hello_C3 h;

	MyThreadT_C3(Hello_C3 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}

}

class Hello_C3 {
	 void show() {
		ArrayList al = new ArrayList();
		Thread th = Thread.currentThread();
		synchronized(al) {
		for (int i = 0; i < 5; i++) {
			try {
//				wait(1000);
				al.wait(1000);
//		Thread.sleep(1000);
				System.out.println(th.getName() + "-show: " + "\t" + this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
}