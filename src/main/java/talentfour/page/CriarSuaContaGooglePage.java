package talentfour.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CriarSuaContaGooglePage {
	
	@FindBy(xpath="//h1[text()='Criar sua Conta do Google']//following::input[1]")
	private WebElement inputNome;
	
	@FindBy(xpath="//h1[text()='Criar sua Conta do Google']//following::input[2]")
	private WebElement inputSobrenome;
	
	@FindBy(xpath="//h1[text()='Criar sua Conta do Google']//following::input[3]")
	private WebElement inputNomeUsuario;
	
	@FindBy(xpath="//h1[text()='Criar sua Conta do Google']//following::input[4]")
	private WebElement inputSenha;
	
	@FindBy(xpath="//h1[text()='Criar sua Conta do Google']//following::input[5]")
	private WebElement inputConfirmarSenha;
	
	@FindBy(xpath="//h1[text()='Criar sua Conta do Google']//following::span[5]")
	private WebElement buttonProxima;
	
	public WebElement getInputNome() {
		return inputNome;
	}

	public WebElement getInputSobrenome() {
		return inputSobrenome;
	}

	public WebElement getInputNomeUsuario() {
		return inputNomeUsuario;
	}

	public WebElement getInputSenha() {
		return inputSenha;
	}

	public WebElement getInputConfirmarSenha() {
		return inputConfirmarSenha;
	}

	public WebElement getButtonProxima() {
		return buttonProxima;
	}

	public CriarSuaContaGooglePage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
}
