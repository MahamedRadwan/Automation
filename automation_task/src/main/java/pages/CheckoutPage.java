package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;

	By checkOutBtnLocator = By.xpath("//button[@id='checkout']");

	By firstNameLocator = By.xpath("//input[@id='first-name']");
	By lastNameLocator = By.xpath("//input[@id='last-name']");
	By postalCodeLocator = By.xpath("//input[@id='postal-code']");
	By contButtonLocator = By.xpath("//input[@id='continue']");
	
	By finishButtonLocator = By.xpath("//button[@id='finish']");
	
	By backtohomeButtonLocator = By.xpath("//button[@id='back-to-products']");


	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void proceedToCheckout() {
		driver.findElement(checkOutBtnLocator).click();
	}
	
	public void submitCheckoutData(String firstName , String lastName , String postalCode) throws InterruptedException {
		int duration = 5000;

		driver.findElement(firstNameLocator).sendKeys(firstName);
		driver.findElement(lastNameLocator).sendKeys(lastName);
		driver.findElement(postalCodeLocator).sendKeys(postalCode);
		Thread.sleep(duration);
		driver.findElement(contButtonLocator).click();
	}
	
	
	public void checkout() {
		driver.findElement(finishButtonLocator).click();
	}
	
	
	public void navigateToHome() {
		driver.findElement(backtohomeButtonLocator).click();
	}
	

}
