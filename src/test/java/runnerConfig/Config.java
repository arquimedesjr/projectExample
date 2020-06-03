package runnerConfig;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.LogStatus;

import br.com.auto.tool.TestBaseMobile;
import br.com.auto.tool.TestBaseWeb;
import br.com.extentReport.ReportHtml;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Config {

	Scenario scenario;
	public static String step;
	public static Exception mensagemErro;

	@Before
	public void before(Scenario scenario) {

		String tag = scenario.getSourceTagNames().toString().replace("[", "").replace("]", "");
		ReportHtml.getInstance().nameTest(scenario.getName(), tag);

	}

	@After
	public void After() {
		ReportHtml.getInstance().extent.endTest(ReportHtml.getInstance().logger);
	}
	


	@AfterStep
	public void AfterStep(Scenario scenario)  {
		String src = null;
		
		if(TestBaseWeb.driver!=null) {
			
			src = ((TakesScreenshot) TestBaseWeb.driver).getScreenshotAs(OutputType.BASE64);
		}
		
		
		
		String json = "{" +
                "\"id\": 1," +
                "\"name\": \"A green door\"," +
                "\"price\": 12.50," +
                "\"tags\": [\"home\", \"green\"]" +
            "}";

		System.out.println(scenario.getStatus());
		if (scenario.isFailed()) {
			ReportHtml.getInstance().logger.log(LogStatus.FAIL, step,
					ReportHtml.getInstance().logger.addScreenCapture("images.png"));
			ReportHtml.getInstance().logger.log(LogStatus.FAIL,  mensagemErro);
			
		} else if (scenario.getStatus().toString().equals("PASSED")) {
			ReportHtml.getInstance().logger.log(LogStatus.PASS, step,
					ReportHtml.getInstance().logger.addBase64ScreenShot("data:image/png;base64," + src));
			ReportHtml.getInstance().logger.log(LogStatus.INFO, "<pre>" + json + "</pre>");
		}

		else if (scenario.getStatus().toString().equals("UNDEFINED")) {
			ReportHtml.getInstance().logger.log(LogStatus.SKIP, step, new Throwable().getMessage());
		}

		step = "Não localizado step definition";
		ReportHtml.getInstance().extent.flush();
	}
}
