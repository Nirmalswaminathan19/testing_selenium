package testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Day7_t3 {
	
	WebDriver driver=new EdgeDriver();
  @BeforeMethod
  public void openURL() {
	  
	  WebDriverManager.edgedriver().setup();
	  driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	 
  }
  
  @Test  
  public void login() throws InterruptedException
  {
	  Thread.sleep(3000);	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Thread.sleep(3000);
  }
  
  @AfterMethod
  public void close()
  {
	  driver.quit();
  }
}
