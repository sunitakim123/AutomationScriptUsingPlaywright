package com;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import Resource.BaseTest;

public class TestcaseLogin extends BaseTest {

	@Test(priority=1)
	public void Login_with_Invalid_username() throws IOException, InterruptedException {
		Thread.sleep(2000);
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());
	      page.getByPlaceholder("Email Id or Username").fill("sandy_kim");
	      page.locator("//*[@id=\"logInForm\"]/div[2]/input").fill("654321");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
	      Thread.sleep(2000);
	      Assert.assertTrue(
		          page.getByText("Email or username does not exist, please check for typos and try again.").isVisible(), 
		          "Expected 'Email or username does not exist, please check for typos and try again.' message to be visible, but it was not."
		      );
	      System.out.println("This test case is working fine");

}}
