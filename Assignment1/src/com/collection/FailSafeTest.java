package com.collection;
import java.util.*;

public class FailSafeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lst= new ArrayList<String>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		Iterator<String> itr= lst.iterator();
		while(itr.hasNext()) {
		     System.out.println(itr.next());
		    // lst.add("E");// creates exception as we are modifyting concurrently
		                  // with retriving the value
		}

	}

}
