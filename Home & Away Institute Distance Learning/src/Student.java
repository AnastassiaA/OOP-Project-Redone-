
public class Student extends HAIIndividual{
	private Address address;
	private Date dateEnrolled;
	private ContactNumber contactNumber;
	
	public Student() {
		address = new Address();
		dateEnrolled = new Date();
		contactNumber = new ContactNumber();
	}

	public Student(Address address, Date dateEnrolled, ContactNumber contactNumber) {
		super();
		this.address = address;
		this.dateEnrolled = dateEnrolled;
		this.contactNumber = contactNumber;
	}

	public Student(Student student) {
		super();
		address = student.address;
		dateEnrolled = student.dateEnrolled;
		contactNumber = student.contactNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	public ContactNumber getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(ContactNumber contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + ", dateEnrolled=" + dateEnrolled + ", contactNumber=" + contactNumber
				+ "]";
	}
		
}
