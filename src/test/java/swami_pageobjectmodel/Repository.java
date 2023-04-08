package swami_pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repository {
	public static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
	}
	public static void login1() throws Exception {
		 	driver.findElement(Locators.username).sendKeys(Testdata.username);
		 	driver.findElement(Locators.password).sendKeys(Testdata.password);
		 	Thread.sleep(3000);
		 	driver.findElement(Locators.login).click();
		 	Thread.sleep(3000);
		
	}
	public static void addtocart() throws Exception {
		
		driver.findElement(Locators.redtshirt).click();
		Thread.sleep(3000);
		driver.findElement(Locators.cart).click();
		Thread.sleep(3000);
		driver.findElement(Locators.checkout).click();
		Thread.sleep(3000);
		driver.findElement(Locators.firstname).sendKeys(Testdata.firstname);
		driver.findElement(Locators.lastname).sendKeys(Testdata.lastname);
		driver.findElement(Locators.zipcode).sendKeys(Testdata.zipcode);
		Thread.sleep(3000);
		driver.findElement(Locators.cont).click();
		Thread.sleep(3000);
		driver.findElement(Locators.finish).click();
		Thread.sleep(3000);
		driver.findElement(Locators.backtohome).click();
	}
	
	public static void products() {
		String productsname = driver.findElement(Locators.productsname).getText();
		System.out.println(productsname);
		
	}
	
	

}
