
public class Date {
	private String month;
	private int day;
	private int year;
	
	public Date() {
		month = "";
		day = 0;
		year = 0;
	}

	public Date(String month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public Date(Date date) {
		month = date.month;
		day = date.day;
		year = date.year;
	}
	
	
	
}
