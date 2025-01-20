package com;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import Resource.BaseTest;

public class Login extends BaseTest {

	
	
	
	@Test(priority=1)
	public void Login_with_valid_usernameAndpassword() throws IOException, InterruptedException {
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());
	      page.getByPlaceholder("Email Id or Username").fill(properties.getProperty("username"));
	      page.locator("//*[@id=\"logInForm\"]/div[2]/input").fill("654321");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
	   	  page.waitForNavigation(() -> 
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")));
	   	  System.out.println("Login_with_valid_usernameAndpassword test case got Passed");
	   	  assertEquals(page.title(), "My Games - Factile", "My game page is not getting open, after login");
	   	  Logout();
	
	}
	
	
	
	@Test(priority=2)
	public void Login_with_valid_emailAndpassword() throws IOException, InterruptedException {
		Thread.sleep(2000);
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());
	      page.getByPlaceholder("Email Id or Username").fill(properties.getProperty("email"));
	      page.locator("//*[@id=\"logInForm\"]/div[2]/input").fill("654321");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
	   	  page.waitForNavigation(() -> 
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")));
	   	 System.out.println("Login_with_valid_emailAndpassword test case got Passed");
	   	  assertEquals(page.title(), "My Games - Factile", "My game page is not getting open, after login");
Logout();
	}
	
	@Test(priority=3)
	public void Login_with_Invalid_username() throws IOException, InterruptedException {
		Thread.sleep(2000);
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());
	      page.getByPlaceholder("Email Id or Username").fill("sandy_kim");
	      page.locator("//*[@id=\"logInForm\"]/div[2]/input").fill("654321");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
	      Thread.sleep(2000);
	      System.out.println("Login_with_Invalid_username>> test case got Passed");
	      Assert.assertTrue(
		          page.getByText("Email or username does not exist, please check for typos and try again.").isVisible(), 
		          "Expected 'Email or username does not exist, please check for typos and try again.' message to be visible, but it was not."
		      );

	   	 	}


	
	@Test(priority=4)
	public void Login_with_Invalid_Gmail() throws IOException, InterruptedException {
		Thread.sleep(2000);
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());
	      page.getByPlaceholder("Email Id or Username").fill("sunita.deligen@gmail.com");
	      page.locator("//*[@id=\"logInForm\"]/div[2]/input").fill("654321");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
	      Thread.sleep(2000);
	      System.out.println("Login_with_Invalid_Gmail>> test case got Passed");
	      Assert.assertTrue(
		          page.getByText("Email or username does not exist, please check for typos and try again.").isVisible(), 
		          "Expected 'Email or username does not exist, please check for typos and try again.' message to be visible, but it was not."
		      );

	   	 	}


	@Test(priority=5)
	public void Login_with_Invalid_Password() throws IOException, InterruptedException {
		Thread.sleep(2000);
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());
	      page.getByPlaceholder("Email Id or Username").fill(properties.getProperty("email"));
	      page.locator("//*[@id=\"logInForm\"]/div[2]/input").fill("654321000");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
	      Thread.sleep(2000);
	      System.out.println("Login_with_Invalid_Password>> test case got Passed");
	      Assert.assertTrue(
		          page.getByText("Incorrect email, username or password.").isVisible(), 
		          "Expected 'Incorrect email, username or password.' message to be visible, but it was not."
		      );

	   	 	}
	
	
	public void Logout()
	{
		 page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("profile")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout")).click();
	}

	}
