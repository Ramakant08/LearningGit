package com.Threads;

public class ThreadDemo1 extends Thread{
     Table t;
     ThreadDemo1(Table t){
    	 this.t=t;
     }
     public void run() {
    	 t.printTable(5);
     }
}
