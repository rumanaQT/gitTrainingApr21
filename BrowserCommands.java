package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

import javax.swing.text.Position;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BrowserCommands
{
	WebDriver driver;
	
 // @Test
  public void browsers() 
  {
	  
	  driver.get("https://www.google.co.uk/");
	  driver.manage().window().fullscreen();
	  System.out.println(driver.getTitle());
	  
	  System.out.println(driver.manage().window().getSize());
	  
	  Dimension dimension = new Dimension(950, 500);
	  driver.manage().window().setSize(dimension);
	  
	  System.out.println(driver.manage().window().getSize());
	  
	  System.out.println(driver.manage().window().getPosition());
	  
	 // Position TP = new Position(3,3);
	  
	 driver.manage().window().setPosition(new Point (4,4));
	 
	 System.out.println(driver.manage().window().getPosition());
	 
	 
	 
	  
  }
  
  @Test
  public void cookies() throws InterruptedException
  {
	  
	  driver.navigate().to("https://www.ikea.com/");
	   
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[text()='Fine by me, I accept']")).click();
	  
	  Set<Cookie> GC = driver.manage().getCookies();
	  
	  System.out.println(GC);
	  
	  Thread.sleep(5000);
	  driver.manage().deleteAllCookies();
	  
	  Thread.sleep(2000);
	  
	  System.out.println(driver.manage().getCookies());
	  
	  
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
	  
	 // driver.quit();
  }

}
