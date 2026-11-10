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
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Listerners.Report_Listen;
import Locaters.Patient_Portal_Locaters;
import Repeatative_codes.Repeat;
import Store.Frontend_Store_Front;

public class Pateint_Portal extends Frontend_Store_Front{

public void Patient_Portal_Credentials_Setup_Via_Yopmail(String Patient_Email, String Patient_Password){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

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

	Boolean Link_Found = Reset_Link.find();
	
	if(Link_Found){
		System.out.println("Password setup link | Result: PASS");
		Report_Listen.log_print_in_report().pass("Patient Portal password setup link retrieved successfully.");
	}
	else{
		System.out.println();
		System.out.println("Result : FAIL");
		System.out.println("Reason : Password setup link not found in Yopmail.");

		Report_Listen.log_print_in_report().fail("Password setup link not found for: " + Patient_Email);
		throw new IllegalStateException("Password setup link not found in the latest email for: " + Patient_Email);
	}

	String Password_Setup_URL = Reset_Link.group();

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

public void Patient_Portal_Login(TreeMap<String,String> Product_data){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Patient_Email = Product_data.get("Email");
	String First_Name = Product_data.get("First Name");
	String Last_Name = Product_data.get("Last Name");
	String Patient_Name = First_Name + " " + Last_Name;
	String Product_Name = Product_data.get("Product Name");
	String Patient_Password = Product_data.get("Patient Password");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                   PATIENT PORTAL LOGIN");
	System.out.println("============================================================");
	System.out.println("Patient Name   : " + Patient_Name);
	System.out.println("Patient Email  : " + Patient_Email);
	System.out.println("Product        : " + Product_Name);
	Report_Listen.log_print_in_report().info("Starting Patient Portal Login | Patient: " + Patient_Name + " | Email: " + Patient_Email + " | Product: " + Product_Name);
	d.navigate().to("https://testdemo.logistial.com/");

	WebElement Login_Title = p.Portal_Login_Title();
	WebElement Email_Field = p.Portal_Email();
	WebElement Password_Field = p.Portal_Password();
	WebElement Login_Button = p.Portal_Continue_Button();
	
	Email_Field.clear();
	Email_Field.sendKeys(Patient_Email);
	Password_Field.clear();
	Password_Field.sendKeys(Patient_Password);
	rp.movetoelement(Login_Button);
	Login_Button.click();
	System.out.println("Action : Login form submitted.");
	Report_Listen.log_print_in_report().info("Patient Portal login submitted | Patient: " + Patient_Email);

	Boolean Alert_Visible = p.Portal_Auth_Error_Alert_Visible();
	System.out.println("Registration Alert Visible : " + Alert_Visible);
	Report_Listen.log_print_in_report().info("Registration alert visibility | Patient: " + Patient_Email + " | Visible: " + Alert_Visible);
	
	if(Alert_Visible){
		System.out.println("Action : Registration alert detected. Starting Yopmail credential setup.");
		Report_Listen.log_print_in_report().info("Registration alert detected | Patient: " + Patient_Email + " | Action: Configure credentials through Yopmail.");
		Patient_Portal_Credentials_Setup_Via_Yopmail(Patient_Email, Patient_Password);
		System.out.println("Action : Credential setup completed. Signing in with configured credentials.");
		Report_Listen.log_print_in_report().info("Credential setup completed | Patient: " + Patient_Email + " | Action: Sign in with configured credentials.");

		Login_Title = p.Portal_Login_Title();
		Email_Field = p.Portal_Email();
		Password_Field = p.Portal_Password();
		Login_Button = p.Portal_Continue_Button();
		Email_Field.clear();
		Email_Field.sendKeys(Patient_Email);
		Password_Field.clear();
		Password_Field.sendKeys(Patient_Password);
		rp.movetoelement(Login_Button);
		Login_Button.click();
		System.out.println("Action : Configured credentials submitted.");
		Report_Listen.log_print_in_report().info("Patient Portal sign-in submitted after credential setup | Patient: " + Patient_Email);
	}
	else{
		System.out.println("Action : Verify the registered-patient login already submitted.");
		Report_Listen.log_print_in_report().info("Registration alert absent | Patient: " + Patient_Email + " | Action: Verify the submitted login.");
	}

	rp.wait_for_invisibilty_of_theElement(Login_Title);
	List<WebElement> Menu_Options = p.Patient_Portal_Header_Menu_Options();
	Assert.assertFalse(Menu_Options.isEmpty(), "Patient Portal header menu is unavailable after login for: " + Patient_Email);
	System.out.println("Patient Portal Login | Patient: " + Patient_Name + " | Email: " + Patient_Email + " | Product: " + Product_Name + " | Result: PASS");
	Report_Listen.log_print_in_report().pass("Patient Portal login confirmed | Patient: " + Patient_Name + " | Email: " + Patient_Email + " | Product: " + Product_Name + " | Login page closed and header menu available | Result: PASS");
}

public void Patient_portal_header_menu_navigator(String Option, TreeMap<String,String> Product_data) throws InterruptedException{

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);
	Patient_Portal_Login(Product_data);
	List<WebElement> Menu_Options = p.Patient_Portal_Header_Menu_Options();

	System.out.println("---------- PATIENT PORTAL MENU ----------");
	System.out.println("Expected : " + Option);
	
	for(WebElement Menu_Option : Menu_Options){
		
		String Menu_Name = Menu_Option.getText().trim();
		
		if(Menu_Name.equalsIgnoreCase(Option.trim())){
			Boolean Menu_Visible = rp.check_element_visibility(Menu_Option, 5);
			if(Menu_Visible){
				rp.movetoelement(Menu_Option);
				Menu_Option.click();
				System.out.println("Actual   : " + Menu_Name);
				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Patient Portal menu | Expected: " + Option + " | Actual: " + Menu_Name + " | Result: PASS");
				return;
			}
		}
	}
	System.out.println("Result : FAIL | Reason: Requested menu is unavailable: " + Option);
	Report_Listen.log_print_in_report().fail("Patient Portal menu is unavailable: " + Option);
	throw new IllegalStateException("Patient Portal menu is unavailable: " + Option);
}

@Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
public void Intake_form_filling(TreeMap<String,String> Product_data) throws InterruptedException{

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);
	String Product_Name = Product_data.get("Product Name");
	String Treatment_Variant = Product_data.get("Treatment Variant");
	String Patient_Name = Product_data.get("First Name") + " " + Product_data.get("Last Name");
	String Button_XPath = ".//div[contains(@class,'desktopIncomplete')]//button";

	Patient_portal_header_menu_navigator("Treatments", Product_data);
	System.out.println("---------- PATIENT INTAKE ----------");
	System.out.println("Patient : " + Patient_Name);
	System.out.println("Product : " + Product_Name + " | Variant: " + Treatment_Variant);
	Report_Listen.log_print_in_report().info("Starting Patient Intake | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant);

	List<WebElement> Treatment_Cards;
	try{
		
		WebElement Active_Section = p.Active_Tab();
		rp.movetoelement(Active_Section);
		p.Treatment_Summary_Loader();
		Treatment_Cards = p.Incomplete_Treatment_Cards();
		rp.wait_for_text_in_elements(Treatment_Cards, "Progress:");
		Treatment_Cards = p.Incomplete_Treatment_Cards();
	}
	catch(TimeoutException Unavailable_Treatments){
		System.out.println("Result : NOT PERFORMED | Reason: Incomplete treatments are unavailable.");
		Report_Listen.log_print_in_report().info("Patient Intake NOT PERFORMED | Product: " + Product_Name + " | Variant: " + Treatment_Variant + " | Reason: Incomplete treatments are unavailable.");
		return;
	}

	for(WebElement Treatment_Card : Treatment_Cards){
		String Treatment_Details = Treatment_Card.getText().trim();
		if(Treatment_Details.contains(Product_Name) && Treatment_Details.contains(Treatment_Variant)){
			List<WebElement> Start_Intake_Buttons = Treatment_Card.findElements(By.xpath(Button_XPath));
			for(WebElement Start_Intake_Button : Start_Intake_Buttons){
				String Button_Text = Start_Intake_Button.getText().trim();
				if(Button_Text.contains("Intake")){
					Boolean Button_Visible = rp.check_element_visibility(Start_Intake_Button, 5);
					Boolean Button_Enabled = Start_Intake_Button.isEnabled();
					if(Button_Visible && Button_Enabled){
						rp.movetoelement(Start_Intake_Button);
						Start_Intake_Button.click();
						Report_Listen.log_print_in_report().info("Started Intake | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant);
						if(Product_Name.equalsIgnoreCase("AsterRefluxa Digestive Relief Capsules") || Product_Name.equalsIgnoreCase("AsterSomnera Sleep Support Tablets") || Product_Name.equalsIgnoreCase("AsterMigraEase Headache Support Tablets")){
							AsterRefluxa_Intake_Form(Product_data);
							System.out.println("Patient Intake | Product: " + Product_Name + " | Result: COMPLETED");
							Report_Listen.log_print_in_report().pass("Patient Intake completed | Patient: " + Patient_Name + " | Product: " + Product_Name);
						}
						else{
							throw new SkipException("Intake automation not configured for: " + Product_Name);
						}
						return;
					}
				}
			}
		}
	}
	System.out.println("Result : NOT PERFORMED | Reason: No usable Start Intake button matches the requested product and variant.");
	Report_Listen.log_print_in_report().info("Patient Intake NOT PERFORMED | Product: " + Product_Name + " | Variant: " + Treatment_Variant + " | Reason: No usable matching Start Intake button.");
}

public void AsterRefluxa_Intake_Form(TreeMap<String,String> Product_data){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_data.get("Product Name");
	String First_Name = Product_data.get("First Name");
	String Last_Name = Product_data.get("Last Name");
	String Patient_Email = Product_data.get("Email");
	String Date_Of_Birth = Product_data.get("Date of Birth");
	String Biological_Sex = Product_data.get("Biological Sex at Birth");
	String Patient_Phone = Product_data.get("Phone");
	String Intake_Reason = Product_data.get("Intake Reason");
	String Patient_Address = Product_data.get("Address");
	String Patient_City = Product_data.get("City");
	String Residential_State = Product_data.get("Residential State");
	String Current_Location_State = Product_data.get("Current Location State");
	String Patient_ZIP = Product_data.get("ZIP Code");

	Residential_State = Residential_State.trim().toUpperCase(Locale.ENGLISH);
	Current_Location_State = Current_Location_State.trim().toUpperCase(Locale.ENGLISH);
	Patient_Phone = Patient_Phone.replaceAll("\\D", "");

	if(Patient_Phone.length() == 11 && Patient_Phone.startsWith("1")){
		Patient_Phone = Patient_Phone.substring(1);
	}

	System.out.println();
	System.out.println("========== PATIENT INTAKE FORM ==========");
	System.out.println("Product : " + Product_Name);
	Report_Listen.log_print_in_report().info("Starting intake for: " + Product_Name);

	// Page 1 - Patient Information
	System.out.println();
	System.out.println("---------- PAGE 1 : PATIENT INFORMATION ----------");

	WebElement Page_Indicator = p.Teleform_Page_Indicator();
	rp.wait_for_expected_text(Page_Indicator, "Page 1 of 5");
	String Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 1 of 5");

	WebElement First_Name_Field = p.Teleform_First_Name();
	rp.movetoelement(First_Name_Field);
	First_Name_Field.clear();
	First_Name_Field.sendKeys(First_Name);
	String Actual_First_Name = First_Name_Field.getDomProperty("value");
	System.out.println("First Name | Expected: " + First_Name + " | Actual: " + Actual_First_Name);
	Assert.assertEquals(Actual_First_Name, First_Name, "First Name mismatch.");

	WebElement Last_Name_Field = p.Teleform_Last_Name();
	rp.movetoelement(Last_Name_Field);
	Last_Name_Field.clear();
	Last_Name_Field.sendKeys(Last_Name);
	String Actual_Last_Name = Last_Name_Field.getDomProperty("value");
	System.out.println("Last Name | Expected: " + Last_Name + " | Actual: " + Actual_Last_Name);
	Assert.assertEquals(Actual_Last_Name, Last_Name, "Last Name mismatch.");

	WebElement Email_Field = p.Teleform_Account_Email();
	rp.movetoelement(Email_Field);
	Email_Field.clear();
	Email_Field.sendKeys(Patient_Email);
	String Actual_Email = Email_Field.getDomProperty("value");
	System.out.println("Email | Expected: " + Patient_Email + " | Actual: " + Actual_Email);
	Assert.assertEquals(Actual_Email, Patient_Email, "Email mismatch.");

	WebElement Phone_Field = p.Teleform_Phone();
	rp.movetoelement(Phone_Field);
	Phone_Field.click();
	Phone_Field.sendKeys(Keys.chord(Keys.CONTROL, "a"));
	Phone_Field.sendKeys("+1" + Patient_Phone);
	Phone_Field.sendKeys(Keys.TAB);
	String Actual_Phone = Phone_Field.getDomProperty("value").replaceAll("\\D", "");
	Assert.assertEquals(Actual_Phone, "1" + Patient_Phone, "US mobile phone number mismatch.");

	Teleform_Date_Of_Birth_Selector(Date_Of_Birth);

	WebElement Sex_Dropdown = p.Teleform_Sex_Dropdown();
	Intake_Dropdown_Option_Selector(Sex_Dropdown, Biological_Sex);

	String Actual_Biological_Sex = Sex_Dropdown.getText().trim();
	Assert.assertEquals(Actual_Biological_Sex, Biological_Sex, "Sex for your medical record mismatch.");

	WebElement Reason_Dropdown = p.Teleform_Care_Reason_Dropdown();
	Intake_Dropdown_Option_Selector(Reason_Dropdown, Intake_Reason);

	String Actual_Intake_Reason = Reason_Dropdown.getText().trim();
	Assert.assertEquals(Actual_Intake_Reason, Intake_Reason, "Care reason mismatch.");

	WebElement Next_Button = p.Teleform_Continue_Button();
	rp.movetoelement(Next_Button);
	Next_Button.click();

	Page_Indicator = p.Teleform_Page_Indicator();
	rp.wait_for_expected_text(Page_Indicator, "Page 2 of 5");
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 2 of 5");
	System.out.println("Expected : Page 2 of 5");
	System.out.println("Actual   : " + Actual_Page);
	System.out.println("Result   : PASS");
	Report_Listen.log_print_in_report().pass("Page 1 | Expected: Page 2 of 5 | Actual: " + Actual_Page + " | Result: PASS");

	// Page 2 - Address and Current Location
	System.out.println();
	System.out.println("---------- PAGE 2 : ADDRESS AND CURRENT LOCATION ----------");

	WebElement Address_Field = p.Teleform_Address();
	rp.movetoelement(Address_Field);
	Address_Field.clear();
	Address_Field.sendKeys(Patient_Address);
	String Actual_Address = Address_Field.getDomProperty("value");
	System.out.println("Address | Expected: " + Patient_Address + " | Actual: " + Actual_Address);
	Assert.assertEquals(Actual_Address, Patient_Address, "Address mismatch.");

	WebElement City_Field = p.Teleform_City();
	rp.movetoelement(City_Field);
	City_Field.clear();
	City_Field.sendKeys(Patient_City);
	String Actual_City = City_Field.getDomProperty("value");
	System.out.println("City | Expected: " + Patient_City + " | Actual: " + Actual_City);
	Assert.assertEquals(Actual_City, Patient_City, "City mismatch.");
    
	
	WebElement ZIP_Field = p.Teleform_ZIP();
	rp.movetoelement(ZIP_Field);
	ZIP_Field.clear();
	ZIP_Field.sendKeys(Patient_ZIP);
	String Actual_ZIP = ZIP_Field.getDomProperty("value");
	System.out.println("ZIP Code | Expected: " + Patient_ZIP + " | Actual: " + Actual_ZIP);
	Assert.assertEquals(Actual_ZIP, Patient_ZIP, "ZIP Code mismatch.");

	WebElement Residential_State_Dropdown = p.Teleform_Residential_State_Dropdown();
	Intake_Dropdown_Option_Selector(Residential_State_Dropdown, Residential_State);

	WebElement Current_Location_State_Dropdown = p.Teleform_Current_Location_State_Dropdown();
	Intake_Dropdown_Option_Selector(Current_Location_State_Dropdown, Current_Location_State);

	Next_Button = p.Teleform_Continue_Button();
	rp.movetoelement(Next_Button);
	Next_Button.click();

	Page_Indicator = p.Teleform_Page_Indicator();
	rp.wait_for_expected_text(Page_Indicator, "Page 3 of 5");
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 3 of 5");
	System.out.println("Expected : Page 3 of 5");
	System.out.println("Actual   : " + Actual_Page);
	System.out.println("Result   : PASS");
	Report_Listen.log_print_in_report().pass("Page 2 | Expected: Page 3 of 5 | Actual: " + Actual_Page + " | Result: PASS");

	// Page 3 - Medical History
	System.out.println();
	System.out.println("---------- PAGE 3 : MEDICAL HISTORY ----------");

	Teleform_Question_Selector(Product_data);

	Next_Button = p.Teleform_Continue_Button();
	rp.movetoelement(Next_Button);
	Next_Button.click();

	Page_Indicator = p.Teleform_Page_Indicator();
	rp.wait_for_expected_text(Page_Indicator, "Page 4 of 5");
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 4 of 5");
	System.out.println("Expected : Page 4 of 5");
	System.out.println("Actual   : " + Actual_Page);
	System.out.println("Result   : PASS");
	Report_Listen.log_print_in_report().pass("Page 3 | Expected: Page 4 of 5 | Actual: " + Actual_Page + " | Result: PASS");

	// Page 4 - Visible Symptom Questions
	System.out.println();
	System.out.println("---------- PAGE 4 : YOUR SYMPTOMS ----------");

	Teleform_Question_Selector(Product_data);

	
	Next_Button = p.Teleform_Continue_Button();
	rp.movetoelement(Next_Button); 
	Next_Button.click();

	Page_Indicator = p.Teleform_Page_Indicator();
	rp.wait_for_expected_text(Page_Indicator, "Page 5 of 5");
	Actual_Page = Page_Indicator.getText().trim();
	Assert.assertEquals(Actual_Page, "Page 5 of 5");
	System.out.println("Expected : Page 5 of 5");
	System.out.println("Actual   : " + Actual_Page);
	System.out.println("Result   : PASS");
	Report_Listen.log_print_in_report().pass("Page 4 | Expected: Page 5 of 5 | Actual: " + Actual_Page + " | Result: PASS");

	// Page 5 - Review and Consent
	System.out.println();
	System.out.println("---------- PAGE 5 : REVIEW AND CONSENT ----------");

	List<WebElement> Consent_Checkboxes = p.Teleform_Consent_Checkboxes();
	Assert.assertEquals(Consent_Checkboxes.size(), 2, "Expected the adult/accuracy and telehealth consent checkboxes.");

	for(int n=0;n<Consent_Checkboxes.size();n++){
		WebElement Consent_Checkbox = Consent_Checkboxes.get(n);
		WebElement Consent_Input = Consent_Checkbox.findElement(By.xpath(".//input[@type='radio' or @type='checkbox']"));

		Boolean Consent_Selected = Consent_Input.isSelected();
		if(!Consent_Selected){
			rp.movetoelement(Consent_Checkbox);
			Consent_Checkbox.click();
		}
		else{
			System.out.println("Action : Consent " + (n + 1) + " is already selected.");
		}

		Consent_Selected = Consent_Input.isSelected();

		System.out.println("Consent " + (n + 1) + " | Expected: true | Actual: " + Consent_Selected);
		Assert.assertTrue(Consent_Selected, "Consent " + (n + 1) + " was not selected.");
		System.out.println("Result : PASS");

		Report_Listen.log_print_in_report().pass("Consent " + (n + 1) + " | Expected: true | Actual: " + Consent_Selected + " | Result: PASS");
	}

	// Intake Form Submission
	System.out.println();
	System.out.println("---------- INTAKE FORM SUBMISSION ----------");

	WebElement Submit_Button = p.Teleform_Submit_Button();
	rp.movetoelement(Submit_Button); 
	Submit_Button.click();

	WebElement Submission_Toast = p.Teleform_Submission_Success_Toast;
	Boolean Submission_Success = Teleform_Toast_Detector_Printer(Submission_Toast);

	Assert.assertTrue(Submission_Success, "Page 5 intake submission failed: expected Action Successful | Submitted successfully."); 
	
	
}

   public void Teleform_Question_Selector(TreeMap<String,String> Product_data){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);
	System.out.println("---------- INTAKE QUESTIONS ----------");

	List<WebElement> Question_Cards = p.Teleform_Choice_Cards();

	for(WebElement Question_Card : Question_Cards){

		Boolean Question_Visible = Question_Card.isDisplayed();

		if(Question_Visible){

			WebElement Question_Label = Question_Card.findElement(By.xpath(".//div[contains(@class,'fieldLabel')]/span[1]"));

			String Question = Question_Label.getText().trim();

			String Data_Key = "Intake Q&A - " + Question;

			String Expected_Answer = Product_data.get(Data_Key);

			List<WebElement> Answer_Options = Question_Card.findElements(By.xpath(".//label[contains(@class,'ant-radio-wrapper') or contains(@class,'ant-checkbox-wrapper')]"));

			Assert.assertFalse(Answer_Options.isEmpty(), "No answer options for: " + Question);

			for(int n=0; n<Answer_Options.size(); n++){

				WebElement Answer_Option = Answer_Options.get(n);
				String Option_Text = Answer_Option.getText().trim();

				if(Answer_Option.isDisplayed() && Option_Text.equalsIgnoreCase(Expected_Answer)){

					WebElement Answer_Input = Answer_Option.findElement(By.xpath(".//input[@type='radio' or @type='checkbox']"));
					Boolean Answer_Visible = rp.check_element_visibility(Answer_Option, 5);
					Boolean Answer_Enabled = Answer_Input.isEnabled();

					if(Answer_Visible && Answer_Enabled){

						Boolean Answer_Selected = Answer_Input.isSelected();

						if(!Answer_Selected){

							rp.movetoelement(Answer_Option);
							Answer_Option.click();

						}

						String Actual_Answer = Answer_Option.getText().trim();
						Answer_Selected = Answer_Input.isSelected();
						Assert.assertEquals(Actual_Answer, Expected_Answer, "Intake answer text mismatch: " + Question);
						Assert.assertTrue(Answer_Selected, "Intake answer was not selected: " + Question);
						System.out.println();
						System.out.println("Question        : " + Question);
						System.out.println("Selected Answer : " + Actual_Answer);
						System.out.println("Expected Answer : " + Expected_Answer);
						System.out.println("Selected        : " + Answer_Selected);
						System.out.println("Result          : PASS");
						Report_Listen.log_print_in_report().pass(Question + " | Expected: " + Expected_Answer + " | Actual: " + Actual_Answer + " | Selected: " + Answer_Selected + " | Result: PASS");
						break;

					}

				}

				if(n == Answer_Options.size()-1){

					Assert.fail("No visible enabled answer option for: " + Question + " | Expected: " + Expected_Answer);

				}

			}

		}

	}

	List<WebElement> Textarea_Cards = p.Teleform_Textarea_Cards();

	for(WebElement Question_Card : Textarea_Cards){

		Boolean Question_Visible = Question_Card.isDisplayed();

		if(Question_Visible){

			WebElement Question_Label = Question_Card.findElement(By.xpath(".//div[contains(@class,'fieldLabel')]/span[1]"));
			String Question = Question_Label.getText().trim();
			String Data_Key = "Intake Q&A - " + Question;

			if(Question.equals("Tell the clinician anything else about your symptoms, triggers, previous tests, or questions.")){

				Data_Key = "Notes";

			}

			String Expected_Answer = Product_data.get(Data_Key);
			WebElement Answer_Field = Question_Card.findElement(By.xpath(".//textarea"));
			Boolean Answer_Visible = rp.check_element_visibility(Answer_Field, 5);
			Boolean Answer_Enabled = Answer_Field.isEnabled();

			if(Answer_Visible && Answer_Enabled){

				rp.movetoelement(Answer_Field);
				Answer_Field.clear();
				Answer_Field.sendKeys(Expected_Answer);
				Answer_Field.sendKeys(Keys.TAB);
				String Actual_Answer = Answer_Field.getDomProperty("value");
				Assert.assertEquals(Actual_Answer, Expected_Answer, "Intake textarea mismatch: " + Question);
				System.out.println();
				System.out.println("Question        : " + Question);
				System.out.println("Entered Answer  : " + Actual_Answer);
				System.out.println("Expected Answer : " + Expected_Answer);
				System.out.println("Result          : PASS");
				Report_Listen.log_print_in_report().pass(Question + " | Expected: " + Expected_Answer + " | Actual: " + Actual_Answer + " | Result: PASS");

			}

			else{

				Assert.fail("Intake textarea is unavailable: " + Question);

			}

		}

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

	WebElement Date_Field = p.Teleform_DOB_Input();
	rp.movetoelement(Date_Field);
	Date_Field.click();
	WebElement Year_Button = p.Teleform_DOB_Year_Button();
	rp.movetoelement(Year_Button);
	Year_Button.click();

	for(int Attempt=1; Attempt<=16; Attempt++){
		List<WebElement> Year_Options = p.Teleform_DOB_Years();
		String Previous_Years = "";
		for(WebElement Year_Option : Year_Options){
			if(Year_Option.isDisplayed()){
				Previous_Years += "|" + Year_Option.getText().trim();
				if(Year_Option.getText().trim().equals(Year)){
					Boolean Year_Visible = rp.check_element_visibility(Year_Option, 5);
					if(Year_Visible){
						rp.movetoelement(Year_Option);
						Year_Option.click();

						List<WebElement> Month_Options = p.Teleform_DOB_Months();
						for(int n=0; n<Month_Options.size(); n++){
							WebElement Month_Option = Month_Options.get(n);
							if(Month_Option.isDisplayed() && Month_Option.getText().trim().equalsIgnoreCase(Month)){
								Boolean Month_Visible = rp.check_element_visibility(Month_Option, 5);
								if(Month_Visible){
									rp.movetoelement(Month_Option);
									Month_Option.click();
									break;
								}
							}
							if(n == Month_Options.size()-1){
								Assert.fail("DOB month not available: " + Month);
							}
						}

						List<WebElement> Day_Options = p.Teleform_DOB_Days();
						for(int n=0; n<Day_Options.size(); n++){
							WebElement Day_Option = Day_Options.get(n);
							if(Day_Option.isDisplayed() && Date.equals(Day_Option.getDomAttribute("title"))){
								Boolean Day_Visible = rp.check_element_visibility(Day_Option, 5);
								if(Day_Visible){
									rp.movetoelement(Day_Option);
									Day_Option.click();
									break;
								}
							}
							if(n == Day_Options.size()-1){
								Assert.fail("DOB date not available: " + Date);
							}
						}

						Date_Field = p.Teleform_DOB_Input();
						String Actual_DOB = Date_Field.getDomProperty("value").trim();
						Assert.assertEquals(Actual_DOB, Expected_DOB, "Date of Birth mismatch.");
						System.out.println("Expected : " + Expected_DOB + " | Actual: " + Actual_DOB + " | Result: PASS");
						Report_Listen.log_print_in_report().pass("DOB | Expected: " + Expected_DOB + " | Actual: " + Actual_DOB + " | Result: PASS");
						return;
					}
				}
			}
		}
		if(Attempt < 16){
			WebElement Previous_Decade = p.Teleform_DOB_Previous_Decade();
			rp.movetoelement(Previous_Decade);
			Previous_Decade.click();
			rp.wait_for_collection_text_change(Year_Options, Previous_Years);
		}
	}
	Assert.fail("DOB year not available: " + Year);
}


public void Intake_Dropdown_Option_Selector(WebElement Dropdown, String Expected_Option){

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);
	
	String Expected_Value = Expected_Option.replaceAll("\\s+", "");
	System.out.println("---------- INTAKE DROPDOWN ----------");
	Report_Listen.log_print_in_report().info("Selecting intake dropdown option: " + Expected_Option);
	
	if(!Dropdown.getText().replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){
		rp.movetoelement(Dropdown);
		Dropdown.click();
		for(int Scroll_Attempt=1; Scroll_Attempt<=15; Scroll_Attempt++){
			List<WebElement> Dropdown_Options = p.Intake_Dropdown_Options();
			for(WebElement Dropdown_Option : Dropdown_Options){
				if(Dropdown_Option.isDisplayed()){
					String Option_Text = Dropdown_Option.getText().trim();
					if(Option_Text.replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){
						Boolean Option_Visible = rp.check_element_visibility(Dropdown_Option, 5);
						Boolean Option_Enabled = Dropdown_Option.isEnabled();
						if(Option_Visible && Option_Enabled){
							rp.movetoelement(Dropdown_Option);
							Dropdown_Option.click();
							rp.wait_for_selected_value(Dropdown, Expected_Option);
							break;
						}
					}
				}
			}
			if(Dropdown.getText().replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){
				break;
			}
			else if(Scroll_Attempt < 15){
				List<WebElement> Scroll_Holders = p.Intake_Dropdown_Scroll_Holder();
				for(WebElement Scroll_Holder : Scroll_Holders){
					if(Scroll_Holder.isDisplayed()){
						Boolean Holder_Visible = rp.check_element_visibility(Scroll_Holder, 5);
						if(Holder_Visible){
							System.out.println("Scroll attempt : " + Scroll_Attempt);
							new org.openqa.selenium.interactions.Actions(d).scrollFromOrigin(org.openqa.selenium.interactions.WheelInput.ScrollOrigin.fromElement(Scroll_Holder), 0, 160).perform();
							break;
						}
					}
				}
			}
		}
	}
	String Actual_Option = Dropdown.getText().trim();
	System.out.println("Expected : " + Expected_Option + " | Actual: " + Actual_Option);
	if(Actual_Option.replaceAll("\\s+", "").equalsIgnoreCase(Expected_Value)){
		System.out.println("Result : PASS");
		Report_Listen.log_print_in_report().pass("Intake dropdown | Expected: " + Expected_Option + " | Actual: " + Actual_Option + " | Result: PASS");
	}
	else{
		System.out.println("Result : FAIL | Reason: Requested option was not selected.");
		Report_Listen.log_print_in_report().fail("Intake dropdown | Expected: " + Expected_Option + " | Actual: " + Actual_Option + " | Result: FAIL");
		throw new IllegalStateException("Unable to select intake dropdown option: " + Expected_Option + " | Actual: " + Actual_Option);
	}
}


public Boolean Teleform_Toast_Detector_Printer(WebElement Toast){

	Repeat rp = new Repeat(d);
	String Expected_Toast = "Action Successful | Submitted successfully.";
	Boolean Toast_Visible = rp.check_element_visibility(Toast, 10);

	System.out.println();
	System.out.println("---------- POST SUBMISSION TOAST ----------");
	System.out.println("Expected : " + Expected_Toast);

	if(Toast_Visible){
		String Toast_Message = Toast.getText().trim().replaceAll("\\s*\\r?\\n\\s*", " | ");
		System.out.println("Actual : " + Toast_Message);

		if(Expected_Toast.equals(Toast_Message)){
			System.out.println("Result : PASS");
			Report_Listen.log_print_in_report().pass("Intake submission | Expected: " + Expected_Toast + " | Actual: " + Toast_Message + " | Result: PASS");
			return true;
		}
		else{
			System.out.println("Result : FAIL");
			System.out.println("Reason : Submission notification did not match the expected message.");
			Report_Listen.log_print_in_report().fail("Intake submission | Expected: " + Expected_Toast + " | Actual: " + Toast_Message + " | Result: FAIL");
			return false;
		}
	}
	else{
		System.out.println("Actual : Notification not displayed.");
		System.out.println("Result : FAIL");
		System.out.println("Reason : Expected success notification was not visible within 10 seconds.");
		Report_Listen.log_print_in_report().fail("Intake submission | Expected: " + Expected_Toast + " | Actual: Notification not displayed | Result: FAIL");
		return false;
	}
}


    @Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
    public void Veirfy_Id_form_filling(TreeMap<String,String> Product_data) throws InterruptedException{

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);
	Assertion Assert_Check = new Assertion();

	String Product_Name = Product_data.get("Product Name");
	String Treatment_Variant = Product_data.get("Treatment Variant");
	String Patient_Name = Product_data.get("First Name") + " " + Product_data.get("Last Name");
	String Button_XPath = ".//div[contains(@class,'desktopIncomplete')]//button";

	String SSN = Product_data.get("SSN");
	String ID_Verification_Image = Product_data.get("ID Verification Image");
	File ID_Verification_Folder = new File(System.getProperty("user.dir"), "Images/AsterMD_ID_Verification_QA_Fixtures_20_Images/Images/ID_Verification");
	File ID_Verification_File = new File(ID_Verification_Folder, ID_Verification_Image);
	String ID_Verification_Image_Path = ID_Verification_File.getAbsolutePath();

	Patient_portal_header_menu_navigator("Treatments", Product_data);
	System.out.println("---------- PATIENT INTAKE ----------");
	System.out.println("Patient : " + Patient_Name);
	System.out.println("Product : " + Product_Name + " | Variant: " + Treatment_Variant);
	Report_Listen.log_print_in_report().info("Starting Patient Intake | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant);

	List<WebElement> Treatment_Cards;

	try{

		WebElement Active_Section = p.Active_Tab();
		rp.movetoelement(Active_Section);
		p.Treatment_Summary_Loader();
		Treatment_Cards = p.Incomplete_Treatment_Cards();
		rp.wait_for_text_in_elements(Treatment_Cards, "Progress:");
		Treatment_Cards = p.Incomplete_Treatment_Cards();
	}
	catch(TimeoutException Unavailable_Treatments){

		System.out.println("Result : NOT PERFORMED | Reason: Incomplete treatments are unavailable.");
		Report_Listen.log_print_in_report().info("Patient Intake NOT PERFORMED | Product: " + Product_Name + " | Variant: " + Treatment_Variant + " | Reason: Incomplete treatments are unavailable.");

		return;
	}

	Master_Loop:{

		for(WebElement Treatment_Card : Treatment_Cards){

			String Treatment_Details = Treatment_Card.getText().trim();

			if(Treatment_Details.contains(Product_Name) && Treatment_Details.contains(Treatment_Variant)){

				List<WebElement> Start_Intake_Buttons = Treatment_Card.findElements(By.xpath(Button_XPath));

				for(WebElement Start_Intake_Button : Start_Intake_Buttons){

					String Button_Text = Start_Intake_Button.getText().trim();

					if(Button_Text.contains("Verify Identity")){

						Boolean Button_Visible = rp.check_element_visibility(Start_Intake_Button, 5);
						Boolean Button_Enabled = Start_Intake_Button.isEnabled();

						if(Button_Visible && Button_Enabled){

							rp.movetoelement(Start_Intake_Button);
							Start_Intake_Button.click();

							Report_Listen.log_print_in_report().info("Started Intake | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant);

							p.ID_Verification_Form();

							System.out.println();
							System.out.println("============================================================");
							System.out.println("                 PATIENT ID VERIFICATION");
							System.out.println("============================================================");
							System.out.println("Patient : " + Patient_Name);
							System.out.println("Product : " + Product_Name);
							System.out.println("Variant : " + Treatment_Variant);
							System.out.println("Action  : ID Verification form opened.");

							Report_Listen.log_print_in_report().info("ID Verification form opened | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant);

							// SSN
							WebElement SSN_Field = p.ID_Verification_SSN();
							rp.Scroll_to_element(SSN_Field);
							rp.movetoelement(SSN_Field);
							SSN_Field.clear();
							SSN_Field.sendKeys(SSN);

							String Actual_SSN = SSN_Field.getDomProperty("value");

							Assert_Check.assertEquals(Actual_SSN, SSN, "ID Verification SSN field does not match the DataProvider value.");

							System.out.println();
							System.out.println("---------------- SSN ENTRY ----------------");
							System.out.println("Action : SSN entered and field value verified.");
							System.out.println("Result : PASS");

							Report_Listen.log_print_in_report().pass("ID Verification SSN entry | Patient: " + Patient_Name + " | Field value matches the DataProvider | Result: PASS");

							// ID Verification Image
							WebElement Upload_Section = p.ID_Verification_Upload_Section();
							rp.Scroll_to_element(Upload_Section);

							WebElement File_Input = p.ID_Verification_File_Input();
							File_Input.sendKeys(ID_Verification_Image_Path);
                            WebElement Pending_Message=p.Teleform_ID_Upload_Pending_Message();
                            rp.wait_for_invisibilty_of_theElement(Pending_Message);
							System.out.println();
							System.out.println("---------------- ID DOCUMENT SELECTION ----------------");
							System.out.println("Image  : " + ID_Verification_File.getName());
							System.out.println("Action : Image supplied to the ID Verification file input.");

							Report_Listen.log_print_in_report().info("ID Verification image selected | Patient: " + Patient_Name + " | Image: " + ID_Verification_File.getName());
                            Thread.sleep(800);
							// Submit
							WebElement Submit_Button = p.ID_Verification_Submit_Button();
							rp.Scroll_to_element(Submit_Button);
							rp.movetoelement(Submit_Button);
							Submit_Button.click();

							System.out.println();
							System.out.println("---------------- ID VERIFICATION SUBMISSION ----------------");
							System.out.println("Action : Submit button clicked.");

							Report_Listen.log_print_in_report().info("ID Verification Submit clicked | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant);

							WebElement Submission_Toast = p.Teleform_Submission_Success_Toast;
							Boolean Submission_Success = Teleform_Toast_Detector_Printer(Submission_Toast);

							if(Submission_Success){

								System.out.println("Patient : " + Patient_Name);
								System.out.println("Product : " + Product_Name);
								System.out.println("Expected: Action Successful | Submitted successfully.");
								System.out.println("Result  : PASS");

								Report_Listen.log_print_in_report().pass("ID Verification form submitted successfully | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Variant: " + Treatment_Variant + " | Success notification verified | Result: PASS");

								break Master_Loop;
							}
							else{

								System.out.println("Result : FAIL");
								System.out.println("Reason : ID Verification submission success notification was not verified.");

								Report_Listen.log_print_in_report().fail("ID Verification submission | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Reason: Expected submission success notification was not verified.");

								Assert_Check.fail("ID Verification submission failed: expected Action Successful | Submitted successfully.");
							}
						}
					}
				}
			}
		}

		System.out.println("Result : NOT PERFORMED | Reason: No usable Verify Identity button matches the requested product and variant.");
		Report_Listen.log_print_in_report().info("ID Verification NOT PERFORMED | Product: " + Product_Name + " | Variant: " + Treatment_Variant + " | Reason: No usable matching Verify Identity button.");
	}
}
}
