package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Swami_Generic_Parameterzation {
	
	public WebDriver driver;
	public Actions action;
	
	public void generic(String str) throws Exception {
		
		WebElement ele1 = driver.findElement(By.xpath(str));
		action.moveToElement(ele1).build().perform();
		Thread.sleep(3000);
		
		
	}
	
	
  @Test
  public void parametereization() throws Exception {
	  for (int i = 1; i < 6; i++) {
		generic("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li["+i+"]/a");
	}
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  action = new Actions(driver);
	  driver.get("https://www.ajio.com/");
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
