package selenium;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.firefox.FirefoxDriver; 

public class jiraTestPage {
	private FirefoxDriver driver;
	
	@Before
	public void startBrowser() {
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://id.atlassian.com/login?application=jac&continue=https"
				+ "%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");
}
	@After
	public void closeBrowser() {
		driver.close();
	}
	@Test
	public void testCreateIssue() throws InterruptedException
	{
		startPage home= new startPage(driver);
			loggedInPage loggedin= home.login("svv.tes@gmail.com", "1234567890");
				writeSummary summary= loggedin.openLink();
					openPage open= summary.openSummary("SummaryTest");
						Thread.sleep(2000);
							searchIssue openIssue= open.sSearch("SummaryTest");
						searchUpdatedIssue sUIssue = openIssue.openSUIssue ("jiraSummaryTest");
						assertTrue(sUIssue.getSearchUpdatedIssue().equals("jiraSummaryTest"));											
					
	}
	
}
