package ecore;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepsTestAutomation {
	ChromeDriver driverLocal;
	TestLoginPage testLoginPage;


    @Before
    public void setUp() throws Exception{
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--start-maximized");
    	System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driverLocal = new ChromeDriver(options);
		

    }

    @After
    public void tearDown(){

    	driverLocal.quit();
    }

	
	
	@Given("^I go to automation-sandbox page$")
	public void iGoToAutomationSandboxPage() throws Throwable {

		
		testLoginPage = new TestLoginPage(driverLocal);
		testLoginPage.accessSandboxPage();
	}

	
	@And("^page loads with success$")
	public void pageLoadsWithSuccess() throws Throwable {

		boolean expectedResult = testLoginPage.verifyLoadPage();
		Assert.assertTrue(expectedResult);
	} 
	
	
	@Then("^I enter the username \"([^\"]*)\"$")
	public void iEnterTheUsername(String receivedUsername) throws Throwable {
		
		testLoginPage.insertUsername(receivedUsername);
	}

	@And("^I enter the password \"([^\"]*)\"$")
	public void iEnterThePassword(String receivedPassword) throws Throwable {

		testLoginPage.insertPassword(receivedPassword);
	}
	
	
	@And("^I click in Login button$")
	public void iClickInLoginButton() throws Throwable {
		
		testLoginPage.clickLoginPage();
	}

	
	@Then("^I log in automation-sandbox with success$")
	public void iLogInAutomationSandboxWithSuccess() throws Throwable {
		
		boolean expectedResult = testLoginPage.verifyLoadPage();
		Assert.assertTrue(expectedResult);
	}

	@Then("^Wrong Username or Password message appears$")
	public void wrongUsernameOrPasswordMessageAppears() throws Throwable {
		
		boolean expectedResult = testLoginPage.verifyLoadPage();
		Assert.assertFalse(expectedResult);
	}

	@Then("^I confirm that HotelName value is equal \"([^\"]*)\"$")
	public void iConfirmThatHotelNameValueIsEqual(String arg1) throws Throwable {

	}

	@Then("^I click in Invoice Details link$")
	public void iClickInInvoiceDetailsLink() throws Throwable {
		 testLoginPage.clickInvoiceDetailsLink();
	}

	@And("^I confirm that InvoiceDate value is equal \"([^\"]*)\"$")
	public void iConfirmThatInvoiceDateValueIsEqual(String arg1) throws Throwable {

	}

	@And("^I confirm that InvoiceNumber value is equal \"([^\"]*)\"$")
	public void iConfirmThatInvoiceNumberValueIsEqual(String arg1) throws Throwable {

	}

	@And("^I confirm that Room value is equal \"([^\"]*)\"$")
	public void iConfirmThatRoomValueIsEqual(String arg1) throws Throwable {

	}

	@And("^I confirm that Tax&VAT value is equal \"([^\"]*)\"$")
	public void iConfirmThatTaxVATValueIsEqual(String arg1) throws Throwable {

	}

	@And("^I confirm that TotalAmount value is equal \"([^\"]*)\"$")
	public void iConfirmThatTotalAmountValueIsEqual(String arg1) throws Throwable {

	}

	@And("^I confirm that TotalStayAmount value is equal \"([^\"]*)\"$")
	public void iConfirmThatTotalStayAmountValueIsEqual(String arg1) throws Throwable {

	}

	@And("^I confirm that TotalStayCount value is equal \"([^\"]*)\"$")
	public void iConfirmThatTotalStayCountValueIsEqual(String arg1) throws Throwable {

	}

	@And("^I confirm that BookingCode value is equal \"([^\"]*)\"$")
	public void iConfirmThatBookingCodeValueIsEqual(String arg1) throws Throwable {
		throw new PendingException();
	}

	@And("^I confirm that CheckIn value is equal \"([^\"]*)\"$")
	public void iConfirmThatCheckInValueIsEqual(String arg1) throws Throwable {
		throw new PendingException();
	}

	@And("^I confirm that CheckOut value is equal \"([^\"]*)\"$")
	public void iConfirmThatCheckOutValueIsEqual(String arg1) throws Throwable {
		throw new PendingException();
	}

	@And("^I confirm that CustomerDetails value is equal \"([^\"]*)\"$")
	public void iConfirmThatCustomerDetailsValueIsEqual(String arg1) throws Throwable {
		throw new PendingException();
	}

	@And("^I confirm that DepositNow value is equal \"([^\"]*)\"$")
	public void iConfirmThatDepositNowValueIsEqual(String arg1) throws Throwable {
		throw new PendingException();
	}

	@And("^I confirm that DueDate value is equal \"([^\"]*)\"$")
	public void iConfirmThatDueDateValueIsEqual(String arg1) throws Throwable {
		throw new PendingException();
	}

	@And("^open a new tab with informations$")
	public void openANewTabWithInformations() throws Throwable {
		testLoginPage.goToNewTabInformations();
	}

}
