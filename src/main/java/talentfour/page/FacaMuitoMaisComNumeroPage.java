package talentfour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacaMuitoMaisComNumeroPage {
	
	@FindBy(xpath="//h2[text()='Por exemplo, seu número será usado para']//following::button[2]")
	private WebElement buttonPular;
	
	public WebElement getButtonPular() {
		return buttonPular;
	}

	public FacaMuitoMaisComNumeroPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
}
