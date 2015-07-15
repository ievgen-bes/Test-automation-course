package myApplicationTest;

import org.testng.annotations.Test;
import myApplicationTest.MainEmployee;
import org.testng.annotations.BeforeTest;    
import org.testng.annotations.AfterTest;
import org.testng.Assert;


public class TestNameTest1 {

	@Test
	public void EmployeeTest() {
		MainEmployee test = new MainEmployee();
		String result = test.name("Will","Smitt");
		Assert.assertEquals("Will Smitt", result);
	}
	  @Test
	@BeforeTest
	    public void testStarted() {
	        System.out.println("TEST Started");
	    }

	    @Test
		@AfterTest
	    public void testFinished() {
	        System.out.println("TEST Finished");
	    }

}