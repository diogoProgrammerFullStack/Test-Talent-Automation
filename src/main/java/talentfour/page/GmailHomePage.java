package talentfour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage {
	
	@FindBy(xpath="//span[text()='Criar conta']")
	private WebElement linkCriarConta;
	
	public WebElement getLinkCriarConta() {
		return linkCriarConta;
	}

	public GmailHomePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
}
