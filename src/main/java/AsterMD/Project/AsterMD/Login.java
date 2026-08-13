package AsterMD.Project.AsterMD;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Listerners.Report_Listen;
import Locaters.Login_Locaters;
import Repeatative_codes.Repeat;

@Listeners(Listerners.Report_Listen.class)
public class Login extends Base {

@Test
public void login() throws IOException {

	int step = 1;
	
	Repeat rp= new Repeat(d);

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 🔐 USER LOGIN ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Scenario Title:</b> Login to the AsterMD application");
		Report_Listen.log_print_in_report().info("<b>Description:</b> Open the configured AsterMD application URL, retrieve the configured login credentials, authenticate the user and verify successful login.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Login credentials retrieved securely from the configured Data Reader.");
		Report_Listen.log_print_in_report().info("<b>Expected:</b> User should be authenticated successfully and the post-login confirmation should be displayed.");

		System.out.println("🔐 USER LOGIN");
		System.out.println();

		System.out.println("🔹 Starting AsterMD login flow.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🧩 LOGIN LOCATOR INITIALIZATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Initialize the Login page locator class.");

		System.out.println("🧩 LOGIN LOCATOR INITIALIZATION");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Initializing Login page locators.");
		System.out.println();

		Login_Locaters lg = new Login_Locaters(d);

		Report_Listen.log_print_in_report().pass("✅ Login page locator class initialized successfully.");
		System.out.println("✅ Login page locator class initialized successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🔑 LOGIN CREDENTIAL RETRIEVAL ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Initialize the Data Reader and retrieve the configured Login ID and Password.");

		System.out.println("🔑 LOGIN CREDENTIAL RETRIEVAL");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Retrieving configured login credentials.");
		System.out.println();

		Data_Reader f = new Data_Reader();

		String Login_id = f.Data_Fetcher("Login_id");
		String Pass = f.Data_Fetcher("Pass");

		Report_Listen.log_print_in_report().pass("✅ Login credentials retrieved successfully without exposing credential values in the report.");
		System.out.println("✅ Login credentials retrieved successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🌐 APPLICATION ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the configured AsterMD application URL.");
		Report_Listen.log_print_in_report().info("<b>Target URL:</b> " + Target_url);

		System.out.println("🌐 APPLICATION ACCESS");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Navigating to application URL: " + Target_url);
		System.out.println();

		d.get(Target_url);

		Report_Listen.log_print_in_report().pass("✅ Target application URL opened successfully.");
		System.out.println("✅ Target application URL opened successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🔎 LOGIN PAGE VERIFICATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Verify that the application has successfully landed on the Login page.");

		System.out.println("🔎 LOGIN PAGE VERIFICATION");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Verifying Login page.");
		System.out.println();

		lg.Landed_in_Login_Page();

		Report_Listen.log_print_in_report().pass("✅ Application successfully landed on the Login page.");
		System.out.println("✅ Application successfully landed on the Login page.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 👤 LOGIN ID ENTRY ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter the configured Login ID into the Login ID field.");

		System.out.println("👤 LOGIN ID ENTRY");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Entering configured Login ID.");
		System.out.println();

		lg.id_field().sendKeys(Login_id);

		Report_Listen.log_print_in_report().pass("✅ Login ID entered successfully.");
		System.out.println("✅ Login ID entered successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🔒 PASSWORD ENTRY ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter the configured Password into the Password field.");

		System.out.println("🔒 PASSWORD ENTRY");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Entering configured Password.");
		System.out.println();

		lg.password_field().sendKeys(Pass);

		Report_Listen.log_print_in_report().pass("✅ Password entered successfully.");
		System.out.println("✅ Password entered successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── 🚀 LOGIN SUBMISSION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Click the Login button to submit the authentication request.");

		System.out.println("🚀 LOGIN SUBMISSION");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Clicking the Login button.");
		System.out.println();

		lg.Login_button().click();

		Report_Listen.log_print_in_report().pass("✅ Login button clicked successfully.");
		System.out.println("✅ Login button clicked successfully.");
		System.out.println();

		step++;

		Report_Listen.log_print_in_report().info("──────────────────── ✅ LOGIN RESULT VERIFICATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Verify successful authentication using the post-login confirmation.");

		System.out.println("✅ LOGIN RESULT VERIFICATION");
		System.out.println();

		System.out.println("🔹 Step " + step + ": Verifying successful login confirmation.");
		System.out.println();/*
        WebElement Progress_Bar =lg.Progress_bar();
        rp.wait_for_invisibilty_of_theElement(Progress_Bar); */
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(80)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		WebElement Login_confirmation= wait.until(driver -> lg.login_confirmation());
		Report_Listen.log_print_in_report().pass("✅ Login completed and login confirmation was verified successfully.");
		System.out.println("✅ Login completed and login confirmation was verified successfully.");
		System.out.println();

	} catch(IOException e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Login flow failed. Failure reason: " + e.getMessage());

		System.out.println("❌ Login flow failed.");
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;

	} catch(RuntimeException e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Login flow failed. Failure reason: " + e.getMessage());

		System.out.println("❌ Login flow failed.");
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}
}
