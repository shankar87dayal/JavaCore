package com.corejava.class_Class_threads;

public class Lab1376 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("jjlc");
		MyThreadd t1 = new MyThreadd(tg, "Hello");
		MyThreadd t2 = new MyThreadd(tg, "Hai");
	}
}

class MyThreadd extends Thread {
	MyThreadd(ThreadGroup tg, String tname) {
		super(tg, tname);
		start();
	}

	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println("Thread Name: " + th.getName());
		System.out.println("Thread Group Name: " + tg.getName());

	}
}
