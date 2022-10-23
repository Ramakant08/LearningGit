package com.collection.list;

import java.util.Iterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector<String> vec=new Vector(); //vector is thread safe
     vec.addElement("a");
     vec.addElement("b");
     vec.addElement("c");
     
     Iterator<String> itr=vec.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
	}
	}
}
