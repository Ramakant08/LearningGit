package first;
import java.util.*;
public class student {
	int roll;
	  String name;
	  
	  void input()
	  { Scanner sc=new Scanner(System.in);
	   System.out.println("enter name:");
	    name=sc.nextLine();
	   System.out.println("enter roll no. :");
	    roll=sc.nextInt();
	   }
	  
	  void display()
	  { System.out.println("name of student:"+name);
	    System.out.println("roll no. of student:"+roll);
	  }


	public static void main(String[] args) {
		student s=new student();
		   s.input();
		   s.display();
		// TODO Auto-generated method stub

	}

}
