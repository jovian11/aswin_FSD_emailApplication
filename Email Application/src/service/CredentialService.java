package service;

import java.util.Random;

import interfaces.ICredentials;
import model.employee;

public class CredentialService implements ICredentials {
	
	public String generatePassword() {
		
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialchar = "~!@#$%^&*()_+<>?:{}";
		String values = uppercase + specialchar + lowercase +  number;

		Random random = new Random();
		
		String password = "";
		char temp;
		for(int i =0 ; i < 8 ; i++)
		{
			password= password + String.valueOf(values.charAt(random.nextInt(values.length())));
			
		}
		return password;
			
	}
	public String generateEmailaddress(String firstName ,String lastName, String department)
	{
		return firstName+lastName+"@"+department+".gl.in";
	}
	
	public void showCredentials(employee emp)
	{
		System.out.println(emp.getFirstName() + "  your creedential is listed");
		System.out.println("Email : " + emp.getEmail());
		System.out.println("Password : " + emp.getPassword());		
	}
}
