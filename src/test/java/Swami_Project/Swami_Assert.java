
package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Swami_Assert {
	public WebDriver driver;

	@Test
	public void asrt() {
		String Actualtitle = "Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
		String Expectedtitle = driver.getTitle();

		System.out.println("paytm.in");
		Assert.assertEquals(Actualtitle, Expectedtitle);

		System.out.println("Swami_ture");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://paytm.com/");

	}

	@AfterTest
	public void afterTest() {


	}

}
