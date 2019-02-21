package fr.imie.bank;
import fr.imie.bank.model.BankAccount;
import fr.imie.bank.model.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainConsole {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner scanner = new Scanner(System.in);
        
        int choice = 0;
        
        while(choice != 5) {
        System.out.println("1) Lister les personnes");
        System.out.println("2) Ajouter une personne");
        System.out.println("3) Modifier une personne");
        System.out.println("4) Supprimer une personne");
        System.out.println("5) Lister les comptes");
        System.out.println("6) Ajouter un compte");
        System.out.println("7) Modifier un compte");
        System.out.println("8) Supprimer un compte");
        System.out.println("9) Quitter");
        
        choice = scanner.nextLine().charAt(0);
        
        switch(choice) {
        case '1' : 
            for (int i=0; i<Person.getList_person().size();i++)
        {
            Person p1 = (Person) Person.getList_person().get(i);
             System.out.println("Votre ID est : "+i+"\n"+p1.getFirstName()+"\n"+p1.getLastName()+"\n"+p1.getEmail()+"\n"+p1.getBirthDate()+"\n");          
            }
            
        break;
        
        case '2' : 
            New_Person();
            
        break;
        case '3':
            System.out.println("Saisissez ce que vous voulez modifier :");
            
            String mod = scanner.nextLine();
            int id = Integer.parseInt(mod);
            
            System.out.println("Entrez vos modifications :");
            
            System.out.println("Saisissez votre prénom :");
            String firstName = scanner.nextLine();
            System.out.println("Saisissez votre nom :");
            String lastName = scanner.nextLine();        
            System.out.println("Saisissez votre email :");
            String email = scanner.nextLine();        
            System.out.println("Saisissez votre date de naissance");
            String birthDate = scanner.nextLine();
            LocalDate birth = DateUtils.toDate(birthDate);
                    
            Person p2 = new Person(lastName, firstName, email, birth);
            Person.getList_person().set(id, p2);
            
            break;
            
        case '4':
            System.out.println("quel est l'ID de la personne a supprimer ?");
            String id2 = scanner.nextLine();
            int id1 = Integer.parseInt(id2);
            Person.getList_person().get(id1);
            Person.getList_person().remove(id1);
            System.out.println("Données de la personne detruite !");
            
        break;
        
        case '5':
             System.out.println("quel est l'ID de la personne à consulter ?");
             String id4 = scanner.nextLine();
             
             int id3 = Integer.parseInt(id4);
            Person p = Person.getList_person().get(id3);
            
            for (int i=0; i<p.getList_accounts().size();i++) {
                BankAccount b1 = (BankAccount) p.getList_accounts().get(i);
                System.out.println("ID du compte : "+i+" Ton/Tes numéro(s) de compte(s) est/sont : "+b1.getNumber()+"\n");
            }
            
        break;
        case '6':
            System.out.println("quel est l'ID de la personne à consulter ?");
            String id10 = scanner.nextLine();
            
            int id9 = Integer.parseInt(id10);
            Person p4 = Person.getList_person().get(id9);
            
            System.out.println("Saisissez un numéro de compte à créer :");
            String nc = scanner.nextLine();
            
            BankAccount b = new BankAccount(nc);
            p4.addBankAccount(b);
            
            break;
            
            case '7':
                System.out.println("quel est l'ID de la personne à consulter ?");
                String id8 = scanner.nextLine();
                int id7 = Integer.parseInt(id8);
                Person p3 = Person.getList_person().get(id7);
                System.out.println("Saisissez l'ID du compte que vous voulez modifiez :");

                String modc = scanner.nextLine();
                int idc = Integer.parseInt(modc);
                System.out.println("Saisissez votre nouveau numéro de compte :");
                String nnb = scanner.nextLine();

                BankAccount b2 = new BankAccount(nnb);
                p3.getList_accounts().set(idc, b2);

                break;
                
                case '8':
                    System.out.println("quel est l'ID de la personne à consulter ?");
                    String id6 = scanner.nextLine();
                    
                    int id5 = Integer.parseInt(id6);
                    Person p1 = Person.getList_person().get(id5);
                    
                    System.out.println("Saisissez le compte que vous voulez supprimer :");
                    String sidc = scanner.nextLine();

                    int nsid = Integer.parseInt(sidc);

                    p1.getList_accounts().get(nsid);
                    p1.getList_accounts().remove(nsid);

                break;
                case '9':
                    System.exit(1);
                    
                    break;
                    
                        }
                }   
                
            }
            
            
            private static void New_Person() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Saisissez un prénom : ");
                String firstName = scanner.nextLine();
                System.out.println("Saisissez un nom : ");
                String lastName = scanner.nextLine();
                System.out.println("Saisissez un email : ");
                String email = scanner.nextLine();
                System.out.println("Saisissez une date de naissance : ");
                String birthDate = scanner.nextLine();
                LocalDate birth = DateUtils.toDate(birthDate);
                
                Person p = new Person(firstName, lastName, email, birth);
                Person.addPerson(p);
            }
            
        }
