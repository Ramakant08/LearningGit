package threading;
class Word1 extends Thread{
	void pattern1() {
		for(int i=0;i<5;i++) {
			try {Thread.sleep(500);} catch(Exception e) {};
			   System.out.print("*");
		}
	}
	void print() {
	   System.out.print("!! Stay");
	   try {Thread.sleep(700);} catch(Exception e) {};
	   }
}
class Word2 extends Thread{
	void print() {
	   System.out.print(" Happy !!");
	   try {Thread.sleep(700);} catch(Exception e) {};
	}
	void pattern2() {
		for(int i=0;i<5;i++) {
			try {Thread.sleep(700);} catch(Exception e) {};
			   System.out.print("*");
		}
	}
}
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word1 w1=new Word1();
		Word2 w2=new Word2();
		w1.pattern1();
		w1.print();
		 try {Thread.sleep(700);} catch(Exception e) {};
		w2.print();
		w2.pattern2();
      }

}
