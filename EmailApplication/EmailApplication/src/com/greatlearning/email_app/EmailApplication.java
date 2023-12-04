package com.greatlearning.email_app;

import java.util.Scanner;

public class EmailApplication {
	
	void init(){

		String FirstName;
		String LastName;
		int departmentCode;
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter your First name");
		FirstName= in.nextLine();
		System.out.println("Please enter your Last name");
		LastName= in.nextLine();
		System.out.println("Please enter the department from the following"+ '\n' +
				"1. Technical"+ '\n' +
				"2. Admin"+ '\n' +
				"3. Human Resource"+ '\n' +
				"4. Legal");
		departmentCode=in.nextInt();
		
		CredentialsServiceImpl credentialsServiceImplObj= new CredentialsServiceImpl();
		//calling method generate email
		String emailAddress = credentialsServiceImplObj.generateEmailAddress(FirstName, LastName, departmentCode);
		//calling method generate password
		String password =credentialsServiceImplObj.generatePassword();
		//creating employee obj
		Employee empObj= new Employee(FirstName,LastName);
		empObj.setPassword(password);
		empObj.setEmailId(emailAddress);
		credentialsServiceImplObj.displayCredentials(empObj);
	}
}
