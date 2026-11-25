package Listerners;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import AsterMD.Project.AsterMD.Base;
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

		Throwable Failure = result.getThrowable();
		ExtentTest Failed_Report = log_report.get();
		String Failure_Location = "Java source line unavailable";
		String Locator_Location = null;
		String Test_Class_Location = null;
		String Test_Class_Name = result.getTestClass().getRealClass().getName();
		Boolean Project_Frame_Found = false;

		Failure_Trace:
		for(Throwable Cause = Failure; Cause != null; Cause = Cause.getCause()){

			for(StackTraceElement Frame : Cause.getStackTrace()){

				String Class_Name = Frame.getClassName();
				Boolean Framework_Frame = Class_Name.startsWith("org.testng.") || Class_Name.startsWith("org.openqa.selenium.") || Class_Name.startsWith("java.") || Class_Name.startsWith("jdk.") || Class_Name.startsWith("sun.") || Class_Name.startsWith("io.cucumber.") || Class_Name.startsWith("org.apache.maven.surefire.") || Class_Name.startsWith("com.aventstack.extentreports.");

				if(Framework_Frame == false && Frame.getFileName() != null && Frame.getLineNumber() > 0){

					if(Project_Frame_Found == false){

						Failure_Location = Frame.toString();
						Project_Frame_Found = true;

					}

					if(Locator_Location == null && Class_Name.startsWith("Locaters.")){

						Locator_Location = Frame.toString();

					}

					if(Test_Class_Location == null && Class_Name.equals(Test_Class_Name)){

						Test_Class_Location = Frame.toString();
						break Failure_Trace;

					}

				}

			}

		}

		String Failure_Message = Failure == null ? "Test failed." : Failure.toString();

		System.out.println();
		System.out.println("---------------- TEST FAILURE ----------------");
		System.out.println("Test      : " + result.getMethod().getMethodName());
		if(Project_Frame_Found == true){

			System.out.println("Failed at :");
			System.out.println("\tat " + Failure_Location);

			if(Locator_Location != null && Locator_Location.equals(Failure_Location) == false){

				System.out.println("\tat " + Locator_Location);

			}

			if(Test_Class_Location != null && Test_Class_Location.equals(Failure_Location) == false){

				System.out.println("\tat " + Test_Class_Location);

			}

		}
		else{

			System.out.println("Failed at : " + Failure_Location);

		}

		System.out.println("Error     : " + Failure_Message);
		System.out.println();

		if(Failed_Report != null) {

			Failed_Report.info("Failed at: " + Failure_Location);

			if(Locator_Location != null && Locator_Location.equals(Failure_Location) == false){

				Failed_Report.info("Locator at: " + Locator_Location);

			}

			if(Test_Class_Location != null && Test_Class_Location.equals(Failure_Location) == false){

				Failed_Report.info("Test step at: " + Test_Class_Location);

			}

			if(Failure != null){

				Failed_Report.log(Status.FAIL, Failure);

			}
			else{

				Failed_Report.log(Status.FAIL, Failure_Message);

			}

			log_report.get().info("──────────────────── 📸 FAILURE SCREENSHOT ────────────────────");
			log_report.get().info("<b>Action:</b> Capture the browser state at the point of test failure.");

			System.out.println();
			System.out.println("📸 FAILURE SCREENSHOT");
			System.out.println();

			System.out.println("🔹 Capturing browser screenshot for failed test: " + result.getMethod().getMethodName());
			System.out.println();

			try {

				Object Test_Instance = result.getInstance();

				if(Test_Instance instanceof Base) {

					WebDriver Failed_Test_Driver = ((Base)Test_Instance).d;

					if(Failed_Test_Driver != null && Failed_Test_Driver instanceof TakesScreenshot) {

						String Failure_Screenshot = ((TakesScreenshot)Failed_Test_Driver).getScreenshotAs(OutputType.BASE64);

						log_report.get().addScreenCaptureFromBase64String(Failure_Screenshot, "Failure Screenshot - " + result.getMethod().getMethodName());

						log_report.get().pass("✅ Failure screenshot captured and attached to the Extent Report successfully.");

						System.out.println();
						System.out.println("✅ Failure screenshot captured and attached to the Extent Report successfully.");
						System.out.println();

					} else {

						log_report.get().warning("⚠️ Failure screenshot could not be captured because the WebDriver was unavailable or did not support screenshots.");

						System.out.println();
						System.out.println("⚠️ Failure screenshot could not be captured because the WebDriver was unavailable.");
						System.out.println();
					}

				} else {

					log_report.get().warning("⚠️ Failure screenshot could not be captured because the failed test instance does not extend the AsterMD Base class.");

					System.out.println();
					System.out.println("⚠️ Failed test instance does not extend the AsterMD Base class.");
					System.out.println();
				}

			} catch(Exception e) {

				log_report.get().warning("⚠️ Screenshot capture failed. Reason: " + e.getMessage());

				System.out.println();
				System.out.println("⚠️ Screenshot capture failed.");
				System.out.println();

				System.out.println("⚠️ Reason: " + e.getMessage());
				System.out.println();
			}
		}

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
