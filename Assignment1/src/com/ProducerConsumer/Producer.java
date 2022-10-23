package com.ProducerConsumer;
import java.util.Vector;

public class Producer extends Thread {
    private Vector messages=new Vector();

	@Override
	public void run() {
		try {
			while(true) {
				putMessage();
			}
		}catch(InterruptedException ex) {}
	}
	
	private synchronized void putMessage() throws InterruptedException{
		while(messages.size()==5) {
			wait();
		}
		messages.addElement(new java.util.Date().toString());
		System.out.println("put message ");
		notify();
	}
	///called by consumer 
	synchronized String getMessage() throws InterruptedException{
		notify();
		try {
		while(messages.size()==0) {
			wait();
		    }
		}catch(InterruptedException ex) {}
		String message= (String) messages.firstElement();
		messages.removeElement(message);
		System.out.println(message);
		return message;
	}
	
}
