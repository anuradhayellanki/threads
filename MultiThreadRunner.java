package com.cashapona.threads.jun17;
/**
 * @author Anuradha
 */
class ThreadCount extends Thread{
	ThreadCount(){
		super("Overriding Thread class");
		System.out.println("New thread created "+this);
		start();
	}
	public void run() {
		try {
			for(int i=0;i<7;i++) {
				System.out.println("New thread created "+this);
				Thread.sleep(500);	
			}
		}catch(Exception e) {
			System.out.println("currently executing run is terminated");
		}
	}
}
public class MultiThreadRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCount count=new ThreadCount();
		try {
			while(count.isAlive()) {
				System.out.println("main method thread will be available");
				Thread.sleep(1000);
			}
		}catch(Exception e) {
				System.out.println("main method thread is interrupted");
		}
		System.out.println("main method thread run is interrupted");
	}
}