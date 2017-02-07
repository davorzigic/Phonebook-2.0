package redointDoublyPhonebook;

public class letterSection {

	private char data;
	public letterSection next;
	public Contact down;
	
	public letterSection(char data) {
		this.setData(data);
		this.setNext(null);
		this.setDown(null);
	}

	public letterSection getNext() {
		return next;
	}

	public void setNext(letterSection next) {
		this.next = next;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Contact getDown() {
		return down;
	}

	public void setDown(Contact down) {
		this.down = down;
	}
	
	
	
}
