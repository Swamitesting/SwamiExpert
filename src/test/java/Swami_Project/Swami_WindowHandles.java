package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_WindowHandles {
	public WebDriver driver;
	
  @Test
  public void Windowshandles() throws Exception {
	  driver.findElement(By.linkText("Open New Seperate Windows")).click();
	  driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
	     String ParentWindowHandle = driver.getWindowHandle();
	  for(String childwindowhandles : driver.getWindowHandles()) {
		  driver.switchTo().window(childwindowhandles);
	  }
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Blog")).click();
	  Thread.sleep(3000); 
	  driver.close();
	  
	  driver.switchTo().window(ParentWindowHandle);
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Home")).click();
	  
  }
  
  @BeforeTest
  public void Openurl() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
