package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iphoneResultPage extends HomePage{
	
	@FindBy(linkText = "Apple iPhone 11, 64GB, Black - Fully Unlocked (Renewed)")
	WebElement iphn11ResultLink;


public String validateResultPageTitle() {    //validate ResultPage Title
	return driver.getTitle();		// expectedctitle=Amazon.ca : iphone11

}

public boolean validateSearchResultLink() {
	return iphn11ResultLink.isDisplayed();
}
}