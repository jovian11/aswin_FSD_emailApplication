package interfaces;

import model.employee;

public interface ICredentials {
	
	public String generateEmailaddress(String firstName ,String lastName, String department);
	
	public String generatePassword ();
	
	public void showCredentials(employee emp);

}
 