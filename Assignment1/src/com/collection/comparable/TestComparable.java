package com.collection.comparable;

import java.util.Arrays;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] orders= {
		new Order(123,"yogesh"),
		new Order(124,"yogesh1"),
		new Order(127,"yogesh2"),
		new Order(125,"yogesh3"),
		new Order(126,"yogesh4"),
		};
		Arrays.sort(orders);// this will automatically call comparable
		for(Object order:orders) {
			System.out.println(order);
		}

	}

}
