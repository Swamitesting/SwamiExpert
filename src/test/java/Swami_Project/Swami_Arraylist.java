package Swami_Project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Swami_Arraylist {
	public WebDriver driver;
	public Actions action;


	@Test
	public void search() throws Exception {

		driver.findElement(By.name("q")).sendKeys("mobiles");
		Thread.sleep(3000);
		String str = driver.findElement(By.xpath("//div[@class='erkvQe']//ul[@role='listbox']")).getText();
		Thread.sleep(3000);
		String t[] = str.split("\n");
		for (int i = 0; i < t.length; i++) {

			if (t[i].equalsIgnoreCase("mobiles under 7000")) {

				driver.findElement(By.name("q")).clear();
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys(t[i]);
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

				break;

			} else {
				driver.findElement(By.name("q")).clear();
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys(t[i]);
				Thread.sleep(3000);

			}

		}


	}


	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		action = new Actions(driver);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();


	}


	@AfterTest
	public void afterTest() {


	}

}
