package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loggedInPage {
		private final FirefoxDriver driver;
			public loggedInPage(FirefoxDriver driver) {
				this.driver= driver;		
	}
	public writeSummary openLink() {
		driver.findElement(By.id("create_link")).click();
		driver.findElement(By.id("summary")).click();
		return new writeSummary (driver);
	}
}