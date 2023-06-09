package testing3;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6_t2 {
	public static void main( String[] args ) throws InterruptedException
	  {
	  	WebDriverManager.edgedriver().setup();
	  	WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form");
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("neww");
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("ssss");
	driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("newwwwww@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Male\"]")).click();
WebElement wpass=	driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
wpass.sendKeys("Mjk@4h11uukhjjjfnejfkdfjk4iuu");
Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)", "");
	WebElement dob=driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]"));
	dob.click();
	driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")).clear();
	driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input")).sendKeys("2003");
	driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select")).sendKeys("August");
	WebElement date= driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[19]"));
	date.click();
	driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("India");
	WebElement country=driver.findElement(By.xpath("//*[@id=\"country_1665629257\"]"));
	country.click();
  Select select= new Select(country);
  select.selectByVisibleText("India");
  
  
	WebElement phone=driver.findElement(By.xpath("//input[@id=\"phone_1665627880\"]"));
	phone.click();
	phone.sendKeys("9903569956");
	driver.findElement(By.xpath("//input[@id=\"phone_1665627865\"]")).sendKeys("8677665989");
	js.executeScript("window.scrollBy(0,100)", "");
	
	WebElement doa=driver.findElement(By.xpath("//*[@id=\"date_box_1665629845_field\"]/span/input[1]"));
	doa.click();
	driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/input")).clear();
	driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/input")).sendKeys("2021");
	WebElement month=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/select"));
	month.click();
	Select sel=new Select(month);
	sel.selectByVisibleText("July");
	WebElement date1= driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/span[19]"));
	date1.click();
	
	driver.findElement(By.xpath("//*[@id=\"number_box_1665629930\"]")).sendKeys("5");
	driver.findElement(By.xpath("//*[@id=\"input_box_1665630010\"]")).sendKeys("5");
	driver.findElement(By.xpath("//*[@id=\"radio_1665627931_Yes\"]")).click();
	js.executeScript("window.scrollBy(0,100)", "");
	driver.findElement(By.xpath("//*[@id=\"radio_1665627997_Single Room\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"radio_1665628131_None\"]")).click();
	js.executeScript("window.scrollBy(0,100)", "");
	driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	Thread.sleep(5000);
	WebElement msg=driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]"));
	String success=msg.getText();
	System.out.println(success);
	
//	driver.quit();
	  }
}
