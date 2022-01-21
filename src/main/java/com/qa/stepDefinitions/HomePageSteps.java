package com.qa.stepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {
	
	LoginPage lp;
	HomePage hp;
	
	public HomePageSteps() {
		
		super(); //to call parent class constructor
	}

	@Given("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {


		intialization();
		lp = new LoginPage();
		String title =  lp.validateLoginPagetitle();
		Assert.assertEquals("Amazon Sign In", title);

		hp = new HomePage();

		
	}

	@When("^validate user is logged in and on homepage$")
	public void validate_user_is_logged_in_and_on_homepage() throws InterruptedException{
		lp.login(prop.getProperty("username1"), prop.getProperty("password1"));

	}
	
	@Then("^user enters \"([^\"]*)\" in searchbar and clicks search button$")
	public void user_enters_in_searchbar_and_clicks_search_button(String searchitem) throws Throwable {
	   hp.SearchMultipleItems(searchitem); 
	   
	   
	}

	@Then("^validate search result related to \"([^\"]*)\" is displayed$")
	public void validate_search_result_related_to_is_displayed(String args1) throws Throwable {
		hp.validateItemsResultPage(args1);
	   
	}
	
	@Then ("^close the browser$")
	public void close_the_browser() throws Throwable {
		  driver.quit();
		   
		}




}



