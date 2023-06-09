package testing3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_t3 {
	public static void main( String[] args ) throws InterruptedException
	  {
	  	WebDriverManager.edgedriver().setup();
	      WebDriver driver=new EdgeDriver();
	      driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("newmail@gmail.com");
	      driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("newwpass");
	      WebElement computerAcc=driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Keyboard\"]"));
	      computerAcc.click();
	      driver.findElement(By.xpath("//*[@id=\"user-registration-form-310\"]/form/div[2]/button")).click();
	  }
}
