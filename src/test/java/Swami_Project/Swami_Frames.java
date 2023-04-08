package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Swami_Frames {
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void f() throws Exception {
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	action = new Actions(driver);
	  action.dragAndDrop(drag, drop).build().perform();
	  Thread.sleep(3000);
	  driver.switchTo().parentFrame();
	  driver.findElement(By.xpath("//a[normalize-space()='Themes']")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
