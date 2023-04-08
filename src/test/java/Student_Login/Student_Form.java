package Student_Login;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Student_Form {
	
	public WebDriver driver;
	
  @Test
  public void login() {
	

	  
  }
  
  
  
  @BeforeTest
  public void OpenUrl() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
