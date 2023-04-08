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
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Swami_Screenshots1 {
	
	public WebDriver driver;
	
  @Test
  public void sts1() throws Exception {
//	  driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	 WebElement scr1 = new Select(driver.findElement(By.id("oldSelectMenu"))).getFirstSelectedOption();
	 String ATM = "7";
	 File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(screen,new File("C:\\MARREAGE VIDEO (DMM)\\Swami Classes\\Swami_ScreenShots\\"+ATM+".png"));
			 System.out.println(scr1.getText());
	 if (scr1.getText().equalsIgnoreCase("red")) {
		 System.out.println("True");
		
	} else {
		System.out.println("Swami");
	}
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/select-menu");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
