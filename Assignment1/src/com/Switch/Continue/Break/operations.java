package com.Switch.Continue.Break;

public class operations {
	int a,b;

	public operations(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
   public void operations1(int a2, int b2) {
		// TODO Auto-generated constructor stub
	}
   public int getA() {
		return a;
	}
   public void setA(int a) {
		this.a = a;
	}
   public int getB() {
		return b;
	}
   public void setB(int b) {
		this.b = b;
	}
   
   public float addition(int a,int b) {
		return a+b;
	}
	public float subtraction(int a,int b) {
		return a-b;
	}
	public float multiplcation(int a,int b) {
		return a*b;
	}
	public float division(int a,int b) {
		if(a>b) return a/b;
		else  return b/a;
	}

}
