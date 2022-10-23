import java.util.ArrayList;

public class TestEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(189);
		list.add(266);
		list.add(679);
		list.add(782);
		list.add(829);
		
		System.out.println("even no. in list: ");
		list.stream().filter(num->num%2==0).forEach(System.out::println);
		System.out.println("odd no. in list: ");
		list.stream().filter(num->num%2!=0).forEach(System.out::println);
	}

}
