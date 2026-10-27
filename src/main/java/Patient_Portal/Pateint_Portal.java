package Patient_Portal;

import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
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
public void Intake_form_filling(TreeMap<String, String> Product_data) throws InterruptedException{

	Patient_Portal_Locaters p = new Patient_Portal_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_data.get("Product Name");
	String Treatment_Variant = Product_data.getOrDefault("Treatment Variant", "");
	String First_Name = Product_data.get("First Name");
	String Last_Name = Product_data.get("Last Name");
	String Email = Product_data.get("Email");
	String Phone = Product_data.get("Phone");
	String State = Product_data.get("State");
	String Unit_System = Product_data.get("Unit System");
	String Height = Product_data.get("Height");
	String Weight = Product_data.get("Weight");

	// Patient Portal Login and Treatments Navigation
	Patient_portal_header_menu_navigator("Treatments", "Registered", Product_data);

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                    PATIENT INTAKE FORM");
	System.out.println("============================================================");
	System.out.println("Product : " + Product_Name);
	System.out.println("Variant : " + Treatment_Variant);

	Report_Listen.log_print_in_report().info("Starting intake form for: " + Product_Name);

	// Scroll to Active Treatments Section
	WebElement Active_section=p.Active_Tab();
	rp.Scroll_to_element(Active_section);

	// Incomplete Treatment Selection
	List<WebElement> Treatment_Cards = p.Incomplete_Treatment_Cards();

	System.out.println("---------------- INCOMPLETE TREATMENTS ----------------");
	System.out.println("Available Treatments : " + Treatment_Cards.size());

	for(WebElement Treatment_Card : Treatment_Cards){

		String Treatment_Details = Treatment_Card.getText().trim();

		System.out.println("Treatment Details : " + Treatment_Details.replace("\n", " | "));

		if(Treatment_Details.toLowerCase().contains(Product_Name.toLowerCase()) && Treatment_Details.toLowerCase().contains(Treatment_Variant.toLowerCase())){

			List<WebElement> Start_Intake_Buttons = Treatment_Card.findElements(By.xpath(".//div[contains(@class,'desktopIncomplete')]//button"));
			rp.wait_for_theElement(Start_Intake_Buttons);

			for(WebElement Start_Intake_Button : Start_Intake_Buttons){

				if(Start_Intake_Button.isDisplayed() && Start_Intake_Button.isEnabled()){

					rp.movetoelement(Start_Intake_Button);
					Start_Intake_Button.click();

					System.out.println("Selected Product : " + Product_Name);
					System.out.println("Selected Variant : " + Treatment_Variant);
					System.out.println("Action           : Start Intake");
					System.out.println("Result           : PASS");

					Report_Listen.log_print_in_report().pass("Started intake for: " + Product_Name + " | " + Treatment_Variant);

					break;
				}
			}

			break;
		}
	}

	// Verify First Page
	WebElement Intake_Heading = p.Intake_Page_Heading();

	System.out.println("---------------- INTAKE FORM PAGE 1 ----------------");
	System.out.println("Section : " + Intake_Heading.getText().trim());

	Report_Listen.log_print_in_report().info("Intake Form Page 1 displayed.");

	// Personal Information
	WebElement First_Name_Field = p.Intake_First_Name();
	WebElement Last_Name_Field = p.Intake_Last_Name();
	WebElement Email_Field = p.Intake_Email_Address();
	WebElement Phone_Field = p.Intake_Phone_Number();

	First_Name_Field.clear();
	First_Name_Field.sendKeys(First_Name);

	Last_Name_Field.clear();
	Last_Name_Field.sendKeys(Last_Name);

	Email_Field.clear();
	Email_Field.sendKeys(Email);

	Phone_Field.clear();
	Phone_Field.sendKeys(Phone);

	System.out.println("---------------- PERSONAL INFORMATION ----------------");
	System.out.println("First Name : " + First_Name);
	System.out.println("Last Name  : " + Last_Name);
	System.out.println("Email      : " + Email);
	System.out.println("Phone      : " + Phone_Field.getAttribute("value"));
	System.out.println("Result     : COMPLETED");

	Report_Listen.log_print_in_report().pass("Patient personal information entered successfully.");

	// State Selection
	WebElement State_Dropdown = p.Intake_State_Dropdown();
	Intake_Dropdown_Option_Selector(State_Dropdown, State);

	// Semaglutide Date of Birth
	if(Product_Name.equalsIgnoreCase("Semaglutide")){

		String Date_Of_Birth = Product_data.get("Date of Birth");
		String[] Date_Parts = Date_Of_Birth.split("/");
		String Formatted_Date = Date_Parts[2] + "-" + Date_Parts[0] + "-" + Date_Parts[1];

		WebElement Date_Field = p.Intake_Date_Of_Birth();

		rp.movetoelement(Date_Field);
		Date_Field.click();
		Date_Field.sendKeys(org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a"));
		Date_Field.sendKeys(Formatted_Date);
		Date_Field.sendKeys(org.openqa.selenium.Keys.ENTER);

		String Actual_Date = Date_Field.getAttribute("value");

		System.out.println("---------------- DATE OF BIRTH ----------------");
		System.out.println("DataProvider Date : " + Date_Of_Birth);
		System.out.println("Date Picker Input : " + Formatted_Date);
		System.out.println("Actual Date       : " + Actual_Date);

		if(Actual_Date == null || Actual_Date.isBlank() || "true".equalsIgnoreCase(Date_Field.getAttribute("aria-invalid"))){

			System.out.println("Result : FAIL");
			System.out.println("Reason : Date of Birth was not accepted by the date picker");

			Report_Listen.log_print_in_report().fail("Date of Birth not accepted. Expected: " + Formatted_Date + " | Actual: " + Actual_Date);

			throw new IllegalStateException("Invalid Date of Birth selection for Semaglutide.");
		}

		System.out.println("Result : PASS");

		Report_Listen.log_print_in_report().pass("Date of Birth entered successfully: " + Actual_Date);
	}

	// Unit System Selection
	WebElement Unit_Dropdown = p.Intake_Unit_System_Dropdown();
	Intake_Dropdown_Option_Selector(Unit_Dropdown, Unit_System);

	// Height and Weight
	WebElement Height_Field = p.Intake_Height();
	WebElement Weight_Field = p.Intake_Weight();

	Height_Field.clear();
	Height_Field.sendKeys(Height);

	Weight_Field.clear();
	Weight_Field.sendKeys(Weight);

	System.out.println("---------------- HEIGHT AND WEIGHT ----------------");
	System.out.println("Unit System : " + Unit_System);
	System.out.println("Height      : " + Height);
	System.out.println("Weight      : " + Weight);
	System.out.println("Result      : COMPLETED");

	Report_Listen.log_print_in_report().pass("Patient height and weight entered successfully.");

	// Dynamic Intake Radio Questions
	List<WebElement> Question_Cards = p.Intake_Radio_Question_Cards();

	System.out.println("---------------- INTAKE RADIO QUESTIONS ----------------");
	System.out.println("Questions Found : " + Question_Cards.size());

	for(WebElement Question_Card : Question_Cards){

		String Question = Question_Card.findElement(By.xpath(".//div[contains(@class,'fieldLabel')]/span[1]")).getText().trim();
		String Expected_Answer = Product_data.getOrDefault("Intake Q&A - " + Question, "");

		if(Question.equalsIgnoreCase("What is your weight loss goal?") && Expected_Answer.isBlank()){
			Expected_Answer = Product_data.getOrDefault("Weight Loss Goal", "");
		}

		System.out.println("---------------- RADIO QUESTION ----------------");
		System.out.println("Question : " + Question);
		System.out.println("Expected : " + Expected_Answer);

		Report_Listen.log_print_in_report().info("Intake Question: " + Question + " | Expected Answer: " + Expected_Answer);

		if(Expected_Answer.isBlank()){

			System.out.println("Result : FAIL");
			System.out.println("Reason : No answer configured in DataProvider");

			Report_Listen.log_print_in_report().fail("Missing intake answer for: " + Question);

			throw new IllegalStateException("Missing DataProvider answer for intake question: " + Question);
		}

		List<WebElement> Radio_Options = Question_Card.findElements(By.xpath(".//label[contains(@class,'ant-radio-wrapper')]"));

		System.out.println("Available Options : " + Radio_Options.size());

		int Selected_Options = 0;

		for(WebElement Radio_Option : Radio_Options){

			String Option_Text = Radio_Option.getText().trim();

			System.out.println("Checking Option : " + Option_Text);

			if(Option_Text.equalsIgnoreCase(Expected_Answer)){

				rp.movetoelement(Radio_Option);
				Radio_Option.click();

				if(Radio_Option.findElement(By.xpath(".//input[@type='radio']")).isSelected()){
					Selected_Options++;
				}

				System.out.println("Selected Answer : " + Option_Text);

				break;
			}
		}

		if(Selected_Options==0){

			System.out.println("Result : FAIL");
			System.out.println("Reason : Expected radio answer not selected");

			Report_Listen.log_print_in_report().fail("Radio answer not selected. Question: " + Question + " | Expected: " + Expected_Answer);

			throw new IllegalStateException("Intake radio option not selected: " + Question);
		}

		System.out.println("Result : PASS");

		Report_Listen.log_print_in_report().pass("Intake answer selected: " + Question + " | " + Expected_Answer);
	}

	// Proceed to Second Page
	System.out.println("---------------- NEXT PAGE NAVIGATION ----------------");
	System.out.println("Action : Click Next");

	WebElement Next_Button = p.Intake_Next_Button();

	rp.movetoelement(Next_Button);
	Next_Button.click();

	WebElement Second_Page = p.Intake_Second_Page_Active();

	System.out.println("Expected : Page 2 displayed");
	System.out.println("Actual   : " + Second_Page.getText().trim());
	System.out.println("Result   : PASS");

	Report_Listen.log_print_in_report().pass("Intake Form Page 1 completed and Page 2 displayed for: " + Product_Name);
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



}














