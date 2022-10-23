import java.util.Comparator;

public class CityPinCode implements Comparator<City> {

	@Override
	public int compare(City o1, City o2) {
		// TODO Auto-generated method stub
		return o1.pinCode-o2.pinCode;
	}

}
