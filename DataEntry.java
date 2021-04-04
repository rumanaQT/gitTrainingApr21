package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

@Test
public class DataEntry 
{
	WebDriver driver;
	

  public void dataRetrieve() throws InterruptedException
  {
	  driver.navigate().to("https://demoqa.com/automation-practice-form/");
	  
	  driver.manage().window().maximize();
	  
	 WebElement firstName =  driver.findElement(By.id("firstName"));
	 
	 firstName.sendKeys("Sami");
	 
	 WebElement lastName = driver.findElement(By.id("lastName"));
	 
	 lastName.sendKeys("David");
	 
	 driver.findElement(By.id("userEmail")).sendKeys("sam.david@yahoo.com");
	 
	 /*System.out.println(firstName.getAttribute("value"));
	 
	 System.out.println(lastName.getAttribute("value"));*/
	 
	 
	Thread.sleep(2000);
	  
//	WebElement male = driver.findElement(By.cssSelector("input#gender-radio-1")); 
	// male.sendKeys(true)

	WebElement maleradio = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	
	maleradio.click();
	
	Thread.sleep(3000);
	
	System.out.println(maleradio.isSelected());
	
	
	
	driver.findElement(By.id("userNumber")).sendKeys("123456");
	
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("//input[@value='24 Feb 2021']")).click();
	
	Actions action = new Actions(driver); 
	WebElement element = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));

	action.moveToElement(element).sendKeys("Maths");
	Thread.sleep(3000);
	
	//element.sendKeys("Maths");
	
	//driver.findElement(By.xpath("//div[@id='subjectsContainer']")).sendKeys("Maths");
	
		 
	 driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
	 
	 driver.findElement(By.id("currentAddress")).sendKeys("city lane, foot loose");
	 Thread.sleep(3000);
	 
	 
	 WebElement UP = driver.findElement(By.xpath("//*[@id='state']/div/div[1]/div[1]']"));
	 
	 Actions keydown = new Actions(driver);
	 keydown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
	 
	 UP.click();
	 
	 
	 Thread.sleep(3000);
	 
	 WebElement lucknow = driver.findElement(By.xpath("//div[contains(text(),'Lucknow')]"));
	 
	 System.out.println(lucknow.getText());
	 
	 
	 
	  
	  
	  
  }
  
  
  
  /*//@Test  
  public void pageRefresh()
  {
	  
	  driver.navigate().to("https://www.google.co.uk/");
	  
	  driver.manage().window().maximize();
	  
	  driver.navigate().refresh();
	  
	  driver.get(driver.getCurrentUrl());
	  
	  driver.navigate().to(driver.getCurrentUrl());
	  
	  //driver.executeScript("history.go(0)");
	  
	  driver.get("https://www.google.co.uk/");
	  
	  //driver.findElement(By.id("Contact-us")).sendKeys(Keys.F5); 
	  
	  
	  
  }*/
  
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	  {System.setProperty("webdriver.chrome.driver", "test//resources//chromedriver.exe");
		 driver = new ChromeDriver();}
	  }

  @AfterMethod
  public void afterMethod()
  {
	  
	  
  }

}
