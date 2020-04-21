package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	WebDriver driver;

	public static void main(String[] args) {
		Day1 myday1 = new Day1();
		myday1.invokeBrowser();
	}

	public void invokeBrowser() {

		try {
			Class<? extends WebDriver> driver = ChromeDriver.class;
			WebDriverManager.getInstance(driver).setup();
			WebDriver driver1 = driver.newInstance();
			driver1.manage().deleteAllCookies();
			driver1.manage().window().maximize();
			driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver1.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			/**
			 * ref: https://github.com/bonigarcia/webdrivermanager
			 * Can be used like this
			 * DriverManagerType chrome = DriverManagerType.CHROME;
			 *  WebDriverManager.getInstance(chrome).setup();
			 *  Class<?> chromeClass =  Class.forName(chrome.browserClass());
			 *  driver = (WebDriver) chromeClass.newInstance();
			 */

			driver1.get("http://wwww.edureka.co");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
