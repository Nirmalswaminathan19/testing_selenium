package testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_t5 {

	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		  
		  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  driver.get(url);
		  driver.manage().window().maximize();
		  
		  JavascriptExecutor j = (JavascriptExecutor) driver;
	      j.executeScript("return document.readyState")
	      .toString().equals("complete");
	      
	      String s = driver.getCurrentUrl();
	      
	      if (s.equals(url)) {
	         System.out.println("Page Loaded");
	         System.out.println("Current Url: " + s);
	      }
	      else {
	         System.out.println("Page did not load");
	      }
		
	      Thread.sleep(3000);	  
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  Thread.sleep(3000);
		  
		  WebElement logout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		  logout.click();
//		  Select sel = new Select(logout);
//		  sel.deselectByVisibleText("Logout");
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		  
		  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
}
