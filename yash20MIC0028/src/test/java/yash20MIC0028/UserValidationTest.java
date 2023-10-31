package yash20MIC0028;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserValidationTest {
	
	@Test 
	public void testValidUser() { 
		boolean n = ValidateUser.validate("Ram", "3025"); 
		System.out.println("Welcome Ram");	
	} 
	
	@Test public void testInvalidUser() { 
		boolean n = ValidateUser.validate("Harsh", "SomePass"); 
		System.out.println("Harsh Not Authorized!!");
		};
}
