package com.corejava.class_Class_threads;

class Account {
	int bal = 970;

	public void withdrow(int amt) {
		if (bal >= amt) {
			System.out.println(Thread.currentThread().getName() + "is going to withdrow......." + bal);

			try {
				Thread.sleep(1200);
			} catch (Exception e) {
			}
			bal -= amt;
			System.out.println(Thread.currentThread().getName() + "is completed withdrow.......:" + bal);

		} else {
			System.out.println("No funds for " + Thread.currentThread().getName());
		}
	}

	public int getBal() {
		return bal;
	}
}

class AccountThread implements Runnable {
	Account acc = null;

	AccountThread(Account acc) {
		this.acc = acc;
		Thread t1 = new Thread(this, "A");
		Thread t2 = new Thread(this, "B");
		t1.start();
		t2.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			acc.withdrow(225);
			if (acc.getBal() < 0) {
				System.out.println("Amount is Overdrawn....");
			}
		}
	}
}

public class Lab1385 {
	public static void main(String[] args) {
		Account acc = new Account();
		new AccountThread(acc);
	}
}
