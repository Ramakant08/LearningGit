package com.collection.comparator;

import java.util.Comparator;

public class Orders implements Comparator<Orders>{
	  private int orderId;
	   private String orderBy;
	   public Orders() {
		   
	   }
	   public Orders(int orderId,String orderBy) {
		   this.orderId=orderId;
		   this.orderBy=orderBy;
	   }
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
    public int compare(Orders o1, Orders o2) {
		// TODO Auto-generated method stub
		if(o1.orderId%5 > o2.orderId%5)
			return 1;
		return -1;

	}
	public int compare1(Orders o3, Orders o4) {
		return o3.orderBy.compareTo(o4.orderBy);
		}
	
}
