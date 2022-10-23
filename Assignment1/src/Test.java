import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<City> city= new ArrayList<City>();
		city.add(new City(123245,"New Delhi","Delhi"));
		city.add(new City(123235,"Kanpur","UP"));
		city.add(new City(123145,"Dwarka","Gujrat"));
		city.add(new City(121245,"Nagpur","Maharashtra"));
		
		// sorting by CityName:
		Collections.sort(city, new CityName());
		for(City c:city) {
			System.out.println("Pincode: "+ c.getPinCode()+" City: "+c.getCityName()+" State: "+c.getState());
		}
		System.out.println("\n");
		// sorting by CityPinCode:
				Collections.sort(city, new CityPinCode());
				for(City c:city) {
					System.out.println("Pincode: "+ c.getPinCode()+" City: "+c.getCityName()+" State: "+c.getState());
				}
				System.out.println("\n");
	  // sorting by CityState:
				Collections.sort(city, new CityState());
				for(City c:city) {
					System.out.println("Pincode: "+ c.getPinCode()+" City: "+c.getCityName()+" State: "+c.getState());
				}

	}

}
