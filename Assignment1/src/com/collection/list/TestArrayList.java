package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> al= new ArrayList<String>();
     //array list maintains an index that enhances the searching
     //but its updation is quite slow 
     
     al.add("1");
     al.add("2");
     al.add("3");
     
     if(al.isEmpty()) {
    	 al.add("5");
     }
     else
    	 al.add("6");
     
     for(int i=0;i<al.size();i++) {
    	 System.out.println(al.get(i));
     }
     al.remove(1);
     System.out.println("\n");
     for(int i=0;i<al.size();i++) {
    	 System.out.println(al.get(i));
     }
     
     // method 2:
     al.add("4");
     System.out.println("\n");
     for(String arrayListItem :al) {
    	 System.out.println(arrayListItem);
     }
     System.out.println("\n");
     
     //method using iterator interface
     Iterator<String> itr=al.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     System.out.println(al.size());
     
    
	}

}
