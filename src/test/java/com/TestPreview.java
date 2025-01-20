package com;

import java.io.IOException;
import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import Resource.BaseTest;

public class TestPreview extends BaseTest {

	@Test(priority=1)
	public void test_preview_Public_Game() throws IOException, InterruptedException {
		Thread.sleep(2000);
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());

      //page.getByRole(AriaRole.MAIN).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Log In")).click();
      page.getByPlaceholder("Email Id or Username").click();
      page.getByPlaceholder("Email Id or Username").fill("mahender.deligence@gmail.com");
      page.getByPlaceholder("Password").click();
      page.getByPlaceholder("Password").fill("12345678");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
      page.getByLabel("Password toggler").click();
      page.getByPlaceholder("Password").click();
      page.getByPlaceholder("Password").fill("1234567");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("profile cena_0077 mahender.")).click();
      page.getByPlaceholder("Search in All My Games").click();
      page.getByPlaceholder("Search in All My Games").fill("EEB 390");
      page.getByPlaceholder("Search in All My Games").press("Enter");
      page.locator("form").getByRole(AriaRole.BUTTON).first().click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Preview")).click();
      page.getByText("$100").first().click();
      assertThat(page.getByText("What is relative fitness?")).isVisible();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("The expected reproductive success of an individual with that trait or gene, relative to other members of the population.");
      page.getByLabel("down navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("down navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      page.getByLabel("down navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("down navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      page.getByLabel("right navigationBtns").click();
      Thread.sleep(2000);
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();

      // Check if the image is visible
      if (page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Screen Shot 2016-09-26 at 9.")).isVisible()) {
        System.out.println("The image 'Screen Shot 2016-09-26 at 9.' is visible on the page.");
      }
      Thread.sleep(2000);
      
      
	}}
      
    