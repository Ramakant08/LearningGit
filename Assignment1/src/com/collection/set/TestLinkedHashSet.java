package com.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
 
	public static void main(String args[]) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
			linkedHashSet.add("A");
			linkedHashSet.add("B");
			linkedHashSet.add("C");
			
			if(linkedHashSet.isEmpty()) {
				linkedHashSet.add("D");
			}
			else
				linkedHashSet.add("E");
			
			Iterator<String> itr=linkedHashSet.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			linkedHashSet.remove("A");
			
			System.out.println("\n");
			Iterator<String> itr2=linkedHashSet.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
			
			System.out.println(linkedHashSet.remove("B"));
			System.out.println(linkedHashSet.size());
			
		}

}
