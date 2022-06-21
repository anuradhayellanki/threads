package com.cashapona.threads.jun17;
/**
 * @author Anuradha
 * there are two ways to create a thread one is by extending Thread class and 
 * second one is by implementing Runnable interface
 */
class Task1 extends Thread{
	public void run() {
		System.out.println("task 1 started : ");
		for(int i=101;i<=105;i++) {
			System.out.print(i+" ");
		}
		System.out.println("task 1 done");
	}
}
class Task2 implements Runnable{
	public void run() {
		System.out.println("task 2 started : ");
		for(int i=201;i<=205;i++) {
			System.out.print(i+" ");
		}
		System.out.println("task 2 done : ");
	}
}
public class ThreadRunner {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//task1
		System.out.println("task 1 kicked off");
		Task1 task1 =new Task1();
		/*
		 * task1.run() , it will execute like a typical method not thread
		 */
		//task1.run();
		/*
		 * given priority to thread, min_priority=1 Norm-priority=5 and Max-priority=10
		 */
		task1.setPriority(1);
		task1.start();
		
		//task2
		System.out.println("task 2 kicked off");
		Task2 task2=new Task2();
		Thread thread=new Thread(task2);
		thread.setPriority(10);
		thread.start();
		
		/*
		 * join(), wait for thread to die
		 * after completion of task1 thread, task2 thread can be started
		 */
		task1.join();
		thread.join();
		
		//task3
		System.out.println("task 3 kicked off");
		for(int i=301;i<=305;i++) {
			System.out.print(i+" ");
		}
		System.out.println("task 3 done");
		System.out.println("main done");
	}
}
