package myApplication;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 
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
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ 2, 1, 1 }, 
			{ 4, 2, 2 }, 
			{ 10, 2, 8 }, 
			{ 9, 5, 4 } 
		});
	}
 
	@Test
	public void test_age() {	
		assertEquals(expected,Employee.age(numberBDay, numberPresYear));
	}
 
}