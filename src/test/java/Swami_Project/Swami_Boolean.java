package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_Boolean {
	
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.linkText("WOMEN")).click();
	  Thread.sleep(3000);
	 Boolean Pricondition = driver.findElement(By.linkText("WOMEN")).isDisplayed();
	 System.out.println(Pricondition);
	WebElement ele1 = driver.findElement(By.linkText("Visit AJIOLUXE"));
	 
	 if (ele1.isEnabled()) {
		System.out.println("ture");
	} else {
System.out.println("KK will check");
	}
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.ajio.com/");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
