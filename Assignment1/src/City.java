public class City {
  
  int pinCode;
  String cityName;
  String state;
  public City() {
	  
  }
  public City(int pinCode, String cityName,String state) {
		this.pinCode = pinCode;
		this.cityName = cityName;
		this.state= state;
	}
 
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

  
}
