package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Swami_MouseOverActions {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void move() throws Exception {
	  
	  action = new Actions(driver);
	  
	 WebElement element1 =  driver.findElement(By.linkText("Widgets"));
	  
	  action.moveToElement(element1).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("AutoComplete")).click();
	 
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
