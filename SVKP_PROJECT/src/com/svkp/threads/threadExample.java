package com.svkp.threads;

public class threadExample extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		threadExample obj=new threadExample();
		Thread tobj=new Thread(obj);
		tobj.start();
	}

}
