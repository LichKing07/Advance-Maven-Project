package com.testingcode_9th_April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNLoginin {

	public class TNLogin {
		public WebDriver driver;
		
		@Test(dataProvider = "TN", dataProviderClass = DataProvider.class)
		 public void TNLoginFirefoxTest(String username, String password) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By .linkText("Login")).click();
			driver.findElement(By .linkText("input-email")).sendKeys(username);
			driver.findElement(By .linkText("input-password")).sendKeys(password);
			driver.findElement(By .cssSelector("input.btn.btn-primary")).click();
			driver.quit();
			
			
			
			
			
		}
		@Test(dataProvider = "TN", dataProviderClass = DataProvider.class)
		public void TNLoginEdgeTest(String username, String password) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By .linkText("Login")).click();
			driver.findElement(By .linkText("input-email")).sendKeys(username);
			driver.findElement(By .linkText("input-password")).sendKeys(password);
			driver.findElement(By .cssSelector("input.btn.btn-primary")).click();
			driver.quit();
	
}
	}
}
