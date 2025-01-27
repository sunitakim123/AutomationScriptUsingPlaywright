package com;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.KeyboardModifier;

import Resource.BaseTest;

public class FreeAccountFeatures extends BaseTest {

	@Test(priority=1)
	public void test_SignUP_FreeAccount() throws IOException, InterruptedException {
		  
		
		Thread.sleep(2000);
		 String email1=generateRandomEmail();
	        System.out.println(email1);
		
  		page.navigate(properties.getProperty("rootUrl"));
		  
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click();
        Thread.sleep(3000);
        page.waitForNavigation(() -> 
        page.getByPlaceholder("Email Address").fill(email1));
 	   
  		page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
  		page.getByPlaceholder("Confirm Password").fill("123456");
  		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
  		page.waitForNavigation(() -> 
  		page.locator("#freeAccount").click());
	}
	     

	@Test(priority=2)
	  public void test_Create_Game_In_NewAccount_Who_having_FreeAccount() throws InterruptedException
      {
      
      Thread.sleep(2000);
  	      //Create a Game
  	    Thread.sleep(2000);
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")).click();
  	      page.getByPlaceholder("Enter a descriptive title for").fill("MixQuestion");
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create")).click();
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Create Manually Add you own")).click();
  	      Thread.sleep(2000);
  	      page.getByPlaceholder("Category-1 Title").fill("Categ1");
  	      page.locator(".incompleteQuestion").first().click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the capital city of India?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("New Delhi");
  	      page.locator(".gameCategoryColumn > span:nth-child(2)").first().click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Which planet is known as the \"Red Planet\"?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Mars");
  	      page.locator("span:nth-child(3)").first().click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the largest animal on Earth?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Blue Whale");
  	    Thread.sleep(2000);
  	      page.locator("span:nth-child(4)").first().click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Which is the longest river in the world?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Nile River");
  	      page.locator("span:nth-child(5)").first().click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the national flower of India?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Lotus");
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
  	      page.getByPlaceholder("Category-2 Title").click();
  	    Thread.sleep(2000);
  	      page.getByPlaceholder("Category-2 Title").fill("CaTEG-2");
  	      page.locator(".incompleteQuestion").first().click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("45 + 27?");
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("72");
  	      page.locator("div:nth-child(2) > span:nth-child(2)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("If you have 3 apples and you buy 7 more, how many apples do you have in total?1");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("0");
  	    Thread.sleep(2000);
  	      page.getByText("0", new Page.GetByTextOptions().setExact(true)).fill("10 Apples");
  	      page.locator("div:nth-child(2) > span:nth-child(4)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the product of 6 and 8?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("48");
  	      page.locator("div:nth-child(2) > span:nth-child(3)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the perimeter of a square with a side length of 5 cm?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	    Thread.sleep(2000);
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill(" 20 cm (Perimeter = 4 × side length)");
  	      page.locator("div:nth-child(2) > span:nth-child(5)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("How many minutes are there in 2 hours?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("120");
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
  	    Thread.sleep(2000);
  	      page.getByPlaceholder("Category-3 Title").click();
  	      page.getByPlaceholder("Category-3 Title").fill("Categ-3");
  	      page.locator(".incompleteQuestion").first().click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the opposite of the word \"happy\"?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Sad");
  	      page.locator("div:nth-child(3) > span:nth-child(2)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Complete the sentence: \"The sun is shining _____ in the sky.\"");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Brightly");
  	    Thread.sleep(2000);
  	      page.locator("div:nth-child(3) > span:nth-child(3)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Identify the noun in this sentence: \"The cat is sleeping on the couch.\"");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Cat couch");
  	      page.locator("div:nth-child(3) > span:nth-child(4)").click();
  	      page.locator("div:nth-child(3) > span:nth-child(4)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the past tense of the verb \"run\"?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	    Thread.sleep(2000);
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("R");
  	      
  	      page.getByText("R", new Page.GetByTextOptions().setExact(true)).fill("Ran");
  	      page.locator("div:nth-child(3) > span:nth-child(5)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the plural form of the word \"child\"?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("children");
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();   
  	    Thread.sleep(2000);
  	      page.getByPlaceholder("Category-4 Title").click();
  	      page.getByPlaceholder("Category-4 Title").fill("Categ-4");
  	      page.locator("div:nth-child(4) > span:nth-child(3)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Who is known as the \"Father of the Nation\" in India?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Mahatma Gandhi");
  	      page.locator("div:nth-child(4) > span:nth-child(2)").click();
  	    Thread.sleep(2000);
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What are the four cardinal directions?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("North, South, East, West");
  	      page.locator("div:nth-child(4) > span:nth-child(3)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	    Thread.sleep(2000);
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the name of the current President of the United States?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Jeo Biden");
  	      page.locator("div:nth-child(4) > span:nth-child(4)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Which is the largest country in the world by area?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Russia");
  	      page.locator("div:nth-child(4) > span:nth-child(5)").click();
  	    Thread.sleep(2000);
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Name the three branches of the United States government.");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Executive, Legislative, Judicial");
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
  	    Thread.sleep(2000);
  	      page.getByPlaceholder("Category-5 Title").click();
  	      page.getByPlaceholder("Category-5 Title").fill("Categ-5");
  	      page.locator("div:nth-child(5) > span:nth-child(3) > .gamePointsBlock").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("45+45");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("90");
  	      page.locator("div:nth-child(5) > span:nth-child(2)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("50-20");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("30");
  	    Thread.sleep(2000);
  	      page.locator("div:nth-child(5) > span:nth-child(3)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("60-20");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("40");
  	      page.locator("div:nth-child(5) > span:nth-child(4)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("25+25");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("50");
  	    Thread.sleep(2000);
  	      page.locator("div:nth-child(5) > span:nth-child(5)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("100-80");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("20");
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
  	      page.getByPlaceholder("Category-6 Title").click();
  	      page.getByPlaceholder("Category-6 Title").fill("Categ-6");
  	      page.locator("div:nth-child(6) > span:nth-child(3) > .gamePointsBlock").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What planet do we live on?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("earth");
  	      page.locator("div:nth-child(6) > span:nth-child(2)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	    Thread.sleep(2000);
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What do plants need to make food?Sunlight, water, carbon dioxide (through photosynthesis");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
  	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Sunlight, water, carbon dioxide (through photosynthesis)");
  	      page.locator("div:nth-child(6) > span:nth-child(3)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the main gas that humans need to breathe?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Oxygen");
  	      page.locator("div:nth-child(6) > span:nth-child(4)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	    Thread.sleep(2000);
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the largest organ in the human body?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Skin");
  	      page.locator("div:nth-child(6) > span:nth-child(5)").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What are the three states of matter?");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Solid, Liquid, Gas");
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
  	    Thread.sleep(2000);
  	      page.getByText("Final Factile").click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("50+60");
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
  	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("110");
  	    Thread.sleep(2000);
  	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
  	    page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Factile Logo My Games")).click();
  	    page.reload();  	
  	    System.out.println("A new user with a free account has successfully created a game. ");
  	    Thread.sleep(2000);
	}

	@Test(priority=3)
  	  public void test_Preview_OF_CreatedGame() throws InterruptedException
      {
      
      Thread.sleep(2000); 
  	    //Preview a created  game
  	  Thread.sleep(2000);
  	   page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Preview")).first().click();
      //assertThat(page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^PREVIEW$"))).first()).isVisible();
     // assertThat(page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^PREVIEW$"))).first()).isVisible();
  	 Thread.sleep(2000);
  	   assertThat(page.getByText("CATEG1")).isVisible();
      assertThat(page.locator(".gamePointsBlock").first()).isVisible();
      assertThat(page.locator("#game-screen-top")).containsText("$100");
      page.locator(".gameQuestionBlock").first().click();
      assertThat(page.locator("#responsive-question")).containsText("What is the capital city of India?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("New Delhi");
      page.locator(".gameCategoryColumn > span:nth-child(2)").first().click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.getByText("Which planet is known as the")).isVisible();
      assertThat(page.locator("#responsive-question")).containsText("Which planet is known as the \"Red Planet\"?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Mars");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("down navigationBtns").click();
      assertThat(page.locator("#responsive-question")).containsText("What is the largest animal on Earth?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Blue Whale");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("down navigationBtns").click();
      assertThat(page.locator("#responsive-question")).containsText("Which is the longest river in the world?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Nile River");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("down navigationBtns").click();
      assertThat(page.locator("#responsive-question")).containsText("What is the national flower of India?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Lotus");
      page.getByLabel("right navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("How many minutes are there in 2 hours?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("120");
      page.getByLabel("up navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What is the product of 6 and 8?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("48");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("up navigationBtns").click();
      assertThat(page.locator("#responsive-question")).containsText("What is the perimeter of a square with a side length of 5 cm?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("20 cm (Perimeter = 4 × side length)");
      page.getByLabel("up navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("If you have 3 apples and you buy 7 more, how many apples do you have in total?1");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("10 Apples");
      page.getByLabel("up navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("45 + 27?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("72");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^FF$"))).nth(2).click();
      page.locator("div:nth-child(3) > span").first().click();
      assertThat(page.locator("#responsive-question")).containsText("What is the opposite of the word \"happy\"?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Sad");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("down navigationBtns").click();
      assertThat(page.locator("#responsive-question")).containsText("Complete the sentence: \"The sun is shining _____ in the sky.\"");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Brightly");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.locator("div:nth-child(3) > span:nth-child(3)").click();
      assertThat(page.locator("#responsive-question")).containsText("Identify the noun in this sentence: \"The cat is sleeping on the couch.\"");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Cat couch");
      page.getByLabel("down navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What is the past tense of the verb \"run\"?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Ran");
      page.getByLabel("down navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What is the plural form of the word \"child\"?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("children");
      page.locator(".gameCategories > div:nth-child(4) > span").first().click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("Who is known as the \"Father of the Nation\" in India?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Mahatma Gandhi");
      page.locator("div:nth-child(4) > span:nth-child(2)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What are the four cardinal directions?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("North, South, East, West");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByLabel("down navigationBtns").click();
      assertThat(page.locator("#responsive-question")).containsText("What is the name of the current President of the United States?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Jeo Biden");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.locator("div:nth-child(4) > span:nth-child(4)").click();
      assertThat(page.locator("#responsive-question")).containsText("Which is the largest country in the world by area?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Russia");
      page.getByLabel("down navigationBtns").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("Name the three branches of the United States government.");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Executive, Legislative, Judicial");
      page.locator("div:nth-child(5) > span").first().click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("45+45");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("90");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.locator("div:nth-child(5) > span:nth-child(2)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("50-20");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("30");
      page.locator("div:nth-child(5) > span:nth-child(3)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("60-20");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("40");
      page.locator("div:nth-child(5) > span:nth-child(4)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("25+25");
      assertThat(page.locator("#responsive-question")).containsText("25+25");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("50");
      page.locator("div:nth-child(5) > span:nth-child(5)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("20");
      page.locator("div:nth-child(6) > span").first().click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What planet do we live on?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("earth");
      page.locator("div:nth-child(6) > span:nth-child(2)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What do plants need to make food?Sunlight, water, carbon dioxide (through photosynthesis");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Sunlight, water, carbon dioxide (through photosynthesis)");
      page.locator("div:nth-child(6) > span:nth-child(3)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What is the main gas that humans need to breathe?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Oxygen");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.locator("div:nth-child(6) > span:nth-child(4)").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("What is the largest organ in the human body?");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("Skin");
      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Final Factile$"))).nth(1).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      assertThat(page.locator("#responsive-question")).containsText("50+60");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
      assertThat(page.locator("#responsive-question")).containsText("110");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Final Factile")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Final Factile")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Factile Logo My Games")).click();
      Thread.sleep(2000);
      System.out.println("A new user with a free account has successfully previewed the game they created.");
  	  
	}
	@Test(priority=4)
	public void test_Preview_A_Public_Game() throws IOException, InterruptedException {
		Thread.sleep(2000);
		 page.getByText("Public Games", new Page.GetByTextOptions().setExact(true)).click();
	      page.getByPlaceholder("Search in Public Games").click();
	      page.getByPlaceholder("Search in Public Games").fill("7th grade math");
	      Thread.sleep(2000);      
	      page.locator("form").getByRole(AriaRole.BUTTON).first().click();    
	      Thread.sleep(2000); 
	     page.locator(".game-card-footer > button").first().click();
	    //  page.getByText("Integers").click();
	     // assertThat(page.getByText("Integers")).isVisible();
	      page.locator(".gamePointsBlock").first().click();
	      assertThat(page.getByText("-9+-(-5)")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is -4?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 15?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("+6")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("-6-(-8)")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is 2?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is -9?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("-9+9+-9+9+-")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("-(-1000)-")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is 996?")).isVisible();
	      page.getByLabel("right navigationBtns").click();
	      assertThat(page.getByText("What is 17?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("-5+4+6*9/")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.locator("#responsive-question")).containsText("-4+-5/2");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is -6.5?")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("What is 5.222 infinite?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("9d-25=")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("2x + 7 =")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is 4?")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("What is 3?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("-4+")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      page.getByLabel("right navigationBtns").click();
	      assertThat(page.getByText("What is y≥1/6?")).isVisible();
	      assertThat(page.getByText("What is y≥1/6?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is x≤2?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is z≤33?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is y≤5.61616161 infinite?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is x≥174?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("x/6-5≥")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("99y≤")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("3z≤")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("54x≤")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("+6y≥24")).isVisible();
	      page.getByLabel("right navigationBtns").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is 0.1?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 5.94?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 7.02?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is $32.10?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("Larry bought $30.00 worth of")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("9% of")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("23% of")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("6% of")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("Convert 10% to a decimal")).isVisible();
	      page.getByLabel("right navigationBtns").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is -20?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is -339?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 8?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 15?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is -")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("-9(60+95)")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("(2-3) + (20-4)")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("- 4 - 2")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("-7(56-7)")).isVisible();
	      page.getByLabel("up navigationBtns").click();
	      assertThat(page.getByText("-30-20-10")).isVisible();
	      page.getByLabel("right navigationBtns").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is 133.333 infinite?")).isVisible();
	      assertThat(page.getByText("What is 133.333 infinite?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 1.897?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 1.25?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 41?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is 9.2?")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("What is big and yellow and")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^FF$"))).nth(2).click();
	      page.locator("div:nth-child(6) > span").first().click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      page.locator("div:nth-child(6) > span:nth-child(2)").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      page.locator("div:nth-child(6) > span:nth-child(3)").click();
	      page.locator("div:nth-child(6) > span:nth-child(4)").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      page.locator("div:nth-child(6) > span").first().click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Question")).click();
	      assertThat(page.getByText("What is the unit rate of")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("into 74")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("into 45")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("5 into")).isVisible();
	      page.getByLabel("down navigationBtns").click();
	      assertThat(page.getByText("What is the unit rate if 5")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Final Factile")).click();
	      assertThat(page.getByText("What is big and yellow and")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("See Answer")).click();
	      assertThat(page.getByText("What is a school bus?")).isVisible();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Factile Logo My Games")).click();
	      page.locator("#sidebar-nav__item-myGames").getByText("My Games").click();
	      Thread.sleep(2000);
	      
	      System.out.println("Preview a public game is working fine");
	      Thread.sleep(2000);
	      
	    }
	
	
	
  	

	@Test(priority=5)
      public void test_Move_A_CreatedGame_From_AllGames_To_CreatedFolder() throws InterruptedException
      {
      
      Thread.sleep(2000);
      
      //Move a game from all games to folder1
      Thread.sleep(2000);
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Folder New Folder")).click();
      page.getByPlaceholder("Enter Folder Name").fill("folder1");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" All Games (1)")).click();
      Thread.sleep(2000);
      page.locator("div:nth-child(8) > .game-card-header__icon").click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("")).nth(2).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Add Selected Games").setExact(true)).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" folder1 ")).click();
      System.out.println("A new user with a free account has created a folder and moved the game from AllGames to CreatedFolder.");
      assertThat(page.getByText("MixQuestion")).isVisible();
      
      
	}
	@Test(priority=6)
      public void test_Delete_Folder() throws InterruptedException
      {
      
      Thread.sleep(2000);
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("")).nth(2).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Delete").setExact(true)).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes, Delete it!")).click();
      System.out.println("A new user with a free account has successfully deleted a folder they previously created.");
      Thread.sleep(2000);
	}

	
  /*  
  	@Test(priority=7)
  	public void test_Mark_Created_Game_AS_A_favorite()
  	{
        assertThat(page.locator("#root")).containsText("MixQuestion");
        page.locator("#sidebar-nav__item-favoriteGames span").nth(2).click();
        page.getByText("My Games(1)").click();
        assertThat(page.getByTestId("wrapper")).containsText("MixQuestion");
        System.out.println("A New user successfully marked a game as Favorite and that game is appearing under Favorite Game");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Games")).click();
        
  	}
  	
	*/
	
  	@Test(priority=7)
      public void test_Delete_Created_Game() throws InterruptedException
      {
      Thread.sleep(2000);
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Edit")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Delete")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes, Delete it!")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("OK")).click();
      Thread.sleep(3000);
      assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Upgrade to Pro"))).isVisible();
System.out.println( "A new user with a free account has successfully deleted a created Game they previously created.");
	}
  
  	
  	

	@Test(priority=9)
   public void test_Delete_Account() throws InterruptedException
   {
	   Thread.sleep(2000);
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Account")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete Account")).click();
		page.getByRole(AriaRole.TEXTBOX).fill("123456");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next!")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete!")).click();
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes!")).click();
        page.reload();
System.out.println("A New user successfully deleted account.");
    }

	/*
	@Test(dependsOnMethods="test")
  public void test_Free_User_Create_Folder() throws InterruptedException
  {
  }*/

  	// Generate random email
  	private String generateRandomEmail() {
  		String randomString = UUID.randomUUID().toString().substring(0, 8); // Generates a random 8-character string
  		return randomString + "1@example.com";
  		//https://www.youtube.com/watch?v=rAWLXwN3Jp4
  	}
	    
}
		
					
		

