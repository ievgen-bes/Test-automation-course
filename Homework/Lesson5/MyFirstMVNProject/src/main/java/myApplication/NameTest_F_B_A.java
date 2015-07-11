package myApplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.JUnitCore;
public class NameTest_F_B_A {

	@Test
	public void EmployeeTest2() {
		Employee test = new Employee();
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
	    public static void main(String[] args) {
	        JUnitCore core = new JUnitCore();
	        core.run(NameTest_F_B_A.class);
	    }
}
