package Report;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	public ExtentReports Get_reports() {
		Path Report_directory = Paths.get(System.getProperty("user.dir"), "Report_folder");
		try {
			Files.createDirectories(Report_directory);
		} catch (IOException e) {
			throw new UncheckedIOException("Unable to create the report directory: " + Report_directory, e);
		}

		ExtentSparkReporter spark = new ExtentSparkReporter(Report_directory.resolve("report.html").toString());
		spark.config().setReportName("Aster MD Automation Report");
		spark.config().setDocumentTitle("Aster MD Test Execution Report");
		spark.config().setTheme(Theme.DARK);
		spark.config().setEncoding("UTF-8");
		spark.config().setTimelineEnabled(true);
		spark.config().setCss(".badge { font-size: 12px; padding: 4px; }");

		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Automated By", "Ayan Sengupta");
		report.setSystemInfo("Framework", "Selenium + TestNG + Cucumber");
		report.setSystemInfo("Report Type", "Extent Spark HTML");
		report.setSystemInfo("OS", System.getProperty("os.name"));
		report.setSystemInfo("Java Version", System.getProperty("java.version"));
		return report;
	}
}
