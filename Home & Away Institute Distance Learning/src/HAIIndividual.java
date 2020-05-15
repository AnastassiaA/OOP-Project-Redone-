
public class HAIIndividual {
	public int id;
	public Name name;
	public String password;
	

	public HAIIndividual() {
		id = 0;
		name = new Name();
		password = "";
	}


	public HAIIndividual(int id, Name name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}


	public HAIIndividual(HAIIndividual person) {
		id = person.id;
		name = person.name;
		password = person.password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "HAIIndividual [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}
