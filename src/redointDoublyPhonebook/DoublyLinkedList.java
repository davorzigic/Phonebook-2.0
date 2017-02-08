package redointDoublyPhonebook;

public class DoublyLinkedList {

	public letterSection head;
	public int counter = 0;

	
	/** 
	* This function prints the specific Letter Section
	* @param s1: First name
	* @param s2: Last name
	* @param s3: Phone number
	* @return: Returns the new contact with the parameters s1, s2 and s3 
	*/ 
	public Contact insertBoth(String s1, String s2, String s3) {

		Contact newContact = new Contact(s1, s2, s3);
		letterSection helper = head;

		// If phone book is empty
		if (head == null) {
			letterSection newSection = new letterSection(newContact.getLastName().charAt(0));
			head = newSection;
			newSection.down = newContact;
		}
		// If there is a contact in head section
		else if (head.getData() == newContact.getLastName().charAt(0)) {

			Contact temp = helper.down;

			while (temp.down != null) {
				temp = temp.down;
			}
			temp.down = newContact;
		}
		// Make new letter section
			else if (helper.getNext() == null && newContact.getLastName().charAt(0) < helper.getData())  {
			
			// If new section value is smaller than head value
			if(newContact.getLastName().charAt(0) < helper.getData()) {
				
			letterSection temp = new letterSection(newContact.getLastName().charAt(0));
			temp.next = helper;
			head = temp;
			
			Contact tempCont = temp.down;
			
			if(temp.down == null) {
				temp.down = newContact;
			}else{
				while(tempCont.down != null){
					tempCont = tempCont.down;
				}
				tempCont.down = newContact;
			}
						
			} else {
				
			}

		} else {
			while (helper != null) {
				if (helper.getData() == newContact.getLastName().charAt(0)) {
					Contact temp = helper.down;

					while (temp.down != null) {
						temp = temp.down;
					}
					temp.down = newContact;
				} else {
					if (helper.next == null) {
						letterSection newSection = new letterSection(newContact.getLastName().charAt(0));
						helper.next = newSection;
						newSection.down = newContact;
						break;
					}
					helper = helper.next;
				}
			}
		}
		counter++;
		return newContact;

	}
	
	/** 
	* This function prints the specific Letter Section
	* @param x: Letter that we want to print 
	*/ 
	public void printSpecificSection(Character x) {
		
		letterSection helper = head;
		while(helper.getData() != x.toUpperCase(x)) {
			helper = helper.next;
		}
		System.out.println(helper.getData());
		Contact temp = helper.down;
		while(temp != null) {
			System.out.println(temp.getLastName() + " " + temp.getName() + " " + temp.getNumber());
			temp = temp.down;
		}
		
	}
	/** 
	* This function prints the whole phone book
	*/ 
	public void print() {

		letterSection temp = head;

		while (temp != null) {
			System.out.println(temp.getData());
			Contact contactTemp = temp.down;
			while (contactTemp != null) {

				System.out.println("Name: " + contactTemp.getName() + "\n" + "Last name: " + contactTemp.getLastName()
						+ "\n" + "Phone: " + contactTemp.getNumber());
				contactTemp = contactTemp.down;

			}
			System.out.println();
			temp = temp.getNext();
		}

	}
	
	/***
	 * This function sorts letter section while adding it
	 * @param s1: Contact's name
	 * @param s2: Contact's last name
	 * @param s3: Contact's phone number
	 * @return: returns the contacts with values s1, s2 and s3
	 */
	
	public Contact cleanAdd(String s1, String s2, String s3) {

		Contact newContact = new Contact(s1, s2, s3);
		letterSection helper = head;
		
		// If phonebook is empty
		if(head == null) {
			letterSection newSection = new letterSection(newContact.getLastName().charAt(0));
			head = newSection;
			newSection.down = newContact;

		} 
		else if(newContact.getLastName().charAt(0) == head.getData()) {
			Contact temp = helper.down;

			while (temp.down != null) {
				temp = temp.down;
			}
			temp.down = newContact;
		}
		else {
			if(newContact.getLastName().charAt(0) < head.getData()) {
				
				// becomes head
				letterSection temp = new letterSection(newContact.getLastName().charAt(0));
				temp.next = helper;
				head = temp;
				
				Contact tempCont = temp.down;
				
				if(temp.down == null) {
					temp.down = newContact;
				}else{
					while(tempCont.down != null){
						tempCont = tempCont.down;
					}
					tempCont.down = newContact;
				}
			
				// searching for the right place for the section and inserting contact
			} else {
				
				
				while(newContact.getLastName().charAt(0) > helper.getNext().getData()) {
					
					helper = helper.next;
					
				}
				// Once it's there make a new section
				letterSection newSection = new letterSection(newContact.getLastName().charAt(0));
				newSection.next = helper.next;
				helper.next = newSection;
				
				Contact tempCont = newSection.down;
				if(newSection.down == null) {
					newSection.down = newContact;
				}else{
					while(tempCont.down != null){
						tempCont = tempCont.down;
					}
					tempCont.down = newContact;
				}
				
				
				
				
			}
		}
		
		return newContact;
	}
}
