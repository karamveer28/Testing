package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	WebDriver driver;

	public static void main(String[] args) {
		
	}
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", ".m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://wwww.edureka.co");
		
	}
}
