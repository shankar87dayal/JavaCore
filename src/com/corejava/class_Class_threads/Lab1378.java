package com.corejava.class_Class_threads;

public class Lab1378 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("jjlc");
		MyThreadd2 t1 = new MyThreadd2(tg);
		MyThreadd2 t2 = new MyThreadd2(tg);
	}
}

class MyThreadd2 implements Runnable {
	MyThreadd2(ThreadGroup tg) {
		Thread t = new Thread(tg, this);
		t.start();
	}

	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println("Thread Name: " + th.getName());
		System.out.println("Thread Group Name: " + tg.getName());

	}
}
