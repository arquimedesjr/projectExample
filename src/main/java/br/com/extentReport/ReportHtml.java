package br.com.extentReport;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportHtml {

	private static ReportHtml reportHtml;
	public ExtentReports extent;
	public ExtentTest logger;

	public static ReportHtml getInstance() {
		if (reportHtml == null) {
			reportHtml = new ReportHtml();
		}
		return reportHtml;
	}

	public void dirReportHtml(String dirHtml) {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", false,
				DisplayOrder.OLDEST_FIRST);

		extent.addSystemInfo("Host Name", "SoftwareTestingMaterial").addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Rajkumar SM");

		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}

	public void nameTest(String nameTest, String categories) {

		logger = extent.startTest(nameTest);
		logger.assignCategory(categories);
	}

	public void afterMethod(boolean status) {
		if (status) {
		}

	}

}
