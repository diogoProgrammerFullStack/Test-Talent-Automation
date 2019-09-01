package talentfour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacidadeTermosPage {
	
	@FindBy(xpath="//span[text()='Concordo']")
	private WebElement buttonConcordo;
	
	public WebElement getButtonConcordo() {
		return buttonConcordo;
	}

	public PrivacidadeTermosPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
}
