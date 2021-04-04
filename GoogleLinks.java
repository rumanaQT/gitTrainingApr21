package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GoogleLinks 
{
	WebDriver driver;
	
  @Test
  public void googleLinks()
  {
	  driver.get("https://www.google.com");
	  
	 List<WebElement> allGoogleLinks = driver.findElements(By.xpath("//a"));
	 
	 System.out.println("Total number of links : " + allGoogleLinks.size());// total number of links
	 
	 for(int i = 0; i < allGoogleLinks.size(); i++)
	 {
		 
		 String visibleTextOfElement = allGoogleLinks.get(i).getText(); // to get the visible text.
		 String getUrlWhereLinksIsPointing = allGoogleLinks.get(i).getAttribute("href");
		 System.out.println(visibleTextOfElement + " - " + getUrlWhereLinksIsPointing);
		 
		 
		 
	 }
	  
	  
	  
	  
	  
	  
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
	  driver.close();
  }

}
