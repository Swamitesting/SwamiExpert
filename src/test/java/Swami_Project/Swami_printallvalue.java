package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Swami_printallvalue {
	
	public WebDriver driver;
	
  @Test
  public void allvalues() {
	  
	 
	List<WebElement> Values = new Select(driver.findElement(By.id("today_Day_ID"))).getOptions();
	  System.out.println(Values.get(7).getText());
	 for (int i = 0; i < Values.size(); i++) {
		 System.out.println(Values.get(i).getText());
		 if (Values.get(i).getText().contains("17")) {
			System.out.println(Values.get(i).getText());
			System.out.println("Passed");
		}
	}
	}
	  
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.calculator.net/age-calculator.html");
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
