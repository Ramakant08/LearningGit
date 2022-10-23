package com.ProducerConsumer;

public class Consumer {
	Producer producer;
	
	public Consumer(Producer p) {
		producer=p;
	}
	public void run() {
		try {
			while(true) {
				String message=producer.getMessage();
				System.out.println("got message: "+ message);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
    public static void main(String args[]) {
    	Producer producer= new Producer();
    	new Consumer(producer).run();
    }
	
}
