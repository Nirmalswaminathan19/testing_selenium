package testing3;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Day7_t2 {

	int num1=20;
	int num2=10;

	@Test(priority = 1)
	public void add() {
	  
	  
	  int sum=num1+num2;
	  Assert.assertEquals(sum, 30);
	  }
	
	 @Test(priority = 2)
	 public void sub() {
		  
		  int diff=num1-num2;
		  Assert.assertEquals(diff, 10);
		  }
	 
	 @Test(priority = 3)
	 public void mul() {
		  
		  int pro=num1*num2;
		  Assert.assertEquals(pro, 200);
		  }
	 
	 @Test(priority = 4)
	 public void div() {
		
		  
		  int divv=num1/num2;
		  Assert.assertEquals(divv, 2);
		  }
	
	
}
