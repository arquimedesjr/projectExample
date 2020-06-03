package Tests.cenario3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.extentReport.ReportHtml;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\Tests\\cenario3\\[CT1]-validar_data_nascimento_joe_russo.feature" }, plugin = {
		"json:target/cucumber-report.json" }, glue = { "Tests.cenario3", "runnerConfig" }, strict = true)
public class Cenario3 {

	@BeforeClass
	public static void beforeclass() {
		ReportHtml.getInstance().dirReportHtml("./Report/extent.html");

	}
	


	@AfterClass
	public static void EndTest() {
		ReportHtml.getInstance().extent.close();
	}

}
