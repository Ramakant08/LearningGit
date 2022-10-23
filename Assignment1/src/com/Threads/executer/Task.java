package com.Threads.executer;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
 private String name;
 public Task(String name) {
	 this.name=name;
 }
 public String getName() {
	 return name;
 }
 public void setName(String name) {
	 this.name=name;
 }
 public void run() {
	 try {
	// Math.random();
	 System.out.println("running "+name);
	 TimeUnit.SECONDS.sleep(100);
	 }catch(InterruptedException ex) {
		 ex.printStackTrace();
	 }
 }
}
