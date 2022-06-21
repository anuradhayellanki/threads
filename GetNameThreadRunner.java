package com.cashapona.threads.jun17;
/**
 * @author Anuradha
 */
class ThreadName extends Thread{
	ThreadName(String threadName){
		/*
		 * invoking the constructor of the Thread(super) class
		 */
		super(threadName);
	}
	/*
	 * overriding run() method
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class GetNameThreadRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * creating two threads and setting their names using the constructor of the class
	 */
	ThreadName name1=new ThreadName("Java programming");
	ThreadName name2=new ThreadName("core java");
	System.out.println("Thread 1: "+name1.getName());
	System.out.println("Thread 2: "+name2.getName());

	name1.start();
	name2.start();
	}
}
