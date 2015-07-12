package myApplication;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class AllTestsCase {

	@Test
	public void EmployeeTest() {
		MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
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
			MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
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
		    @Test
			public void EmployeeTest3() {
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
				int result = test.late(15);
				assertSame(15, result);
			}
			@Test
			public void EmployeeTest4() {
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
				int result = test.ID(1001);
				assertEquals(1001, result);
			}
			@Test
			public void EmployeeTest5() {
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
				int result = test.ID(1001);
				assertSame(100001, result);
}
			@Test
			public void EmployeeTest6() {
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
				float result = test.CalculateSalary(121.75f, 1700.89f);
				assertEquals(1822.64, 1822.64, result);
			}
			@Test
			public void EmployeeTest7() {
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
				float result = test.CalculateSalary(1500.14f, 150.47f);
				assertEquals(974.709, 1650.61, result);
}
			@Test
			public void EmployeeTest8() {
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
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
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
				float result = test.baseRate(30.7f, 30.87f);
				assertEquals(974.709, 1000000, result);
			}
			@Test
			public void EmployeeTest10() {
				MaimEmployeeTestRunner test = new MaimEmployeeTestRunner();
				int result = test.age(1988, 2015);
				assertEquals(27, result);
}
			@RunWith(value = Parameterized.class)

			public class MainEployyeeParam {

				private int numberPresYear;
				private int numberBDay;
				private int expected;
				public MainEployyeeParam(int numberPresYear, int numberBDay, int expected) {
					this.numberPresYear = numberPresYear;
					this.numberBDay = numberBDay;
					this.expected = expected;
				}

				@Parameters(name = "{index}: add({0}+{1})={2}")
				public Iterable<Object[]> data() {
					return Arrays.asList(new Object[][] { 
						{ 2, 1, 1 }, 
						{ 4, 2, 2 }, 
						{ 10, 2, 8 }, 
						{ 9, 5, 4 } 
					});
				}
			 
				@Test
				public void test_age() {	
					assertEquals(expected,MaimEmployeeTestRunner.age(numberBDay, numberPresYear));
				}
			 
			}
}