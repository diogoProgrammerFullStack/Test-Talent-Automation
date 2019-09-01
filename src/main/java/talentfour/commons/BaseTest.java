package talentfour.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import talentfour.factory.WebApplication;
/**
 * 
 * @author diogo
 *
 */
public class BaseTest {
	protected static WebDriver webDriver;
	protected static WebDriverWait wait;
	
	protected void initializeWebApplication(WebApplication webApplication) {
		webDriver = webApplication.getDriver();
		webDriver.manage().window().fullscreen();
	}
	
	public void closeDriver() {
		webDriver.quit();
	}
}
