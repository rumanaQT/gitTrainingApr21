package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MyFirstTestNGClass
{
	WebDriver driver;
	
  @Test
  public void myNicheThyself() 
  
 {
	  driver.get("http://selenium-examples.nichethyself.com/home.html");
	  driver.findElement(By.id("loginname")).sendKeys("stc123");
		 driver.findElement(By.id("loginpassword")).sendKeys("12345");
		 driver.findElement(By.id("loginbutton")).click();
		 
		 String expectedPageTitle = ("My account1");
		 String actualPageTitle = driver.getTitle();
		/* if (expectedPageTitle.equals(actualPageTitle))
			 System.out.println("Testcase Passed");
		 else
			 System.out.println("Testcase failed");
	  */
		 
		 assertEquals(actualPageTitle, expectedPageTitle);
  }
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "test//resources//chromedriver.exe");
	 driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod()
  {
	  //driver.close();;
  }
  
  
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("This is beforeClass method");
	  
	  
  }
  
  @AfterClass
  public void afterClass()
  {
	  System.out.println("This is afterClass method");
	  
  }

}
