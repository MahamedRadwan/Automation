package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage  {
public WebDriver driver;
	By userNameLocator = By.xpath("//input[@id='user-name']");
	By passwrodLocator = By.xpath("//input[@id='password']");
	By loginButtonLocator = By.xpath("//input[@id='login-button']");

	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}

	public void login(String userName, String password) throws InterruptedException {
		int duration = 5000;

		driver.findElement(userNameLocator).sendKeys(userName);
		driver.findElement(passwrodLocator).sendKeys(password);
		Thread.sleep(duration);

		driver.findElement(loginButtonLocator).click();
	}

}
