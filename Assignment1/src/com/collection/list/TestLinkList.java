package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkList {
  
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		Iterator<String> itr=ll.iterator();
	     while(itr.hasNext()) {
	    	 System.out.println(itr.next());
		}
	}
}
