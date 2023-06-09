package testing3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7_t1 {
  @Test
  public void f() {
	  
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver =new EdgeDriver();
	  
	  driver.manage().window().maximize();
	  
	  //task1
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, "Guest Registration Form – User Registration");
	  
  }
}
