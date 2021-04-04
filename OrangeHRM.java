package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class OrangeHRM 
{
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "test//resources//chromedriver.exe");

    WebDriver driver = new ChromeDriver();

   
    driver.get("https://opensource-demo.orangehrmlive.com/");

  driver.findElement(By.id("txtUsername")).sendKeys("Admin");

driver.findElement(By.id("txtPassword")).sendKeys("admin123");

    driver.findElement(By.id("btnLogin")).click(); 

    System.out.println(driver.getTitle());

    String expectedResult = ("OrangeHRM");

    String actualResult = driver.getTitle();

   

    boolean b = expectedResult.equals(actualResult);

    System.out.println(b);
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
