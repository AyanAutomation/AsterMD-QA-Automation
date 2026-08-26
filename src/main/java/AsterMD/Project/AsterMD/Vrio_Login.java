package AsterMD.Project.AsterMD;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import Listerners.Report_Listen;
import Locaters.Vrio_Master_Locaters;
import Repeatative_codes.Repeat;

@Listeners(Report_Listen.class)
public class Vrio_Login extends Base {
	
public void Login_to_Vrio() throws Exception{
	
	Vrio_Master_Locaters p = new Vrio_Master_Locaters(d);
	Data_Reader f = new Data_Reader();
	Repeat rp = new Repeat(d);
	
	String Login_Id = f.Data_Fetcher("Vrio_Login_id");
	String Password = f.Data_Fetcher("Vrio_Pass");
	String Vrio_Url = f.Data_Fetcher("Vrio_Url");
	
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                       VRIO LOGIN");
	System.out.println("============================================================");
	
	Report_Listen.log_print_in_report().info("──────────────────── VRIO LOGIN ────────────────────");
	
	System.out.println("Action : Open Vrio Login Page");
	Report_Listen.log_print_in_report().info("Action: Open Vrio Login Page.");
	
	d.get(Vrio_Url);
	p.Landed_in_Login_Page();
	
	System.out.println("Result : PASS");
	System.out.println("Details: Vrio Login Page opened successfully.");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Vrio Login Page opened successfully.");
	
	System.out.println("---------------- LOGIN CREDENTIALS ----------------");
	System.out.println("Login ID : " + Login_Id);
	System.out.println("Password : ********");
	System.out.println();
	
	Report_Listen.log_print_in_report().info("Login ID: " + Login_Id);
	Report_Listen.log_print_in_report().info("Password: ********");
	
	System.out.println("Action : Enter Login ID");
	p.id_field().sendKeys(Login_Id);
	
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Login ID entered successfully.");
	
	System.out.println("Action : Enter Password");
	p.password_field().sendKeys(Password);
	
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Password entered successfully.");
	
	System.out.println("Action : Click Login Button");
	p.Login_button().click();
	
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Login button clicked successfully.");
	
	System.out.println("---------------- LOGIN RESULT ----------------");
	
	WebElement Login_Confirmation = p.login_confirmation;
	Boolean Login_Status = rp.check_element_visibility(Login_Confirmation, 5);
	
	if(Login_Status==true){
		
		System.out.println("Expected : User should login successfully");
		System.out.println("Actual   : Logged-in page displayed");
		System.out.println("Result   : PASS");
		System.out.println();
		
		Report_Listen.log_print_in_report().info("Expected: User should login successfully.");
		Report_Listen.log_print_in_report().info("Actual: Logged-in page displayed.");
		Report_Listen.log_print_in_report().pass("Result: PASS");
		
		System.out.println("---------------- LOGIN NOTIFICATION CHECK ----------------");
		
		WebElement Login_Toast = p.Success_Toast;
		Boolean Toast_Visibility = rp.check_element_visibility(Login_Toast, 2);
		
		if(Toast_Visibility==true){
			
			System.out.println("Result : Login notification displayed.");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Login notification displayed.");
			
			Vrio_Toast_Printer_closer(Login_Toast);
		}
		else{
			
			System.out.println("Result : Login notification was not displayed.");
			System.out.println("Action : Continue execution.");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Login notification was not displayed.");
			Report_Listen.log_print_in_report().info("Continuing execution because login toast is optional.");
		}
		
		System.out.println("============================================================");
		System.out.println("                  VRIO LOGIN COMPLETED");
		System.out.println("============================================================");
		System.out.println();
		
		Report_Listen.log_print_in_report().pass("──────────────────── VRIO LOGIN COMPLETED ────────────────────");
	}
	else{
		
		System.out.println("Expected : User should login successfully");
		System.out.println("Actual   : Logged-in page was not displayed");
		System.out.println("Result   : FAIL");
		System.out.println("Reason   : Login confirmation element was not visible.");
		System.out.println();
		
		Report_Listen.log_print_in_report().info("Expected: User should login successfully.");
		Report_Listen.log_print_in_report().info("Actual: Logged-in page was not displayed.");
		Report_Listen.log_print_in_report().fail("Result: FAIL");
		Report_Listen.log_print_in_report().fail("Reason: Login confirmation element was not visible.");
		
		throw new Exception("Vrio Login failed - Login confirmation element was not visible.");
	}
}


public void Vrio_Toast_Printer_closer(WebElement toast){

	Vrio_Master_Locaters p = new Vrio_Master_Locaters(d);
	Repeat rp = new Repeat(d);

	String Confirmation_Message_Text = toast.getText().trim();

	System.out.println();
	System.out.println("---------------- VRIO NOTIFICATION ----------------");
	System.out.println("Message : " + Confirmation_Message_Text);
	System.out.println("Result  : PASS");

	Report_Listen.log_print_in_report().info("──────────────────── VRIO NOTIFICATION ────────────────────");
	Report_Listen.log_print_in_report().info("Message: " + Confirmation_Message_Text);
	Report_Listen.log_print_in_report().pass("Result: PASS");

	System.out.println("Action  : Closing notification.");

	Report_Listen.log_print_in_report().info("Action: Closing notification.");

	p.Toast_Close_Button().click();
	rp.wait_for_invisibilty_of_theElement(toast);

	System.out.println("Result  : Notification closed successfully.");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Notification closed successfully.");
}

}
