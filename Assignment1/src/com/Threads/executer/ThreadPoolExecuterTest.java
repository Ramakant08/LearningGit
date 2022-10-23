package com.Threads.executer;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
public class ThreadPoolExecuterTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPoolExecutor threadPoolExecutor =(ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++) {
        	Task task =new Task("task "+i);
        	System.out.println("Created "+ task.getName());
        	threadPoolExecutor.execute(task);
        }
        threadPoolExecutor.shutdown();
        
        while(!threadPoolExecutor.isTerminated()) {}
        System.out.println("All requests completed");
	}

}
