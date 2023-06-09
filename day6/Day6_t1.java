package testing3;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_t1  {
	

	public static void main( String[] args ) throws InterruptedException
	  {
	  	WebDriverManager.edgedriver().setup();
	      WebDriver driver=new EdgeDriver();
	      driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sab");
	      driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("jjj");
	      Thread.sleep(3000);
	  	JavascriptExecutor js = (JavascriptExecutor)driver;
	  	js.executeScript("window.scrollBy(0,2000)", "");
	      driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Sab@gmail.com");
	      driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("thecomrade4433");
	      driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
	      driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	  }
}
