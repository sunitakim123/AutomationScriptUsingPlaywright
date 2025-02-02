package com;


	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
	import static org.testng.Assert.assertEquals;

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

	public class GamePlayByFreeUsers extends BaseTest {

			
		@Test(priority=1)
		public void test_Public_Game_Played_By_Non_Logged_User() throws IOException, InterruptedException {
			 Thread.sleep(4000);
			page.navigate(properties.getProperty("rootUrl"));
			page.locator("form").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Browse All Games")).click();
			 page.getByPlaceholder("Search Games").click();
		      page.getByPlaceholder("Search Games").fill("7th Grade Math");
		      page.getByLabel("Search").click();
		      Page page1 = page.waitForPopup(() -> {
		        page.locator(".game-card-footer__btn").first().click();
		      });
		      page1.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Flashcards Self-Paced Review$"))).nth(2).click();
		      assertThat(page1.getByText("UPGRADE toPROGraduate from")).isVisible();
		      assertThat(page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Go Pro"))).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
		      page1.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Choice Jeopardy-style Multiple Choice$"))).nth(2).click();
		      assertThat(page1.getByText("UPGRADE toPROGraduate from")).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
		      page1.getByText("Quiz Bowl College Bowl-style").click();
		      assertThat(page1.getByText("UPGRADE toPROGraduate from")).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
		      page1.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Interactive Choice Self-Paced Jeopardy-style Multiple Choice$"))).nth(2).click();
		      assertThat(page1.getByText("UPGRADE toPROGraduate from")).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
		      page1.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Memory Tile Matching Memory Board$"))).nth(2).click();
		      assertThat(page1.getByText("UPGRADE toPROGraduate from")).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Close")).click();
		      
		      page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Factile Jeopardy-style    ")).click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("6").setExact(true)).click();
		      assertThat(page1.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Do you want to select more no"))).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Cancel")).click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("5").setExact(true)).click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("No")).click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Auto Select")).click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Begin Game")).click();
		      page1.locator(".gamePointsBlock").first().click();
		      page1.locator(".podium-controls > i").first().click();
		      assertThat(page1.locator("#game-screen-bottom")).containsText("$100");
		      assertThat(page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue "))).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("span:nth-child(3) > .gamePointsBlock").first().click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
		      assertThat(page1.locator("#game-screen-bottom")).containsText("$200");
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator(".gameCategoryColumn > span:nth-child(4)").first().click();
		      //page1.locator("body").press("AudioVolumeDown");
		      page1.locator(".podium-controls > i").first().click();
		      assertThat(page1.locator("#game-screen-bottom")).containsText("$400");
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("span:nth-child(5)").first().click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      assertThat(page1.locator("#game-screen-bottom")).containsText("$400");
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("span:nth-child(6)").first().click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      assertThat(page1.locator("#game-screen-bottom")).containsText("$900");
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(2) > span:nth-child(2)").click();
		      assertThat(page1.getByText("-4+")).isVisible();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
		      assertThat(page1.getByText("$300")).isVisible();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(2) > span:nth-child(3) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(2) > span:nth-child(4) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(2) > span:nth-child(5) > .gamePointsBlock").click();
		      assertThat(page1.locator("#responsive-question")).containsText("-4+-5/2");
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      assertThat(page1.locator("#game-screen-bottom")).containsText("$1300");
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(2) > span:nth-child(6)").click();
		      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(3) > span:nth-child(2) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(3) > span:nth-child(3) > .gamePointsBlock").click();
		      page1.locator(".podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(3) > span:nth-child(4) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(3) > span:nth-child(5) > .gamePointsBlock").click();
		      assertThat(page1.getByText("$1600")).isVisible();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i:nth-child(2)").click();
		      assertThat(page1.getByText("$1200")).isVisible();
		      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(3) > span:nth-child(6) > .gamePointsBlock").click();
		      page1.locator(".podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(4) > span:nth-child(2) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(4) > span:nth-child(3)").click();
		      page1.locator(".podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(4) > span:nth-child(4) > .gamePointsBlock").click();
		      page1.getByText("Skip/See Answer").click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(4) > span:nth-child(5)").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(4) > span:nth-child(6)").click();
		      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(5) > span:nth-child(3) > .gamePointsBlock").click();
		      page1.locator(".podium-controls").first().click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(5) > span:nth-child(4)").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(5) > span:nth-child(2) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(5) > span:nth-child(5) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(5) > span:nth-child(6)").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(6) > span:nth-child(2) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(6) > span:nth-child(5) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(6) > span:nth-child(4) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls").click();
		      page1.locator(".podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(6) > span:nth-child(3) > .gamePointsBlock").click();
		      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      page1.locator("div:nth-child(6) > span:nth-child(6)").click();
		      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i").first().click();
		      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
		      assertThat(page1.getByText("Enter Valid Wagers")).isVisible();
		      
		      page1.getByPlaceholder("0").first().click();
		      page1.getByPlaceholder("0").first().fill("1300");
		      page1.getByPlaceholder("0").nth(1).click();
		      page1.getByPlaceholder("0").nth(1).fill("1000");
		      page1.getByPlaceholder("0").nth(2).click();
		      page1.getByPlaceholder("0").nth(2).fill("1200");
		      page1.getByPlaceholder("0").nth(3).click();
		      page1.getByPlaceholder("0").nth(3).fill("495");

		      page1.getByPlaceholder("0").nth(4).click();
		      page1.getByPlaceholder("0").nth(4).fill("0");
		      page1.getByText("Enter Valid Wagers").click();
		         assertThat(page1.getByText("What is big and yellow and")).isVisible();
		       //  page1.getByText("Enter Valid Wagers").click();
			      page1.locator(".podium-controls > i").first().click();
			      page1.locator("div:nth-child(2) > .podium-content > .podium-controls > i").first().click();
			      page1.locator("div:nth-child(3) > .podium-content > .podium-controls > i:nth-child(2)").click();
			      page1.locator("div:nth-child(4) > .podium-content > .podium-controls > i:nth-child(2)").click();
			      page1.locator("div:nth-child(5) > .podium-content > .podium-controls > i:nth-child(2)").click();
			      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reveal Answer")).click();
			      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue ")).click();
			      assertThat(page1.locator("#mainGameBoard")).containsText("Winner");
			      page1.close();
			      System.out.println("A non-logged-in user has successfully played a public game.");
			      //assertThat(page1.getByText("Go HomeShow ScoreFeedback")).isVisible();
		    		}


	
	
	@Test(priority=2)
	public void test_Public_Game_Played_By_Logged_User_Who_having_Free_account() throws IOException, InterruptedException {
		page.navigate(properties.getProperty("rootUrl"));
		  page.waitForNavigation(() -> 
	      page.locator("//*[@id=\"gatsby-focus-wrapper\"]/div/main/section[1]/div/div/div[1]/div/div[1]/a[2]").click());
	      page.getByPlaceholder("Email Id or Username").fill(properties.getProperty("username"));
	      page.locator("//*[@id=\"logInForm\"]/div[2]/input").fill("654321");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
	   	  page.waitForNavigation(() -> 
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")));
	   	page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Public Games$"))).click();
	      page.getByPlaceholder("Search in Public Games").click();
	      page.getByPlaceholder("Search in Public Games").fill("halloween math");
	      page.getByPlaceholder("Search in Public Games").press("Enter");
	      page.locator("form").getByRole(AriaRole.BUTTON).first().click();
	      Page page1 = page.waitForPopup(() -> {
	        page.locator("div:nth-child(3) > .game-card-template__footer > .game-card-footer > a").click();
	      });Thread.sleep(3000);
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
	      page1.waitForNavigation(() -> 
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("profile")).click());
	      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Logout")).click();
	     
	      page1.close();
	      page.reload();
	System.out.println("A new user with a free account has successfully played a public game.");      
	}

	
	
	@Test(priority=3)
	public void test_Free_User_Create_Game_Using_AI() throws IOException, InterruptedException {
		 Thread.sleep(5000);
		 
		 String email1=generateRandomEmail();
	        System.out.println(email1);
		   page.navigate(properties.getProperty("rootUrl"));
		  
		   page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click();
		      page.getByPlaceholder("Email Address").click();
		      page.getByPlaceholder("Email Address").fill(email1);
		      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).click();
		      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
		      page.getByPlaceholder("Confirm Password").click();
		      page.getByPlaceholder("Confirm Password").fill("123456");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
		 /*  
	        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click();
	        
	        //System.out.println("generateRandomEmail:-"+generateRandomEmail());
	        String email1=generateRandomEmail();
	        System.out.println(email1);
	        Thread.sleep(2000);
	        page.waitForNavigation(() -> 
	        page.getByPlaceholder("Email Address").fill(email1));
	        Thread.sleep(3000);
	       // System.out.println("email:-"+generateRandomEmail());
			page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
			page.getByPlaceholder("Confirm Password").fill("123456");
			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();*/
	    	page.waitForNavigation(() -> 
		    page.locator("#freeAccount").click());
		    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")).click();
	      page.getByPlaceholder("Enter a descriptive title for").click();
	      page.getByPlaceholder("Enter a descriptive title for").fill("creategame");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create")).click();
	   // page.locator("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[3]/div/a[2]").click();
	   // page.waitForNavigation(() -> 
	    //page.locator("//*[@id=\"gameEditPage\"]/div/div[1]/span[3]/span[2]").click());
	    
	    page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("New  AutoGen AI Assisted")).click();
	      page.getByPlaceholder("Type or select topic,").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Mathematics")).click();
	      page.getByPlaceholder(" Enter Grade").click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Elementary school").setExact(true)).click();
	      page.getByLabel("No. of Questions").selectOption("10");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Generate")).click();
	      Thread.sleep(7000);
	            
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
	      System.out.println("\r\n"
	      		+ "A new user with a free account has successfully created a game using AI.");
	      	      Thread.sleep(2000);
	}
	      
	     
	      @Test(dependsOnMethods = {"test_Free_User_Create_Game_Using_AI"})
	      public void test_Free_User_Play_AIGenerated_Game() throws InterruptedException
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
		      page1.close();
		      System.out.println("A new user with a free account has played an AI-generated game that they created.");
		      page.reload();
	    }
	    
	
	      @Test(priority=4)
	  	public void test_Free_User_Creates_Game_Manually() throws IOException, InterruptedException {
	    	  Thread.sleep(5000);
	    	  
	    	  String email1=generateRandomEmail();
		        System.out.println(email1);
			   page.navigate(properties.getProperty("rootUrl"));
			  
			   page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click();
			      page.getByPlaceholder("Email Address").click();
			      page.getByPlaceholder("Email Address").fill(email1);
			      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).click();
			      page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
			      page.getByPlaceholder("Confirm Password").click();
			      page.getByPlaceholder("Confirm Password").fill("123456");
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();
	    /*	 page.navigate(properties.getProperty("rootUrl"));
	    		
	          page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Sign Up Sign Up For Free")).click();
	          String email2=generateRandomEmail();
		        System.out.println(email2);
		        Thread.sleep(2000);
		        page.waitForNavigation(() -> 
		        page.getByPlaceholder("Email Address").fill(email2));
	          Thread.sleep(3000);
	    	       // System.out.println("email:-"+generateRandomEmail());
	    			page.getByPlaceholder("Password", new Page.GetByPlaceholderOptions().setExact(true)).fill("123456");
	    			page.getByPlaceholder("Confirm Password").fill("123456");
	    			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign Up")).click();  */
	    			page.waitForNavigation(() -> 
	    		    page.locator("#freeAccount").click());
	    
	    	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Game")).click();
	    	      page.getByPlaceholder("Enter a descriptive title for").fill("Test1");
	    	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create")).click();
	  	//    page.locator("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[2]/div/div[3]/div/a[2]").click();
	  	    
	  	   
	    	     page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(" Create Manually Add you own")).click();
	  	   
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
	    	      System.out.println("\r\n"
	    	      		+ "A new user with a free account has successfully created a game manually.");
	    	      Thread.sleep(2000);
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
	         System.out.println("A new user with a free account has played a manually created game.");
	         page.reload();

	      }
	  	
	  	
	  	
	  	// Generate random email
	  	private String generateRandomEmail() {
	  		String randomString = UUID.randomUUID().toString().substring(0, 8); // Generates a random 8-character string
	  		return randomString + "1@example.com";
	  	}
					
		
}
	
	