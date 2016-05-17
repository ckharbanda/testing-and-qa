package com.switchmedia.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Common {
	public WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		driver.get("https://mail.google.com");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
