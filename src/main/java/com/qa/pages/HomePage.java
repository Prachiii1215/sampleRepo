package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import junit.framework.Assert;

public class HomePage extends TestBase{
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement userNameLabel;
	
	@FindBy(id="glow-ingress-line2")
	WebElement userAddrsLabel;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	@FindBy (id="nav-search-submit-button")
	WebElement searchbtn;
	
	
	//Initializing the Page Object
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String HomePagetitle() {    //validate HomePage Title
		return driver.getTitle();		// expectedctitle= Amazon.ca: Low Prices – Fast Shipping – Millions of Items
	}
	
	public boolean validateUserLabel() {    //Validate username Label is displayed
		return userNameLabel.isDisplayed();
		
	}
	
	public void SearchMultipleItems(String searchitem) {
		searchbox.sendKeys(searchitem);
		searchbtn.click();
		//return new iphoneResultPage();
	}
	
	public void validateItemsResultPage(String searchitem) {
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals("Your Amazon.ca : " + searchitem, title);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
