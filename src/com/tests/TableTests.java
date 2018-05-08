package com.tests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableTests {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
//		System.setProperty("webdriver.gecko.driver", TestConstants.FIREFOX_PATH);
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", TestConstants.MAC_CHROME_PATH);
		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get(TestConstants.WEB_ORDERS_URL);
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test"+Keys.ENTER);
		
		

}
	
	@Test
	public void test() {
		driver.findElement(By.linkText("View all products")).click();
		
		//Print the whole table
		WebElement table = driver.findElement(By.xpath("//table[@class='ProductsTable']"));
		System.out.println(table.getText());
		
		//Print the names of the columns
		List<WebElement> columnNames = driver.findElements(By.xpath("//table[@class='ProductsTable']//th"));
		for (WebElement columnName : columnNames) {
			System.out.println(columnName.getText());
			
		}
			
	
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
	
	
}