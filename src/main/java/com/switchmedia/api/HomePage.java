package com.switchmedia.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver){
		super(driver);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public ComposePage clickComposeButton() {
		//driver.findElement(By.className("z0")).click();
		driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
		return new ComposePage(driver);
	}

	public void clickLogout() {
		driver.findElement(By.id("gb_2a")).click();
		driver.findElement(By.id("gb_71")).click();
	}
}
