package talentfour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoasVindasPage {
	
	@FindBy(xpath="//div[text()='Welcome']")
	private WebElement welcome;
	
	@FindBy(xpath="//div[text()='Welcome']//following::button")
	private WebElement buttonNext;
	
	@FindBy(xpath="//span[text()='Account Created']")
	private WebElement contaCriada;
	
	public WebElement getContaCriada() {
		return contaCriada;
	}

	@FindBy(name="ok")
	private WebElement buttonOk;
	
	public WebElement getButtonOk() {
		return buttonOk;
	}

	public WebElement getWelcome() {
		return welcome;
	}

	public WebElement getButtonNext() {
		return buttonNext;
	}

	public BoasVindasPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
}
