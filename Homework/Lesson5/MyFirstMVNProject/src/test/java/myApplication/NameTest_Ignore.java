package myApplication;

import org.junit.Test;
import org.junit.Ignore;

public class NameTest_Ignore {

	@Test
	@Ignore
    public void testIgnored() {
        System.out.println("Ignored test!I will add test later)");
    }
}
