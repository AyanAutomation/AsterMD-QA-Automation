package Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Report.Reports;

public class Report_Listen implements ITestListener {

	private static final ExtentReports report = new Reports().Get_reports();
	public static final ThreadLocal<ExtentTest> log_report = new ThreadLocal<ExtentTest>();

	public static ExtentTest log_print_in_report() {
		return log_report.get();
	}

	@Override
	public void onTestStart(ITestResult result) {
		String Test_Method_name = result.getMethod().getMethodName();
		log_report.set(report.createTest(Test_Method_name));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		if (log_report.get() != null) log_report.get().log(Status.PASS, "Test passed");
		log_report.remove();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		if (log_report.get() != null) log_report.get().log(Status.FAIL, result.getThrowable());
		log_report.remove();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		if (log_report.get() != null && result.getThrowable() != null) log_report.get().log(Status.SKIP, result.getThrowable());
		if (log_report.get() != null && result.getThrowable() == null) log_report.get().log(Status.SKIP, "Test skipped");
		log_report.remove();
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
}
