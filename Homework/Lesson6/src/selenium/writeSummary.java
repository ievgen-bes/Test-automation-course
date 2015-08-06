package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class writeSummary {
	private FirefoxDriver driver;
	
	public writeSummary(FirefoxDriver driver) {
		this.driver= driver;
		
	}
	public openPage openSummary(String summary) {
		driver.findElement(By.id("summary")).clear();
		driver.findElement(By.id("summary")).sendKeys(summary);
		driver.findElement(By.id("create-issue-submit")).click();
		return new openPage(driver);
	}
}
