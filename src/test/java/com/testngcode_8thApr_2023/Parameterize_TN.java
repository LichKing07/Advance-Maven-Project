package com.testngcode_8thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parameterize_TN {
	
	public WebDriver driver;
	
	@Test
	 public void TutorialsNinja(String Browser, String url, String username, String password) {
		if(Browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}
	
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	driver.findElement(By.id("login")).sendKeys("seleiumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	
	}
@AfterMethod
public void tearDown() {
	driver.quit();

}
	

}
