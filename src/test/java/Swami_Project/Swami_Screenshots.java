package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Swami_Screenshots {
	public WebDriver driver;
	public Actions action;
  @Test
  public void shts2() throws Exception {
	  action = new Actions(driver);
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  WebElement  Element1 = driver.findElement(By.xpath("//img[@alt='Fashion']"));
	  action.moveToElement(Element1).build().perform();
	  Thread.sleep(3000);
	  String ATM = "3";
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrFile, new File("C:\\MARREAGE VIDEO (DMM)\\Swami Classes\\Swami_ScreenShots\\"+ATM+".png"));
	  driver.findElement(By.linkText("Women Ethnic")).click();
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void screenshots() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  
	  String ATM = "1";
	  
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(scrFile, new File("C:\\MARREAGE VIDEO (DMM)\\Swami Classes\\Swami_ScreenShots\\"+ATM+".png"));
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
