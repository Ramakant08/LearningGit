package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> hashSet =new HashSet();
     hashSet.add("X");
     hashSet.add("y");
     hashSet.add("X");
     hashSet.add("z");
     
     Iterator<String> itr=hashSet.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
	}
	}

}
