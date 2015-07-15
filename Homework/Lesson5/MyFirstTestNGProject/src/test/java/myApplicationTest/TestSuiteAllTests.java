package myApplicationTest;

import myApplicationTest.MainEmployee;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;


public class TestSuiteAllTests {
	@BeforeSuite
	@Test
	@DataProvider(parallel = true)
	public void EmployeeTest() {
		MainEmployee test = new MainEmployee();
		String result = test.Designation("");
		Assert.assertNotNull("", result);
	}
	@Test(enabled = false)
    public void testName2(){
    Assert.assertEquals(true, true);
        System.out.println("Ignored test!I will add test later)");
	}
		@Test
		public void EmployeeTest2() {
			MainEmployee test = new MainEmployee();
			String result = test.name("Will"," Smitt");
			Assert.assertEquals("Will Smitt", result);
		}
		 @BeforeTest
		    public void testStarted() {
		        System.out.println("TEST Started");
		    }

		 @AfterTest
		    public void testFinished() {
		        System.out.println("TEST Finished");
		    }
		    @Test
			public void EmployeeTest3() {
				MainEmployee test = new MainEmployee();
				int result = test.late(15);
				Assert.assertSame(15, result);
			}
			@Test
			public void EmployeeTest4() {
				MainEmployee test = new MainEmployee();
				int result = test.ID(1001);
				Assert.assertEquals(1001, result);
			}
			@Test
			public void EmployeeTest5() {
				MainEmployee test = new MainEmployee();
				int result = test.ID(1001);
				Assert.assertSame(100001, result);
}
			@Test
			public void EmployeeTest6() {
				MainEmployee test = new MainEmployee();
				float result = test.CalculateSalary(121.75f, 1700.89f);
				Assert.assertEquals(1822.64, 1822.64, result);
			}
			@Test
			public void EmployeeTest7() {
				MainEmployee test = new MainEmployee();
				float result = test.CalculateSalary(1500.14f, 150.47f);
				Assert.assertEquals(974.709, 1650.61, result);
}
			@Test
			public void EmployeeTest8() {
				MainEmployee test = new MainEmployee();
				int result = test.bonus(15, 150);
				Assert.assertEquals(135, result);
			}
			@Test(enabled = false)
		    public void testName1(){
		    Assert.assertEquals(true, true);
		        System.out.println("Ignored test!I will add test later)");
			}
			@Test
			public void EmployeeTest9() {
				MainEmployee test = new MainEmployee();
				float result = test.baseRate(30.7f, 30.87f);
				Assert.assertEquals(974.709, 1000000, result);
			}
			@Test
			public void EmployeeTest10() {
				MainEmployee test = new MainEmployee();
				int result = test.age(1988, 2015);
				Assert.assertEquals(27, result);
}

				@Test(timeOut = 1000)
			    public void waitLongTime() throws Exception {
			        Thread.sleep(1001);
				        }
			}