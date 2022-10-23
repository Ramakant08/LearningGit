package com.Threads.AtomicPackage;

public class TestAtomic {

	public static void main(String args[]) throws InterruptedException{
		WithAtomic withAtomic1= new WithAtomic();
		
		Thread thread1 =new Thread(withAtomic1,"first");
		Thread thread2 =new Thread(withAtomic1,"second");
		
		thread1.start();
		thread1.join();
		
		thread2.start();
		thread1.join();
		
		System.out.println("sum after thread,:"+withAtomic1.sum);
		
		
	}
}
