package testing3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorData {
	
	CalculatorLogic cl =new CalculatorLogic();
	
  @Test(dataProvider = "testData")
  public void addMethod(int a,int b,int expected) {
	  
	  int result =cl.add(a,b);
	  Assert.assertEquals(expected, result);
	  
  }
  
  @DataProvider
  public Object [][] testData()
  {
	  return new Object [][]
			  {
		  {1,2,3}
		  
			  };
  }
  @Test(dataProvider = "testData1")
  public void subMethod(int a,int b,int expected) {
	  
	  int result =cl.sub(a,b);
	  Assert.assertEquals(expected, result);
	  
  }
  
  @DataProvider
  public Object [][] testData1()
  {
	  return new Object [][]
			  {
		  {2,1,1}
		  
			  };
  }
  @Test(dataProvider = "testData2")
  public void mulMethod(int a,int b,int expected) {
	  
	  int result =cl.mul(a,b);
	  Assert.assertEquals(expected, result);
	  
  }
  
  @DataProvider
  public Object [][] testData2()
  {
	  return new Object [][]
			  {
		  {1,2,2}
		  
			  };
  }
  @Test(dataProvider = "testData3")
  public void divMethod(int a,int b,int expected) {
	  
	  int result =cl.div(a,b);
	  Assert.assertEquals(expected, result);
	  
  }
  
  @DataProvider
  public Object [][] testData3()
  {
	  return new Object [][]
			  {
		  {2,1,2}
		  
			  };
  }
  
}
