package com.collection.comparable;

public class Order implements Comparable<Order> {
   private int orderId;
   private String orderBy;
   
   public Order() {
	   
   }
   public Order(int orderId,String orderBy) {
	   this.orderId=orderId;
	   this.orderBy=orderBy;
   }
   @Override
   public String toString() {
	   return ("order of orderId "+orderId+" and orderBy "+orderBy);
   }
   @Override
    public int compareTo(Order o) {
	// TODO Auto-generated method stub
	return (this.orderId< o.orderId)?-1:((this.orderId==o.orderId)?0:1);
	//if   a<b  return-1;
	//if   a==b return 0;
	//else a>b  return 1;
}
}
