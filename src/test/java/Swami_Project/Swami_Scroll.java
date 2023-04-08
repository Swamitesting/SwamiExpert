package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_Scroll {
	public WebDriver driver;
	
	
  @Test
  public void scroll() {
	 
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  
	  WebElement ele1 = driver.findElement(By.linkText("Who We Are"));
	  js.executeAsyncScript("arguments[0].scrollIntoView()", ele1);
	  
  }
  
 
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
