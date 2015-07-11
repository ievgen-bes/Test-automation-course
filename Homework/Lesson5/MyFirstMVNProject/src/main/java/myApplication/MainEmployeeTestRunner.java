package myApplication;
	import org.junit.runner.JUnitCore;
	import org.junit.runner.Result;
	import org.junit.runner.notification.Failure;
	
public class MainEmployeeTestRunner {

	public static void main(String[] args) {
			        Result result = JUnitCore.runClasses(MainEployyeeParam.class);
			        for (Failure fail : result.getFailures()) {
			            System.out.println("Test is Failed: " + fail.toString());
			        }
			        if (result.wasSuccessful()) {
			            System.out.println("All tests finished successfully...");
			        }
			    }
			}
