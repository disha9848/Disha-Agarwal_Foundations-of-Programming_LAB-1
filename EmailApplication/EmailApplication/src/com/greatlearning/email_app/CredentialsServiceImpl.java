package com.greatlearning.email_app;

import java.util.Random;

public class CredentialsServiceImpl implements ICredentialsService{
	public String generateEmailAddress(String firstName, String lastName, int departmentCode) {
		String departmentType;
		switch(departmentCode){
		case 1:
			departmentType="tech";break;
		case 2:
			departmentType="admin";break;
		case 3:
			departmentType="hr";break;
		case 4:
			departmentType="legal";break;
		default:
			departmentType="";break;
		}
		StringBuilder emailAddress = new StringBuilder();
		emailAddress.append(firstName.toLowerCase());
		emailAddress.append(".");
		emailAddress.append(lastName.toLowerCase());
		emailAddress.append("@");
		emailAddress.append(departmentType);
		emailAddress.append(".gl.com");
		
		return emailAddress.toString();
		
	}
	
	public String generatePassword() {
		StringBuilder password =new StringBuilder();
		String CapitalLetter= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SpecialChar="~!@#$%^&*()_+=-`;:<>?";
		String Numbers="0123456789";
		
		
		for(int i=1;i<=2;i++) {
			Random randomNum = new Random();
			int index= randomNum.nextInt(0,CapitalLetter.length());
			password.append(CapitalLetter.charAt(index));
		}
		
		for(int i=1;i<=2;i++) {
			Random randomNum = new Random();
			int index= randomNum.nextInt(0,CapitalLetter.length());
			password.append(CapitalLetter.toLowerCase().charAt(index));
		}
		
		for(int i=1;i<=2;i++) {
			Random randomNum = new Random();
			int index= randomNum.nextInt(0,SpecialChar.length());
			password.append(SpecialChar.charAt(index));
		}
		
		for(int i=1;i<=2;i++) {
			Random randomNum = new Random();
			int index= randomNum.nextInt(0,Numbers.length());
			password.append(Numbers.charAt(index));
		}
		return password.toString();
		
	}
	
	public void displayCredentials(Employee empObj) {
		
		System.out.println("Dear "+ empObj.getFirstName() +" your generated credentials are as follows");
		System.out.println("Email ---> "+ empObj.getEmailId());
		System.out.println("Password ---> "+ empObj.getPassword());
	}
}
