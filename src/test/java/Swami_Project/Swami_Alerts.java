package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_Alerts {
	
	public WebDriver driver;
  @Test(priority=2)
  public void alerts() throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
	  Thread.sleep(3000);
	  
	  String str = driver.switchTo().alert().getText();
	  System.out.println(str);
	  
	  driver.switchTo().alert().accept();
  }
  @Test(priority=1)
  public void diloguealerts() throws Exception  {
	  
	  driver.findElement(By.id("confirmButton")).click();
	  Thread.sleep(3000);
	  
	  
	 String digalert = driver.switchTo().alert().getText();
	 System.out.println(digalert);
	 
	 driver.switchTo().alert().dismiss();
	
  }
  
  
  @BeforeTest
  public void openurl() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
