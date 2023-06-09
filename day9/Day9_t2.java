package testing3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9_t2 {

  @Test
  public void testcase1() {
	  
	  WebDriver driver = new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
	  
//		driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://godaddy.com/");
//	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  String title = driver.getTitle();
	  Assert.assertEquals(title, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
//	  driver.quit();
	  System.out.println("thread count is:" + Thread.currentThread().getId());
	  
  }
  @Test
  public void testcase2() throws InterruptedException {
	  
	  WebDriver driver = new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
//		driver.switchTo().newWindow(WindowType.TAB);

		driver.navigate().to("https://godaddy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Domain Name Search")).click();
//		driver.quit();
		System.out.println("thread count is:" + Thread.currentThread().getId());
	  
  }
  @Test
  public void testcase3() throws InterruptedException {
	  
	  WebDriver driver = new EdgeDriver();
	  WebDriverManager.edgedriver().setup();
//		driver.switchTo().newWindow(WindowType.TAB);

	  driver.navigate().to("https://godaddy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Domain Name Search")).click();
		String title = driver.getTitle();
		System.out.print(title);
		Assert.assertEquals(title, "GoDaddy Domain Search - Buy and Register Available Domain Names");
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]"));
		search.isDisplayed();
		WebElement buyit = driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button"));
		buyit.isDisplayed();
		search.sendKeys("mydomain");
		buyit.click();
		System.out.println("thread count is:" + Thread.currentThread().getId());
	  
  }
  
}
