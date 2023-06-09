package testing3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_t4 {


		public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");;
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
		username.sendKeys("Admin");
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
	    WebElement button;
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
	    button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
	    button.click();
		}

	}

