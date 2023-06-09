package testing3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8_t3 {
	public static void main(String args[])
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		 WebElement val = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		 val.sendKeys("401");
		 WebElement sub = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		 sub.click();
		 
		 Alert a=driver.switchTo().alert();
		 a.dismiss();
		 
		 val.clear();
		 val.sendKeys("402");
		 sub.click();
		 
		 a.accept();
		 
		 Alert b=driver.switchTo().alert();
		 String text = b.getText();
		 b.accept();
		 System.out.print(text);
		 driver.quit();
	
	}

}
