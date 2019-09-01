package talentfour.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Web implements WebApplication {

	CHROME_WINDOWS {
		@Override
		public WebDriver getDriver() {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			return new ChromeDriver();
		}
	},
}
