package com.Threads.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class TestCallable {

	public static void main(String args[]) throws InterruptedException,ExecutionException {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		System.out.println("factorial of 5:");
	    Future<Long>result=executorService.submit(new FactorialService(7)); //way to call a callable()
	    System.out.println("factorial of 20");
	    Future<Long>result2=executorService.submit(new FactorialService(6)); //way to call a callable()
        System.out.println(result.get());	
        System.out.println(result2.get());	
        executorService.shutdown();
	}
}
//future is to store the result