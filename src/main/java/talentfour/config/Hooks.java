package talentfour.config;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import talentfour.commons.BaseTest;
import talentfour.commons.SeleniumFuncoes;
import talentfour.factory.Web;

/**
 * 
 * @author diogo
 *
 */
public class Hooks extends BaseTest {

	@Before(value = "@chrome")
	public void beforeScenarioChrome() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME_WINDOWS);
	}

	@After(value = "@chrome")
	public void afterScenarioWeb(Scenario scenario) {
		SeleniumFuncoes.generateEvidence(scenario);
		closeDriver();
	}

}
