package Tests.cenario1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.extentReport.ReportHtml;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\Tests\\cenario1\\Cenario1.feature" }, plugin = {
		"json:target/cucumber-report.json" }, glue = { "Tests.cenario1", "runnerConfig" }, strict = true)
public class Cenario1 {

	@BeforeClass
	public static void beforeclass() {
		ReportHtml.getInstance().dirReportHtml("./Report/extent.html");

	}
	

	@AfterClass
	public static void afterClass() {
		ReportHtml.getInstance().extent.close();	
	}

}
