package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CSSQt
{
	WebDriver driver;
  @Test
  public void f() 
  {
	  driver.get("https://qualitestgroup.com/");

      

      driver.manage().window().maximize();

     

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.findElement(By.cssSelector("li[id='mega-menu-item-4374']")).click();

     

      System.out.println(driver.getTitle());

      driver.navigate().back();

     

      System.out.println(driver.getTitle());
      
      String actualResult = driver.getTitle();
      String expectedResult = ("Independent Software Testing Company | Quality Assurance Services | Qualitest");
      
      assertEquals(actualResult, expectedResult);
	  
	  
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
	  driver.quit();
  }

}
