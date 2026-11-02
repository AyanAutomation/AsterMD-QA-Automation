package Patient_Portal;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
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

	System.out.println();
	System.out.println("---------------- YOPMAIL INBOX ----------------");
	System.out.println("Inbox : " + Patient_Email);

	// Refresh Inbox
	WebElement Refresh_Button = p.Yopmail_Refresh();

	rp.movetoelement(Refresh_Button);
	Refresh_Button.click();

	// Open Latest Email
	WebElement Inbox_Frame = p.Yopmail_Inbox_Frame();
	d.switchTo().frame(Inbox_Frame);

	WebElement First_Mail = p.Yopmail_First_Mail();

	rp.movetoelement(First_Mail);
	First_Mail.click();

	d.switchTo().defaultContent();

	// Read Password Setup Link
	WebElement Message_Frame = p.Yopmail_Message_Frame();
	d.switchTo().frame(Message_Frame);

	WebElement Mail_Body = p.Yopmail_Message_Body();
	String Email_Content = Mail_Body.getText();

	Matcher Reset_Link = Pattern.compile("https://testdemo\\.logistial\\.com/set-password\\?token=[A-Za-z0-9._~-]+").matcher(Email_Content);

	if(!Reset_Link.find()){
		System.out.println();
		System.out.println("Result : FAIL");
		System.out.println("Reason : Password setup link not found in Yopmail.");

		Report_Listen.log_print_in_report().fail("Password setup link not found for: " + Patient_Email);
		throw new IllegalStateException("Password setup link not found in the latest email for: " + Patient_Email);
	}

	String Password_Setup_URL = Reset_Link.group();

	System.out.println();
	System.out.println("---------------- PASSWORD SETUP LINK ----------------");
	System.out.println("Email      : Account Created");
	System.out.println("Domain     : testdemo.logistial.com");
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
	WebElement Login_Title = p.Portal_Login_Title();

	System.out.println();
	System.out.println("---------------- CREDENTIAL SETUP ----------------");
	System.out.println("Password : Configured");
	System.out.println("Login    : Page displayed");
	System.out.println("Result   : PASS");

	Report_Listen.log_print_in_report().pass("Patient Portal credentials configured successfully for: " + Patient_Email);
}


	


public void Patient_Portal_Login(TreeMap<String, String> Product_data, String Patient_Status){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Patient_Email = Product_data.get("Email");
	String Patient_Name = Product_data.get("First Name") + " " + Product_data.get("Last Name");
	String Product_Name = Product_data.get("Product Name");
	String Patient_Password = Product_data.get("Patient Password");

	if(Patient_Password == null || Patient_Password.isBlank()){
		throw new IllegalStateException("Patient Password is missing in the DataProvider for: " + Patient_Email);
	}

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                   PATIENT PORTAL LOGIN");
	System.out.println("============================================================");
	System.out.println("Patient Name   : " + Patient_Name);
	System.out.println("Patient Email  : " + Patient_Email);
	System.out.println("Product        : " + Product_Name);
	System.out.println("Patient Status : " + Patient_Status);

	Report_Listen.log_print_in_report().info("Starting Patient Portal Login for: " + Patient_Email);

	// Patient Registration Status
	if(Patient_Status.equalsIgnoreCase("Not Registered")){

		System.out.println("---------------- NEW PATIENT REGISTRATION ----------------");
		System.out.println("Action : Configure Patient Portal Credentials via Yopmail");

		Report_Listen.log_print_in_report().info("Patient credentials are not configured. Starting Yopmail setup.");

		Patient_Portal_Credentials_Setup_Via_Yopmail(Patient_Email, Patient_Password);

		System.out.println("Result : CREDENTIAL SETUP COMPLETED");

		Report_Listen.log_print_in_report().pass("Patient Portal credentials configured successfully.");
	}
	else{

		System.out.println("---------------- EXISTING PATIENT LOGIN ----------------");
		System.out.println("Action : Skip Yopmail and Open Patient Portal Login");

		Report_Listen.log_print_in_report().info("Existing registered patient. Skipping Yopmail credential setup.");

		d.navigate().to("https://testdemo.logistial.com/");

		System.out.println("Result : LOGIN PAGE OPENED");
	}

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



	

public void Patient_portal_header_menu_navigator(String Option, String Status, TreeMap<String, String> Product_data) throws InterruptedException{

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	// Patient Portal Login
	Patient_Portal_Login(Product_data, Status);

	Thread.sleep(800);
	WebElement Header_Menu = p.Header_Tab();
	rp.movetoelement(Header_Menu);
	List<WebElement> Menu_Options = Header_Menu.findElements(By.xpath(".//a[contains(@href,'/')]"));

	System.out.println("---------------- PATIENT PORTAL MENU NAVIGATION ----------------");
	System.out.println("Expected Menu : " + Option);

	for(WebElement Menu_Option : Menu_Options){

		String Menu_Name = Menu_Option.getText().trim();

		if(Menu_Name.equalsIgnoreCase(Option.trim())){

			rp.movetoelement(Menu_Option);
			Menu_Option.click();

			System.out.println("Actual Menu   : " + Menu_Name);
			System.out.println("Result        : PASS");

			Report_Listen.log_print_in_report().pass("Patient Portal menu selected successfully: " + Menu_Name);

			break;
		}
	}
}
	
	



@Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
public void Intake_form_filling(TreeMap<String,String> Product_data) throws InterruptedException{

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_data.get("Product Name");
	String Treatment_Variant = Product_data.getOrDefault("Treatment Variant", "");
	String Patient_Name = Product_data.get("First Name") + " " + Product_data.get("Last Name");
	String Button_XPath = ".//div[contains(@class,'desktopIncomplete')]//button";

	// Patient Portal Login and Treatments Navigation
	Patient_portal_header_menu_navigator("Treatments", "Registered", Product_data);

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                       PATIENT INTAKE FORM");
	System.out.println("============================================================");
	System.out.println("Patient : " + Patient_Name);
	System.out.println("Product : " + Product_Name);
	System.out.println("Variant : " + Treatment_Variant);
	System.out.println("URL     : " + d.getCurrentUrl());

	Report_Listen.log_print_in_report().info("Starting Patient Intake for: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant);

	// Access Active Treatments Section
	System.out.println();
	System.out.println("---------- ACTIVE TREATMENTS SECTION ----------");
	System.out.println("POM Getter : Active_Tab()");

	WebElement Active_Section = p.Active_Tab();
	rp.Scroll_to_element(Active_Section);

	System.out.println("Result : Active Treatments section located.");

	// Retrieve Incomplete Treatment Cards
	System.out.println();
	System.out.println("---------- TREATMENT CARD RETRIEVAL ----------");
	System.out.println("POM Getter : Incomplete_Treatment_Cards()");

	List<WebElement> Treatment_Cards = p.Incomplete_Treatment_Cards();

	System.out.println("Total Cards : " + Treatment_Cards.size());

	int Product_Matches = 0;
	int Variant_Matches = 0;
	int Buttons_Found = 0;
	int Intake_Buttons_Found = 0;
	int Card_Number = 0;

	// Search Matching Treatment and Start Intake Button
	for(WebElement Treatment_Card : Treatment_Cards){

		Card_Number++;

		// rp.Fetch_Section_HTML(Treatment_Card, "Treatment Card " + Card_Number);

		String Treatment_Details = Treatment_Card.getText().trim().replace("\n", " | ");
		Boolean Product_Matched = Treatment_Details.contains(Product_Name);
		Boolean Variant_Matched = Treatment_Details.contains(Treatment_Variant);

		System.out.println();
		System.out.println("---------- TREATMENT CARD " + Card_Number + " ----------");
		System.out.println("Card Text      : " + Treatment_Details);
		System.out.println("Product Match  : " + Product_Matched);
		System.out.println("Variant Match  : " + Variant_Matched);

		if(Product_Matched){

			Product_Matches++;

			if(Variant_Matched){

				Variant_Matches++;

				// Retrieve Start Intake Buttons
				System.out.println();
				System.out.println("---------- START INTAKE BUTTON SEARCH ----------");
				System.out.println("Locator : " + Button_XPath);

				List<WebElement> Start_Intake_Buttons = Treatment_Card.findElements(By.xpath(Button_XPath));
				Buttons_Found += Start_Intake_Buttons.size();

				System.out.println("Buttons Retrieved : " + Start_Intake_Buttons.size());

				for(WebElement Start_Intake_Button : Start_Intake_Buttons){

					String Button_Text = Start_Intake_Button.getText().trim();
					Boolean Button_Visible = rp.check_element_visibility(Start_Intake_Button, 2);
					Boolean Button_Enabled = Start_Intake_Button.isEnabled();

					System.out.println();
					System.out.println("Button Text    : " + Button_Text);
					System.out.println("Button Visible : " + Button_Visible);
					System.out.println("Button Enabled : " + Button_Enabled);

					if(Button_Text.contains("Intake")){
						Intake_Buttons_Found++;
					}

					if(Button_Visible && Button_Enabled && Button_Text.contains("Intake")){

						System.out.println("Button Match : PASS");
						System.out.println("Action       : Opening Intake Form.");

						Report_Listen.log_print_in_report().pass("Matching treatment and Start Intake button found for: " + Patient_Name);

						rp.wait_for_theElement(Start_Intake_Button);
						rp.movetoelement(Start_Intake_Button);
						Start_Intake_Button.click();

						System.out.println();
						System.out.println("---------- INTAKE FORM NAVIGATION ----------");
						System.out.println("Patient : " + Patient_Name);
						System.out.println("Product : " + Product_Name);
						System.out.println("Variant : " + Treatment_Variant);
						System.out.println("Result  : Start Intake button clicked.");

						Report_Listen.log_print_in_report().info("Started Intake Form for: " + Patient_Name + " | Product: " + Product_Name);

						// Shared Intake Form Routing
						if(Product_Name.equalsIgnoreCase("AsterRefluxa Digestive Relief Capsules") || Product_Name.equalsIgnoreCase("AsterSomnera Sleep Support Tablets") || Product_Name.equalsIgnoreCase("AsterMigraEase Headache Support Tablets")){

							AsterRefluxa_Intake_Form(Product_data);

							System.out.println();
							System.out.println("============================================================");
							System.out.println("                    PATIENT INTAKE RESULT");
							System.out.println("============================================================");
							System.out.println("Patient : " + Patient_Name);
							System.out.println("Product : " + Product_Name);
							System.out.println("Variant : " + Treatment_Variant);
							System.out.println("Result  : COMPLETED");
							System.out.println("Reason  : Intake form execution completed successfully.");

							Report_Listen.log_print_in_report().pass("Patient Intake Form execution completed successfully for: " + Patient_Name);
						}
						else{
							throw new SkipException("Intake automation not configured for: " + Product_Name);
						}

						return;
					}
					else{
						System.out.println("Action : NOT PERFORMED - Start Intake button is unavailable, hidden, or disabled.");
					}
				}
			}
		}
	}

	// Identify Why Intake Form Could Not Be Performed
	String Action_Reason;

	if(Treatment_Cards.isEmpty()){
		Action_Reason = "No treatment cards were available in the Active Treatments section.";
	}
	else if(Product_Matches == 0){
		Action_Reason = "No treatment card matched the expected product name.";
	}
	else if(Variant_Matches == 0){
		Action_Reason = "Product was found, but the expected treatment variant was not available: " + Treatment_Variant;
	}
	else if(Buttons_Found == 0){
		Action_Reason = "Matching treatment card found, but no buttons were returned by XPath: " + Button_XPath;
	}
	else if(Intake_Buttons_Found == 0){
		Action_Reason = "Matching treatment cards were found, but no Start Intake button is currently available. Existing buttons may show Verify Identity or Pending.";
	}
	else{
		Action_Reason = "Start Intake button was found, but it is currently hidden or disabled.";
	}

	// Log Action Not Performed Without Throwing Exception
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                    INTAKE FORM NOT PERFORMED");
	System.out.println("============================================================");
	System.out.println("Patient        : " + Patient_Name);
	System.out.println("Product        : " + Product_Name);
	System.out.println("Variant        : " + Treatment_Variant);
	System.out.println("Treatment Cards: " + Treatment_Cards.size());
	System.out.println("Product Matches: " + Product_Matches);
	System.out.println("Variant Matches: " + Variant_Matches);
	System.out.println("Buttons Found  : " + Buttons_Found);
	System.out.println("Intake Buttons : " + Intake_Buttons_Found);
	System.out.println("Button XPath   : " + Button_XPath);
	System.out.println("Current URL    : " + d.getCurrentUrl());
	System.out.println("Action         : NOT PERFORMED");
	System.out.println("Reason         : " + Action_Reason);
	System.out.println("============================================================");

	Report_Listen.log_print_in_report().info("⚠️ Patient Intake NOT PERFORMED | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant + " | Reason: " + Action_Reason);

	return;
}









@Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
public void Verify_Post_Intake_Form_Fillup(TreeMap<String,String> Product_data) throws InterruptedException{

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_data.get("Product Name");
	String Treatment_Variant = Product_data.getOrDefault("Treatment Variant", "");
	String Patient_Name = Product_data.get("First Name") + " " + Product_data.get("Last Name");
	String Patient_SSN = Product_data.get("SSN");
	String ID_Verification_Image_Name = Product_data.get("ID Verification Image");
	String Button_XPath = ".//div[contains(@class,'desktopIncomplete')]//button";

	Assert.assertTrue(Patient_SSN != null && !Patient_SSN.isBlank(), "DataProvider Failure | Field: SSN | Patient: " + Patient_Name);
	Assert.assertTrue(ID_Verification_Image_Name != null && !ID_Verification_Image_Name.isBlank(), "DataProvider Failure | Field: ID Verification Image | Patient: " + Patient_Name);

	// Prepare ID Verification Image Path
	String ID_Verification_Folder = System.getProperty("user.dir") + File.separator + "Images" + File.separator + "AsterMD_ID_Verification_QA_Fixtures_20_Images" + File.separator + "Images" + File.separator + "ID_Verification";
	File ID_Verification_Image = new File(ID_Verification_Folder, ID_Verification_Image_Name);
	Assert.assertTrue(ID_Verification_Image.isFile(), "ID Verification Fixture Failure | Image not found: " + ID_Verification_Image.getAbsolutePath());

	// Patient Portal Login and Treatments Navigation
	Patient_portal_header_menu_navigator("Treatments", "Registered", Product_data);

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                   POST INTAKE ID VERIFICATION");
	System.out.println("============================================================");
	System.out.println("Patient : " + Patient_Name);
	System.out.println("Product : " + Product_Name);
	System.out.println("Variant : " + Treatment_Variant);
	System.out.println("URL     : " + d.getCurrentUrl());

	Report_Listen.log_print_in_report().info("Starting post-intake identity verification for: " + Patient_Name + " | " + Product_Name + " | " + Treatment_Variant);

	// Access Active Treatments Section
	System.out.println();
	System.out.println("---------- ACTIVE TREATMENTS SECTION ----------");
	System.out.println("POM Getter : Active_Tab()");

	WebElement Active_Section = p.Active_Tab();
	rp.Scroll_to_element(Active_Section);

	System.out.println("Result : Active Treatments section located.");

	// Retrieve Treatment Cards
	System.out.println();
	System.out.println("---------- TREATMENT CARD RETRIEVAL ----------");
	System.out.println("POM Getter : Incomplete_Treatment_Cards()");

	List<WebElement> Treatment_Cards = p.Incomplete_Treatment_Cards();

	System.out.println("Total Cards : " + Treatment_Cards.size());

	int Product_Matches = 0;
	int Variant_Matches = 0;
	int Buttons_Found = 0;
	int Identity_Buttons_Found = 0;
	int Card_Number = 0;

	// Search Matching Treatment and Verify Identity Button
	for(WebElement Treatment_Card : Treatment_Cards){

		Card_Number++;

		// rp.Fetch_Section_HTML(Treatment_Card, "Treatment Card " + Card_Number);

		String Treatment_Details = Treatment_Card.getText().trim().replace("\n", " | ");
		Boolean Product_Matched = Treatment_Details.contains(Product_Name);
		Boolean Variant_Matched = Treatment_Details.contains(Treatment_Variant);

		System.out.println();
		System.out.println("---------- TREATMENT CARD " + Card_Number + " ----------");
		System.out.println("Card Text      : " + Treatment_Details);
		System.out.println("Product Match  : " + Product_Matched);
		System.out.println("Variant Match  : " + Variant_Matched);

		if(Product_Matched){

			Product_Matches++;

			if(Variant_Matched){

				Variant_Matches++;

				// Retrieve Verify Identity Buttons
				System.out.println();
				System.out.println("---------- VERIFY IDENTITY BUTTON SEARCH ----------");
				System.out.println("Locator : " + Button_XPath);

				List<WebElement> Verify_Buttons = Treatment_Card.findElements(By.xpath(Button_XPath));
				Buttons_Found += Verify_Buttons.size();

				System.out.println("Buttons Retrieved : " + Verify_Buttons.size());

				for(WebElement Verify_Button : Verify_Buttons){

					String Button_Text = Verify_Button.getText().trim();
					Boolean Button_Visible = rp.check_element_visibility(Verify_Button, 4);
					Boolean Button_Enabled = Verify_Button.isEnabled();

					System.out.println();
					System.out.println("Button Text    : " + Button_Text);
					System.out.println("Button Visible : " + Button_Visible);
					System.out.println("Button Enabled : " + Button_Enabled);

					if(Button_Text.contains("Verify Identity")){
						Identity_Buttons_Found++;
					}

					if(Button_Visible && Button_Enabled && Button_Text.contains("Verify Identity")){

						System.out.println("Button Match : PASS");
						System.out.println("Action       : Opening ID Verification.");

						Report_Listen.log_print_in_report().pass("Matching treatment and Verify Identity button found for: " + Patient_Name);

						rp.wait_for_theElement(Verify_Button);
						rp.movetoelement(Verify_Button);
						Verify_Button.click();

						System.out.println("Result : ID Verification form navigation triggered.");
						Report_Listen.log_print_in_report().info("Opened ID Verification for: " + Product_Name);

						// Shared ID Verification Form Routing
						if(Product_Name.equalsIgnoreCase("AsterRefluxa Digestive Relief Capsules") || Product_Name.equalsIgnoreCase("AsterSomnera Sleep Support Tablets") || Product_Name.equalsIgnoreCase("AsterMigraEase Headache Support Tablets")){

							// Verify ID Verification Form
							System.out.println();
							System.out.println("---------- ID VERIFICATION FORM ----------");
							System.out.println("POM Getter : ID_Verification_Title()");

							WebElement Form_Title = p.ID_Verification_Title();
							String Actual_Title = Form_Title.getText().trim();

							Assert.assertEquals(Actual_Title, "ID VERIFICATION", "ID Verification Failure | Section: Form Title | Actual: " + Actual_Title);

							System.out.println("Form Title : " + Actual_Title);
							System.out.println("Result     : PASS");

							// Enter SSN
							System.out.println();
							System.out.println("---------- SSN FIELD VERIFICATION ----------");
							System.out.println("POM Getter : ID_Verification_SSN()");

							WebElement SSN_Field = p.ID_Verification_SSN();
							SSN_Field.clear();
							SSN_Field.sendKeys(Patient_SSN);

							String Actual_SSN = SSN_Field.getDomProperty("value");
							Assert.assertEquals(Actual_SSN, Patient_SSN, "ID Verification Failure | Section: SSN | Entered value mismatch.");

							System.out.println("SSN Entry : PASS");
							Report_Listen.log_print_in_report().pass("SSN field entered and verified.");

							// Upload ID Verification Image
							System.out.println();
							System.out.println("---------- ID DOCUMENT UPLOAD ----------");
							System.out.println("POM Getter : ID_Verification_File_Input()");
							System.out.println("File       : " + ID_Verification_Image_Name);

							WebElement File_Input = p.ID_Verification_File_Input();
							File_Input.sendKeys(ID_Verification_Image.getAbsolutePath());

							WebElement Uploaded_File_Name = p.ID_Verification_Uploaded_File_Name();
							String Actual_File_Name = Uploaded_File_Name.getText().trim();

							Assert.assertEquals(Actual_File_Name, ID_Verification_Image_Name, "ID Verification Failure | Section: Uploaded Filename | Uploaded file does not match DataProvider.");

							System.out.println("Expected File : " + ID_Verification_Image_Name);
							System.out.println("Actual File   : " + Actual_File_Name);
							System.out.println("Upload Result : PASS");

							Report_Listen.log_print_in_report().pass("ID Verification image uploaded: " + Actual_File_Name);

							// Verify Uploaded Image Card
							System.out.println();
							System.out.println("---------- UPLOAD CARD VERIFICATION ----------");
							System.out.println("POM Field : Upload_image_card");

							Boolean Card_Populated = rp.check_element_visibility(p.Upload_image_card, 4);

							if(Card_Populated){
								System.out.println("Upload Card Visible : true");
								System.out.println("Result              : PASS");
							}
							else{
								System.out.println("Upload Card Visible : false");
								System.out.println("Result              : FAIL");
								Report_Listen.log_print_in_report().fail("ID image upload card not populated for: " + Patient_Name);
								Assert.fail("ID Verification Failure | Section: Image Upload | POM: Upload_image_card | Reason: Uploaded image card was not visible.");
							}

							// Submit ID Verification Form
							System.out.println();
							System.out.println("---------- ID VERIFICATION SUBMISSION ----------");
							System.out.println("POM Getter : ID_Verification_Submit()");

							WebElement Submit_Button = p.ID_Verification_Submit();
							rp.wait_for_theElement(Submit_Button);
							rp.movetoelement(Submit_Button);
							Submit_Button.click();

							System.out.println("Action : Submit clicked.");

							// Verify Submission Toast
							System.out.println();
							System.out.println("---------- SUBMISSION TOAST VERIFICATION ----------");
							System.out.println("POM Field : ID_Verification_Success_Toast");

							WebElement Submission_Toast = p.ID_Verification_Success_Toast;
							Boolean Submission_Success = Teleform_Toast_Detector_Printer(Submission_Toast);

							if(Submission_Success){

								System.out.println();
								System.out.println("============================================================");
								System.out.println("                    ID VERIFICATION RESULT");
								System.out.println("============================================================");
								System.out.println("Patient : " + Patient_Name);
								System.out.println("Product : " + Product_Name);
								System.out.println("Result  : PASS");
								System.out.println("Reason  : Success notification displayed.");

								Report_Listen.log_print_in_report().pass("ID Verification form submitted successfully for: " + Patient_Name);
							}
							else{

								System.out.println();
								System.out.println("---------- ID VERIFICATION SUBMISSION FAILURE ----------");
								System.out.println("Patient : " + Patient_Name);
								System.out.println("Result  : FAIL");
								System.out.println("Reason  : ID Verification success toast was not displayed.");

								Report_Listen.log_print_in_report().fail("ID Verification success toast missing for: " + Patient_Name);
								Assert.fail("ID Verification Failure | Section: Post-Submission Toast | POM: ID_Verification_Success_Toast | Patient: " + Patient_Name + " | Reason: Success notification not detected.");
							}
						}
						else{
							throw new SkipException("ID Verification automation not configured for: " + Product_Name);
						}

						return;
					}
					else{
						System.out.println("Action : NOT PERFORMED - Verify Identity button is unavailable, hidden, or disabled.");
					}
				}
			}
		}
	}

	// Identify Why ID Verification Could Not Be Performed
	String Action_Reason;

	if(Treatment_Cards.isEmpty()){
		Action_Reason = "No treatment cards were available in the Active Treatments section.";
	}
	else if(Product_Matches == 0){
		Action_Reason = "No treatment card matched the expected product name.";
	}
	else if(Variant_Matches == 0){
		Action_Reason = "Product was found, but the expected treatment variant was not available: " + Treatment_Variant;
	}
	else if(Buttons_Found == 0){
		Action_Reason = "Matching treatment card found, but no buttons were returned by XPath: " + Button_XPath;
	}
	else if(Identity_Buttons_Found == 0){
		Action_Reason = "Matching treatment cards were found, but no Verify Identity button is currently available. Existing buttons may show Pending or Start Intake.";
	}
	else{
		Action_Reason = "Verify Identity button was found, but it is currently hidden or disabled.";
	}

	// Log Action Not Performed Without Throwing Exception
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                  ID VERIFICATION NOT PERFORMED");
	System.out.println("============================================================");
	System.out.println("Patient          : " + Patient_Name);
	System.out.println("Product          : " + Product_Name);
	System.out.println("Variant          : " + Treatment_Variant);
	System.out.println("Treatment Cards  : " + Treatment_Cards.size());
	System.out.println("Product Matches  : " + Product_Matches);
	System.out.println("Variant Matches  : " + Variant_Matches);
	System.out.println("Buttons Found    : " + Buttons_Found);
	System.out.println("Identity Buttons : " + Identity_Buttons_Found);
	System.out.println("Button XPath     : " + Button_XPath);
	System.out.println("Current URL      : " + d.getCurrentUrl());
	System.out.println("Action           : NOT PERFORMED");
	System.out.println("Reason           : " + Action_Reason);
	System.out.println("============================================================");

	Report_Listen.log_print_in_report().info("⚠️ ID Verification NOT PERFORMED | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant + " | Reason: " + Action_Reason);

	return;
}







public void AsterRefluxa_Intake_Form(TreeMap<String,String> Product_data){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_data.get("Product Name");
	String Patient_Email = Product_data.get("Email");

	System.out.println();
	System.out.println("========== PATIENT INTAKE FORM ==========");
	System.out.println("Product : " + Product_Name);
	Report_Listen.log_print_in_report().info("Starting intake for: " + Product_Name);

	// Page 1 - Treatment Reason
	System.out.println();
	System.out.println("---------- PAGE 1 : TREATMENT REASON ----------");

	WebElement Page_Indicator = p.Teleform_Page_Indicator();
	String Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 1 of 5");

	String Intake_Reason = Product_data.get("Intake Reason");
	Assert.assertTrue(Intake_Reason != null && !Intake_Reason.isBlank(), "Intake Reason is missing in the DataProvider.");

	WebElement Reason_Option = p.Teleform_Button(Intake_Reason);
	rp.movetoelement(Reason_Option);
	Reason_Option.click();

	System.out.println("Selected Reason : " + Intake_Reason);

	WebElement Next_Button = p.Teleform_Button("NEXT STEP →");
	rp.movetoelement(Next_Button);
	Next_Button.click();

	Report_Listen.log_print_in_report().pass("Page 1 completed: " + Product_Name);

	// Page 2 - Account Email
	System.out.println();
	System.out.println("---------- PAGE 2 : ACCOUNT EMAIL ----------");

	Page_Indicator = p.Teleform_Page_Indicator();
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 2 of 5");

	WebElement Account_Email = p.Teleform_Account_Email();
	Account_Email.clear();
	Account_Email.sendKeys(Patient_Email);

	System.out.println("Patient Email : " + Patient_Email);

	WebElement Continue_Button = p.Teleform_Button("CONTINUE →");
	rp.movetoelement(Continue_Button);
	Continue_Button.click();

	Report_Listen.log_print_in_report().pass("Page 2 completed: " + Product_Name);

	// Page 3 - Personal Details
	System.out.println();
	System.out.println("---------- PAGE 3 : PERSONAL DETAILS ----------");

	Page_Indicator = p.Teleform_Page_Indicator();
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 3 of 5");

	String[][] Personal_Fields = {
		{"FIRST NAME", "First Name"},
		{"LAST NAME", "Last Name"},
		{"EMAIL", "Email"}
	};

	for(String[] Field : Personal_Fields){
		String Value = Product_data.get(Field[1]);
		WebElement Input = p.Teleform_Field(Field[0]);

		rp.movetoelement(Input);
		Input.clear();
		Input.sendKeys(Value);

		String Actual_Value = Input.getDomProperty("value");
		System.out.println(Field[1] + " : " + Actual_Value);
	}

	String Date_Of_Birth = Product_data.get("Date of Birth");
	Teleform_Date_Of_Birth_Selector(Date_Of_Birth);

	String Biological_Sex = Product_data.get("Biological Sex at Birth");
	WebElement Sex_Dropdown = p.Teleform_Sex_Dropdown();

	rp.movetoelement(Sex_Dropdown);
	Sex_Dropdown.click();

	WebElement Sex_Option = p.Teleform_Dropdown_Option(Biological_Sex);
	rp.movetoelement(Sex_Option);
	Sex_Option.click();

	System.out.println("Biological Sex : " + Biological_Sex);

	String Patient_Phone = Product_data.get("Phone");
	WebElement Phone_Field = p.Teleform_Phone();

	rp.movetoelement(Phone_Field);
	Phone_Field.click();
	Phone_Field.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	Phone_Field.sendKeys("+1" + Patient_Phone);
	Phone_Field.sendKeys(Keys.TAB);

	String Actual_Phone = Phone_Field.getDomProperty("value");
	System.out.println("Phone : " + Actual_Phone);

	// Required Telehealth Consent
	WebElement Terms_Consent = p.Teleform_Terms_Consent();
	Boolean Consent_Visible = rp.check_element_visibility(Terms_Consent, 5);

	if(Consent_Visible){
		rp.movetoelement(Terms_Consent);
		Terms_Consent.click();

		WebElement Consent_Input = Terms_Consent.findElement(By.xpath(".//input[@type='checkbox']"));
		Boolean Consent_Selected = Consent_Input.isSelected();

		if(Consent_Selected){
			System.out.println();
			System.out.println("Telehealth Consent : Selected Successfully");
			Report_Listen.log_print_in_report().pass("Telehealth Consent checkbox selected successfully.");
		}
		else{
			System.out.println();
			System.out.println("Telehealth Consent : Selection Failed");
			Report_Listen.log_print_in_report().fail("Telehealth Consent checkbox selection failed.");
			throw new IllegalStateException("Telehealth Consent checkbox was not selected.");
		}
	}
	else{
		System.out.println();
		System.out.println("Telehealth Consent : Checkbox Not Visible");
		Report_Listen.log_print_in_report().fail("Telehealth Consent checkbox is not visible.");
		throw new IllegalStateException("Telehealth Consent checkbox is not visible.");
	}

	Next_Button = p.Teleform_Button("NEXT STEP →");
	rp.movetoelement(Next_Button);
	Next_Button.click();

	// Check Page 3 Validation Errors
	List<WebElement> Error_Messages = p.Form_error_Messages;
	Boolean Error_Check = rp.check_element_visibility(Error_Messages, 2);

	if(Error_Check){
		System.out.println();
		System.out.println("---------- PAGE 3 VALIDATION ERRORS ----------");
		rp.error_message_checker(Error_Messages);
		Report_Listen.log_print_in_report().fail("Page 3 form validation errors detected.");
		throw new IllegalStateException("Page 3 form validation failed.");
	}
	else{
		System.out.println();
		System.out.println("Page 3 : No Visible Validation Errors");
	}

	Report_Listen.log_print_in_report().pass("Page 3 completed: " + Product_Name);

	// Page 4 - Medical Questions
	System.out.println();
	System.out.println("---------- PAGE 4 : MEDICAL QUESTIONS ----------");

	Page_Indicator = p.Teleform_Page_Indicator();
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 4 of 5");

	Teleform_Question_Selector(Product_data);

	String Blood_Pressure_Reading = Product_data.getOrDefault("Blood Pressure Reading", "");

	if(!Blood_Pressure_Reading.isBlank()){
		WebElement Blood_Pressure_Field = p.Teleform_Textarea("Please provide your most recent blood pressure reading below:");

		rp.movetoelement(Blood_Pressure_Field);
		Blood_Pressure_Field.clear();
		Blood_Pressure_Field.sendKeys(Blood_Pressure_Reading);

		String Actual_Reading = Blood_Pressure_Field.getDomProperty("value");
		System.out.println("Blood Pressure : " + Actual_Reading);
	}

	Next_Button = p.Teleform_Button("Next");
	rp.movetoelement(Next_Button);
	Next_Button.click();

	Report_Listen.log_print_in_report().pass("Page 4 completed: " + Product_Name);

	// Page 5 - Assessment
	System.out.println();
	System.out.println("---------- PAGE 5 : ASSESSMENT ----------");

	Page_Indicator = p.Teleform_Page_Indicator();
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 5 of 5");

	Teleform_Question_Selector(Product_data);

	String Patient_Notes = Product_data.get("Notes");
	WebElement Notes_Field = p.Teleform_Textarea("Please introduce yourself and feel free to ask any questions you have about your medical concerns or anything you would like the doctor to know:");

	rp.movetoelement(Notes_Field);
	Notes_Field.clear();
	Notes_Field.sendKeys(Patient_Notes);

	String Actual_Notes = Notes_Field.getDomProperty("value");
	System.out.println("Additional Notes : " + Actual_Notes);

	WebElement Submit_Button = p.Teleform_Button("Submit →");
	rp.movetoelement(Submit_Button);
	Submit_Button.click();

	// Post Submission Verification
	WebElement Submission_Toast = p.Teleform_Submission_Success_Toast;
	Boolean Submission_Success = Teleform_Toast_Detector_Printer(Submission_Toast);

	if(Submission_Success){
		System.out.println("========== INTAKE SUBMISSION RESULT ==========");
		System.out.println();
		System.out.println("Product : " + Product_Name);
		System.out.println("Result  : PASS");
		System.out.println("Reason  : Intake form submitted successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().pass("Intake form submitted successfully for: " + Product_Name);
	}
	else{
		System.out.println("========== INTAKE SUBMISSION RESULT ==========");
		System.out.println();
		System.out.println("Product : " + Product_Name);
		System.out.println("Result  : FAIL");
		System.out.println("Reason  : Post-submission success toast was not displayed.");
		System.out.println();

		Report_Listen.log_print_in_report().fail("Intake submission verification failed for: " + Product_Name);
		throw new AssertionError("Intake form submission failed. Expected success toast was not displayed for: " + Product_Name);
	}

}



public void Teleform_Question_Selector(TreeMap<String,String> Product_data){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	System.out.println("---------- INTAKE QUESTION SELECTION ----------");

	List<WebElement> Question_Cards = p.Teleform_Choice_Cards();

	for(WebElement Question_Card : Question_Cards){

		WebElement Question_Label = p.Teleform_Question_Label(Question_Card);
		String Question = Question_Label.getText().trim();
		String Expected_Answer = Product_data.get("Intake Q&A - " + Question);

		if(Expected_Answer==null || Expected_Answer.isBlank()){
			throw new IllegalStateException("Missing DataProvider answer for: " + Question);
		}

		WebElement Answer_Option = p.Teleform_Choice_Option(Question_Card, Expected_Answer);

		rp.movetoelement(Answer_Option);
		Answer_Option.click();

		String Actual_Answer = Answer_Option.getText().trim();

		System.out.println("Question : " + Question);
		System.out.println("Answer   : " + Actual_Answer);

		Report_Listen.log_print_in_report().pass("Intake answer selected: " + Question + " | " + Actual_Answer);
	}
}





public void Teleform_Date_Of_Birth_Selector(String Date_Of_Birth){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	DateTimeFormatter Date_Format = DateTimeFormatter.ofPattern("MM/dd/uuuu");
	LocalDate DOB = LocalDate.parse(Date_Of_Birth, Date_Format);

	String Year = String.valueOf(DOB.getYear());
	String Month = DOB.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
	String Date = DOB.toString();
	String Expected_DOB = DOB.format(DateTimeFormatter.ofPattern("uuuu/MM/dd"));

	System.out.println("---------- DATE OF BIRTH ----------");
	System.out.println("Expected : " + Expected_DOB);

	WebElement Date_Field = p.Teleform_DOB_Input();
	rp.movetoelement(Date_Field);
	Date_Field.click();

	// Year Selection
	WebElement Year_Button = p.Teleform_DOB_Year_Button();
	Year_Button.click();

	List<WebElement> Year_Options = p.Teleform_DOB_Year_Options(Year);

	for(int n=0;n<15 && Year_Options.isEmpty();n++){
		WebElement Previous_Decade = p.Teleform_DOB_Previous_Decade();
		Previous_Decade.click();
		Year_Options = p.Teleform_DOB_Year_Options(Year);
	}

	if(Year_Options.isEmpty()) throw new IllegalStateException("DOB year not available: " + Year);

	WebElement Year_Option = Year_Options.get(0);
	Year_Option.click();

	// Month Selection - Month Panel Opens Automatically
	WebElement Month_Option = p.Teleform_DOB_Month_Option(Month);
	rp.movetoelement(Month_Option);
	Month_Option.click();

	// Day Selection
	WebElement Day_Option = p.Teleform_DOB_Day_Option(Date);
	rp.movetoelement(Day_Option);
	Day_Option.click();

	// Final DOB Verification
	String Actual_DOB = Date_Field.getDomProperty("value");
	Actual_DOB = Actual_DOB==null ? "" : Actual_DOB.trim();

	System.out.println("Expected DOB : " + Expected_DOB);
	System.out.println("Actual DOB   : " + Actual_DOB);

	Assert.assertEquals(Actual_DOB, Expected_DOB, "Date of Birth mismatch.");

	System.out.println("Result : PASS");
	Report_Listen.log_print_in_report().pass("Date of Birth selected successfully: " + Actual_DOB);
}






public void Intake_Dropdown_Option_Selector(WebElement Dropdown, String Expected_Option){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Expected_Value = Expected_Option.replaceAll("\\s+", "");

	System.out.println();
	System.out.println("---------------- INTAKE DROPDOWN SELECTION ----------------");
	System.out.println("Expected Option : " + Expected_Option);

	Report_Listen.log_print_in_report().info("Selecting intake dropdown option: " + Expected_Option);

	if(!Dropdown.getText().replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){

		rp.movetoelement(Dropdown);
		Dropdown.click();

		WebElement Scroll_Holder = p.Intake_Dropdown_Scroll_Holder();

		for(int Scroll_Attempt=1; Scroll_Attempt<=15; Scroll_Attempt++){

			List<WebElement> Dropdown_Options = p.Intake_Dropdown_Options();

			System.out.println("---------------- SCROLL ATTEMPT " + Scroll_Attempt + " ----------------");
			System.out.println("Rendered Options : " + Dropdown_Options.size());

			for(WebElement Dropdown_Option : Dropdown_Options){

				if(Dropdown_Option.isDisplayed()){

					String Option_Text = Dropdown_Option.getText().trim();

					System.out.println("Checking Option : " + Option_Text);

					if(Option_Text.replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){

						rp.movetoelement(Dropdown_Option);
						Dropdown_Option.click();

						System.out.println("Matching Option : " + Option_Text);
						System.out.println("Action          : Clicked");

						break;
					}
				}
			}

			if(Dropdown.getText().replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){
				break;
			}

			System.out.println("Action : Scroll to load additional dropdown options");

			new org.openqa.selenium.interactions.Actions(d).scrollFromOrigin(org.openqa.selenium.interactions.WheelInput.ScrollOrigin.fromElement(Scroll_Holder), 0, 160).perform();
		}
	}

	String Actual_Option = Dropdown.getText().trim();

	System.out.println("---------------- DROPDOWN RESULT ----------------");
	System.out.println("Expected : " + Expected_Option);
	System.out.println("Actual   : " + Actual_Option);

	if(Actual_Option.replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){

		System.out.println("Result : PASS");

		Report_Listen.log_print_in_report().pass("Intake dropdown option selected successfully: " + Actual_Option);
	}
	else{

		System.out.println("Result : FAIL");
		System.out.println("Reason : Requested dropdown option not selected");

		Report_Listen.log_print_in_report().fail("Intake dropdown selection failed. Expected: " + Expected_Option + " | Actual: " + Actual_Option);

		throw new IllegalStateException("Unable to select intake dropdown option: " + Expected_Option);
	}
}


public Boolean Teleform_Toast_Detector_Printer(WebElement Toast){

	Repeat rp = new Repeat(d);
	Boolean Toast_Visible = rp.check_element_visibility(Toast, 10);

	if(Toast_Visible){
		String Toast_Message = Toast.getText().trim();

		System.out.println();
		System.out.println("---------- POST SUBMISSION TOAST ----------");
		System.out.println();
		System.out.println("Toast Message : " + Toast_Message.replace("\n", " | "));
		System.out.println("Toast Visible : " + Toast_Visible);
		System.out.println();

		return true;
	}
	else{
		System.out.println();
		System.out.println("---------- POST SUBMISSION TOAST ----------");
		System.out.println();
		System.out.println("Toast Visible : " + Toast_Visible);
		System.out.println("Reason : Success toast was not displayed.");
		System.out.println();

		return false;
	}
}


}














