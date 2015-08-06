package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchIssue {

private FirefoxDriver driver;
	
	public searchIssue(FirefoxDriver driver) {
		this.driver= driver;
}

	public searchUpdatedIssue openSUIssue(String issue) {
			driver.findElement(By.xpath(".//*[@id='edit-issue']/span[1]")).click();
			driver.findElement(By.xpath(".//*[@id='summary']")).clear();
			driver.findElement(By.xpath(".//*[@id='summary']")).sendKeys(issue);
			driver.findElement(By.id("edit-issue-submit")).click();
			
			return new  searchUpdatedIssue(driver);
	}

	
	}

