package Patient_Portal;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Listerners.Report_Listen;
import Locaters.Patient_Portal_Locaters;
import Repeatative_codes.Repeat;
import Store.Frontend_Store_Front;

public class Pateint_Portal extends Frontend_Store_Front{
	
	
	

public void Patient_Portal_Credentials_Setup_Via_Yopmail(String Patient_Email, String Patient_Password){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	if(!Patient_Email.endsWith("@yopmail.com")){
		throw new IllegalArgumentException("Patient email must use @yopmail.com: " + Patient_Email);
	}

	String Inbox_Name = Patient_Email.substring(0, Patient_Email.indexOf("@"));

	System.out.println();
	System.out.println("============================================================");
	System.out.println("               PATIENT PORTAL CREDENTIAL SETUP");
	System.out.println("============================================================");
	System.out.println("Patient Email : " + Patient_Email);

	Report_Listen.log_print_in_report().info("Starting Patient Portal credential setup through Yopmail for: " + Patient_Email);

	// Open Yopmail
	d.navigate().to("https://yopmail.com/en/");

	WebElement Inbox_Search = p.Yopmail_Inbox_Search();
	WebElement Open_Inbox = p.Yopmail_Open_Inbox();

	Inbox_Search.sendKeys(Inbox_Name);

	rp.movetoelement(Open_Inbox);
	Open_Inbox.click();

	System.out.println("---------------- YOPMAIL INBOX ----------------");
	System.out.println("Inbox : " + Patient_Email);

	// Refresh Inbox
	WebElement Refresh_Button = p.Yopmail_Refresh();

	rp.movetoelement(Refresh_Button);
	Refresh_Button.click();

	// Open Latest Email
	d.switchTo().frame(p.Yopmail_Inbox_Frame());

	WebElement First_Mail = p.Yopmail_First_Mail();

	rp.movetoelement(First_Mail);
	First_Mail.click();

	d.switchTo().defaultContent();

	// Read Password Setup Link
	d.switchTo().frame(p.Yopmail_Message_Frame());

	WebElement Mail_Body = p.Yopmail_Message_Body();
	String Email_Content = Mail_Body.getText();

	Matcher Reset_Link = Pattern.compile("https://patient-care\\.trackease\\.net/set-password\\?token=[A-Za-z0-9._~-]+").matcher(Email_Content);

	if(!Reset_Link.find()){

		Report_Listen.log_print_in_report().fail("Password setup link not found for: " + Patient_Email);

		throw new IllegalStateException("Password setup link not found in the latest email for: " + Patient_Email);
	}

	String Password_Setup_URL = Reset_Link.group();

	System.out.println("Email      : Account Created");
	System.out.println("Setup Link : Retrieved successfully");
	System.out.println("Result     : PASS");

	Report_Listen.log_print_in_report().pass("Patient Portal credential setup link retrieved successfully.");

	// Configure Patient Credentials
	d.switchTo().defaultContent();
	d.navigate().to(Password_Setup_URL);

	WebElement Password_Field = p.Portal_Password();
	WebElement Confirm_Password_Field = p.Portal_Confirm_Password();

	Password_Field.sendKeys(Patient_Password);
	Confirm_Password_Field.sendKeys(Patient_Password);

	WebElement Continue_Button = p.Portal_Continue_Button();

	rp.movetoelement(Continue_Button);
	Continue_Button.click();

	// Verify Patient Portal Login Page
	p.Portal_Login_Title();

	System.out.println("---------------- CREDENTIAL SETUP ----------------");
	System.out.println("Password : Configured");
	System.out.println("Login    : Page displayed");
	System.out.println("Result   : PASS");

	Report_Listen.log_print_in_report().pass("Patient Portal credentials configured successfully for: " + Patient_Email);
}

	




@Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
public void Patient_Portal_Login(TreeMap<String, String> Product_data){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Patient_Email = Product_data.get("Email");
	String Patient_Name = Product_data.get("First Name") + " " + Product_data.get("Last Name");
	String Product_Name = Product_data.get("Product Name");
	String Patient_Password = Product_data.get("Patient Password");;

	if(Patient_Password == null || Patient_Password.isBlank()){
		throw new IllegalStateException("ASTERMD_TEST_PATIENT_PASSWORD environment variable is not configured.");
	}

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                   PATIENT PORTAL LOGIN");
	System.out.println("============================================================");
	System.out.println("Patient Name  : " + Patient_Name);
	System.out.println("Patient Email : " + Patient_Email);
	System.out.println("Product       : " + Product_Name);

	Report_Listen.log_print_in_report().info("Starting Patient Portal Login for: " + Patient_Email);

	// Setup Patient Credentials through Yopmail
	Patient_Portal_Credentials_Setup_Via_Yopmail(Patient_Email, Patient_Password);

	// Patient Portal Login Elements
	WebElement Login_Title = p.Portal_Login_Title();
	WebElement Email_Field = p.Portal_Email();
	WebElement Password_Field = p.Portal_Password();
	WebElement Login_Button = p.Portal_Continue_Button();

	// Login to Patient Portal
	Email_Field.sendKeys(Patient_Email);
	Password_Field.sendKeys(Patient_Password);

	rp.movetoelement(Login_Button);
	Login_Button.click();

	rp.wait_for_invisibilty_of_theElement(Login_Title);

	System.out.println("---------------- LOGIN RESULT ----------------");
	System.out.println("Patient Name  : " + Patient_Name);
	System.out.println("Patient Email : " + Patient_Email);
	System.out.println("Login Form    : Submitted");
	System.out.println("Sign-in Page  : Closed");
	System.out.println("Result        : LOGIN NAVIGATION COMPLETED");

	Report_Listen.log_print_in_report().info("Patient Portal sign-in form submitted and login page closed for: " + Patient_Email);
}


	
	
	

}
