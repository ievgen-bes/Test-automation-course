package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createLink {
	private FirefoxDriver driver;
	public createLink(FirefoxDriver driver) {
		this.driver= driver;
}
	public Object getCreate() {
		return driver.findElement(By.xpath("/html/body/div[1]/div/div")).getText();
	}
}