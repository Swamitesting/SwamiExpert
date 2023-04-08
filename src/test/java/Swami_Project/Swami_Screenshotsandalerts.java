package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Swami_Screenshotsandalerts {
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void f() throws Exception {
//	  driver.findElement(By.linkText("Login")).click();
//	  driver.findElement(By.id("usernameField")).sendKeys("shashireddy985@gmail.com");
//	  driver.findElement(By.id("passwordField")).sendKeys("Chandu@22");
//	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	  driver.findElement(By.linkText("Newsroom")).click();
	  String parentwindow = driver.getWindowHandle();
	  for(String childwindow : driver.getWindowHandles()) {
		  driver.switchTo().window(childwindow);
	  }
	  
	  WebElement news = driver.findElement(By.linkText("Newsroom"));
	  action.moveToElement(news).build().perform();
	  Thread.sleep(3000);
	  driver.switchTo().window(parentwindow);
	  String FF = "10";
	  File Screen1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(Screen1, new File("C:\\MARREAGE VIDEO (DMM)\\Swami Classes\\Swami_ScreenShots\\"+FF+".png"));
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  action = new Actions(driver);
	  driver.get("https://www.thehartford.com/aarp/car-insurance/classic-car");
	  driver.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
