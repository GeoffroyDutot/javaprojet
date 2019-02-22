package fr.imie.bank.model;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import fr.imie.bank.DateUtils;

public interface BankAccountDao {

	public List<BankAccount> findAll();

	public BankAccount findById(int id);

	public static void save(BankAccount account) {
		  String path = "D:\\Nicolas\\Documents\\ECOLE\\IMIE\\Module Java\\Tp_findesemaine_souheil\\database.csv";               
	        File fichier =new File(path);
	                                    
	       try {
	       	          
	           FileWriter database = new FileWriter(fichier, true);
	           
	           database.write("id_bankaccount;number; \n");
	       	       	       	       	   		   		   		                        
	               int  recup_id = Person.List_accounts.indexOf(account);
	                                           
	               int number = account.getNumber();
	   
	               database.write(recup_id + ";" + number + "\n");
	              	                       	  
	           database.close(); 

	           	                               	           	                       
	       		}
				catch (Exception e) {
			            System.out.println(e);
			        }
			       try {
			        BufferedReader br = new BufferedReader(new FileReader(fichier));
			        String line;
			        while ((line = br.readLine()) != null) {
			           System.out.println(line);
			        }
			        br.close();
			       }
			       catch(Exception e){
			    	   System.out.println(e);
			           
			       }
			    }
	

	public static void saveAll(List<BankAccount> people) {
		
		 String path = "D:\\Nicolas\\Documents\\ECOLE\\IMIE\\Module Java\\Tp_findesemaine_souheil\\database.csv";
	        
	        
	        File fichier =new File(path);
	    
	                          
	       try {
	       	 
	           FileWriter database = new FileWriter(fichier, false);
	       	database.write("id_bankaccount;number; \n");
	       	       	       	       	   		   		   		
	           for (int i=0; i<people.size(); i++) { 
	               
	               BankAccount  compte = (BankAccount)people.get(i);
	                                           
	               int number = compte.getNumber();
	              	            
	               database.write(i + ";" + number + "\n");
	               
	                
	           	}   
	           database.close(); 
	           	                               	           	                       
	       		}
				catch (Exception e) {
			            System.out.println("Impossible de creer le fichier");
			        }
			       try {
			        BufferedReader br = new BufferedReader(new FileReader(fichier));
			        String line;
			        while ((line = br.readLine()) != null) {
			           System.out.println(line);
			        }
			        br.close();
			       }
			       catch(Exception e){
			    	   System.out.println("Impossible de creer le fichier");
			           
			       }
			    }}
	
	
	
	

		
		
	
=======
import java.util.List;

public interface BankAccountDao extends Dao<BankAccount> {

	public List<BankAccount> findByPersonId(int id);

}
>>>>>>> 41c4e9aa27da00d6e19cc60ea2cbf5060f96e3cb
