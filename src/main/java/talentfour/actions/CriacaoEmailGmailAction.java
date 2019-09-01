package talentfour.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import talentfour.commons.BaseTest;
import talentfour.commons.SeleniumFuncoes;
import talentfour.commons.Urls;
import talentfour.page.BemVindoGooglePage;
import talentfour.page.BoasVindasPage;
import talentfour.page.CriarSuaContaGooglePage;
import talentfour.page.FacaMuitoMaisComNumeroPage;
import talentfour.page.GmailHomePage;
import talentfour.page.PrivacidadeTermosPage;
/**
 * 
 * @author diogo
 *
 */
public class CriacaoEmailGmailAction extends BaseTest{
	
	private GmailHomePage gmailHomePage;
	private BemVindoGooglePage bemVindoGooglePage;
	private CriarSuaContaGooglePage criarSuaContaGooglePage;
	private FacaMuitoMaisComNumeroPage facaMuitoMaisComNumeroPage;
	private PrivacidadeTermosPage privacidadeTermosPage;
	private BoasVindasPage boasVindasPage;
	private String resultsWelcome;
	private String resultadoFinal;
	
	public CriacaoEmailGmailAction() {
		this.gmailHomePage = new GmailHomePage(webDriver);
		this.criarSuaContaGooglePage = new CriarSuaContaGooglePage(webDriver);
		this.facaMuitoMaisComNumeroPage = new FacaMuitoMaisComNumeroPage(webDriver);
		this.privacidadeTermosPage = new PrivacidadeTermosPage(webDriver);
		this.boasVindasPage = new BoasVindasPage(webDriver);
		this.bemVindoGooglePage = new BemVindoGooglePage(webDriver);
	}
	
	public void navegarAteHome() {
		webDriver.get(Urls.GMAIL);
		webDriver.manage().window().maximize();
	}
	
	public void clicarCriarConta() {
		SeleniumFuncoes.waitElementAppear(this.gmailHomePage.getLinkCriarConta());
		this.gmailHomePage.getLinkCriarConta().click();
	}
	
	public void cadastroInicialGmail(String nome, String sobrenome, String nomeUsuario) throws Exception {
		SeleniumFuncoes.waitElementAppear(this.criarSuaContaGooglePage.getInputNome());
		this.criarSuaContaGooglePage.getInputNome().sendKeys(nome);
		SeleniumFuncoes.waitElementAppear(this.criarSuaContaGooglePage.getInputSobrenome());
		this.criarSuaContaGooglePage.getInputSobrenome().sendKeys(sobrenome);
		SeleniumFuncoes.waitElementAppear(this.criarSuaContaGooglePage.getInputNomeUsuario());
		this.criarSuaContaGooglePage.getInputNomeUsuario().sendKeys(nomeUsuario);
		
	}
	public void senhaGmail() throws InterruptedException {
		SeleniumFuncoes.waitElementAppear(this.criarSuaContaGooglePage.getInputSenha());
		this.criarSuaContaGooglePage.getInputSenha().sendKeys("TalentFour123");
		SeleniumFuncoes.waitElementAppear(this.criarSuaContaGooglePage.getInputConfirmarSenha());
		this.criarSuaContaGooglePage.getInputConfirmarSenha().sendKeys("TalentFour123");
		SeleniumFuncoes.waitElementAppear(this.criarSuaContaGooglePage.getButtonProxima());
		this.criarSuaContaGooglePage.getButtonProxima().click();
		Thread.sleep(5000);
		SeleniumFuncoes.takeSnapShot();
	}
	
	public void cadastroFinalGmail(String diaNascimento, String mes, String anoNascimento) {
		SeleniumFuncoes.implicityWait();
		this.bemVindoGooglePage.getInputDiaNascimento().click();
		this.bemVindoGooglePage.getInputDiaNascimento().sendKeys(diaNascimento);
		WebElement element = this.bemVindoGooglePage.getSelectMesNascimento();
		Select combo = new Select(element);
		combo.selectByVisibleText(mes);
		
		SeleniumFuncoes.waitElementAppear(this.bemVindoGooglePage.getInputAnoNascimento());
		this.bemVindoGooglePage.getInputAnoNascimento().sendKeys(anoNascimento);
	}
	
	public void generoSexo(String sexo) {
		WebElement element = this.bemVindoGooglePage.getSelectGenero();
		Select comboGenero = new Select(element);
		comboGenero.selectByVisibleText(sexo);
	}
	
	public void clicarProxima() {
		this.bemVindoGooglePage.getButtonProxima().click();
	}
	
	public void pularNumero() {
		this.facaMuitoMaisComNumeroPage.getButtonPular().click();
	}
	
	public void privacidadeTermos() {
		this.privacidadeTermosPage.getButtonConcordo().click();
	}
	
	public String getMsgWelcome() {
		resultsWelcome = this.boasVindasPage.getWelcome().getText();
		return resultsWelcome;
		
	}
	
	public void finalCreated() {
		this.boasVindasPage.getButtonNext().click();
		this.boasVindasPage.getButtonOk().click();
	}
	
	public String getMsgCreated() {
		resultadoFinal = this.boasVindasPage.getContaCriada().getText();
		return resultadoFinal;
	}
}
