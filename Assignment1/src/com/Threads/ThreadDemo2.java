package com.Threads;

public class ThreadDemo2 extends Thread{
	 Table t;
     ThreadDemo2(Table t){
    	 this.t=t;
     }
     public void run() {
    	 t.printTable(500);
     }
}
