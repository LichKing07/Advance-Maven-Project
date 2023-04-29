package com.automationcode_5thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class_19Mar {

public WebDriver driver ;

@Test
public void testOne() throws InterruptedException {
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
	driver.findElement(By.xpath("//a[@title ='My Account']")).click();
	Thread.sleep(1000);
//	driver.findElement(By.xpath("//a[text()='Login']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	Thread.sleep(1000);
	driver.quit();
}
	
	
	@Test
	public void testOne1() throws InterruptedException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@title ='My Account']")).click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(1000);
		driver.quit();
	
}

}
