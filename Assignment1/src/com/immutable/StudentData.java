package com.immutable;
import java.util.*;

public final class StudentData {
     final String name;
     final int  rollNo;
	public StudentData(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	public void display(String name,int rollNo) {
		System.out.println("Name: "+name+"\nRoll no.: "+rollNo);
	}
	
     
     
     
}
