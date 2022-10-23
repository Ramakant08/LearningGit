import java.util.*;
public class Factorial {

	public static int findFactorial(int n) {
		int f=1;
		if(n>0) {
		// TODO Auto-generated constructor stub
		for(int i=n;i>=1;i--) {
			f=f*i;
		 }
		 return f;
		}
		else
			System.out.println("no. should be greater than 0 ");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter number to find factorial:");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		int fact=findFactorial(num);
		System.out.println("factorial="+fact);
        sc.close();
	}

}
