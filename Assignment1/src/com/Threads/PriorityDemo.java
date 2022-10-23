package com.Threads;

public class PriorityDemo extends Thread {
  public void run() {
	  System.out.println("thread is running");
  }
  public static void main(String args[]) {
	  PriorityDemo priorityDemo1=new PriorityDemo();
	  PriorityDemo priorityDemo2=new PriorityDemo();
	  PriorityDemo priorityDemo3=new PriorityDemo();
	  /*System.out.println(priorityDemo1.getPriority());
	  System.out.println(priorityDemo2.getPriority());
	  System.out.println(priorityDemo3.getPriority());*/
	  priorityDemo1.setPriority(10);
	  priorityDemo2.setPriority(5);
	  priorityDemo3.setPriority(2);
	  System.out.println(priorityDemo1.getPriority());
	  System.out.println(priorityDemo2.getPriority());
	  System.out.println(priorityDemo3.getPriority());
	  priorityDemo1.start();
	  priorityDemo2.start();
	  priorityDemo3.start();
  }
}
