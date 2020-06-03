package Tests.cenario2;

import java.io.File;

import org.junit.Assert;

import runnerConfig.Config;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepCenario {

	@Dado("acesso ao sistema")
	public void acesso_ao_sistema() {
		Config.step = "Dado acesso ao sistema";

	}

	@Quando("insiro as informações")
	public void insiro_as_informacoes() {
		Config.step = "Quando insiro as informações";
	}

	@Entao("valido")
	public void valido() {
		Config.step = "Então valido";

		Config.mensagemErro = new NullPointerException("A NullPointer occured.");
		Assert.assertTrue("Assert", false);

	}

}
