package redointDoublyPhonebook;

public class Contact {
	
	private String name;
	private String lastName;
	private String number;
	protected Contact down;
	
	public Contact(String s1, String s2, String s3) {
		name = s1;
		lastName = s2;
		number = s3;
		down = null;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

}
