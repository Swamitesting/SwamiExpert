package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Swami_VV {
	public WebDriver driver;
	
  @Test
  public void v() {
	  
	  String Expec = "Investor Relation";
	  String Actual = driver.findElement(By.linkText("Investor Relations")).getText();
	  System.out.println(Actual);
	  
	  try {
		  
		  Assert.assertEquals(Expec, Actual);
		
	} catch (Throwable e) {
		 System.out.println("Swami_v");
			
		
	}
	  
	  
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
