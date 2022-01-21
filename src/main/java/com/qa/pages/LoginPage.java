package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


	public class LoginPage extends TestBase {
	
		//PageFactory
		
		@FindBy(id= "ap_email")
		WebElement username;
		
		@FindBy(id = "continue")
		WebElement continuebtn;
		
		@FindBy(id= "ap_password")
		WebElement password;
		
		@FindBy(id= "signInSubmit")
		WebElement signinbtn;
		
		//initializing the Page Object
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
	
		//Actions
		
		public String validateLoginPagetitle() {
			System.out.println(driver.getTitle());
			return driver.getTitle();
		}
	
		public void login (String un, String pswd) throws InterruptedException {
		
			
			//	driver.findElement(By.id("ap_email")).sendKeys(un);   
			
			
			username.sendKeys(un);
			continuebtn.click();
			password.sendKeys(pswd);
			signinbtn.click();
			//Thread.sleep(3000);
			//String title = driver.getTitle();
			//Assert.assertEquals("Amazon.ca: Low Prices – Fast Shipping – Millions of Items", title);
			}
		}
		
		
		
		
