package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Swami_Getoptions {
	
	public WebDriver driver;
    public Actions action;
	
  @Test
  public void getoptions() throws Exception {
	  
	  action = new Actions(driver);
	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 WebElement ele = driver.findElement(By.xpath("//img[@alt='Home & Furniture']"));
	  action.moveToElement(ele).click();
	  Thread.sleep(3000);
	WebElement ele1 = new Select(driver.findElement(By.xpath("//img[@alt='Mobiles']"))).getFirstSelectedOption();
	  System.out.println(ele1.getText());
	  if (ele1.getText().equalsIgnoreCase("moblies")) {
		System.out.println("Testing is True");
	} else {
		System.out.println("Swami Testing");
	}
	  
	  
  }													
  @BeforeTest
  public void beforeTest() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
