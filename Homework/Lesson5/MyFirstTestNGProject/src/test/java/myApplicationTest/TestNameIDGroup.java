package myApplicationTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNameIDGroup {
	@Test (groups = { "Name" })
	@DataProvider(parallel = true) 
	  public void EmployeeTest_A() {
			MainEmployee test = new MainEmployee();
			String result = test.name("Will ","Smitt");
			Assert.assertEquals("Will Smitt", result);
	}
	@Test (groups = { "Name" })
	public void EmployeeTest_B() {
		MainEmployee test = new MainEmployee();
		String result = test.Designation("");
		Assert.assertNotNull("", result);
	}
	@Test (groups = { "Name","ID" })
	public void EmployeeTest_C() {
		MainEmployee test = new MainEmployee();
		int result = test.ID(1001);
		Assert.assertEquals(1001, result);		
	}
	@Test (groups = { "Name","ID" })
	public void EmployeeTest_D() {
		MainEmployee test = new MainEmployee();
		int result = test.ID(1001);
		Assert.assertSame(100001, result);	
	}
}