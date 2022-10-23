package com.collection.comparator;

import java.util.*;

public class TestComparator  {
	

	public static void main(String args[]) {
		ArrayList<Orders> Or= new ArrayList<Orders>();
				Or.add(new Orders(123,"yogesh1"));
				Or.add(new Orders(125,"yogesh2"));
				Or.add(new Orders(122,"yogesh3"));
				Or.add(new Orders(124,"yogesh4"));
				

                Collections.sort(Or,new Orders());
		        
		        for(Orders O:Or) {
					System.out.println(O.getOrderId()+" "+O.getOrderBy());
				}
		        
		        ArrayList<Orders> Or1 = Or;
		        System.out.println("\n");
                
		        Collections.sort(Or1,new Orders());
		        
		        for(Orders O:Or1) {
					System.out.println(O.getOrderId()+" "+O.getOrderBy());
				}
	}

	
	
	

}
