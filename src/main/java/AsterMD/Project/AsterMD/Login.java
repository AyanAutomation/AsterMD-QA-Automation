package AsterMD.Project.AsterMD;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import Listerners.Report_Listen;
import Locaters.Login_Locaters;

@Listeners(Listerners.Report_Listen.class)
public class Login extends Base {

@Test
public void login() throws IOException {
	ExtentTest log = Report_Listen.log_print_in_report();
	int step = 1;

	log.info("Login Step " + step + ": Initializing login page locators.");
	System.out.println("🔹 Login Step " + step + ": Initializing login page locators.");

	Login_Locaters lg = new Login_Locaters(d);
	step++;

	log.info("Login Step " + step + ": Initializing Data Reader and retrieving configured login credentials.");
	System.out.println("🔹 Login Step " + step + ": Initializing Data Reader and retrieving configured login credentials.");

	Data_Reader f = new Data_Reader();
	String Login_id = f.Data_Fetcher("Login_id");
	String Pass = f.Data_Fetcher("Pass");

	log.pass("Login credentials retrieved successfully without exposing credential values in logs.");
	System.out.println("✅ Login credentials retrieved successfully.");
	step++;

	log.info("Login Step " + step + ": Navigating to the target application URL: " + Target_url);
	System.out.println("🔹 Login Step " + step + ": Navigating to the target application URL: " + Target_url);

	d.get(Target_url);
	step++;

	log.info("Login Step " + step + ": Verifying that the application has landed on the login page.");
	System.out.println("🔹 Login Step " + step + ": Verifying that the application has landed on the login page.");

	lg.Landed_in_Login_Page();

	log.pass("Application successfully landed on the login page.");
	System.out.println("✅ Application successfully landed on the login page.");
	step++;

	log.info("Login Step " + step + ": Entering the configured login ID.");
	System.out.println("🔹 Login Step " + step + ": Entering the configured login ID.");

	lg.id_field().sendKeys(Login_id);

	log.pass("Login ID entered successfully.");
	System.out.println("✅ Login ID entered successfully.");
	step++;

	log.info("Login Step " + step + ": Entering the configured password.");
	System.out.println("🔹 Login Step " + step + ": Entering the configured password.");

	lg.password_field().sendKeys(Pass);

	log.pass("Password entered successfully.");
	System.out.println("✅ Password entered successfully.");
	step++;

	log.info("Login Step " + step + ": Clicking the Login button.");
	System.out.println("🔹 Login Step " + step + ": Clicking the Login button.");

	lg.Login_button().click();
	step++;

	log.info("Login Step " + step + ": Verifying successful login confirmation.");
	System.out.println("🔹 Login Step " + step + ": Verifying successful login confirmation.");

	lg.login_confirmation();

	log.pass("Login completed and login confirmation was verified successfully.");
	System.out.println("✅ Login completed and login confirmation was verified successfully.");
}
}
