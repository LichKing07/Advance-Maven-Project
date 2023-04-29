package automation_March25_2029;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Advanced_Css {

public WebDriver driver;
	
	@BeforeMethod
	public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
	}
	@Test
	public void test() {
		
		driver.findElement(By.cssSelector("a.signin')]")).click();
				
	}
	
	
	
	
}
