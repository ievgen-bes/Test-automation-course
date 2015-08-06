package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openPage {
private FirefoxDriver driver;
	
	public openPage(FirefoxDriver driver) {
		this.driver= driver;
	}
	public searchIssue sSearch(String sSearch){
		driver.findElement(By.id("find_link")).click();
		driver.findElement(By.id("issues_new_search_link_lnk")).click();
		driver.findElement(By.id("searcher-query")).clear();
		driver.findElement(By.id("searcher-query")).sendKeys(sSearch);	
		driver.findElement(By.xpath(".//*[@id='content']/div[1]/div[4]/div/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/ul/li[7]/button")).click();
		return new searchIssue(driver);
		
	}
}
