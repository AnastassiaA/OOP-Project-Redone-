
public class Address {
	private String lotNumber;
	private String street;
	private String townCity;
	
	public Address() {
		lotNumber = "";
		street = "";
		townCity = "";
	}

	public Address(String lotNumber, String street, String townCity) {
		this.lotNumber = lotNumber;
		this.street = street;
		this.townCity = townCity;
	}

	public Address(Address address) {
		lotNumber = address.lotNumber;
		street = address.street;
		townCity = address.townCity;
	}

	public String getLotNumber() {
		return lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTownCity() {
		return townCity;
	}

	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}

	@Override
	public String toString() {
		return "Address [lotNumber=" + lotNumber + ", street=" + street + ", townCity=" + townCity + "]";
	}
	
}
