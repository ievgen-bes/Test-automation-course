package myApplication;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


	@RunWith(Suite.class)
	@Suite.SuiteClasses({
			NameTest_Ignore.class,
			AllTestsCase.class,
			NameTest_F_B_A.class
			})
	public class NameSuit {
		
}
