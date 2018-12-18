package ecore;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;



public class TestLoginPage  {
	ChromeDriver driverLocal;
	
	public TestLoginPage(ChromeDriver global) {
		 driverLocal = global;
		
	}

	public void accessSandboxPage() {
		
		driverLocal.get("https://automation-sandbox.herokuapp.com/");
		
	}

	

	public void verifyLoginSandBox() {
		
		String pathElement = "//*[contains(text(), 'Invoice List')]";
				driverLocal.findElements(By.xpath(pathElement));
	}

	public boolean verifyLoadPage() {
		String pathElement = "//*[contains(text(), 'Invoice List')]";
		return !driverLocal.findElements(By.xpath(pathElement)).isEmpty();
	}

	public void insertPassword(String receivedPassword) {
		 WebElement passwordField =  driverLocal.findElement(By.name("password"));
		
		passwordField.sendKeys(receivedPassword);		
	}
	
	public void insertUsername(String receivedUsername) {
		WebElement usernameField =  driverLocal.findElement(By.name("username"));
		
		usernameField.sendKeys(receivedUsername);
	}

	public void clickLoginPage()  {
		
		WebElement btnLogin =  driverLocal.findElement(By.id("btnLogin"));
		
		btnLogin.submit();
		

		
	}

	public void clickInvoiceDetailsLink()  {

		WebElement linkInvoice =  driverLocal.findElement(By.xpath("//a[contains(@href,'/invoice/0')]"));
		linkInvoice.click();
		
		
	}

	public void goToNewTabInformations() {
		String parentHandle = driverLocal.getWindowHandle(); 
	    System.out.println("browser 1: "+driverLocal.getCurrentUrl());           
	    for (String winHandle : driverLocal.getWindowHandles()) { 
	        System.out.println("browser 2" +  driverLocal.getCurrentUrl());
	        driverLocal.switchTo().window(winHandle);                 
	    }
	 
		
	}

	public boolean verifyHotelName(String hotelName) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/h4")).getText();
        if (textElement.equalsIgnoreCase(hotelName)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyInvoiceDate(String invoiceDate) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/ul/li[1]/text()")).getText();
        if (textElement.equalsIgnoreCase(invoiceDate)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyInvoiceNumber(String invoiceNumber) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/h6")).getText();
        if (textElement.contains(invoiceNumber)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyRoomValue(String roomValue) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[1]/tbody/tr[2]/td[2]")).getText();
        if (textElement.equalsIgnoreCase(roomValue)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyTaxVat(String taxVat) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[2]/tbody/tr/td[2]")).getText();
        if (textElement.equalsIgnoreCase(taxVat)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyTotalAmountValue(String amountValue) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[2]/tbody/tr/td[3]")).getText();
        if (textElement.equalsIgnoreCase(amountValue)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyStayTotalAmount(String totalAmount) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[1]/tbody/tr[4]/td[2]")).getText();
        if (textElement.equalsIgnoreCase(totalAmount)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyTotalStayCount(String totalCount) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[1]/tbody/tr[3]/td[2]")).getText();
        if (textElement.equalsIgnoreCase(totalCount)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyDueDate(String dueDate) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/ul/li[2]/text()")).getText();
        if (textElement.equalsIgnoreCase(dueDate)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyDeposite(String depositeNow) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[2]/tbody/tr/td[1]")).getText();
        if (textElement.equalsIgnoreCase(depositeNow)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyCustomerDetails(String customerDetails) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/div")).getText();
        if (textElement.equalsIgnoreCase(customerDetails)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyCheckOut(String checkOut) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[1]/tbody/tr[6]/td[2]")).getText();
        if (textElement.equalsIgnoreCase(checkOut)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyCheckIn(String checkIn) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[1]/tbody/tr[7]/td[2]")).getText();
        if (textElement.equalsIgnoreCase(checkIn)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyBookingCode(String bookingCode) {
		String textElement = driverLocal.findElement(By.xpath("/html/body/section/div/table[1]/tbody/tr[1]/td[2]")).getText();
        if (textElement.equalsIgnoreCase(bookingCode)) {
			return true;
		} else {
			return false;
		}
	}
}




