package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_AjaxControl {
	public WebDriver driver;
	
  @Test
  public void ajax() throws Exception {
	  
	  driver.findElement(By.name("q")).sendKeys("Shirts");
	  Thread.sleep(3000);
	  String str = driver.findElement(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']")).getText();
	  String t[] = str.split("\n");
	  for (int i = 0; i < t.length; i++) {
		  
		  if (t[i].equalsIgnoreCase("Shirts for women")) {
			
			  driver.findElement(By.name("q")).clear();
			  Thread.sleep(3000);
			  driver.findElement(By.name("q")).sendKeys(t[i]);
			  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}
		  
		
	}
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
