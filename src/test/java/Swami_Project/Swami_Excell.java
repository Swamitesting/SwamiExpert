package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_Excell {
	public WebDriver driver;
	
  @Test
  public void excel() throws Exception {
	  FileInputStream File = new FileInputStream("C:\\Excel Sheets\\Marks Card.xlsx");
	  Workbook WB = Workbook.getWorkbook(File);
	  Sheet s = WB.getSheet("Swami");
	  driver.findElement(By.id("login_field")).sendKeys(s.getCell(1, 4).getContents());
	  driver.findElement(By.id("password")).sendKeys(s.getCell(2, 4).getContents());
	  
	  driver.findElement(By.name("commit")).click();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://github.com/login");
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
