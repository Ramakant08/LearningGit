package com.Threads;

public class Table {
    
	synchronized void printTable(int n) {
		for(int i=0;i<5;i++) {
			System.out.println(i*n);
		}
		try {
			Thread.sleep(500);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
}
