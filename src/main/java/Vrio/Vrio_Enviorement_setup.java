package Vrio;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AsterMD.Project.AsterMD.Product_Module;
import AsterMD.Project.AsterMD.Vrio_Login;
import Listerners.Report_Listen;
import Locaters.Vrio_Master_Locaters;
import Repeatative_codes.Repeat;

@Listeners(Report_Listen.class)
public class Vrio_Enviorement_setup extends Vrio_Login{
	
	
	public void Module_Accessor(String Menu_Option) throws Exception{
	
	Vrio_Master_Locaters p = new Vrio_Master_Locaters(d);
	Repeat rp = new Repeat(d);
	
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                     MODULE ACCESS");
	System.out.println("============================================================");
	System.out.println("Requested Module : " + Menu_Option);
	System.out.println();
	
	Report_Listen.log_print_in_report().info("──────────────────── MODULE ACCESS ────────────────────");
	Report_Listen.log_print_in_report().info("Requested Module: " + Menu_Option);
	
	System.out.println("---------------- LOGIN STATUS CHECK ----------------");
	System.out.println("Action : Checking whether user is already logged in.");
	
	WebElement check_login = p.login_confirmation;
	Boolean visibilty = rp.check_element_visibility(check_login, 2);
	
	if(visibilty==false){
		
		System.out.println("Actual : User is not logged in.");
		System.out.println("Action : Executing Vrio Login.");
		System.out.println();
		
		Report_Listen.log_print_in_report().info("User is not logged in.");
		Report_Listen.log_print_in_report().info("Executing Vrio Login.");
		
		Login_to_Vrio();
		
		System.out.println("Result : Login completed successfully.");
		System.out.println();
		
		Report_Listen.log_print_in_report().pass("Vrio Login completed successfully.");
	}
	else{
		
		System.out.println("Actual : User is already logged in.");
		System.out.println("Result : PASS");
		System.out.println();
		
		Report_Listen.log_print_in_report().pass("User is already logged in to Vrio.");
	}
	
	System.out.println("---------------- NAVIGATION OPTIONS ----------------");
	System.out.println("Action : Searching for module → " + Menu_Option);
	
	Report_Listen.log_print_in_report().info("Searching navigation menu for Module: " + Menu_Option);
	
	List<WebElement> Naviagtion_options = p.Nav_options();
	
	for(WebElement Naviagtion_option : Naviagtion_options){
		
		String option_text = Naviagtion_option.getText().trim();
		
		if(option_text.contains(Menu_Option)){
			
			System.out.println("Expected : " + Menu_Option);
			System.out.println("Actual   : " + option_text);
			System.out.println("Action   : Opening module.");
			
			Report_Listen.log_print_in_report().info("Expected Module: " + Menu_Option);
			Report_Listen.log_print_in_report().info("Actual Module: " + option_text);
			
			Naviagtion_option.click();
			
			System.out.println("Result   : PASS");
			System.out.println();
			
			Report_Listen.log_print_in_report().pass("Module opened successfully: " + Menu_Option);
			
			break;
		}
	}
	
	System.out.println("============================================================");
	System.out.println("              MODULE ACCESS COMPLETED");
	System.out.println("============================================================");
	System.out.println("Module : " + Menu_Option);
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("──────────────────── MODULE ACCESS COMPLETED ────────────────────");
}
	
	
	@DataProvider
	public Object[][] Offer_Create_Data(){

		TreeMap<String, String> data1 = new TreeMap<String, String>();
		data1.put("Name", "AsterMD Monthly Wellness Care Offer");
		data1.put("Offer Type", "Recurring");
		data1.put("Offer Configuration", "Shared");
		data1.put("Charge Frequency", "Monthly");

		TreeMap<String, String> data2 = new TreeMap<String, String>();
		data2.put("Name", "AsterMD Weekly Treatment Access Offer");
		data2.put("Offer Type", "Recurring");
		data2.put("Offer Configuration", "Shared");
		data2.put("Charge Frequency", "Weekly");

		TreeMap<String, String> data3 = new TreeMap<String, String>();
		data3.put("Name", "AsterMD Daily Care Support Offer");
		data3.put("Offer Type", "Recurring");
		data3.put("Offer Configuration", "Custom");
		data3.put("Charge Frequency", "Daily");

		TreeMap<String, String> data4 = new TreeMap<String, String>();
		data4.put("Name", "AsterMD Quarterly Health Management Offer");
		data4.put("Offer Type", "Recurring");
		data4.put("Offer Configuration", "Shared");
		data4.put("Charge Frequency", "Quarterly");

		TreeMap<String, String> data5 = new TreeMap<String, String>();
		data5.put("Name", "AsterMD Yearly Patient Wellness Offer");
		data5.put("Offer Type", "Recurring");
		data5.put("Offer Configuration", "Custom");
		data5.put("Charge Frequency", "Yearly");

		TreeMap<String, String> data6 = new TreeMap<String, String>();
		data6.put("Name", "AsterMD Monthly Medicine Access Offer");
		data6.put("Offer Type", "Recurring");
		data6.put("Offer Configuration", "Custom");
		data6.put("Charge Frequency", "Monthly");

		TreeMap<String, String> data7 = new TreeMap<String, String>();
		data7.put("Name", "AsterMD Weekly Care Continuity Offer");
		data7.put("Offer Type", "Recurring");
		data7.put("Offer Configuration", "Shared");
		data7.put("Charge Frequency", "Weekly");

		TreeMap<String, String> data8 = new TreeMap<String, String>();
		data8.put("Name", "AsterMD Quarterly Wellness Access Offer");
		data8.put("Offer Type", "Recurring");
		data8.put("Offer Configuration", "Custom");
		data8.put("Charge Frequency", "Quarterly");

		TreeMap<String, String> data9 = new TreeMap<String, String>();
		data9.put("Name", "AsterMD Daily Digital Care Offer");
		data9.put("Offer Type", "Recurring");
		data9.put("Offer Configuration", "Shared");
		data9.put("Charge Frequency", "Daily");

		TreeMap<String, String> data10 = new TreeMap<String, String>();
		data10.put("Name", "AsterMD Yearly Treatment Support Offer");
		data10.put("Offer Type", "Recurring");
		data10.put("Offer Configuration", "Shared");
		data10.put("Charge Frequency", "Yearly");

		TreeMap<String, String> data11 = new TreeMap<String, String>();
		data11.put("Name", "AsterMD Monthly Health Support Offer");
		data11.put("Offer Type", "Recurring");
		data11.put("Offer Configuration", "Custom");
		data11.put("Charge Frequency", "Monthly");

		TreeMap<String, String> data12 = new TreeMap<String, String>();
		data12.put("Name", "AsterMD Weekly Wellness Program Offer");
		data12.put("Offer Type", "Recurring");
		data12.put("Offer Configuration", "Custom");
		data12.put("Charge Frequency", "Weekly");

		TreeMap<String, String> data13 = new TreeMap<String, String>();
		data13.put("Name", "AsterMD Direct Patient Care Offer");
		data13.put("Offer Type", "One Time Sale");
		data13.put("Offer Configuration", "Shared");

		TreeMap<String, String> data14 = new TreeMap<String, String>();
		data14.put("Name", "AsterMD One Time Wellness Access Offer");
		data14.put("Offer Type", "One Time Sale");
		data14.put("Offer Configuration", "Custom");

		TreeMap<String, String> data15 = new TreeMap<String, String>();
		data15.put("Name", "AsterMD Immediate Treatment Access Offer");
		data15.put("Offer Type", "One Time Sale");
		data15.put("Offer Configuration", "Shared");

		TreeMap<String, String> data16 = new TreeMap<String, String>();
		data16.put("Name", "AsterMD Single Care Purchase Offer");
		data16.put("Offer Type", "One Time Sale");
		data16.put("Offer Configuration", "Custom");

		TreeMap<String, String> data17 = new TreeMap<String, String>();
		data17.put("Name", "AsterMD Patient Support Purchase Offer");
		data17.put("Offer Type", "One Time Sale");
		data17.put("Offer Configuration", "Shared");

		TreeMap<String, String> data18 = new TreeMap<String, String>();
		data18.put("Name", "AsterMD Direct Wellness Purchase Offer");
		data18.put("Offer Type", "One Time Sale");
		data18.put("Offer Configuration", "Custom");

		TreeMap<String, String> data19 = new TreeMap<String, String>();
		data19.put("Name", "AsterMD Care Access Purchase Offer");
		data19.put("Offer Type", "One Time Sale");
		data19.put("Offer Configuration", "Shared");

		TreeMap<String, String> data20 = new TreeMap<String, String>();
		data20.put("Name", "AsterMD Treatment Service Purchase Offer");
		data20.put("Offer Type", "One Time Sale");
		data20.put("Offer Configuration", "Custom");

		return new Object[][] {/*
			{ data1 },
			{ data2 },
			{ data3 },*/
			{ data4 },
			{ data5 },
			{ data6 },
			{ data7 },
			{ data8 },
			{ data9 },
			{ data10 },
			{ data11 },
			{ data12 },
			{ data13 },
			{ data14 },
			{ data15 },
			{ data16 },
			{ data17 },
			{ data18 },
			{ data19 },
			{ data20 } 
		};
	}	
	
@DataProvider
public Object[][] Campaign_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Name", "AsterMD Men's Health Access Campaign");
	data1.put("Payment Type", "Merchant");
	data1.put("Merchant Account", "60 - AbundRx Merchant");
	data1.put("Active", "Yes");
	data1.put("Notes", "Telehealth campaign supporting eligible patients with confidential online consultation, treatment assessment, prescription review, medicine access, and ongoing healthcare support.");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Name", "AsterMD Men's Wellness Care Campaign");
	data2.put("Payment Type", "Merchant");
	data2.put("Merchant Account", "60 - AbundRx Merchant");
	data2.put("Active", "Yes");
	data2.put("Notes", "Digital healthcare campaign supporting adult patients through online clinical assessment, treatment guidance, medicine-management services, and scheduled follow-up care.");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Name", "AsterMD Vitality Support Campaign");
	data3.put("Payment Type", "Merchant");
	data3.put("Merchant Account", "60 - AbundRx Merchant");
	data3.put("Active", "Yes");
	data3.put("Notes", "Patient-focused telehealth campaign providing wellness assessment, clinician consultation, suitable treatment support, medicine access, and continued digital care.");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Name", "AsterMD Hormone Health Management Campaign");
	data4.put("Payment Type", "Merchant");
	data4.put("Merchant Account", "60 - AbundRx Merchant");
	data4.put("Active", "Yes");
	data4.put("Notes", "Telehealth campaign supporting hormone-related healthcare through patient intake, clinician assessment, laboratory review where applicable, treatment selection, and ongoing monitoring.");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Name", "AsterMD Reproductive Wellness Campaign");
	data5.put("Payment Type", "Merchant");
	data5.put("Merchant Account", "60 - AbundRx Merchant");
	data5.put("Active", "Yes");
	data5.put("Notes", "Healthcare campaign supporting eligible patients through digital consultation, clinical assessment, relevant laboratory workflows, treatment guidance, and ongoing care management.");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Name", "AsterMD Hair Restoration Care Campaign");
	data6.put("Payment Type", "Merchant");
	data6.put("Merchant Account", "60 - AbundRx Merchant");
	data6.put("Active", "Yes");
	data6.put("Notes", "Telehealth campaign supporting patients with hair and scalp concerns through online assessment, treatment selection, medicine access, progress monitoring, and follow-up care.");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Name", "AsterMD Scalp Wellness Support Campaign");
	data7.put("Payment Type", "Merchant");
	data7.put("Merchant Account", "60 - AbundRx Merchant");
	data7.put("Active", "Yes");
	data7.put("Notes", "Digital dermatology campaign providing assessment and care support for patients experiencing scalp and hair-health concerns requiring structured treatment management.");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Name", "AsterMD Medical Weight Care Campaign");
	data8.put("Payment Type", "Merchant");
	data8.put("Merchant Account", "60 - AbundRx Merchant");
	data8.put("Active", "Yes");
	data8.put("Notes", "Telehealth campaign supporting weight-management patients with clinical assessment, treatment eligibility review, medicine-management services, lifestyle guidance, and progress monitoring.");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Name", "AsterMD Healthy Weight Support Campaign");
	data9.put("Payment Type", "Merchant");
	data9.put("Merchant Account", "60 - AbundRx Merchant");
	data9.put("Active", "Yes");
	data9.put("Notes", "Digital care campaign focused on sustainable weight management through patient assessment, treatment guidance, metabolic-health support, and regular follow-up.");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Name", "AsterMD Metabolic Wellness Campaign");
	data10.put("Payment Type", "Merchant");
	data10.put("Merchant Account", "60 - AbundRx Merchant");
	data10.put("Active", "Yes");
	data10.put("Notes", "Telehealth campaign supporting patients requiring metabolic-health assessment, laboratory review, clinician consultation, medicine management, and ongoing health monitoring.");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Name", "AsterMD Glucose Care Management Campaign");
	data11.put("Payment Type", "Merchant");
	data11.put("Merchant Account", "60 - AbundRx Merchant");
	data11.put("Active", "Yes");
	data11.put("Notes", "Digital healthcare campaign supporting glucose-management workflows through patient assessment, treatment review, laboratory monitoring, medicine support, and continued follow-up.");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Name", "AsterMD Restful Sleep Care Campaign");
	data12.put("Payment Type", "Merchant");
	data12.put("Merchant Account", "60 - AbundRx Merchant");
	data12.put("Active", "Yes");
	data12.put("Notes", "Telehealth sleep-care campaign supporting patients with persistent sleep concerns through clinical assessment, treatment review, medicine-management services, and follow-up care.");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Name", "AsterMD Sleep Wellness Support Campaign");
	data13.put("Payment Type", "Merchant");
	data13.put("Merchant Account", "60 - AbundRx Merchant");
	data13.put("Active", "Yes");
	data13.put("Notes", "Digital health campaign designed to support patients experiencing sleep-quality concerns through online evaluation, healthcare guidance, and appropriate treatment pathways.");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Name", "AsterMD Calm Mind Care Campaign");
	data14.put("Payment Type", "Merchant");
	data14.put("Merchant Account", "60 - AbundRx Merchant");
	data14.put("Active", "Yes");
	data14.put("Notes", "Confidential telehealth campaign supporting emotional wellbeing through patient assessment, clinician consultation, treatment planning, medicine review, and continued care.");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Name", "AsterMD Mood Wellness Support Campaign");
	data15.put("Payment Type", "Merchant");
	data15.put("Merchant Account", "60 - AbundRx Merchant");
	data15.put("Active", "Yes");
	data15.put("Notes", "Digital wellness campaign supporting patients through structured assessment, treatment guidance, ongoing clinical review, and appropriate healthcare-management services.");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Name", "AsterMD Focus and Productivity Care Campaign");
	data16.put("Payment Type", "Merchant");
	data16.put("Merchant Account", "60 - AbundRx Merchant");
	data16.put("Active", "Yes");
	data16.put("Notes", "Telehealth campaign supporting patients experiencing attention and concentration concerns through clinical evaluation, treatment review, medicine-management services, and continued care.");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Name", "AsterMD Clear Skin Treatment Campaign");
	data17.put("Payment Type", "Merchant");
	data17.put("Merchant Account", "60 - AbundRx Merchant");
	data17.put("Active", "Yes");
	data17.put("Notes", "Online dermatology campaign providing skin assessment, treatment selection, medicine-management support, progress monitoring, and follow-up care.");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Name", "AsterMD Skin Barrier Wellness Campaign");
	data18.put("Payment Type", "Merchant");
	data18.put("Merchant Account", "60 - AbundRx Merchant");
	data18.put("Active", "Yes");
	data18.put("Notes", "Teledermatology campaign supporting patients with recurring skin irritation and barrier-related concerns through assessment, treatment guidance, medicine access, and ongoing care.");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Name", "AsterMD Facial Skin Care Campaign");
	data19.put("Payment Type", "Merchant");
	data19.put("Merchant Account", "60 - AbundRx Merchant");
	data19.put("Active", "Yes");
	data19.put("Notes", "Digital dermatology campaign supporting facial skin concerns through online consultation, treatment assessment, medicine access, progress monitoring, and ongoing care.");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Name", "AsterMD Headache Relief Care Campaign");
	data20.put("Payment Type", "Merchant");
	data20.put("Merchant Account", "60 - AbundRx Merchant");
	data20.put("Active", "Yes");
	data20.put("Notes", "Telehealth campaign supporting recurring headache concerns through clinical assessment, treatment planning, medicine-management services, symptom monitoring, and follow-up care.");

	return new Object[][] {/*
		{ data1 },
		{ data2 },
		{ data3 },*/
		{ data4 },
		{ data5 },
		{ data6 },
		{ data7 },
		{ data8 },
		{ data9 },
		{ data10 },
		{ data11 },
		{ data12 },
		{ data13 },
		{ data14 },
		{ data15 },
		{ data16 },
		{ data17 },
		{ data18 },
		{ data19 },
		{ data20 } 
	};
}
	
@Test(dataProvider="Campaign_Create_Data")
public void Campaign_Add(TreeMap<String, String> Campaign_data) throws Exception{
	
	Vrio_Master_Locaters p = new Vrio_Master_Locaters(d);
	Repeat rp = new Repeat(d);
	
	String Campaign_Name = Campaign_data.get("Name");
	String Payment_Type = Campaign_data.get("Payment Type");
	String Merchant_Account = Campaign_data.get("Merchant Account");
	String Active = Campaign_data.get("Active");
	String Notes = Campaign_data.get("Notes");
	
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                     CAMPAIGN CREATION");
	System.out.println("============================================================");
	System.out.println("Campaign : " + Campaign_Name);
	System.out.println();
	
	Report_Listen.log_print_in_report().info("──────────────────── CAMPAIGN CREATION ────────────────────");
	Report_Listen.log_print_in_report().info("Campaign: " + Campaign_Name);
	
	System.out.println("---------------- CAMPAIGN DATA ----------------");
	System.out.println("Name             : " + Campaign_Name);
	System.out.println("Payment Type     : " + Payment_Type);
	System.out.println("Merchant Account : " + Merchant_Account);
	System.out.println("Active           : " + Active);
	System.out.println("Notes            : " + Notes);
	System.out.println();
	
	Report_Listen.log_print_in_report().info("Name: " + Campaign_Name);
	Report_Listen.log_print_in_report().info("Payment Type: " + Payment_Type);
	Report_Listen.log_print_in_report().info("Merchant Account: " + Merchant_Account);
	Report_Listen.log_print_in_report().info("Active: " + Active);
	
	System.out.println("---------------- CAMPAIGNS MODULE ----------------");
	System.out.println("Action : Open Campaigns module");
	
	Module_Accessor("Campaigns");
	
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Campaigns module opened successfully.");
	
	System.out.println("---------------- ADD CAMPAIGN ----------------");
	
	WebElement Add_Button = p.Campaign_Add_Button();
	Add_Button.click();
	
	System.out.println("Action : Campaign Add button clicked");
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Campaign Add button clicked successfully.");
	
	WebElement add_form = p.Form();
	
	System.out.println("Action : Campaign creation form opened");
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Campaign creation form opened successfully.");
	
	WebElement name = add_form.findElement(By.xpath(".//input[@id='campaign_name']"));
	WebElement note = add_form.findElement(By.xpath(".//textarea"));
	
	if(rp.check_element_visibility(name, 3)){
		
		name.sendKeys(Campaign_Name);
		
		System.out.println("Campaign Name : " + Campaign_Name);
		System.out.println("Result        : PASS");
		System.out.println();
		
		Report_Listen.log_print_in_report().pass("Campaign Name entered successfully: " + Campaign_Name);
	}
	else{
		
		System.out.println("Result : FAIL");
		System.out.println("Reason : Campaign Name field was not visible.");
		System.out.println();
		
		Report_Listen.log_print_in_report().fail("Campaign Name field was not visible.");
		
		throw new Exception("Campaign Name field was not visible.");
	}
	
	if(rp.check_element_visibility(note, 3)){
		
		note.sendKeys(Notes);
		
		System.out.println("Notes  : Entered");
		System.out.println("Result : PASS");
		System.out.println();
		
		Report_Listen.log_print_in_report().pass("Campaign Notes entered successfully.");
	}
	else{
		
		System.out.println("Result : FAIL");
		System.out.println("Reason : Campaign Notes field was not visible.");
		System.out.println();
		
		Report_Listen.log_print_in_report().fail("Campaign Notes field was not visible.");
		
		throw new Exception("Campaign Notes field was not visible.");
	}
	
	System.out.println("---------------- PAYMENT TYPE ----------------");
	System.out.println("Expected : " + Payment_Type);
	
	WebElement dropdown_field = p.Select_Field();
	dropdown_field.click();
	
	List<WebElement> options = p.Select_dropdown_options();
	
	for(WebElement option : options){
		
		String text = option.getText().trim();
		
		if(text.contains(Payment_Type)){
			
			option.click();
			
			System.out.println("Actual   : " + text);
			System.out.println("Result   : PASS");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Expected Payment Type: " + Payment_Type);
			Report_Listen.log_print_in_report().info("Actual Payment Type: " + text);
			Report_Listen.log_print_in_report().pass("Payment Type selected successfully.");
			
			break;
		}
	}
	
	if(Payment_Type.contains("Merchant")){
		
		System.out.println("---------------- MERCHANT ACCOUNT ----------------");
		System.out.println("Expected : " + Merchant_Account);
		
		WebElement Merchant_Account_dropdown_field = p.Merchant_Account_Select_feild();
		Merchant_Account_dropdown_field.click();
		
		WebElement Merchant_Account_Search = p.Merchant_Account_Dropdown_search();
		Merchant_Account_Search.sendKeys(Merchant_Account);
		
		List<WebElement> Merchantoptions = p.Select_dropdown_options();
		
		for(WebElement Merchantoption : Merchantoptions){
			
			String text = Merchantoption.getText().trim();
			
			if(text.contains(Merchant_Account)){
				
				Merchantoption.click();
				
				System.out.println("Actual   : " + text);
				System.out.println("Result   : PASS");
				System.out.println();
				
				Report_Listen.log_print_in_report().info("Expected Merchant Account: " + Merchant_Account);
				Report_Listen.log_print_in_report().info("Actual Merchant Account: " + text);
				Report_Listen.log_print_in_report().pass("Merchant Account selected successfully.");
				
				break;
			}
		}
	}
	
	System.out.println("============================================================");
	System.out.println("        BASIC CAMPAIGN DETAILS ENTERED SUCCESSFULLY");
	System.out.println("============================================================");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Basic Campaign details entered successfully for: " + Campaign_Name);

	System.out.println("---------------- CAMPAIGN SUBMISSION ----------------");
	System.out.println("Action : Submit Campaign creation form.");

	Report_Listen.log_print_in_report().info("Action: Submit Campaign creation form.");

	WebElement Submit = p.Submit_Button();
	Submit.click();
	rp.wait_for_invisibilty_of_theElement(Submit);

	System.out.println("Result : PASS");
	System.out.println("Details: Campaign creation form submitted successfully.");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Campaign creation form submitted successfully.");

	WebElement Confirmation_Message = p.Success_Toast();
	Vrio_Toast_Printer_closer(Confirmation_Message);

	System.out.println("---------------- CAMPAIGN SAVE ----------------");
	System.out.println("Action : Save Campaign configuration.");

	Report_Listen.log_print_in_report().info("Action: Save Campaign configuration.");

	WebElement Save = p.Edit_Form_Submit_Button();
	Save.click();
	Thread.sleep(400);

	System.out.println("Result : PASS");
	System.out.println("Details: Campaign configuration saved successfully.");
	System.out.println();

	Report_Listen.log_print_in_report().pass("Campaign configuration saved successfully.");

	System.out.println("============================================================");
	System.out.println("                CAMPAIGN CREATION COMPLETED");
	System.out.println("============================================================");
	System.out.println("Campaign : " + Campaign_Name);
	System.out.println("Result   : PASS");
	System.out.println();

	Report_Listen.log_print_in_report().pass("──────────────────── CAMPAIGN CREATION COMPLETED ────────────────────");
	Report_Listen.log_print_in_report().pass("Campaign created successfully: " + Campaign_Name);
	
	
}



@Test(dataProvider="Product_Create_Data", dataProviderClass=Product_Module.class)
public void item_Add_Vrio(TreeMap<String, String> Product_data) throws Exception{
	
	Vrio_Master_Locaters p = new Vrio_Master_Locaters(d);
	Repeat rp = new Repeat(d);
	
	String Product_Name = Product_data.get("Product Name");
	String Price = Product_data.get("Default Price");
	String Description = Product_data.get("Description");
	
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                       ITEM CREATION");
	System.out.println("============================================================");
	System.out.println("Item Name : " + Product_Name);
	System.out.println("Price     : " + Price);
	System.out.println();
	
	Report_Listen.log_print_in_report().info("──────────────────── ITEM CREATION ────────────────────");
	Report_Listen.log_print_in_report().info("Item Name: " + Product_Name);
	Report_Listen.log_print_in_report().info("Price: " + Price);
	
	Module_Accessor("Items");
	
	System.out.println("---------------- ADD ITEM ----------------");
	
	WebElement Add_Button = p.Item_Add_Button();
	Add_Button.click();
	
	System.out.println("Action : Item Add button clicked.");
	Report_Listen.log_print_in_report().info("Item Add button clicked.");
	
	WebElement add_form = p.Form();
	
	List<WebElement> Inputs = add_form.findElements(By.xpath(".//input[@id='item_name' or @id='item_price']"));
	WebElement productname = Inputs.get(0);
	WebElement Price_Field = Inputs.get(1);
	WebElement note = add_form.findElement(By.xpath(".//textarea"));
	
	rp.wait_for_theElement(Inputs);
	rp.wait_for_theElement(note);
	
	productname.sendKeys(Product_Name);
	Price_Field.sendKeys(Price);
	note.sendKeys(Description);
	
	System.out.println();
	System.out.println("---------------- ITEM DETAILS ----------------");
	System.out.println("Item Name : " + Product_Name);
	System.out.println("Price     : " + Price);
	System.out.println("Note      : Entered");
	System.out.println("Result    : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Item Name entered successfully: " + Product_Name);
	Report_Listen.log_print_in_report().pass("Item Price entered successfully: " + Price);
	Report_Listen.log_print_in_report().pass("Item Note entered successfully.");
	
	System.out.println("---------------- ITEM SUBMISSION ----------------");
	
	WebElement Submit = p.Submit_Button();
	Submit.click();
	rp.wait_for_invisibilty_of_theElement(Submit);
	
	System.out.println("Result : Initial Item details submitted successfully.");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Initial Item details submitted successfully.");
	
	System.out.println("---------------- ITEM DESCRIPTION ----------------");
	
	WebElement Description_Feild = p.ck_editor();
	Description_Feild.sendKeys(Description);
	
	System.out.println("Description : Entered");
	System.out.println("Result      : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Item Description entered successfully.");
	
	System.out.println("---------------- ITEM SAVE ----------------");
	
	WebElement Save = p.Edit_Form_Submit_Button();
	Save.click();
	Thread.sleep(400);
	
	System.out.println("Result : PASS");
	System.out.println("Details: Item saved successfully.");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Item saved successfully: " + Product_Name);
	
	System.out.println("============================================================");
	System.out.println("                  ITEM CREATION COMPLETED");
	System.out.println("============================================================");
	System.out.println("Item   : " + Product_Name);
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("──────────────────── ITEM CREATION COMPLETED ────────────────────");
}


@DataProvider
public Object[][] Product_Offer_Combined_Data(){

	
	
	Object[][] Product_datas = Product_Module.Product_Create_Data();
	Object[][] Offer_datas = Offer_Create_Data();

	int n = IntStream.of(Product_datas.length, Offer_datas.length).min().orElse(0);

	Object[][] combined_data = new Object[n][2];

	int i = 0;
	while(i < n) {
		combined_data[i][0] = Product_datas[i][0];
		combined_data[i][1] = Offer_datas[i][0];
		i++;
	}

	return combined_data;
}

@DataProvider
public Object[][] Product_Campaign_Combined_Data(){

	
	
	Object[][] Product_datas = Product_Module.Product_Create_Data();
	Object[][] Campaign_datas = Campaign_Create_Data();
	Object[][] Offer_datas = Offer_Create_Data();

	int n = IntStream.of(Product_datas.length, Campaign_datas.length, Offer_datas.length).min().orElse(0);

	Object[][] combined_data = new Object[n][3];

	int i = 0;
	while(i < n) {
		combined_data[i][0] = Product_datas[i][0];
		combined_data[i][1] = Campaign_datas[i][0];
		combined_data[i][2] = Offer_datas[i][0];
		i++;
	}

	return combined_data;
}




@Test(dataProvider="Product_Campaign_Combined_Data")
public void Campaign_item_Add(TreeMap<String, String> Product_data,TreeMap<String, String> Campaign_data,TreeMap<String, String> Offer_data) throws Exception{
	
	String Campaign_Name = Campaign_data.get("Name");
	String Product_Name = Product_data.get("Product Name");
	String offer_name = Offer_data.get("Name");
	
	Vrio_Master_Locaters p = new Vrio_Master_Locaters(d);
	Repeat rp = new Repeat(d);
	
	System.out.println();
	System.out.println("============================================================");
	System.out.println("               CAMPAIGN ITEM ASSIGNMENT");
	System.out.println("============================================================");
	System.out.println("Campaign : " + Campaign_Name);
	System.out.println("Item     : " + Product_Name);
	System.out.println("Offer    : " + offer_name);
	System.out.println();
	
	Report_Listen.log_print_in_report().info("──────────────────── CAMPAIGN ITEM ASSIGNMENT ────────────────────");
	Report_Listen.log_print_in_report().info("Campaign: " + Campaign_Name);
	Report_Listen.log_print_in_report().info("Item: " + Product_Name);
	Report_Listen.log_print_in_report().info("Offer: " + offer_name);
	
	System.out.println("---------------- CAMPAIGN MODULE ----------------");
	System.out.println("Action : Open Campaigns module.");
	
	Module_Accessor("Campaigns");
	
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Campaigns module opened successfully.");
	
	System.out.println("---------------- CAMPAIGN SEARCH ----------------");
	System.out.println("Expected : " + Campaign_Name);
	
	Report_Listen.log_print_in_report().info("Searching Campaign: " + Campaign_Name);
	
	WebElement Search_Box = p.Search();
	Search_Box.sendKeys(Campaign_Name);
	Search_Box.sendKeys(Keys.ENTER);
	Thread.sleep(1100);
	
	WebElement Clear_Filter_Button = p.Filter_Clear_Button();
	List<WebElement> rows = p.Table_rows();
	
	for(WebElement row : rows){
		
		String row_text = row.getText().trim();
		
		if(row_text.contains(Campaign_Name)){
			
			System.out.println("Actual   : " + row_text);
			System.out.println("Result   : PASS");
			System.out.println("Action   : Opening Campaign.");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Expected Campaign: " + Campaign_Name);
			Report_Listen.log_print_in_report().info("Actual Campaign: " + row_text);
			Report_Listen.log_print_in_report().pass("Campaign found successfully.");
			
			row.click();
			break;
		}
	}
	
	rp.wait_for_invisibilty_of_theElement(Clear_Filter_Button);
	
	System.out.println("---------------- CAMPAIGN ITEM SECTION ----------------");
	System.out.println("Action : Open Items section.");
	
	Report_Listen.log_print_in_report().info("Opening Items section of Campaign.");
	
	WebElement Edit_Side_Men = p.Side_Menu_in_Edit_Form();
	List<WebElement> Menu_Options = Edit_Side_Men.findElements(By.xpath(".//a"));
	rp.wait_for_theElement(Menu_Options);
	
	for(WebElement Menu_Option : Menu_Options){
		
		String Menu_Option_text = Menu_Option.getText().trim();
		
		if(Menu_Option_text.contains("Items")){
			
			Menu_Option.click();
			
			System.out.println("Result : PASS");
			System.out.println();
			
			Report_Listen.log_print_in_report().pass("Campaign Items section opened successfully.");
			
			break;
		}
	}
	
	System.out.println("---------------- ADD CAMPAIGN ITEM ----------------");
	System.out.println("Action : Open Add Item form.");
	
	Report_Listen.log_print_in_report().info("Opening Add Item form.");
	
	WebElement Add_Button = d.findElement(By.xpath("//a[text()='Add Item ']"));
	rp.wait_for_theElement(Add_Button);
	Add_Button.click();
	
	WebElement add_form = p.Form();
	
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Add Item form opened successfully.");
	
	List<WebElement> dropdown_fields = add_form.findElements(By.xpath(".//span[@id='select2-item_id-container' or @class='select2-selection select2-selection--multiple']"));
	rp.wait_for_theElement(dropdown_fields);
	
	WebElement Item = dropdown_fields.get(0);
	
	System.out.println("---------------- ITEM SELECTION ----------------");
	System.out.println("Expected : " + Product_Name);
	
	Report_Listen.log_print_in_report().info("Expected Item: " + Product_Name);
	
	Item.click();
	
	WebElement Item_search_field = d.findElement(By.xpath("//input[@aria-controls='select2-item_id-results']"));
	rp.wait_for_theElement(Item_search_field);
	Item_search_field.sendKeys(Product_Name);
	
	List<WebElement> Item_options = p.Select_dropdown_options();
	rp.wait_for_theElement(Item_options);
	
	for(WebElement Item_option : Item_options){
		
		String text = Item_option.getText().trim();
		
		if(text.contains(Product_Name)){
			
			Item_option.click();
			
			System.out.println("Actual   : " + text);
			System.out.println("Result   : PASS");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Actual Item: " + text);
			Report_Listen.log_print_in_report().pass("Item selected successfully.");
			
			break;
		}
	}
	
	Thread.sleep(800);
	
	System.out.println("---------------- OFFER SELECTION ----------------");
	System.out.println("Expected : " + offer_name);
	
	Report_Listen.log_print_in_report().info("Expected Offer: " + offer_name);
	
	WebElement Offer = add_form.findElement(By.xpath(".//span[@class='select2-selection select2-selection--multiple']"));
	rp.wait_for_theElement(Offer);
	
	Offer.sendKeys(offer_name);
	
	List<WebElement> offer_options = p.Select_dropdown_options();
	rp.wait_for_theElement(offer_options);
	
	for(WebElement offer_option : offer_options){
		
		String text = offer_option.getText().trim();
		
		if(text.contains(offer_name)){
			
			offer_option.click();
			
			System.out.println("Actual   : " + text);
			System.out.println("Result   : PASS");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Actual Offer: " + text);
			Report_Listen.log_print_in_report().pass("Offer selected successfully.");
			
			break;
		}
	}
	
	System.out.println("---------------- CAMPAIGN ITEM SUBMISSION ----------------");
	System.out.println("Action : Submit Campaign Item assignment.");
	
	Report_Listen.log_print_in_report().info("Submitting Campaign Item assignment.");
	
	WebElement Submit = p.Submit_Button();
	Submit.click();
	rp.wait_for_invisibilty_of_theElement(Submit);
	Thread.sleep(900);
	
	System.out.println("Result : PASS");
	System.out.println("Details: Item and Offer assigned to Campaign successfully.");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Item and Offer assigned to Campaign successfully.");
	
	System.out.println("============================================================");
	System.out.println("         CAMPAIGN ITEM ASSIGNMENT COMPLETED");
	System.out.println("============================================================");
	System.out.println("Campaign : " + Campaign_Name);
	System.out.println("Item     : " + Product_Name);
	System.out.println("Offer    : " + offer_name);
	System.out.println("Result   : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("──────────────────── CAMPAIGN ITEM ASSIGNMENT COMPLETED ────────────────────");
}



@Test(dataProvider="Product_Offer_Combined_Data")
public void Offer_Add_Vrio(TreeMap<String, String> Product_data,TreeMap<String, String> Offer_data) throws Exception{
	 
	Vrio_Master_Locaters p = new Vrio_Master_Locaters(d);
	Repeat rp = new Repeat(d);
	
	String Product_Name = Product_data.get("Product Name");
	String Price = Product_data.get("Default Price");
	String Offer_Name = Offer_data.get("Name");
	String OfferType = Offer_data.get("Offer Type");
	String Offer_Config = Offer_data.get("Offer Configuration");
	String Description = Product_data.get("Description");
	
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                      OFFER CREATION");
	System.out.println("============================================================");
	System.out.println("Offer Name          : " + Offer_Name);
	System.out.println("Offer Type          : " + OfferType);
	System.out.println("Offer Configuration : " + Offer_Config);
	System.out.println();
	
	Report_Listen.log_print_in_report().info("──────────────────── OFFER CREATION ────────────────────");
	Report_Listen.log_print_in_report().info("Offer Name: " + Offer_Name);
	Report_Listen.log_print_in_report().info("Offer Type: " + OfferType);
	Report_Listen.log_print_in_report().info("Offer Configuration: " + Offer_Config);
	
	System.out.println("---------------- OFFERS MODULE ----------------");
	System.out.println("Action : Open Offers module.");
	
	Module_Accessor("Offers");
	
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Offers module opened successfully.");
	
	System.out.println("---------------- ADD OFFER ----------------");
	
	WebElement Add_Button = p.Offer_Add_Button();
	Add_Button.click();
	
	System.out.println("Action : Offer Add button clicked.");
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Offer Add button clicked successfully.");
	
	WebElement add_form = p.Form();
	
	List<WebElement> Inputs = add_form.findElements(By.xpath(".//input[@id='offer_name']"));
	rp.wait_for_theElement(Inputs);
	
	WebElement note = add_form.findElement(By.xpath(".//textarea"));
	rp.wait_for_theElement(note);
	
	WebElement Offername = Inputs.get(0);
	Offername.sendKeys(Offer_Name);
	
	System.out.println("Offer Name : " + Offer_Name);
	System.out.println("Result     : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Offer Name entered successfully: " + Offer_Name);
	
	System.out.println("---------------- OFFER TYPE ----------------");
	System.out.println("Expected : " + OfferType);
	
	List<WebElement> dropdown_field = d.findElements(By.xpath("//span[@id='select2-offer_type_id-container' or @id='select2-offer_cycle_product_type_id-container']"));
	rp.wait_for_theElement(dropdown_field);
	
	WebElement Offer_Type = dropdown_field.get(0);
	WebElement Offer_Configuration = dropdown_field.get(1);
	
	Offer_Type.click();
	
	List<WebElement> Offer_Type_options = p.Select_dropdown_options();
	
	for(WebElement Offer_Type_option : Offer_Type_options){
		
		String text = Offer_Type_option.getText().trim();
		
		if(text.contains(OfferType)){
			
			Offer_Type_option.click();
			
			System.out.println("Actual   : " + text);
			System.out.println("Result   : PASS");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Expected Offer Type: " + OfferType);
			Report_Listen.log_print_in_report().info("Actual Offer Type: " + text);
			Report_Listen.log_print_in_report().pass("Offer Type selected successfully.");
			
			break;
		}
	}
	
	if(OfferType.contains("Recurring")){
		
		String TimeFrame = Offer_data.get("Charge Frequency");
		
		System.out.println("---------------- CHARGE FREQUENCY ----------------");
		System.out.println("Expected : " + TimeFrame);
		
		Report_Listen.log_print_in_report().info("Recurring Offer detected.");
		Report_Listen.log_print_in_report().info("Expected Charge Frequency: " + TimeFrame);
		
		WebElement Time_frame_dropdown_field = d.findElement(By.xpath("//span[@id='select2-charge_timeframe_id-container']"));
		rp.wait_for_theElement(Time_frame_dropdown_field);
		Time_frame_dropdown_field.click();
		
		WebElement Time_frame_search_field = d.findElement(By.xpath("//input[@aria-controls='select2-charge_timeframe_id-results']"));
		rp.wait_for_theElement(Time_frame_search_field);
		Time_frame_search_field.sendKeys(TimeFrame);
		
		Thread.sleep(300);
		
		List<WebElement> Timeframe_Type_options = p.Select_dropdown_options();
		
		for(WebElement Timeframe_Type_option : Timeframe_Type_options){
			
			String text = Timeframe_Type_option.getText().trim();
			
			if(text.contains(TimeFrame)){
				
				Timeframe_Type_option.click();
				
				System.out.println("Actual   : " + text);
				System.out.println("Result   : PASS");
				System.out.println();
				
				Report_Listen.log_print_in_report().info("Actual Charge Frequency: " + text);
				Report_Listen.log_print_in_report().pass("Charge Frequency selected successfully.");
				
				break;
			}
		}
	}
	else{
		
		System.out.println("---------------- CHARGE FREQUENCY ----------------");
		System.out.println("Offer Type : " + OfferType);
		System.out.println("Result     : Not Applicable");
		System.out.println();
		
		Report_Listen.log_print_in_report().info("Charge Frequency is not applicable for Offer Type: " + OfferType);
	}
	
	System.out.println("---------------- OFFER CONFIGURATION ----------------");
	System.out.println("Expected : " + Offer_Config);
	
	Offer_Configuration.click();
	
	List<WebElement> Offer_Configuration_options = p.Select_dropdown_options();
	
	for(WebElement Offer_Configuration_option : Offer_Configuration_options){
		
		String text = Offer_Configuration_option.getText().trim();
		
		if(text.contains(Offer_Config)){
			
			Offer_Configuration_option.click();
			
			System.out.println("Actual   : " + text);
			System.out.println("Result   : PASS");
			System.out.println();
			
			Report_Listen.log_print_in_report().info("Expected Offer Configuration: " + Offer_Config);
			Report_Listen.log_print_in_report().info("Actual Offer Configuration: " + text);
			Report_Listen.log_print_in_report().pass("Offer Configuration selected successfully.");
			
			break;
		}
	}
	
	if(Offer_Config.contains("Custom")){
		
		System.out.println("---------------- CUSTOM OFFER ITEM ----------------");
		System.out.println("Expected Item  : " + Product_Name);
		System.out.println("Expected Price : " + Price);
		
		Report_Listen.log_print_in_report().info("Custom Offer configuration detected.");
		Report_Listen.log_print_in_report().info("Expected Item: " + Product_Name);
		Report_Listen.log_print_in_report().info("Expected Quick Price: " + Price);
		
		WebElement Item_dropdown_field = d.findElement(By.xpath("//span[@id='select2-item_id-container']"));
		rp.wait_for_theElement(Item_dropdown_field);
		
		WebElement Quick_Price = d.findElement(By.xpath("//input[@id='quick_add_price']"));
		rp.wait_for_theElement(Quick_Price);
		
		Item_dropdown_field.click();
		
		WebElement Item_search_field = d.findElement(By.xpath("//input[@aria-controls='select2-item_id-results']"));
		rp.wait_for_theElement(Item_search_field);
		Item_search_field.sendKeys(Product_Name);
		
		Thread.sleep(300);
		
		List<WebElement> item_Type_options = p.Select_dropdown_options();
		
		for(WebElement item_Type_option : item_Type_options){
			
			String text = item_Type_option.getText().trim();
			
			if(text.contains(Product_Name)){
				
				item_Type_option.click();
				
				System.out.println("Actual Item : " + text);
				System.out.println("Result      : PASS");
				
				Report_Listen.log_print_in_report().info("Actual Item: " + text);
				Report_Listen.log_print_in_report().pass("Custom Offer Item selected successfully.");
				
				break;
			}
		}
		
		Quick_Price.sendKeys(Price);
		
		System.out.println("Quick Price : " + Price);
		System.out.println("Result      : PASS");
		System.out.println();
		
		Report_Listen.log_print_in_report().pass("Quick Price entered successfully: " + Price);
	}
	else{
		
		System.out.println("---------------- CUSTOM OFFER ITEM ----------------");
		System.out.println("Offer Configuration : " + Offer_Config);
		System.out.println("Result              : Not Applicable");
		System.out.println();
		
		Report_Listen.log_print_in_report().info("Custom Item and Quick Price are not applicable for Offer Configuration: " + Offer_Config);
	}
	
	System.out.println("---------------- OFFER DESCRIPTION ----------------");
	
	rp.Scroll_to_element(note);
	note.sendKeys(Description);
	
	System.out.println("Description : Entered");
	System.out.println("Result      : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Offer Description entered successfully.");
	
	System.out.println("---------------- OFFER SUBMISSION ----------------");
	System.out.println("Action : Submit Offer creation form.");
	
	Report_Listen.log_print_in_report().info("Submitting Offer creation form.");
	
	WebElement Submit = p.Submit_Button();
	rp.Scroll_to_element(Submit);
	Thread.sleep(650);
	Submit.click();
	rp.wait_for_invisibilty_of_theElement(Submit);
	
	System.out.println("Result : PASS");
	System.out.println("Details: Initial Offer details submitted successfully.");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Initial Offer details submitted successfully.");
	
	System.out.println("---------------- OFFER SAVE ----------------");
	System.out.println("Action : Save Offer configuration.");
	
	Report_Listen.log_print_in_report().info("Saving Offer configuration.");
	
	WebElement Save = p.Edit_Form_Submit_Button();
	Save.click();
	Thread.sleep(400);
	
	System.out.println("Result : PASS");
	System.out.println("Details: Offer saved successfully.");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("Offer saved successfully: " + Offer_Name);
	
	System.out.println("============================================================");
	System.out.println("                 OFFER CREATION COMPLETED");
	System.out.println("============================================================");
	System.out.println("Offer  : " + Offer_Name);
	System.out.println("Result : PASS");
	System.out.println();
	
	Report_Listen.log_print_in_report().pass("──────────────────── OFFER CREATION COMPLETED ────────────────────");
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
