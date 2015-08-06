package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class startPage {
	private final FirefoxDriver driver;

	public startPage(FirefoxDriver driver) {
		this.driver= driver;
	}
	public loggedInPage login(String login, String password) {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(login);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-submit")).click();
		return new loggedInPage(driver);
	}
	

}
