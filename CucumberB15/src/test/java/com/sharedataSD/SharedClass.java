package com.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;

	
	@Before
	public WebDriver setup(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "D:\\radicalsoftware\\chromedriver_win32_B39\\chromedriver.exe");
			////System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_winn32_B37\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	
	@After
	public void tearDown(){
		driver.quit();
		driver =null;
	}
	
	

}
