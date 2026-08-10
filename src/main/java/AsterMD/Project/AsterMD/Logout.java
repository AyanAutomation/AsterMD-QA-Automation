package AsterMD.Project.AsterMD;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listerners.Report_Listen;
import Locaters.Login_Locaters;
import Locaters.Logout_locaters;

@Listeners(Listerners.Report_Listen.class)
public class Logout extends Base {

	@Test
	public void logout() throws IOException {

		int step = 1;

		try {

			Report_Listen.log_print_in_report().info("──────────────────── 🚪 USER LOGOUT ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Scenario Title:</b> Logout from the AsterMD application");
			Report_Listen.log_print_in_report().info("<b>Description:</b> Authenticate the configured user, establish an active application session, perform Logout and verify successful session termination.");
			Report_Listen.log_print_in_report().info("<b>Input:</b> Login credentials retrieved securely from the configured Data Reader.");
			Report_Listen.log_print_in_report().info("<b>Expected:</b> User should login successfully, perform Logout and receive the expected logout confirmation.");

			System.out.println("🚪 USER LOGOUT");
			System.out.println();

			System.out.println("🔹 Starting AsterMD logout validation flow.");
			System.out.println();

			Report_Listen.log_print_in_report().info("──────────────────── 🧩 LOGOUT FLOW INITIALIZATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Initialize Login and Logout locator classes.");

			System.out.println("🧩 LOGOUT FLOW INITIALIZATION");
			System.out.println();

			System.out.println("🔹 Step " + step + ": Initializing Login and Logout locators.");
			System.out.println();

			Login_Locaters lgin = new Login_Locaters(d);
			Logout_locaters lg = new Logout_locaters(d);

			Report_Listen.log_print_in_report().pass("✅ Login and Logout locator classes initialized successfully.");
			System.out.println("✅ Login and Logout locator classes initialized successfully.");
			System.out.println();

			step++;

			Report_Listen.log_print_in_report().info("──────────────────── 🔑 LOGIN CREDENTIAL RETRIEVAL ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve the configured Login ID and Password required to establish an authenticated session.");

			System.out.println("🔑 LOGIN CREDENTIAL RETRIEVAL");
			System.out.println();

			System.out.println("🔹 Step " + step + ": Retrieving configured login credentials.");
			System.out.println();

			Data_Reader f = new Data_Reader();

			String Login_id = f.Data_Fetcher("Login_id");
			String Pass = f.Data_Fetcher("Pass");

			Report_Listen.log_print_in_report().pass("✅ Login credentials retrieved successfully without exposing credential values.");
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

			Report_Listen.log_print_in_report().info("──────────────────── 🔐 USER AUTHENTICATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Verify the Login page, enter the configured credentials and authenticate the user.");

			System.out.println("🔐 USER AUTHENTICATION");
			System.out.println();

			System.out.println("🔹 Step " + step + ": Verifying Login page.");
			System.out.println();

			lgin.Landed_in_Login_Page();

			Report_Listen.log_print_in_report().pass("✅ Login page verified successfully.");
			System.out.println("✅ Login page verified successfully.");
			System.out.println();

			step++;

			Report_Listen.log_print_in_report().info("<b>Action:</b> Enter the configured Login ID.");
			System.out.println("🔹 Step " + step + ": Entering configured Login ID.");
			System.out.println();

			lgin.id_field().sendKeys(Login_id);

			Report_Listen.log_print_in_report().pass("✅ Login ID entered successfully.");
			System.out.println("✅ Login ID entered successfully.");
			System.out.println();

			step++;

			Report_Listen.log_print_in_report().info("<b>Action:</b> Enter the configured Password.");
			System.out.println("🔹 Step " + step + ": Entering configured Password.");
			System.out.println();

			lgin.password_field().sendKeys(Pass);

			Report_Listen.log_print_in_report().pass("✅ Password entered successfully.");
			System.out.println("✅ Password entered successfully.");
			System.out.println();

			step++;

			Report_Listen.log_print_in_report().info("<b>Action:</b> Click the Login button.");
			System.out.println("🔹 Step " + step + ": Clicking the Login button.");
			System.out.println();

			lgin.Login_button().click();

			Report_Listen.log_print_in_report().pass("✅ Login button clicked successfully.");
			System.out.println("✅ Login button clicked successfully.");
			System.out.println();

			step++;

			Report_Listen.log_print_in_report().info("──────────────────── ✅ LOGIN SESSION VERIFICATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Verify successful authentication before attempting Logout.");

			System.out.println("✅ LOGIN SESSION VERIFICATION");
			System.out.println();

			System.out.println("🔹 Step " + step + ": Verifying successful login confirmation.");
			System.out.println();

			lgin.login_confirmation();

			Report_Listen.log_print_in_report().pass("✅ Authenticated application session established successfully.");
			System.out.println("✅ Authenticated application session established successfully.");
			System.out.println();

			step++;

			Report_Listen.log_print_in_report().info("──────────────────── 🚪 LOGOUT ACTION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Locate and click the Logout button to terminate the current application session.");

			System.out.println("🚪 LOGOUT ACTION");
			System.out.println();

			System.out.println("🔹 Step " + step + ": Clicking the Logout button.");
			System.out.println();

			lg.logout_button().click();

			Report_Listen.log_print_in_report().pass("✅ Logout button clicked successfully.");
			System.out.println("✅ Logout button clicked successfully.");
			System.out.println();

			step++;

			Report_Listen.log_print_in_report().info("──────────────────── ✅ LOGOUT RESULT VERIFICATION ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Verify that the authenticated user session has been terminated successfully.");

			System.out.println("✅ LOGOUT RESULT VERIFICATION");
			System.out.println();

			System.out.println("🔹 Step " + step + ": Verifying Logout confirmation.");
			System.out.println();

			lg.logout_confirmation();

			Report_Listen.log_print_in_report().pass("✅ Logout completed and logout confirmation was verified successfully.");
			System.out.println("✅ Logout completed and logout confirmation was verified successfully.");
			System.out.println();

		} catch(IOException e) {

			if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Logout flow failed. Failure reason: " + e.getMessage());

			System.out.println("❌ Logout flow failed.");
			System.out.println();

			System.out.println("❌ Failure reason: " + e.getMessage());
			System.out.println();

			throw e;

		} catch(RuntimeException e) {

			if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Logout flow failed. Failure reason: " + e.getMessage());

			System.out.println("❌ Logout flow failed.");
			System.out.println();

			System.out.println("❌ Failure reason: " + e.getMessage());
			System.out.println();

			throw e;
		}
	}
}
