
public class overloading {

    int test(int a) {
		return a*a;
	}
	int test(int a,int b) {
		return a+b;
	}
	int test(int a,int b,int c) {
		return a*b*c;
	}
    
	public static void main(String args[]) {
		int a=5,b=6,c=10;
		overloading o=new overloading();
		System.out.println("for 1 argument: "+ o.test(a));
		System.out.println("for 2 arguments: "+ o.test(a,b));
		System.out.println("for 1 argument: "+ o.test(a,b,c));
	}
}
