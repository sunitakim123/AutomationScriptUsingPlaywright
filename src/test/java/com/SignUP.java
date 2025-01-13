package com;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import Resource.BaseTest;

public class SignUP extends BaseTest {

	
	
	
	@Test(priority=1)
	public void Sign_Up_with_Valid_Credentials() throws IOException, InterruptedException {
		
		page.navigate(properties.getProperty("rootUrl"));
		Thread.sleep(2000);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click();
        page.getByPlaceholder("Email Address").fill(generateRandomEmail());
		page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("ValidPass123");
		page.getByPlaceholder("Confirm Password").fill("ValidPass123");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
		DeleteAccount();			
		String ExpectedTitle= "Login – PlayFactile"; 
		page.waitForNavigation(() -> 
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")));
		System.out.println("After performing  Sign up, I have deleted the new account and fetching the title of the page:-"+page.title());		
		//assertEquals(page.title(), ExpectedTitle, "Login page is not appearing, after deleting newly created account");
	}
	

	@Test(priority=2)
	 public void Sign_Up_with_an_already_Registered_Email()  throws IOException, InterruptedException {
		//Thread.sleep(2000);
		page.navigate(properties.getProperty("rootUrl"));
		page.waitForNavigation(() -> 
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up").setExact(true)).click());
		  page.getByPlaceholder("Email Address").fill("sunita.deligence@gmail.com");
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
	      page.getByPlaceholder("Confirm Password").fill("123456");
	      page.locator(".btn.signin").click();
	      Thread.sleep(2000);
	     	      Assert.assertTrue(
	    		    page.getByText("Email already exist!").isVisible(), 
	    		    "Expected 'Email already exist!' message to be visibl, but it was not."
	    		);

	    	}
	

	@Test(priority=3)
	 public void SignUp_with_an_Invalid_EmailID()  throws IOException, InterruptedException {
		//Thread.sleep(2000);
		page.navigate(properties.getProperty("rootUrl"));
		// page.reload();
		  page.waitForNavigation(() -> 
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up").setExact(true)).click());
		  page.getByPlaceholder("Email Address").fill("valid");
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("ValidPass123");
	      page.getByPlaceholder("Confirm Password").fill("ValidPass@123");
	    //  page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
	      page.locator(".btn.signin").click();
	   // Example assertion with a custom message using TestNG
	      Assert.assertTrue(
	          page.getByText("Invalid email").isVisible(), 
	          "Expected 'Invalid email' message to be visible, but it was not."
	      );

	}
	

	@Test(priority=4)
	 public void SignUp_with_Password_ConfirmPassword_Missmatch()  throws IOException, InterruptedException {
		//Thread.sleep(2000);
		 page.navigate(properties.getProperty("rootUrl"));
			page.waitForNavigation(() -> 
         page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up").setExact(true)).click());
	      page.getByPlaceholder("Email Address").fill(generateRandomEmail());
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("ValidPass123");
	      page.getByPlaceholder("Confirm Password").fill("ValidPass@12");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
	     // assertThat(page.getByText("Password mismatch")).isVisible();
	      
	      
	   // Example assertion with a custom message using TestNG
	      Assert.assertTrue(
	          page.getByText("Password mismatch").isVisible(), 
	          "Expected 'Password mismatch, but it was not."
	      );

	}
	

	@Test(priority=5)
	 public void SignUp_with_a_Password_Less_Than_6_Characters()  throws IOException, InterruptedException {
		//Thread.sleep(2000);
		page.navigate(properties.getProperty("rootUrl"));
		page.waitForNavigation(() -> 
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up").setExact(true)).click());
	      page.getByPlaceholder("Email Address").fill(generateRandomEmail());
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("12345");
	      page.getByPlaceholder("Confirm Password").fill("12345");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
	     // assertThat(page.getByText("Password must contain at least 6 characters")).isVisible();
	   // Example assertion with a custom message using TestNG
	      Assert.assertTrue(
	          page.getByText("Password must contain at least 6 characters").isVisible(), 
	          "Expected 'Password must contain at least 6 characters' message to be visible, but it was not."
	      );

	}

	@Test(priority=6)
	 public void SignUp_with_an_Email_Containing_Invalid_Characters_Space()  throws IOException, InterruptedException {
		page.navigate(properties.getProperty("rootUrl"));
		page.waitForNavigation(() -> 
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up").setExact(true)).click());
	      page.getByPlaceholder("Email Address").fill("     ");
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
	      page.getByPlaceholder("Confirm Password").fill("123456");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
	     // assertThat(page.getByText("Email required")).isVisible();
	   // Example assertion with a custom message using TestNG
	      Assert.assertTrue(
	          page.getByText("Email required").isVisible(), 
	          "Expected 'Email required' message to be visible, but it was not."
	      );

	}
	


	@Test(priority=7)
	 public void SignUp_with_an_Password_Containing_Invalid_Characters_Space()  throws IOException, InterruptedException {
		page.navigate(properties.getProperty("rootUrl"));
		page.waitForNavigation(() -> 
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up").setExact(true)).click());
	      page.getByPlaceholder("Email Address").fill(generateRandomEmail());
	      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("     ");
	      page.getByPlaceholder("Confirm Password").fill("     ");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
	     // assertThat(page.getByText("Password must contain at least 6 characters")).isVisible();
	   // Example assertion with a custom message using TestNG
	      Assert.assertTrue(
	          page.getByText("Password must contain at least 6 characters").isVisible(), 
	          "Expected 'Password must contain at least 6 characters' message to be visible, but it was not."
	      );

	}

	
	
	// Generate random email
	private String generateRandomEmail() {
		String randomString = UUID.randomUUID().toString().substring(0, 8); // Generates a random 8-character string
		return randomString + "@example.com";
	}

	

	public void DeleteAccount() {
		page.locator("#freeAccount").click();
		//page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("×")).click();
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Account")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete Account")).click();
		page.getByRole(AriaRole.TEXTBOX).fill("ValidPass123");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next!")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete!")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes!")).click();
	}

}