package fr.imie.bank.model;

import java.util.ArrayList;
import java.util.List;
import fr.imie.bank.MainConsole;

	public class BankAccount extends MainConsole{

	     
	        private String number;
	        private Person person;
	        
	        public BankAccount(String nb) {
	            number = nb;
	        }

	        public BankAccount(String number, Person person) {
	            super();
	            this.number = number;
	            this.person = person;
	        }

	        public String getNumber() {
	            return number;
	        }

	        public void setNumber(String number) {
	            this.number = number;
	        }

	        public Person getPerson() {
	            return person;
	        }

	        public void setPerson(Person person) {
	            this.person = person;
	        }

	        public int size() {
	            // TODO Auto-generated method stub
	            return 0;
	        }
	        
	        
	    }