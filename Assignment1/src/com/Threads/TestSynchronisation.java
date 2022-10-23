package com.Threads;

public class TestSynchronisation {
  public static void main(String args[]) {
	  Table table=new Table();
	  ThreadDemo1 threadDemo1=new ThreadDemo1(table);
	  ThreadDemo2 threadDemo2=new ThreadDemo2(table);
	  threadDemo1.start();
	  threadDemo2.start();
	  
  }
}
