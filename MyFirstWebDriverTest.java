package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebDriverTest {

	public static void main(String[] args)
	
	
	
	{
		System.setProperty("webdriver.chrome.driver", "test//resources//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium-examples.nichethyself.com/");
		 
		 driver.findElement(By.id("loginname")).sendKeys("stc123");
		 driver.findElement(By.id("loginpassword")).sendKeys("12345");
		 driver.findElement(By.id("loginbutton")).click();
		 
		 String expectedPageTitle = ("My account");
		 String actualPageTitle = driver.getTitle();
		 if (expectedPageTitle.equals(actualPageTitle))
			 System.out.println("Testcase Passed");
		 else
			 System.out.println("Testcase failed");
		 
		 WebElement CS = driver.findElement(By.xpath("//button[@class = 'link']"));
				 
		 
		 
		 
		 
		

	}

}
