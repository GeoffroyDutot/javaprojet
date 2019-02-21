package fr.imie.bank.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import fr.imie.bank.MainConsole;

public class Person extends MainConsole{
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate birthDate;
	private static List<Person> list_person = new ArrayList<Person>();
    private static List<BankAccount> list_accounts = new ArrayList<BankAccount>();
	
	
	
	public static List<BankAccount> getList_accounts() {
		return list_accounts;
	}


	public static void setList_accounts(List<BankAccount> list_accounts) {
		Person.list_accounts = list_accounts;
	}


	public Person(String firstName, String lastName, String email, LocalDate birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthDate = birthDate;
}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setList_person(List<Person> list_person) {
		Person.list_person = list_person;
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static List<Person> getList_person() {
		return list_person;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public static void addPerson(Person p) {
		list_person.add(p);
	}
	public static void addBankAccount(BankAccount b) {
        // TODO Auto-generated method stub
       getList_accounts().add(b);
    }
}