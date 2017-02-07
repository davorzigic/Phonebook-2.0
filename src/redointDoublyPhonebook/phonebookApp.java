package redointDoublyPhonebook;

public class phonebookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList phonebook = new DoublyLinkedList();
		/*
		phonebook.insertBoth("Davor", "Zigic", "0659161515");
		phonebook.insertBoth("Nikola", "Uzelac", "0644954477");
		phonebook.insertBoth("Filip", "Uzelac", "1111");
		phonebook.insertBoth("Maja", "Kvrgic", "0644892772");
		*/
		
		phonebook.cleanAdd("Davor", "Zigic", "0659161515");
		phonebook.cleanAdd("Nikola", "Uzelac", "0644954477");
		phonebook.cleanAdd("Filip", "Uzelac", "0631784296");
		phonebook.cleanAdd("Maja", "Kvrgic", "0644982772");
		phonebook.cleanAdd("Miroslav", "Apostolovic", "0641975801");
		phonebook.cleanAdd("Samir", "Haliti", "0600709003");
		phonebook.cleanAdd("Test", "Testic", "0651112233");
		phonebook.print();
		//phonebook.printSpecificSection('u');
	}

}
