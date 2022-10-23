package com.collection.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
 
	public static void main(String args[]) {
		PriorityQueue<String> priorityQueue= new PriorityQueue<String>();
		 priorityQueue.add("A");
		 priorityQueue.add("V");
		 priorityQueue.add("N");
		 priorityQueue.add("I");
		 
		 Iterator<String> itr= priorityQueue.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 
	}
}
