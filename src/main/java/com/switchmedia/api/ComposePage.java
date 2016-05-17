package com.switchmedia.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComposePage extends BasePage {

	public ComposePage(WebDriver driver) {
		super(driver);
	}

	public void selectRecipient(String recipient) {
		driver.findElement(By.name("to")).sendKeys(recipient);
	}

	public void enterEmailSubject(String subject) {
		driver.findElement(By.name("subjectbox")).sendKeys(subject);
	}

	public void clickSendButton() {
		driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
	}

	public HomePage enterBodyContent(String bodyContent) {
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(bodyContent);
		return new HomePage(driver);
	}

}
