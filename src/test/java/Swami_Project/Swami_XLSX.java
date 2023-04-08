package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Swami_XLSX {
	public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	  File f1 = new File("C:\\Excel Sheets\\Marks Card.xlsx");
	  
	  FileInputStream box = new FileInputStream(f1);
	  
	  XSSFWorkbook wb1 = new XSSFWorkbook(box);
	  
	  XSSFSheet s1 = wb1.getSheet("Swami");
	  
	  String username = s1.getRow(1).getCell(1).getStringCellValue();
	  
	  driver.findElement(By.id("login_field")).sendKeys(username);
	  Thread.sleep(3000);
	  String password = s1.getRow(2).getCell(1).getStringCellValue();
	  driver.findElement(By.id("password")).sendKeys(password);
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
