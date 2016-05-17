package com.switchmedia.tests;

import org.junit.Assert;
import org.junit.Test;

import com.switchmedia.api.ComposePage;
import com.switchmedia.api.HomePage;
import com.switchmedia.api.LoginPage;

public class TestLogin extends Common {
	
	@Test
	public void testEmailComposeInGmail() throws Exception{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmail("testerswitch123@gmail.com");
		loginPage.clickNext();
		loginPage.setPassword("Tester@123");

		HomePage homePage = loginPage.clickSignInButton();
		Assert.assertEquals("Unable to login to Gmail. Please check if the username and password is correct",
				"Gmail", homePage.getTitle());
		
		ComposePage composePage = homePage.clickComposeButton();
		composePage.selectRecipient("testerswitch123@gmail.com");
		composePage.enterEmailSubject("Test Subject");
		composePage.enterBodyContent("This is a test email");
		composePage.clickSendButton();
		
	}

}
