package com.java8.stream.api;

import java.util.ArrayList;
import java.util.function.Function;



public class TestFunctionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> alist= new ArrayList<Integer>();
    alist.add(10);
    alist.add(20);
    alist.add(45);
    alist.add(25);
    Function<Integer,Integer> fun= i->i/2;
    alist.stream().map(fun).forEach(System.out::println);
    //map() is checking condition for all
    
	}

}
