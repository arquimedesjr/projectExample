package Tests.cenario2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.extentReport.ReportHtml;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\Tests\\cenario2\\Cenario2.feature" }, plugin = {
		"json:target/cucumber-report.json" }, glue = { "Tests.cenario2", "runnerConfig" }, strict = true)
public class Cenario2 {

	@BeforeClass
	public static void beforeclass() {
		ReportHtml.getInstance().dirReportHtml("./Report/extent.html");

	}
	


	@AfterClass
	public static void EndTest() {
		ReportHtml.getInstance().extent.close();
	}

}
