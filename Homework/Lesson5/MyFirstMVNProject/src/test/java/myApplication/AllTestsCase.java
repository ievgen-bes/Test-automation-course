package myApplication;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
//c
public class AllTestsCase {

	@Test
	public void EmployeeTest() {
		Employee test = new Employee();
		String result = test.Designation("");
		assertNotNull("", result);
	}
		@Test
		@Ignore
	    public void testIgnored() {
	        System.out.println("Ignored test!I will add test later)");
	}
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
		    @Test
			public void EmployeeTest3() {
				Employee test = new Employee();
				int result = test.late(15);
				assertSame(15, result);
			}
			@Test
			public void EmployeeTest4() {
				Employee test = new Employee();
				int result = test.ID(1001);
				assertEquals(1001, result);
			}
			@Test
			public void EmployeeTest5() {
				Employee test = new Employee();
				int result = test.ID(1001);
				assertSame(100001, result);
}
			@Test
			public void EmployeeTest6() {
				Employee test = new Employee();
				float result = test.CalculateSalary(121.75f, 1700.89f);
				assertEquals(1822.64, 1822.64, result);
			}
			@Test
			public void EmployeeTest7() {
				Employee test = new Employee();
				float result = test.CalculateSalary(1500.14f, 150.47f);
				assertEquals(974.709, 1650.61, result);
}
			@Test
			public void EmployeeTest8() {
				Employee test = new Employee();
				int result = test.bonus(150, 15);
				assertEquals(135, result);
			}
			@Test
			//BaseRate;
			@Ignore
		    public void testIgnored1() {
		        System.out.println("Ignored test!I will add test later)");
			}
			@Test
			public void EmployeeTest9() {
				Employee test = new Employee();
				float result = test.baseRate(30.7f, 30.87f);
				assertEquals(974.709, 1000000, result);
			}
			@Test
			public void EmployeeTest10() {
				Employee test = new Employee();
				int result = test.age(1988, 2015);
				assertEquals(27, result);
}
}