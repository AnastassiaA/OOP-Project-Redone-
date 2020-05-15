
public class ContactNumber {
	private int countryCode;
	private int areaCode;
	private int prefix;
	private int line;
	
	public ContactNumber(){
		countryCode = 0;
		areaCode = 0;
		prefix = 0;
		line = 0;
	}

	public ContactNumber(int countryCode, int areaCode, int prefix, int line) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.prefix = prefix;
		this.line = line;
	}

	public ContactNumber(ContactNumber number) {
		countryCode = number.countryCode;
		areaCode = number.areaCode;
		prefix = number.prefix;
		line = number.line;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return "ContactNumber [countryCode=" + countryCode + ", areaCode=" + areaCode + ", prefix=" + prefix + ", line="
				+ line + "]";
	}
	
	
}
