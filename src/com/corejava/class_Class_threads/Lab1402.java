package com.corejava.class_Class_threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab1402 {
	public static void main(String[] args) {
		My_Thread_1 th = new My_Thread_1();
		ExecutorService ser = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			ser.execute(th);
		}
	}
}

class My_Thread_1 implements Runnable {
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + "\t" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(th.getName() + "task completed **");
	}
}
