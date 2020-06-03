package Tests.cenario3;

import br.com.auto.tool.TestBaseWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Google;
import runnerConfig.Config;

public class StepCenario {
	
	TestBaseWeb testBasewWeb = new TestBaseWeb();
	Google pageGoogle = new Google();

	@Dado("que navego na url do google")
	public void que_navego_na_url_do_google() {
		Config.step = "Dado que navego na url do google";
		testBasewWeb.setUpBrowser();
		testBasewWeb.setUrl("https://www.google.com/");
	}

	@Quando("insiro no campo de perquisa {string}")
	public void insiro_no_campo_de_perquisa(String string) {
		Config.step = "Quando insiro no campo de perquisa "+string;
		testBasewWeb.sendkeysELement(pageGoogle.fieldSearchHome(), string);
//		testBasewWeb.screenReport(scenario);
	}

	@E("clico no botao {string}")
	public void clico_no_botao(String string) {
		Config.step = "E clico no botão "+string;
		testBasewWeb.clickForELement(pageGoogle.buttonSearch());
//		testBasewWeb.screenReport(scenario);
	}

	@Então("capturo a data de nascimento do diretor {string}")
	public void capturo_a_data_de_nascimento_do_diretor(String string) {
		Config.step = "Então capturo a data de nascimento do diretor "+string;
//		testBasewWeb.screenReport(scenario);
	}
}
