package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Swami_Homework {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void Master() {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  driver.findElement(By.id("firstName")).sendKeys("Swami");
	  driver.findElement(By.id("lastName")).sendKeys("ok");
	  driver.findElement(By.id("userEmail")).sendKeys("Swami@test.com");
	  driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	  driver.findElement(By.id("userNumber")).sendKeys("52156438");
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).sendKeys("September");
	  driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1993");
	  driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, September 29th, 1993']")).click();
	  driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	 WebElement ele1 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
	 ele1.click();
	 js.executeScript("aruguments[0].scrollIntoView()", ele1);
	  WebElement ele11 = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	  ele11.sendKeys("C:\\MARREAGE VIDEO (DMM)\\Swami Classes\\Swami_ScreenShots\\1.png");
	  driver.findElement(By.id("currentAddress")).sendKeys("India");
	  driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
	  driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
	  driver.findElement(By.id("react-select-4-input")).sendKeys("delhi");
	  driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
	  WebElement ele = driver.findElement(By.xpath("//button[@id='submit']"));
	  
	  js.executeScript("aruguments[0].scrollIntoView();", ele);
	  ele.click();

  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
	   action = new Actions(driver);
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
