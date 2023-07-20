package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_base {
	public static WebDriver chromeDriver = null;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://www.saucedemo.com/");
		
	}
	
//	chromeDriver.get(/)
	public static void closeBrowser() {
		chromeDriver.quit();
//		chromeDriver.manage().timeouts().implicitlyWait(10sec)
	}
}
