package com.greatlearning.email_app;

public interface ICredentialsService {
	String generateEmailAddress(String firstName, String lastName, int departmentCode);
	
	String generatePassword();
	
	void displayCredentials(Employee empObj);
}
