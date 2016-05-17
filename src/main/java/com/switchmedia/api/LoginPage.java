package com.switchmedia.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterEmail(String email) throws Exception {
		WebElement Email = driver.findElement(By.id("Email"));
		if (Email.isDisplayed()){
			driver.findElement(By.id("Email")).sendKeys(email);
		} else {
			throw new Exception("UserName is not enabled");
		}
	}

	public void setPassword(String password) throws Exception {
		WebElement Password = driver.findElement(By.id("Email"));
		if (Password.isDisplayed()){
			driver.findElement(By.id("Passwd")).sendKeys(password);
		} else {
			throw new Exception("Unable to enter Password. Password field is not enabled");
		}
		
	}
	
	public void clickNext() {
		driver.findElement(By.id("next")).click();
	}

	public HomePage clickSignInButton() {
		driver.findElement(By.id("signIn")).click();
		return new HomePage(driver);
	}

}
