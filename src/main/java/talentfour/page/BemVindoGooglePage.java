package talentfour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BemVindoGooglePage {
	
	@FindBy(css="#countryList > div:nth-child(1) > div.e2CuFe.eU809d")
	private WebElement selectPais;

	@FindBy(xpath="//h1[text()='Bem-vindo ao Google']//following::input[1]")
	private WebElement inputNumeroTelefone;
	
	@FindBy(xpath="//h1[text()='Bem-vindo ao Google']//following::input[2]")
	private WebElement inputEmailConfirmacao;
	
	@FindBy(xpath="//h1[text()='Bem-vindo ao Google']//following::input[3]")
	private WebElement inputDiaNascimento;
	
	@FindBy(xpath="//h1[text()='Bem-vindo ao Google']//following::select[1]")
	private WebElement selectMesNascimento;
	
	public WebElement getSelectPais() {
		return selectPais;
	}
	
	public WebElement getInputNumeroTelefone() {
		return inputNumeroTelefone;
	}

	public WebElement getInputEmailConfirmacao() {
		return inputEmailConfirmacao;
	}

	public WebElement getInputDiaNascimento() {
		return inputDiaNascimento;
	}

	public WebElement getSelectMesNascimento() {
		return selectMesNascimento;
	}

	public WebElement getInputAnoNascimento() {
		return inputAnoNascimento;
	}

	public WebElement getSelectGenero() {
		return selectGenero;
	}

	public WebElement getButtonProxima() {
		return buttonProxima;
	}

	@FindBy(xpath="//h1[text()='Bem-vindo ao Google']//following::input[4]")
	private WebElement inputAnoNascimento;
	
	@FindBy(xpath="//h1[text()='Bem-vindo ao Google']//following::select[2]")
	private WebElement selectGenero;
	
	@FindBy(xpath="//span[text()='Data de nascimento']//following::span[3]")
	private WebElement buttonProxima;
	
	public BemVindoGooglePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
}
