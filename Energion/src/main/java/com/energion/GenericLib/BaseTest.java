package com.energion.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest implements IAutoConsts {

	public static WebDriver driver;

	public void openBrowser() throws Throwable {
		
	FileLib flib = new FileLib();
	
	String browserName = flib.readPropertyData(PROP_PATH, "browser");
	
	if(browserName.equals("chrome")) {
		
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	
	driver = new ChromeDriver();
	}
	
	//This line is for changes in github 
	
	else if(browserName.equals("firefox")) {
		
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();
	
	}
	
	else {
		System.out.println("Enter Proper Browser Name");
	}
	
	driver.manage().window().maximize();
	
	String appurl = flib.readPropertyData(PROP_PATH, "url");
	
	driver.get(appurl);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	public void closeBrowser() {
		
		driver.quit();
	}
}
