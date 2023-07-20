package test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.test_base;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class AddToCartTest extends test_base {

	HomePage homePageObject;
	LoginPage loginPageObject;
	CheckoutPage checkoutpageObject;

	@BeforeMethod
	public void intialStart() {
		openBrowser();
		homePageObject = new HomePage(chromeDriver);
		loginPageObject = new LoginPage(chromeDriver);
		checkoutpageObject = new CheckoutPage(chromeDriver);

	}

	@Test
	public void addToCart() throws InterruptedException {
		loginPageObject.login("standard_user", "secret_sauce");
		homePageObject.openItem("1");
	}

	@Test
	public void fullPassscenario() throws InterruptedException {
		String userName = "standard_user";
		String password = "secret_sauce";

		String firstName = "Mohamed";
		String lastName = "Gamal";
		String postalcode = "12345";
		int duration = 5000;

		loginPageObject.login(userName, password);
		Thread.sleep(duration);
		homePageObject.openItem("1");
		Thread.sleep(duration);
		homePageObject.addTocart();
		Thread.sleep(duration);
		homePageObject.openCart();
		Thread.sleep(duration);

		checkoutpageObject.proceedToCheckout();
		Thread.sleep(duration);

		checkoutpageObject.submitCheckoutData(firstName, lastName, postalcode);
		Thread.sleep(duration);

		checkoutpageObject.checkout();
		Thread.sleep(duration);

		checkoutpageObject.navigateToHome();

	}
	@Test
	public void fullfailcenario() throws InterruptedException {
		String userName = "standard_user";
		String password = "secret_sauce";
		int duration = 5000;
		loginPageObject.login(userName, password);
		Thread.sleep(duration);
		homePageObject.openItem("5");
		Thread.sleep(duration);
		homePageObject.addTocart();
		Thread.sleep(duration);
		homePageObject.openCart();
		Thread.sleep(duration);
		homePageObject.removeFromCart();

	}

	@AfterMethod
	public void finishTest() {
		closeBrowser();
	}

}
