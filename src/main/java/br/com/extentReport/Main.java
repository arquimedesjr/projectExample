/*
 * package br.com.extentReport;
 * 
 * import java.io.File;
 * 
 * import org.junit.Test;
 * 
 * import com.aventstack.extentreports.AnalysisStrategy; import
 * com.aventstack.extentreports.ExtentReporter; import
 * com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.GherkinKeyword; import
 * com.aventstack.extentreports.MediaEntityBuilder; import
 * com.aventstack.extentreports.MediaEntityModelProvider; import
 * com.aventstack.extentreports.Status; import
 * com.aventstack.extentreports.markuputils.Markup; import
 * com.aventstack.extentreports.reporter.ExtentHtmlReporter; import
 * com.aventstack.extentreports.reporter.configuration.Protocol; import
 * com.aventstack.extentreports.reporter.configuration.Theme;
 * 
 * public class Main {
 * 
 * private final String path = "./Report/";
 * 
 * private final String file = "extent.html";
 * 
 * ExtentReporter extentReporter; ExtentReports extentReports;
 * ExtentHtmlReporter extentHtmlReporter;
 * 
 * @Test public void teste() {
 * 
 * try { // extentHtmlReporter = new ExtentHtmlReporterConfiguration().
 * ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(path + file);
 * extentReports = new ExtentReports();
 * 
 * extentHtmlReporter.setAppendExisting(true);
 * extentReports.attachReporter(extentHtmlReporter);
 * 
 * // String css = ".tabs .tab:nth-child(2) { display: none; }"; //
 * extentHtmlReporter.config().setCSS(css);
 * extentHtmlReporter.loadConfig(System.getProperty("user.dir") +
 * "\\extent-config.xml");
 * 
 * ExtentTest test = extentReports.createTest("MEu"); // level = 0
 * 
 * test.log(Status.INFO, "login Amazon").addScreenCaptureFromPath("images.png",
 * "teste"); test.log(Status.PASS, "te:",
 * MediaEntityBuilder.createScreenCaptureFromPath("images.png").build());
 * test.log(Status.PASS, "te:",
 * MediaEntityBuilder.createScreenCaptureFromPath("images.png").build());
 * test.log(Status.PASS, "te:",
 * MediaEntityBuilder.createScreenCaptureFromPath("images.png").build());
 * test.log(Status.PASS, "te:",
 * MediaEntityBuilder.createScreenCaptureFromPath("images.png").build());
 * test.log(Status.PASS, "te:",
 * MediaEntityBuilder.createScreenCaptureFromPath("images.png").build());
 * test.log(Status.PASS, "te:",
 * MediaEntityBuilder.createScreenCaptureFromPath("images.png").build());
 * test.log(Status.PASS, "te:",
 * MediaEntityBuilder.createScreenCaptureFromPath("images.png").build());
 * 
 * 
 * 
 * 
 * 
 * // creating nodes ExtentTest parentTest =
 * extentReports.createTest("MyFirstTest"); ExtentTest childTest =
 * parentTest.createNode("MyFirstChildTest"); childTest.pass("oi");
 * 
 * // short-hand for above extentReports .createTest("MyFirstTest")
 * .createNode("MyFirstChildTest") .pass("tchau");
 * 
 * // node description parentTest.createNode("MyFirstChildTest",
 * "Node Description").pass("ola");
 * 
 * extentReports.flush();
 * 
 * } catch (Exception e) { e.printStackTrace(); }
 * 
 * }
 * 
 * 
 * 
 * }
 */