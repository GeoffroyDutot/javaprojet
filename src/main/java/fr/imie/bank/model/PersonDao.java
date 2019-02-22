package fr.imie.bank.model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.imie.bank.DateUtils;

public interface PersonDao {

	public static List<Person> findAll() {
		
		final String csvFile = "D:\\Nicolas\\Documents\\ECOLE\\IMIE\\Module Java\\Tp_findesemaine_souheil\\database.csv";
        List<Person> list_db_person = new ArrayList<Person>();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // separateur = ;
                String[] word = line.split(cvsSplitBy);
                Person person = toObject(word);
                System.out.println("Personne ajoutée [Nom= " + word[0] + " , Prenom=" + word[1] + " , Email= "+ word[2]+ " , Date de naissance=" + word[3]+ "]");
                list_db_person.add(person);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        

        return list_db_person;
	
}		
	public static Person findById(int id_personne) {


        String path = "D:\\Nicolas\\Documents\\ECOLE\\IMIE\\Module Java\\Tp_findesemaine_souheil\\database.csv";               
        File fichier =new File(path);
       try {
    	   
    	   
    	      	  
		   Person recup_data_person=(Person)Person.getList_person().get(id_personne); 
			
		   String firstName = recup_data_person.getFirstName();
                            
           String lastName = recup_data_person.getLastName();
                             
           String email = recup_data_person.getEmail();
           
           LocalDate Datedenaissance = recup_data_person.getBirthDate();
           String Birth = DateUtils.toString(Datedenaissance);
              
           System.out.println("Voici le prénom correspondant à l'ID :"+ id_personne + ":	" + firstName);
           System.out.println("Voici le nom correspondant à l'ID :"+ id_personne + ":	" + lastName);
           System.out.println("Voici l'email correspondant à l'ID :"+ id_personne + ":	" + email);
           System.out.println("Voici la date de naissance correspondant à l'ID :"+ id_personne + ":	" + Birth);
			     
           
           BufferedReader br = new BufferedReader(new FileReader(fichier));
           
           br.readLine();
           
          
           
           
       //  String List_id = database.readline();
             
//         BufferedReader br = new BufferedReader(new FileReader(fichier));
//		   String line;
//		   while ((id = id_personne) {
//		        	
//		   Person prenom = Person.List_person.getFirstname();
//		           
//		   String firstName = person.getFirstname();
//		              
//	               
//	       String lastName = person.getLastname();
//	               
//	                   
//	       String email_p = person.getEmail();
//	       System.out.println(firstName + lastName + email_p);
//		  }
		        
		   //br.close();
             
       }
             
        catch(Exception e){
		    	   System.out.println(e);
		           
		      }
       // PAS TERMINE
	return null;                                	            
       }

	public static void  save(Person person) {
		
        String path = "D:\\Nicolas\\Documents\\ECOLE\\IMIE\\Module Java\\Tp_findesemaine_souheil\\database.csv";               
        File fichier =new File(path);
                                    
       try {
       	          
           FileWriter database = new FileWriter(fichier, true);
           
       	       	       	       	   		   		   		                        
               String[] data_person = toString(person);
               
               
               
               LocalDate Datedenaissance = person.getBirthDate();
               String Birth = DateUtils.toString(Datedenaissance);
             
               database.write(data_person[0] + ";" + data_person[1] + ";" + data_person[2] + ";" + data_person[3] + "\n");
               System.out.println("wola");
                
           	  
           database.close(); 
//           	if(id_person && prenom && nom && email && datenaissance ) {
//           		database.write("\n");
//           		database.write("id_person;prenom;nom;email;datenaissance");
//           	}
//           	database.write("\n; id eprson");
           	                               	           	                       
       		}
			catch (Exception e) {
		            System.out.println("Impossible de creer le fichier"+e);
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
		    }

	

	

	public static void saveAll(List<Person> people) { 
		
		
        String path = "D:\\Nicolas\\Documents\\ECOLE\\IMIE\\Module Java\\Tp_findesemaine_souheil\\database.csv";
        
        
        File fichier =new File(path);
      
                          
       try {
       	 
           FileWriter database = new FileWriter(fichier, false);
       
       	       	       	       	   		   		   		
           for (int i=0; i<people.size(); i++) { 
               
               Person  personne = (Person)people.get(i);
                                           
               String[] data_person = toString(personne);
             
               database.write(data_person[0] + ";" + data_person[1] + ";" + data_person[2] + ";" + data_person[3] + ";" + "\n");
               System.out.println("wola");
                
           	}   
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
		    	   System.out.println("Impossible de creer le fichier");
		           
		       }
		    }
	public static String[] toString(Person person) {
		String[] data_list = {"a","a","a","a"};
		String firstName = person.getFirstName();
        
        
        String lastName = person.getLastName();
        
            
        String email_p = person.getEmail();
        
        
        LocalDate Datedenaissance = person.getBirthDate();
        String Birth = DateUtils.toString(Datedenaissance);
        
        data_list[0] = firstName;
        data_list[1] = lastName;
        data_list[2] = email_p;
        data_list[3] = Birth;
		return data_list;
		
	}
	public static Person toObject(String[] data_list) {
		
        LocalDate birth = DateUtils.toDate(data_list[3]);
        Person person = new Person(data_list[0],data_list[1],data_list[2],birth);
		return person;
	}
	
}


	

		
	  

