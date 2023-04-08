package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Infromation_Commands{

	public WebDriver driver;
	
//  @Test(priority=1)
//  public void gettext() {
//	String str1 = driver.findElement(By.linkText("More")).getText();
//	  System.out.println(str1);
//	  
	  
//  }
//
  @Test(priority=1)
  public void attr() {
	String str2= driver.findElement(By.xpath("//img[@alt='Flipkart']")).getAttribute("title");
	  System.out.println(str2);
	  
	  
  }
  
  
  @BeforeTest
  public void openurl() {
	  
	 WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
