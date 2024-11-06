package Laguitan_L16Activity3;

import java.util.HashMap;

public class Phonebook {
	private HashMap<String, Long> phonebook = new HashMap<>();
	
	public void addContact(String name, Long number) {
		if(phonebook.size() == 5) {
			System.out.println("Contacts full.");
		} else {
			phonebook.put(name.toLowerCase(), number);
			System.out.println("Contact added.");
		}
	}
	
	public void displayContacts() {
		phonebook.forEach((key, value) -> System.out.println("+ " + key));
	}
	
	public void searchContact(String name) {
		if (phonebook.containsKey(name.toLowerCase())) {
			System.out.println("Name: " + name);
			System.out.println("Phone number: " + phonebook.get(name));
		} else {
			System.out.println("Contact not found.");
		}
	}
	
	public int getSize() {
		return phonebook.size();
	}
}