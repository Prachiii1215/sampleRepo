package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public  TestBase() {
		try {
			prop = new Properties();
			FileInputStream f= new FileInputStream("M:\\Java Selenium\\Selenium_Workspace\\AmazonBDDFrameworkWithPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(f);
			}
		catch(IOException e){
			e.getMessage();
			
		}
	}
	
	public static void intialization() {
		
		String browser = prop.getProperty("browser");
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "M:\\Java Selenium\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "M:\\Java Selenium\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TestUtilities.Implicit_Wait, TimeUnit.SECONDS);  //called global static variable from TestUtil class
		driver.manage().timeouts().pageLoadTimeout(TestUtilities.Page_Load_Timeout, TimeUnit.SECONDS);  //classname.globalstaticvar
		
		driver.get(prop.getProperty("url"));
		

}

	

}
