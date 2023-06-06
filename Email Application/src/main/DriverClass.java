package main;

import java.util.Scanner;

import interfaces.ICredentials;
import model.employee;
import service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
	
		employee emp = new employee("Naruto", "Uzumaki");
		ICredentials cs = new CredentialService();
		
		System.out.println("Enter the department from the  following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resourse");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int category = sc.nextInt();
		
		String generateEmail = null;
		String generatePassword = null;
		
		switch (category) {
		
		case 1: {
			generateEmail = cs.generateEmailaddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"tech");
			generatePassword = cs.generatePassword();
			break;
		}
		
		case 2: {
			generateEmail = cs.generateEmailaddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"admin");
			generatePassword = cs.generatePassword();
			break;
		}
		
		case 3: {
			generateEmail = cs.generateEmailaddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"HR");
			generatePassword = cs.generatePassword();
			break;
		}
		
		case 4: {
			generateEmail = cs.generateEmailaddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"legal");
			generatePassword = cs.generatePassword();
			break;
		}
		
		default: {
			System.out.println("Enter the valid option");
		}
		
		}
		
		emp.setEmail(generateEmail);
		emp.setPassword(generatePassword);
		cs.showCredentials(emp);
		sc.close(); 
		
		
	}

}
