package first;
import java.util.*;

public class Area {
	float len=0,width=0;

	public Area(float l,float b) {
		float  a;
		a=l*b;
		System.out.println("Area= "+a);// TODO Auto-generated constructor stub
	}
	public Area() {
		float a=len*width;
		System.out.println("Area= "+a);
	}

	public static void main(String[] args) {
		float l,b;
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("enter length: ");
        l=sc.nextFloat();
        System.out.println("enter width: ");
        b=sc.nextFloat();
        Area A=new Area();
        Area B=new Area(l,b);
        sc.close();
	}

}
