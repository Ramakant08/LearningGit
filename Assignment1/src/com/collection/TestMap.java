package com.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
  public static void main(String args[]) {
	  HashMap<Integer,String> hm = new HashMap<Integer,String>();
	  hm.put(1,"A");
	  hm.put(2,"B");
	  hm.put(3,"C");
	  hm.put(8,"D");
	  hm.put(7,"E");
	  if(!hm.isEmpty()) {
		 // System.out.println(hm.size());
	  }
	  for(Integer keys: hm.keySet()) {
		  System.out.println(keys);
	  }
	  System.out.println("\n");
	  
	  for(Map.Entry<Integer,String> entry: hm.entrySet()) {
		  System.out.println(entry.getKey());
		  System.out.println(entry.getValue());
	  }
  }
}
