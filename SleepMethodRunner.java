package com.cashapona.threads.jun17;
/**
 * @author Anuradha
 *
 */
public class SleepMethodRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
				System.out.print(i+" ");
			}
		}catch(Exception e) {
			System.out.println(e);

		}
	}
}
