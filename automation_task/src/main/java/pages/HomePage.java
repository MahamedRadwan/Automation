package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;

public class HomePage {
	public WebDriver driver;
	By addToCartBtnLocator = By.xpath("//button[text()='Add to cart']");
	By backToHomeLocator = By.xpath("//button[@id='back-to-products']"); // in details page
	By openCartBtnLocator = By.xpath("//a[@class='shopping_cart_link']");
	By removeFromCartLocator = By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void openItem(String index) {
		By itemLocator = By.xpath("//a[@id='item_" + index + "_title_link']");
		driver.findElement(itemLocator).click();
	}

	public void addTocart() {
		driver.findElement(addToCartBtnLocator).click();
	}

	public void openCart() {
		driver.findElement(openCartBtnLocator).click();
	}

	public void removeFromCart() throws InterruptedException {
//		int duration = 5000;
//
//		Thread.sleep(duration);

		driver.findElement(removeFromCartLocator).click();

	}

	public void navigatToHome() {
		driver.findElement(backToHomeLocator).click();
	}

}
