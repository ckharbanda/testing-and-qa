package com.telstra.myaccount.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.telstra.myaccount.pages.BillsAndPaymentsPage;
import com.telstra.myaccount.pages.LoginPage;
import com.telstra.myaccount.pages.PayMyBillPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BillsAndPayments_StepDefinitions extends Common {
	@Given("^I have Telstra MyAccount URL$")
    public void i_have_Telstra_MyAccount_URL() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
		driver.navigate().to("https://www.my.telstra.com.au/myaccount/home");
    }

    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
    	LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername("parul.chelseaite@gmail.com");
		loginPage.setPassword("Telstra21");
		loginPage.clickLoginButton();
    }
    
    @And("^I enter the Pay my Bill Page$")
    public void I_enter_the_Pay_my_Bill_Page() throws Throwable {
    	BillsAndPaymentsPage billsAndPaymentsPage = new BillsAndPaymentsPage(driver);
    	billsAndPaymentsPage.clickMakeAPayment();
    }
    
    @And("^I enter billing information for a customer$")
    public void i_enter_billing_information_for_a_customer() throws Throwable {
    	PayMyBillPage billPage = new PayMyBillPage(driver);
    	billPage.selectNewCreditCard();
    	billPage.enterPaymentAmount();
    	billPage.enterCardNumber();
    	billPage.enterCardExpiry();
    	billPage.enterCvvNumber();
    	billPage.savePaymentMethod();
    }
    
    @Then("^The processing of payments should happen successfully$")
    public void the_processing_of_payments_should_happen_successfully() throws Throwable {
    	
    }
}
