package Swami_Project;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_PrintAllLinks {
	public WebDriver driver;

	@Test
  public void printlinks() {
	  
	  List<WebElement> str = driver.findElements(By.tagName("a"));
	  System.out.println(str.size());
	  for (int i = 0; i < str.size(); i++) {
		  if(str.get(i).getText().equalsIgnoreCase("")) {
		  System.out.println("Maintain gap"); 
		  
		
	}
	  
		  System.out.println(str.get(i).getText());
	  }
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
