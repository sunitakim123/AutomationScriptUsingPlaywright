package com;



import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;

import Resource.BaseTest;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.io.IOException;
import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;
	public class test_User_can_Navigate_through_Mockboard_and_data_remains_unchanged extends BaseTest {

		@Test(priority=1)
		public void Login_with_Invalid_username() throws IOException, InterruptedException {
			Thread.sleep(2000);
			  page.navigate(properties.getProperty("rootUrl"));
			  page.getByRole(AriaRole.MAIN).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Log In")).click();
		      page.getByPlaceholder("Email Id or Username").click();
		      page.getByPlaceholder("Email Id or Username").fill("sunita.deligence@gmail.com");
		      page.getByPlaceholder("Password").click();
		      page.getByPlaceholder("Password").fill("654321");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
		      page.locator("div:nth-child(2) > .game-card-template__footer > .game-card-footer > a:nth-child(3)").click();
		      page.locator("div:nth-child(4) > span:nth-child(4) > .gamePointsBlock").click();
		      assertThat(page.getByText("Question 17")).isVisible();
		      assertThat(page.locator("#question")).containsText("Question 17");
		      assertThat(page.locator("#answer")).containsText("Answer 17");
		      page.getByLabel("right navigationBtns").click();
		      assertThat(page.locator("#question")).containsText("Question 3");
		      assertThat(page.locator("#answer")).containsText("Answer 3");
	}}
