package com;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.UUID;
import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import Resource.BaseTest;

public class test extends BaseTest {

	
	
	
	@Test(priority=1)
	public void testFreeUserCreatesGameUsingAI() throws IOException, InterruptedException {
		  page.waitForNavigation(() -> 
	        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click());
	        page.getByPlaceholder("Email Address").fill("sunita.del1@gmail.com");
	       // System.out.println("email:-"+generateRandomEmail());
			page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
			page.getByPlaceholder("Confirm Password").fill("123456");
			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
	    	page.waitForNavigation(() -> 
		    page.locator("#freeAccount").click());
		    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")).click();
	      page.getByPlaceholder("Enter a descriptive title for").click();
	      page.getByPlaceholder("Enter a descriptive title for").fill("creategame");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create")).click();
	    
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("New  AutoGen AI Assisted")).click();
	      page.getByPlaceholder("Type or select topic,").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Mathematics")).click();
	      page.getByPlaceholder(" Enter Grade").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Elementary school").setExact(true)).click();
	      page.getByLabel("No. of Questions").selectOption("10");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Generate")).click();
	      Thread.sleep(5000);
	      
	      
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Generate")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue Anyway")).click();
	      Thread.sleep(5000);
	      page.locator(".modal-content").click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-1100200300400500$"))).getByRole(AriaRole.BUTTON).first().click();
	      page.locator(".QE__QA__buttons > button:nth-child(2)").first().click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-1100200300400500$"))).getByRole(AriaRole.BUTTON).nth(1).click();
	      page.locator("div:nth-child(2) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-1100200300400500$"))).getByRole(AriaRole.BUTTON).nth(2).click();
	      page.locator("div:nth-child(3) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-1100200300400500$"))).getByRole(AriaRole.BUTTON).nth(3).click();
	      page.locator("div:nth-child(4) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-1100200300400500$"))).getByRole(AriaRole.BUTTON).nth(4).click();
	      page.locator("div:nth-child(5) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-2100200300400500$"))).getByRole(AriaRole.BUTTON).first().click();
	      page.locator("div:nth-child(6) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-2100200300400500$"))).getByRole(AriaRole.BUTTON).nth(1).click();
	      page.locator("div:nth-child(7) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-2100200300400500$"))).getByRole(AriaRole.BUTTON).nth(2).click();
	      page.locator("div:nth-child(8) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText("Question-Answer PreviewSelect a tile from below to see its content.CAT-")).nth(2).click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-2100200300400500$"))).getByRole(AriaRole.BUTTON).nth(3).click();
	      page.locator("div:nth-child(9) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-2100200300400500$"))).getByRole(AriaRole.BUTTON).nth(4).click();
	      page.locator("div:nth-child(10) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-3100200300400500$"))).getByRole(AriaRole.BUTTON).first().click();
	      page.locator("div:nth-child(11) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-3100200300400500$"))).getByRole(AriaRole.BUTTON).nth(1).click();
	      page.locator("div:nth-child(12) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-3100200300400500$"))).getByRole(AriaRole.BUTTON).nth(2).click();
	      page.locator("div:nth-child(13) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-3100200300400500$"))).getByRole(AriaRole.BUTTON).nth(3).click();
	      page.locator("div:nth-child(14) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-3100200300400500$"))).getByRole(AriaRole.BUTTON).nth(4).click();
	      page.locator("div:nth-child(15) > .QE__QA > .QE__QA__buttons > button:nth-child(2)").click();
	      Thread.sleep(3000);
	     // page.locator("div").filter(new Locator.FilterOptions().setHasText("Question-Answer PreviewSelect a tile from below to see its content.CAT-")).nth(2).click();
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-4100200300400500$"))).getByRole(AriaRole.BUTTON).first().click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("+")).first().click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-4100200300400500$"))).getByRole(AriaRole.BUTTON).nth(1).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("+")).first().click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-4100200300400500$"))).getByRole(AriaRole.BUTTON).nth(2).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("+")).first().click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-4100200300400500$"))).getByRole(AriaRole.BUTTON).nth(3).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("+")).first().click();
	      Thread.sleep(3000);
	      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^CAT-4100200300400500$"))).getByRole(AriaRole.BUTTON).nth(4).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("+")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("<< BACK")).click();
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
	      page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Factile Jeopardy-style    ")).click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("5").setExact(true)).click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("No")).click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Auto Select")).click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Begin Game")).click();
	      page1.locator(".gameQuestionBlock").first().click();
	      page1.locator(".podium-controls > i").first().click();
	      assertThat(page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue "))).isVisible();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator(".gameCategoryColumn > span:nth-child(3)").first().click();
	      assertThat(page1.locator("#game-screen-bottom")).containsText("$100");
	      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      assertThat(page1.locator("#game-screen-bottom")).containsText("$200");
	      page1.locator(".gameCategoryColumn > span:nth-child(4)").first().click();
	      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
	      assertThat(page1.locator("#game-screen-bottom")).containsText("$300");
	      page1.locator("span").filter(new Locator.FilterOptions().setHasText("Continue")).first().click();
	      page1.locator("span:nth-child(5)").first().click();
	      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
	      assertThat(page1.locator("#game-screen-bottom")).containsText("$400");
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator("span:nth-child(6)").first().click();
	      page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i").first().click();
	      assertThat(page1.locator("#game-screen-bottom")).containsText("$500");
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator("div:nth-child(2) > span:nth-child(2)").click();
	      page1.locator("i:nth-child(2)").first().click();
	      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator("div:nth-child(2) > span:nth-child(3)").click();
	      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$300").nth(1).click();
	      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator("div:nth-child(2) > span:nth-child(5)").click();
	      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator("div:nth-child(2) > span:nth-child(6)").click();
	      page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	    //  page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator("div:nth-child(3) > span:nth-child(2)").click();
	      page1.locator(".podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$200").nth(2).click();
	      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$300").nth(2).click();
	      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$400").nth(2).click();
	      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.locator("div:nth-child(3) > span:nth-child(6)").click();
	      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$100", new Page.GetByTextOptions().setExact(true)).nth(3).click();
	      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$200").nth(3).click();
	      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$300").nth(3).click();
	      page1.locator(".podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$400").nth(3).click();
	      page1.locator(".podium-controls > i").first().click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
	      page1.getByText("$500").nth(3).click();
	      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
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
	    }
	    
		
		
					
		
	
	
	private String generateRandomEmail() {
		String randomString = UUID.randomUUID().toString().substring(0, 8); // Generates a random 8-character string
		return randomString + "@example.com";
	}



	public void DeleteAccount() {
		//page.locator("#freeAccount").click();
		//page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("×")).click();
		 page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Account")).click();
	     // page.locator("#root").click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete Account")).click();
	      page1.getByRole(AriaRole.TEXTBOX).fill("123456");
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next!")).click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete!")).click();
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Yes!")).click();
	}

}
