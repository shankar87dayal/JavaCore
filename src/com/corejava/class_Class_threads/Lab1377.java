package com.corejava.class_Class_threads;

public class Lab1377 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("jjlc");
		MyThreadd1 t1 = new MyThreadd1(tg, "Hello");
		MyThreadd1 t2 = new MyThreadd1(tg, "Hai");
	}
}

class MyThreadd1 implements Runnable {
	MyThreadd1(ThreadGroup tg, String tname) {
		Thread t = new Thread(tg, this, tname);
		t.start();
	}

	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println("Thread Name: " + th.getName());
		System.out.println("Thread Group Name: " + tg.getName());

	}
}
