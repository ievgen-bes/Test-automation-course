package myApplicationTest;

import static org.junit.Assert.assertEquals;
import myApplicationTest.MainEmployeeTestRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestNameTest1 {

	@Test
	public void EmployeeTest2() {
		MainEmployeeTestRunner test = new MainEmployeeTestRunner();
		String result = test.name("Will","Smitt");
		assertEquals("Will Smitt", result);
	}
	  @Before
	    public void testStarted() {
	        System.out.println("TEST Started");
	    }

	    @After
	    public void testFinished() {
	        System.out.println("TEST Finished");
	    }

}