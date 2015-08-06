package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchUpdatedIssue {
private FirefoxDriver driver;
	
	public searchUpdatedIssue(FirefoxDriver driver) {
		this.driver= driver;
		
	}

	public Object getSearchUpdatedIssue() {
		return driver.findElement(By.xpath(".//*[@id='summary-val']")).getText();
	}

}
