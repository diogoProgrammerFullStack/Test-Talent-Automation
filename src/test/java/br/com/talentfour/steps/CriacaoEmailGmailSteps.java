package br.com.talentfour.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import talentfour.actions.CriacaoEmailGmailAction;
/**
 * 
 * @author diogo
 *
 */
public class CriacaoEmailGmailSteps {
	
	private CriacaoEmailGmailAction criacaoEmailGmailAction;
	private String resultadoWelcome;
	private String resultadoFinal;
	
	public CriacaoEmailGmailSteps() {
		this.criacaoEmailGmailAction = new CriacaoEmailGmailAction();
	}
	
	@Dado("^que estou na home do gmail$")
	public void queEstouNaHomeDoGmail() throws Throwable {
		this.criacaoEmailGmailAction.navegarAteHome();
	}

	@Quando("^faco cadastramento completo de dados para criacao do email$")
	public void facoCadastramentoCompletoDeDadosParaCriacaoDoEmail() throws Throwable {
		this.criacaoEmailGmailAction.clicarCriarConta();
		this.criacaoEmailGmailAction.cadastroInicialGmail("Diogo", "Oliveira", "diogo.talentfour12345");
		this.criacaoEmailGmailAction.senhaGmail();
		this.criacaoEmailGmailAction.cadastroFinalGmail("01", "Outubro", "1993");
		this.criacaoEmailGmailAction.generoSexo("Masculino");
		this.criacaoEmailGmailAction.clicarProxima();
		this.criacaoEmailGmailAction.pularNumero();
	}

	@Quando("^clico em \"([^\"]*)\"$")
	public void clicoEm(String arg1) throws Throwable {
		this.criacaoEmailGmailAction.privacidadeTermos();
	}

	@Entao("^devo visualizar a mensagem welcome$")
	public void devoVisualizarAMensagemWelcome() throws Throwable {
		resultadoWelcome = this.criacaoEmailGmailAction.getMsgWelcome();
		assertNotNull(resultadoWelcome);
		this.criacaoEmailGmailAction.finalCreated();
	}

	@Entao("^devo visualizar a mensagem account created$")
	public void devoVisualizarAMensagemAccountCreated() throws Throwable {
		resultadoFinal = this.criacaoEmailGmailAction.getMsgCreated();
		assertEquals("Account Created", resultadoFinal);
	}
}
