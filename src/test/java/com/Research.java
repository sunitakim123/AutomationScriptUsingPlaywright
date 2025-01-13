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

public class Research extends BaseTest {

	
	
	
	@Test(priority=1)
	public void test_Free_User_Creates_Game_Manually() throws IOException, InterruptedException {
		  
		  page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click());
	        page.getByPlaceholder("Email Address").fill(generateRandomEmail());
	       // System.out.println("email:-"+generateRandomEmail());
			page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
			page.getByPlaceholder("Confirm Password").fill("123456");
			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
			page.waitForNavigation(() -> 
		    page.locator("#freeAccount").click());
	/*	 page.navigate(properties.getProperty("rootUrl"));
		 page.getByRole(AriaRole.MAIN).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Log In")).click();
	      page.getByPlaceholder("Email Id or Username").click();
	      page.getByPlaceholder("Email Id or Username").fill("sunita.del1@gmail.com");
	      page.getByPlaceholder("Password").click();
	      page.getByPlaceholder("Password").fill("123456");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();*/
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")).click();
	      page.getByPlaceholder("Enter a descriptive title for").fill("Test1");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Create Manually Add you own")).click();
	      page.getByPlaceholder("Category-1 Title").click();
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
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill(" 20 cm (Perimeter = 4 × side length)");
	      page.locator("div:nth-child(2) > span:nth-child(5)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("How many minutes are there in 2 hours?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("How many minutes are there in 2 hours?");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
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
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("R");
	      page.getByText("R", new Page.GetByTextOptions().setExact(true)).fill("Ran");
	      page.locator("div:nth-child(3) > span:nth-child(5)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the plural form of the word \"child\"?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("children");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();   

	      page.getByPlaceholder("Category-4 Title").click();
	      page.getByPlaceholder("Category-4 Title").fill("Categ-4");
	      page.locator("div:nth-child(4) > span:nth-child(3)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Who is known as the \"Father of the Nation\" in India?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Mahatma Gandhi");
	      page.locator("div:nth-child(4) > span:nth-child(2)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What are the four cardinal directions?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("North, South, East, West");
	      page.locator("div:nth-child(4) > span:nth-child(3)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click(new Locator.ClickOptions()
	        .setModifiers(Arrays.asList(KeyboardModifier.CONTROLORMETA)));
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the name of the current President of the United States?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Jeo Biden");
	      page.locator("div:nth-child(4) > span:nth-child(4)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Which is the largest country in the world by area?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Russia");
	      page.locator("div:nth-child(4) > span:nth-child(5)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("Name the three branches of the United States government.");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Executive, Legislative, Judicial");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
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
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What is the largest organ in the human body?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Skin");
	      page.locator("div:nth-child(6) > span:nth-child(5)").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("What are the three states of matter?");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("Solid, Liquid, Gas");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
	      page.getByText("Final Factile").click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#question").getByRole(AriaRole.TEXTBOX).fill("50+60");
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).click();
	      page.locator("#answer").getByRole(AriaRole.TEXTBOX).fill("110");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("SAVE")).click();
	      }
	
	
	@Test(dependsOnMethods = {"test_Free_User_Creates_Game_Manually"})
    public void test_Free_User_Play_Manually_Created_Game() throws InterruptedException
    {
    Page page1 = page.waitForPopup(() -> {
      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(" Play Game")).click();
    });
    page1.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Flashcards Self-Paced Review$"))).nth(2).click();
    assertThat(page1.getByRole(AriaRole.DIALOG)).containsText("UPGRADE toPROGraduate from your Basic plan");
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    page1.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Choice Jeopardy-style Multiple Choice$"))).nth(2).click();
    assertThat(page1.getByRole(AriaRole.DIALOG)).containsText("Go Pro");
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    page1.getByText("Quiz Bowl College Bowl-style").click();
    assertThat(page1.getByRole(AriaRole.DIALOG)).containsText("UPGRADE toPROGraduate from your Basic plan×Close");
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    page1.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Interactive Choice Self-Paced Jeopardy-style Multiple Choice$"))).nth(2).click();
    assertThat(page1.getByRole(AriaRole.DIALOG)).containsText("UPGRADE toPROGraduate from your Basic plan");
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    page1.getByText("Memory Tile Matching Memory").click();
    page1.getByText("UPGRADE toPROGraduate from").click();
    page1.getByText("UPGRADE toPROGraduate from").click();
    assertThat(page1.getByRole(AriaRole.DIALOG)).containsText("UPGRADE toPROGraduate from your Basic plan");
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
    Thread.sleep(3000);
    page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Factile Jeopardy-style    ")).click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("5").setExact(true)).click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("No")).click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Auto Select")).click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Begin Game")).click();
    page1.locator(".gamePointsBlock").first().click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("span:nth-child(3) > .gamePointsBlock").first().click();
    page1.locator(".podium-controls").first().click();
    page1.locator(".podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("span:nth-child(4) > .gamePointsBlock").first().click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("span:nth-child(5) > .gamePointsBlock").first().click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls").click();
    page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("span:nth-child(6)").first().click();
    page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(2) > span:nth-child(2)").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i:nth-child(2)").click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(2) > span:nth-child(3) > .gamePointsBlock").click();
    page1.locator(".podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(2) > span:nth-child(4)").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(2) > span:nth-child(5)").click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls").click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(2) > span:nth-child(6) > .gamePointsBlock").click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(3) > span:nth-child(2) > .gamePointsBlock").click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(3) > span:nth-child(3)").click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(3) > span:nth-child(4)").click();
    page1.locator("i:nth-child(2)").first().click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(3) > span:nth-child(5) > .gamePointsBlock").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(3) > span:nth-child(6) > .gamePointsBlock").click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(4) > span:nth-child(2) > .gamePointsBlock").click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(4) > span:nth-child(3) > .gamePointsBlock").click();
    page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(4) > span:nth-child(4) > .gamePointsBlock").click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(4) > span:nth-child(5) > .gamePointsBlock").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(4) > span:nth-child(6)").click();
    page1.locator(".podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(5) > span:nth-child(2)").click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(5) > span:nth-child(3) > .gamePointsBlock").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(5) > span:nth-child(4) > .gamePointsBlock").click();
    page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(5) > span:nth-child(5)").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(5) > span:nth-child(6)").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(6) > span:nth-child(2) > .gamePointsBlock").click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(6) > span:nth-child(3) > .gamePointsBlock").click();
    page1.locator(".podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(6) > span:nth-child(4) > .gamePointsBlock").click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(6) > span:nth-child(5) > .gamePointsBlock").click();
    page1.locator(".podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    page1.locator("div:nth-child(6) > span:nth-child(6) > .gamePointsBlock").click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    assertThat(page1.locator("#invalidWagers")).containsText("Enter Valid Wagers");
    page1.getByPlaceholder("0").first().click();
    page1.getByPlaceholder("0").first().press("End");
    page1.getByPlaceholder("0").first().press("End");
    page1.getByPlaceholder("0").first().press("Insert");
    page1.getByPlaceholder("0").first().press("NumLock");
    page1.getByPlaceholder("0").first().fill("1100");
    page1.getByPlaceholder("0").nth(1).click();
    page1.getByPlaceholder("0").nth(1).fill("2500");
    page1.getByPlaceholder("0").nth(2).click();
    page1.getByPlaceholder("0").nth(2).fill("1500");
    page1.getByPlaceholder("0").nth(3).click();
    page1.getByPlaceholder("0").nth(3).fill("1400");
    page1.getByPlaceholder("0").nth(4).click();
    page1.getByPlaceholder("0").nth(4).fill("1400");
   // page1.getByText("It's Final Factile Time!Halloween MathEnter wager amounts belowEnter Valid").click();
    page1.getByText("Enter Valid Wagers").click();
    page1.locator(".podium-controls > i").first().click();
    page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
    page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i:nth-child(2)").click();
    page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i:nth-child(2)").click();
    page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i:nth-child(2)").click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reveal Answer")).click();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
    assertThat(page1.locator("#mainGameBoard")).containsText("Winner");
    assertThat(page1.getByText("Go HomeShow ScoreFeedback")).isVisible();
    page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Go Home")).click();
    page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Account")).click();
    // page.locator("#root").click();
     page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete Account")).click();
     page1.getByRole(AriaRole.TEXTBOX).fill("123456");
     page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next!")).click();
     page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete!")).click();
     page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes!")).click();
     page1.close();

  }
  
	

	// Generate random email
	private String generateRandomEmail() {
		String randomString = UUID.randomUUID().toString().substring(0, 8); // Generates a random 8-character string
		return randomString + "1@example.com";
	}
	
	    
}
		
					
		

