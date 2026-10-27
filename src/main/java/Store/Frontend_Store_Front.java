package Store;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AsterMD.Project.AsterMD.Data_Reader;
import AsterMD.Project.AsterMD.Patient_Module;
import Listerners.Report_Listen;
import Locaters.StoreFront_Locaters;
import Repeatative_codes.Repeat;

public class Frontend_Store_Front extends Patient_Module {

	public void Store_Front_lander() throws IOException {

		StoreFront_Locaters p = new StoreFront_Locaters(d);
		Data_Reader f = new Data_Reader();

		String url = f.Data_Fetcher("Store_Front_URL");

		d.navigate().to(url);

		p.Landed_in_Store_Front_page();

		System.out.println("Store Front");
	}

	




@DataProvider
public Object[][] Storefront_Product_Data(){

	TreeMap<String, String> Shared_Checkout_Data = new TreeMap<String, String>();
	Shared_Checkout_Data.put("Delivery Country", "United States");
	Shared_Checkout_Data.put("Card Number", "1444444444444440");
	Shared_Checkout_Data.put("Expiry Date", "12/29");
	Shared_Checkout_Data.put("Security Code", "123");
	Shared_Checkout_Data.put("Patient Password", "Password@123");
	Shared_Checkout_Data.put("Weight Loss Goal", "21-50 lbs");

	// Dataset 1 - Semaglutide - One-Time Sale - 1 mg
	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Product Name", "Semaglutide");
	data1.put("Treatment Variant", "1 mg");
	data1.put("Subscription Type", "One-Time Sale");
	data1.put("VRIO Offer ID", "340");
	data1.put("VRIO Product ID", "3948");
	data1.put("First Name", "Dmitri");
	data1.put("Last Name", "Sokolov");
	data1.put("Email", "dmitri.sokolov.astermd26101306@yopmail.com");
	data1.put("Phone", "2025550165");
	data1.put("Date of Birth", "01/19/1987");
	data1.put("State", "Illinois");
	data1.put("Unit System", "Imperial (lbs/inches)");
	data1.put("Height", "70");
	data1.put("Weight", "218");
	data1.put("Intake Q&A - Multi Choice", "Male");
	data1.put("Intake Q&A - What is your primary goal for this therapy?", "General wellness");
	data1.put("Notes", "I would like to discuss Semaglutide eligibility, medical history, treatment precautions, side effects and follow-up requirements.");
	data1.put("Address", "660 QA Lakeshore Street");
	data1.put("City", "Chicago");
	data1.put("Delivery State", "Illinois");
	data1.put("Zipcode", "60601");
	data1.put("Cardholder Name", "Dmitri Sokolov");
	data1.putAll(Shared_Checkout_Data);

	// Dataset 2 - Semaglutide - Monthly Recurring - 0.25 mg
	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Product Name", "Semaglutide");
	data2.put("Treatment Variant", "0.25 mg");
	data2.put("Subscription Type", "Monthly / 30-Day Recurring");
	data2.put("VRIO Offer ID", "337");
	data2.put("VRIO Product ID", "3946");
	data2.put("First Name", "Elena");
	data2.put("Last Name", "Morozova");
	data2.put("Email", "elena.morozova.astermd26101307@yopmail.com");
	data2.put("Phone", "2025550166");
	data2.put("Date of Birth", "06/12/1993");
	data2.put("State", "Georgia");
	data2.put("Unit System", "Imperial (lbs/inches)");
	data2.put("Height", "66");
	data2.put("Weight", "185");
	data2.put("Intake Q&A - Multi Choice", "Female");
	data2.put("Intake Q&A - What is your primary goal for this therapy?", "Gut health");
	data2.put("Notes", "I would like to discuss Semaglutide suitability, recurring treatment requirements, lifestyle considerations and regular medical monitoring.");
	data2.put("Address", "770 QA Peachtree Road");
	data2.put("City", "Atlanta");
	data2.put("Delivery State", "Georgia");
	data2.put("Zipcode", "30303");
	data2.put("Cardholder Name", "Elena Morozova");
	data2.putAll(Shared_Checkout_Data);

	// Dataset 3 - Tirzepatide - One-Time Sale - 7.5 mg/mL
	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Product Name", "Tirzepatide");
	data3.put("Treatment Variant", "7.5 mg/mL");
	data3.put("Subscription Type", "One-Time Sale");
	data3.put("VRIO Offer ID", "340");
	data3.put("VRIO Product ID", "3944");
	data3.put("First Name", "Viktor");
	data3.put("Last Name", "Andreev");
	data3.put("Email", "viktor.andreev.astermd26101308@yopmail.com");
	data3.put("Phone", "2025550167");
	data3.put("Date of Birth", "04/06/1986");
	data3.put("State", "Iowa");
	data3.put("Unit System", "Imperial (lbs/inches)");
	data3.put("Height", "72");
	data3.put("Weight", "224");
	data3.put("Notes", "I would like to discuss Tirzepatide eligibility, safety considerations, medical assessment and follow-up requirements before treatment.");
	data3.put("Address", "880 QA Prairie Avenue");
	data3.put("City", "Des Moines");
	data3.put("Delivery State", "Iowa");
	data3.put("Zipcode", "50309");
	data3.put("Cardholder Name", "Viktor Andreev");
	data3.putAll(Shared_Checkout_Data);

	// Dataset 4 - Tirzepatide - Monthly Recurring - 2.5 mg/mL
	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Product Name", "Tirzepatide");
	data4.put("Treatment Variant", "2.5 mg/mL");
	data4.put("Subscription Type", "Monthly / 30-Day Recurring");
	data4.put("VRIO Offer ID", "337");
	data4.put("VRIO Product ID", "3942");
	data4.put("First Name", "Katarina");
	data4.put("Last Name", "Novak");
	data4.put("Email", "katarina.novak.astermd26101309@yopmail.com");
	data4.put("Phone", "2025550168");
	data4.put("Date of Birth", "12/21/1992");
	data4.put("State", "North Carolina");
	data4.put("Unit System", "Imperial (lbs/inches)");
	data4.put("Height", "65");
	data4.put("Weight", "179");
	data4.put("Notes", "I would like information about Tirzepatide recurring treatment, clinical assessment, potential adverse effects and monitoring recommendations.");
	data4.put("Address", "990 QA Forest Lane");
	data4.put("City", "Charlotte");
	data4.put("Delivery State", "North Carolina");
	data4.put("Zipcode", "28202");
	data4.put("Cardholder Name", "Katarina Novak");
	data4.putAll(Shared_Checkout_Data);

	// Dataset 5 - NAD+ Injectable - Monthly Recurring - 100 mg
	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Product Name", "NAD+ Injectable");
	data5.put("Treatment Variant", "100 mg");
	data5.put("Subscription Type", "Monthly / 30-Day Recurring");
	data5.put("VRIO Offer ID", "337");
	data5.put("VRIO Product ID", "3969");
	data5.put("First Name", "Lukas");
	data5.put("Last Name", "Reinhardt");
	data5.put("Email", "lukas.reinhardt.astermd26101301@yopmail.com");
	data5.put("Phone", "2025550160");
	data5.put("Date of Birth", "03/14/1988");
	data5.put("State", "California");
	data5.put("Unit System", "Imperial (lbs/inches)");
	data5.put("Height", "71");
	data5.put("Weight", "195");
	data5.put("Notes", "I would like to discuss NAD+ treatment eligibility, safety precautions, potential benefits and follow-up requirements.");
	data5.put("Address", "110 QA Sunset Lane");
	data5.put("City", "Los Angeles");
	data5.put("Delivery State", "California");
	data5.put("Zipcode", "90012");
	data5.put("Cardholder Name", "Lukas Reinhardt");
	data5.putAll(Shared_Checkout_Data);

	// Dataset 6 - Testosterone Injectable - One-Time Sale - 200 mg/mL
	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Product Name", "Testosterone Injectable");
	data6.put("Treatment Variant", "200 mg/mL");
	data6.put("Subscription Type", "One-Time Sale");
	data6.put("VRIO Offer ID", "340");
	data6.put("VRIO Product ID", "3952");
	data6.put("First Name", "Nikolai");
	data6.put("Last Name", "Volkov");
	data6.put("Email", "nikolai.volkov.astermd26101302@yopmail.com");
	data6.put("Phone", "2025550161");
	data6.put("Date of Birth", "07/22/1985");
	data6.put("State", "Florida");
	data6.put("Unit System", "Imperial (lbs/inches)");
	data6.put("Height", "73");
	data6.put("Weight", "212");
	data6.put("Notes", "I would like to understand Testosterone Injectable treatment evaluation, laboratory testing, potential risks and monitoring requirements.");
	data6.put("Address", "220 QA Palm Avenue");
	data6.put("City", "Orlando");
	data6.put("Delivery State", "Florida");
	data6.put("Zipcode", "32801");
	data6.put("Cardholder Name", "Nikolai Volkov");
	data6.putAll(Shared_Checkout_Data);

	// Dataset 7 - Testosterone Injectable - Monthly Recurring - 100 mg/mL
	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Product Name", "Testosterone Injectable");
	data7.put("Treatment Variant", "100 mg/mL");
	data7.put("Subscription Type", "Monthly / 30-Day Recurring");
	data7.put("VRIO Offer ID", "337");
	data7.put("VRIO Product ID", "3951");
	data7.put("First Name", "Maximilian");
	data7.put("Last Name", "Schneider");
	data7.put("Email", "maximilian.schneider.astermd26101303@yopmail.com");
	data7.put("Phone", "2025550162");
	data7.put("Date of Birth", "11/09/1990");
	data7.put("State", "Texas");
	data7.put("Unit System", "Imperial (lbs/inches)");
	data7.put("Height", "72");
	data7.put("Weight", "205");
	data7.put("Notes", "I would like to discuss Testosterone Injectable treatment suitability, ongoing monitoring, blood tests and recurring treatment considerations.");
	data7.put("Address", "330 QA Oak Street");
	data7.put("City", "Dallas");
	data7.put("Delivery State", "Texas");
	data7.put("Zipcode", "75201");
	data7.put("Cardholder Name", "Maximilian Schneider");
	data7.putAll(Shared_Checkout_Data);

	// Dataset 8 - Wellness Starter Kit - One-Time Sale - Basic Kit
	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Product Name", "Wellness Starter Kit");
	data8.put("Treatment Variant", "Basic Kit");
	data8.put("Subscription Type", "One-Time Sale");
	data8.put("VRIO Offer ID", "340");
	data8.put("VRIO Product ID", "3954");
	data8.put("First Name", "Sofia");
	data8.put("Last Name", "Kuznetsova");
	data8.put("Email", "sofia.kuznetsova.astermd26101304@yopmail.com");
	data8.put("Phone", "2025550163");
	data8.put("Date of Birth", "05/17/1994");
	data8.put("State", "Arizona");
	data8.put("Unit System", "Imperial (lbs/inches)");
	data8.put("Height", "65");
	data8.put("Weight", "168");
	data8.put("Notes", "I would like information about the Wellness Starter Kit Basic Kit, its included products, usage instructions and safety precautions.");
	data8.put("Address", "440 QA Desert Road");
	data8.put("City", "Phoenix");
	data8.put("Delivery State", "Arizona");
	data8.put("Zipcode", "85004");
	data8.put("Cardholder Name", "Sofia Kuznetsova");
	data8.putAll(Shared_Checkout_Data);

	// Dataset 9 - Wellness Starter Kit - Monthly Recurring - Complete Kit
	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Product Name", "Wellness Starter Kit");
	data9.put("Treatment Variant", "Complete Kit");
	data9.put("Subscription Type", "Monthly / 30-Day Recurring");
	data9.put("VRIO Offer ID", "337");
	data9.put("VRIO Product ID", "3955");
	data9.put("First Name", "Anastasia");
	data9.put("Last Name", "Petrova");
	data9.put("Email", "anastasia.petrova.astermd26101305@yopmail.com");
	data9.put("Phone", "2025550164");
	data9.put("Date of Birth", "09/28/1991");
	data9.put("State", "Colorado");
	data9.put("Unit System", "Imperial (lbs/inches)");
	data9.put("Height", "67");
	data9.put("Weight", "174");
	data9.put("Notes", "I would like to understand the Wellness Starter Kit Complete Kit, recurring delivery arrangements, contents and recommended usage instructions.");
	data9.put("Address", "550 QA Mountain Lane");
	data9.put("City", "Denver");
	data9.put("Delivery State", "Colorado");
	data9.put("Zipcode", "80202");
	data9.put("Cardholder Name", "Anastasia Petrova");
	data9.putAll(Shared_Checkout_Data);

	// Dataset 10 - Digital Body Weight Scale - Multi Shipment
	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Product Name", "Digital Body Weight Scale");
	data10.put("Subscription Type", "Multi Shipment");
	data10.put("VRIO Offer ID", "467");
	data10.put("VRIO Product ID", "3953");
	data10.put("First Name", "Felix");
	data10.put("Last Name", "Wagner");
	data10.put("Email", "felix.wagner.astermd26101310@yopmail.com");
	data10.put("Phone", "2025550169");
	data10.put("Date of Birth", "08/16/1995");
	data10.put("State", "Washington");
	data10.put("Unit System", "Imperial (lbs/inches)");
	data10.put("Height", "69");
	data10.put("Weight", "181");
	data10.put("Notes", "I would like to use the Digital Body Weight Scale for routine weight tracking and understand the product's measurement features.");
	data10.put("Address", "1010 QA Pine Street");
	data10.put("City", "Seattle");
	data10.put("Delivery State", "Washington");
	data10.put("Zipcode", "98101");
	data10.put("Cardholder Name", "Felix Wagner");
	data10.putAll(Shared_Checkout_Data);

	// Dataset 11 - Sharps Disposal Container - One-Time Sale
	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Product Name", "Sharps Disposal Container");
	data11.put("Subscription Type", "One-Time Sale");
	data11.put("VRIO Offer ID", "340");
	data11.put("VRIO Product ID", "3956");
	data11.put("First Name", "Oskar");
	data11.put("Last Name", "Lindberg");
	data11.put("Email", "oskar.lindberg.astermd26101311@yopmail.com");
	data11.put("Phone", "2025550170");
	data11.put("Date of Birth", "02/25/1989");
	data11.put("State", "Ohio");
	data11.put("Unit System", "Imperial (lbs/inches)");
	data11.put("Height", "71");
	data11.put("Weight", "190");
	data11.put("Notes", "I would like information about the Sharps Disposal Container, safe handling, storage and disposal procedures.");
	data11.put("Address", "1110 QA Maple Street");
	data11.put("City", "Columbus");
	data11.put("Delivery State", "Ohio");
	data11.put("Zipcode", "43215");
	data11.put("Cardholder Name", "Oskar Lindberg");
	data11.putAll(Shared_Checkout_Data);

	// Dataset 12 - Alcohol Prep Pads - One-Time Sale
	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Product Name", "Alcohol Prep Pads");
	data12.put("Subscription Type", "One-Time Sale");
	data12.put("VRIO Offer ID", "340");
	data12.put("VRIO Product ID", "3957");
	data12.put("First Name", "Frederik");
	data12.put("Last Name", "Hansen");
	data12.put("Email", "frederik.hansen.astermd26101312@yopmail.com");
	data12.put("Phone", "2025550171");
	data12.put("Date of Birth", "10/03/1991");
	data12.put("State", "Oregon");
	data12.put("Unit System", "Imperial (lbs/inches)");
	data12.put("Height", "70");
	data12.put("Weight", "186");
	data12.put("Notes", "I would like information about Alcohol Prep Pads, packaging, intended usage and relevant safety precautions.");
	data12.put("Address", "1210 QA River Road");
	data12.put("City", "Portland");
	data12.put("Delivery State", "Oregon");
	data12.put("Zipcode", "97204");
	data12.put("Cardholder Name", "Frederik Hansen");
	data12.putAll(Shared_Checkout_Data);

	// Dataset 13 - Injection Supply Kit - One-Time Sale
	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Product Name", "Injection Supply Kit");
	data13.put("Subscription Type", "One-Time Sale");
	data13.put("VRIO Offer ID", "340");
	data13.put("VRIO Product ID", "3958");
	data13.put("First Name", "Adrian");
	data13.put("Last Name", "Kowalski");
	data13.put("Email", "adrian.kowalski.astermd26101313@yopmail.com");
	data13.put("Phone", "2025550172");
	data13.put("Date of Birth", "01/27/1990");
	data13.put("State", "Nevada");
	data13.put("Unit System", "Imperial (lbs/inches)");
	data13.put("Height", "72");
	data13.put("Weight", "203");
	data13.put("Notes", "I would like information about the Injection Supply Kit contents, storage recommendations and safe usage guidelines.");
	data13.put("Address", "1310 QA Valley Avenue");
	data13.put("City", "Las Vegas");
	data13.put("Delivery State", "Nevada");
	data13.put("Zipcode", "89101");
	data13.put("Cardholder Name", "Adrian Kowalski");
	data13.putAll(Shared_Checkout_Data);

	return new Object[][] {/*
		{ data1 }, */
		{ data2 }, /*
		{ data3 },
		{ data4 },
		{ data5 },
		{ data6 },
		{ data7 },
		{ data8 },
		{ data9 },
		{ data10 },
		{ data11 },
		{ data12 },
		{ data13 } */
	};
}





	





@Test(dataProvider="Storefront_Product_Data")
public void Product_Choose(TreeMap<String, String> Product_data) throws IOException, InterruptedException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	// Manual Flow Switch
	boolean Proceed_To_Checkout_Directly = true;

	String Product_Name = Product_data.get("Product Name");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                  STOREFRONT PRODUCT");
	System.out.println("============================================================");
	System.out.println("Expected Product : " + Product_Name);
	System.out.println("Flow             : " + (Proceed_To_Checkout_Directly ? "Direct Checkout" : "Assessment Checkout"));

	Report_Listen.log_print_in_report().info("Storefront Product: " + Product_Name);

	Store_Front_lander();

	WebElement Prod_Section = p.Treatments_Product_Section();
	rp.movetoelement(Prod_Section);

	List<WebElement> Medicine_Cards = p.Product_Cards();

	for(WebElement Medicine_Card : Medicine_Cards){

		String Medicine_Name = Medicine_Card.findElement(By.xpath(".//h3")).getText().trim();

		if(Medicine_Name.equalsIgnoreCase(Product_Name)){

			WebElement Add_to_Cart_Button = Medicine_Card.findElement(By.xpath(".//a[contains(@class,'inline-flex items-center justify-center gap-2 rounded-sm border border-border')]"));

			rp.movetoelement(Add_to_Cart_Button);
			Add_to_Cart_Button.click();

			System.out.println("---------------- PRODUCT SELECTION ----------------");
			System.out.println("Expected : " + Product_Name);
			System.out.println("Actual   : " + Medicine_Name);
			System.out.println("Result   : PASS");

			Report_Listen.log_print_in_report().pass("Product selected: " + Medicine_Name);

			// Secondary Product Selection
			if(rp.check_element_visibility(p.Optional_Second_Treatment_List(), 2)){

				Second_Product_List_Product_Choose(Product_Name);

				Report_Listen.log_print_in_report().pass("Secondary Product selected successfully.");
			}

			// Select Checkout Flow
			if(Proceed_To_Checkout_Directly){

				System.out.println("---------------- DIRECT CHECKOUT ----------------");

				WebElement Proceed_Button = p.Proceed_To_Checkout_Button();

				rp.movetoelement(Proceed_Button);
				Proceed_Button.click();

				System.out.println("Action : Proceed to Checkout");
				System.out.println("Result : PASS");

				Report_Listen.log_print_in_report().pass("Proceed to Checkout clicked successfully.");
			}
			else{

				if(rp.check_element_visibility(p.Optional_Start_Assessment_Buttons(), 2)){

					WebElement Assesment_Button = p.Star_Assesment_Button();

					Assesment_executor(Assesment_Button, Product_data);

					Report_Listen.log_print_in_report().pass("Product assessment completed successfully.");
				}
			}

			// Common Checkout Execution
			System.out.println("---------------- CHECKOUT ----------------");
			System.out.println("Action : Enter Contact, Delivery and Payment Details");

			Report_Listen.log_print_in_report().info("Starting Storefront Checkout.");

			Checkout_Manager(Product_data);

			// Collect Order Details
			TreeMap<String, String> Actual_Order_Details = Order_Details_Collector();

			System.out.println("---------------- ORDER DETAILS ----------------");
			System.out.println("Order Number : " + Actual_Order_Details.get("Order Number"));
			System.out.println("Product      : " + Actual_Order_Details.get("Product Name"));
			System.out.println("Total        : " + Actual_Order_Details.get("Total"));
			System.out.println("Result       : COLLECTION COMPLETED");

			Report_Listen.log_print_in_report().info("Order Details collected for Order: " + Actual_Order_Details.get("Order Number"));

			System.out.println();
			System.out.println("============================================================");
			System.out.println("                 STOREFRONT FLOW COMPLETED");
			System.out.println("============================================================");
			System.out.println("Product : " + Product_Name);
			System.out.println("Order   : " + Actual_Order_Details.get("Order Number"));
			System.out.println("Result  : PASS");

			Report_Listen.log_print_in_report().pass("Storefront flow completed for Product: " + Product_Name);

			break;
		}

		if(Medicine_Card.equals(Medicine_Cards.get(Medicine_Cards.size()-1))){

			System.out.println("Result : FAIL");
			System.out.println("Reason : Product not found: " + Product_Name);

			Report_Listen.log_print_in_report().fail("Product not found: " + Product_Name);

			throw new NoSuchElementException("Product not found: " + Product_Name);
		}
	}
}



public void Second_Product_List_Product_Choose(String Product_name) throws IOException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	System.out.println();
	System.out.println("---------------- SECONDARY PRODUCT SELECTION ----------------");
	System.out.println("Expected : " + Product_name);
	Report_Listen.log_print_in_report().info("Selecting Product from secondary list: " + Product_name);

	WebElement Treatment_List = p.Second_Treatment_List();
	List<WebElement> Medicine_Cards = Treatment_List.findElements(By.xpath(".//article"));

	for(WebElement Medicine_Card : Medicine_Cards){

		String Medicine_Name = Medicine_Card.findElement(By.xpath(".//h2")).getText().trim();

		if(Medicine_Name.equalsIgnoreCase(Product_name)){
			WebElement Add_to_Cart_Button = Medicine_Card.findElement(By.xpath(".//a[contains(@class,'bg-primary')]"));
			rp.movetoelement(Add_to_Cart_Button);
			Add_to_Cart_Button.click();
			System.out.println("Actual : " + Medicine_Name);
			System.out.println("Result : PASS");
			Report_Listen.log_print_in_report().pass("Secondary Product selected: " + Medicine_Name);
			break;
		}

		if(Medicine_Card.equals(Medicine_Cards.get(Medicine_Cards.size()-1))){
			Report_Listen.log_print_in_report().fail("Product not found in secondary list: " + Product_name);
			throw new NoSuchElementException("Product not found in secondary list: " + Product_name);
		}
	}
}
public void Assesment_executor(WebElement Assesment_Button, TreeMap<String, String> Form_Data) throws IOException, InterruptedException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Form_Data.get("Product Name");

	System.out.println();
	System.out.println("================ PATIENT ASSESSMENT ================");
	System.out.println("Product : " + Product_Name);
	Report_Listen.log_print_in_report().info("Starting Patient Assessment for Product: " + Product_Name);

	rp.movetoelement(Assesment_Button);
	Assesment_Button.click();
	Thread.sleep(800);

	List<WebElement> Intake_Forms = p.Optional_Medical_Intake_Forms();

	if(Intake_Forms.isEmpty()){
		p.Address_Field();
		Report_Listen.log_print_in_report().info("Direct checkout; no medical intake for: " + Product_Name);
		return;
	}

	WebElement Assesment_form = Intake_Forms.get(0);
	p.Medical_Intake_Active_Page();

	if("1".equals(Assesment_form.getAttribute("data-intake-blocked"))){
		Report_Listen.log_print_in_report().fail("Unsupported required medical questions: " + Product_Name);
		throw new IllegalStateException("Medical Intake is blocked by unsupported questions: " + Product_Name);
	}

	WebElement First_Name_Field = p.Intake_First_Name();
	WebElement Last_Name_Field = p.Intake_Last_Name();
	WebElement Email_Field = p.Intake_Email();
	WebElement Phone_Field = p.Intake_Phone();

	rp.movetoelement(First_Name_Field);
	First_Name_Field.sendKeys(Form_Data.get("First Name"));
	rp.movetoelement(Last_Name_Field);
	Last_Name_Field.sendKeys(Form_Data.get("Last Name"));
	rp.movetoelement(Email_Field);
	Email_Field.sendKeys(Form_Data.get("Email"));
	rp.movetoelement(Phone_Field);
	Phone_Field.sendKeys(Form_Data.get("Phone"));

	System.out.println("---------------- PERSONAL INFORMATION ----------------");
	System.out.println("Patient : " + Form_Data.get("First Name") + " " + Form_Data.get("Last Name"));
	System.out.println("Email   : " + Form_Data.get("Email"));
	Report_Listen.log_print_in_report().pass("Patient information entered for: " + Product_Name);

	List<WebElement> Birth_Date_Fields = p.Intake_Birth_Date();
	List<WebElement> State_Dropdowns = p.Intake_State();
	List<WebElement> Unit_System_Dropdowns = p.Intake_Unit_System();
	List<WebElement> Height_Fields = p.Intake_Height();
	List<WebElement> Weight_Fields = p.Intake_Weight();

	if(!Birth_Date_Fields.isEmpty()){
		WebElement Birth_Date = Birth_Date_Fields.get(0);
		rp.movetoelement(Birth_Date);
		Birth_Date.sendKeys(Form_Data.get("Date of Birth"));
	}
	if(!State_Dropdowns.isEmpty()){
		WebElement State = State_Dropdowns.get(0);
		rp.movetoelement(State);
		new Select(State).selectByVisibleText(Form_Data.get("State"));
	}
	if(!Unit_System_Dropdowns.isEmpty()){
		WebElement Unit_System = Unit_System_Dropdowns.get(0);
		rp.movetoelement(Unit_System);
		new Select(Unit_System).selectByVisibleText(Form_Data.get("Unit System"));
	}
	if(!Height_Fields.isEmpty()){
		WebElement Height = Height_Fields.get(0);
		rp.movetoelement(Height);
		Height.sendKeys(Form_Data.get("Height"));
	}
	if(!Weight_Fields.isEmpty()){
		WebElement Weight = Weight_Fields.get(0);
		rp.movetoelement(Weight);
		Weight.sendKeys(Form_Data.get("Weight"));
	}

	List<WebElement> Goal_Fields = p.Medical_Intake_Goal_Fields();

	for(WebElement Goal_Field : Goal_Fields){
		String Goal_Name = Goal_Field.getAttribute("data-intake-field");
		String Goal_Value = Form_Data.getOrDefault("Q&A " + Goal_Name, Goal_Name.equals("weight_loss_goal") ? "havent-decided" : "general-wellness");
		WebElement Goal_Label = Goal_Field.findElement(By.xpath(".//label[.//input[@value='" + Goal_Value + "']]"));
		rp.movetoelement(Goal_Label);
		Goal_Label.click();
		System.out.println("Goal : " + Goal_Value);
	}

	WebElement Continue_Button = Product_Name.equalsIgnoreCase("NAD+ Injectable") ? p.Continue_Button() : p.Medical_Intake_Next_Button();
	rp.movetoelement(Continue_Button);
	Continue_Button.click();

	if(Product_Name.equalsIgnoreCase("NAD+ Injectable")){
		Q_and_A_Resolver(Form_Data);
	}
	else{
		Medical_Q_and_A_Resolver(Assesment_form, Form_Data);
	}

	System.out.println("================ ASSESSMENT STEP COMPLETED ================");
	System.out.println("Product : " + Product_Name);
	System.out.println("Result  : PASS");
	Report_Listen.log_print_in_report().pass("Patient Assessment completed: " + Product_Name);
}
public void Q_and_A_Resolver(TreeMap<String, String> Form_Data) throws IOException, InterruptedException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	System.out.println();
	System.out.println("---------------- NAD+ QUESTIONNAIRE ----------------");
	Report_Listen.log_print_in_report().info("Processing NAD+ assessment questionnaire.");

	for(int Page_Number=1; Page_Number<=6; Page_Number++){

		p.Medical_Intake_Active_Page();
		List<WebElement> Option_Labels = p.Intake_Option_Labels();

		if(Page_Number==6){
			WebElement Notes_Field = p.Notes_textarea();
			rp.movetoelement(Notes_Field);
			Notes_Field.sendKeys(Form_Data.get("Notes"));
			Report_Listen.log_print_in_report().pass("Assessment Notes entered successfully.");
		}

		for(WebElement Option_Label : Option_Labels){

			String Option_Text = Option_Label.getText().trim();

			if(Option_Label.isDisplayed() && ((Page_Number==2 && (Option_Text.contains("health") || Option_Text.contains("No"))) || (Page_Number==6 && Option_Text.toLowerCase().contains("consent")) || (Page_Number!=2 && Page_Number!=6 && (Option_Text.equalsIgnoreCase("None") || Option_Text.contains("No"))))){
				rp.movetoelement(Option_Label);
				Option_Label.click();
			}
		}

		if(Page_Number==4){
			List<WebElement> Pregnancy_Options = p.Optional_Pregnancy_Status_No_Options();
			if(!Pregnancy_Options.isEmpty() && Pregnancy_Options.get(0).isDisplayed()){
				WebElement Pregnancy_No = Pregnancy_Options.get(0);
				rp.movetoelement(Pregnancy_No);
				Pregnancy_No.click();
			}
		}

		WebElement Continue_Button = p.NAD_Next_Button();
		rp.movetoelement(Continue_Button);
		Continue_Button.click();

		System.out.println("Page " + Page_Number + " : COMPLETED");
		Report_Listen.log_print_in_report().pass("NAD+ Assessment Page " + Page_Number + " completed.");
	}

	System.out.println("Action : Continue to Review");
	System.out.println("Result : PASS");
	Report_Listen.log_print_in_report().pass("NAD+ Assessment questionnaire Continue button clicked successfully.");
}



public void Checkout_Manager(TreeMap<String, String> Form_Data){

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Form_Data.get("Product Name");
	String First_Name = Form_Data.get("First Name");
	String Last_Name = Form_Data.get("Last Name");
	String Email = Form_Data.get("Email");
	String Phone = Form_Data.get("Phone");
	String Address = Form_Data.get("Address");
	String City = Form_Data.get("City");
	String State = Form_Data.get("Delivery State");
	String Zipcode = Form_Data.get("Zipcode");
	String Card_Number = Form_Data.get("Card Number");
	String Expiry = Form_Data.get("Expiry Date");
	String CVV = Form_Data.get("Security Code");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                     STOREFRONT CHECKOUT");
	System.out.println("============================================================");
	System.out.println("Product : " + Product_Name);

	Report_Listen.log_print_in_report().info("Starting checkout for: " + Product_Name);

	for(int Attempt=1; Attempt<=2; Attempt++){

		System.out.println("---------------- CHECKOUT ATTEMPT " + Attempt + " ----------------");

		Report_Listen.log_print_in_report().info("Checkout Attempt: " + Attempt + " | Product: " + Product_Name);

		// Existing Checkout Error Check
		Boolean Checkout_Error = rp.check_element_visibility(p.Checkout_Retryable_Errors(), 2);

		if(Checkout_Error && Attempt==1){

			System.out.println("Checkout Error : Detected");
			System.out.println("Action         : Hard Refresh");

			Report_Listen.log_print_in_report().warning("Checkout error detected before submission. Refreshing checkout page.");

			rp.Hard_Refresh();
		}

		p.Address_Field();

		Checkout_Error = rp.check_element_visibility(p.Checkout_Retryable_Errors(), 2);

		if(Checkout_Error){

			String Error_Message = p.Checkout_Retryable_Errors().get(0).getText().trim();

			System.out.println("Result : FAIL");
			System.out.println("Reason : " + Error_Message);

			Report_Listen.log_print_in_report().fail("Checkout error remains active: " + Error_Message);

			throw new IllegalStateException("Checkout cannot proceed: " + Error_Message);
		}

		// Treatment Variant and Subscription Selection
		Treatment_Variant_Selector(Form_Data);

		// Contact Information
		WebElement Email_Field = p.Checkout_Email();
		WebElement Phone_Field = p.Checkout_Phone();
		WebElement First_Name_Field = p.Checkout_First_Name();
		WebElement Last_Name_Field = p.Checkout_Last_Name();

		System.out.println("---------------- CONTACT INFORMATION ----------------");

		rp.movetoelement(Email_Field);
		Email_Field.clear();
		Email_Field.sendKeys(Email);

		rp.movetoelement(Phone_Field);
		Phone_Field.clear();
		Phone_Field.sendKeys(Phone);

		rp.movetoelement(First_Name_Field);
		First_Name_Field.clear();
		First_Name_Field.sendKeys(First_Name);

		rp.movetoelement(Last_Name_Field);
		Last_Name_Field.clear();
		Last_Name_Field.sendKeys(Last_Name);

		System.out.println("First Name : " + First_Name);
		System.out.println("Last Name  : " + Last_Name);
		System.out.println("Email      : " + Email);
		System.out.println("Phone      : " + Phone);
		System.out.println("Result     : PASS");

		Report_Listen.log_print_in_report().pass("Checkout contact information entered successfully.");

		// Delivery Information
		WebElement Address_Field = p.Address_Field();
		WebElement City_Field = p.City_Field();
		WebElement State_Dropdown = p.State_Dropdown();
		WebElement Zipcode_Field = p.Zipcode_Field();

		System.out.println("---------------- DELIVERY DETAILS ----------------");

		rp.movetoelement(Address_Field);
		Address_Field.clear();
		Address_Field.sendKeys(Address);

		rp.movetoelement(City_Field);
		City_Field.clear();
		City_Field.sendKeys(City);

		rp.movetoelement(State_Dropdown);
		new Select(State_Dropdown).selectByVisibleText(State);

		rp.movetoelement(Zipcode_Field);
		Zipcode_Field.clear();
		Zipcode_Field.sendKeys(Zipcode);

		System.out.println("Address : " + Address);
		System.out.println("City    : " + City);
		System.out.println("State   : " + State);
		System.out.println("Zipcode : " + Zipcode);
		System.out.println("Result  : PASS");

		Report_Listen.log_print_in_report().pass("Checkout delivery details entered successfully.");

		// Payment Information
		WebElement Card_num = p.Card_Number();
		WebElement Expiry_Date = p.expiry_date();
		WebElement Security_Code = p.Security_Code();

		System.out.println("---------------- PAYMENT DETAILS ----------------");

		rp.movetoelement(Card_num);
		Card_num.clear();
		Card_num.sendKeys(Card_Number);

		rp.movetoelement(Expiry_Date);
		Expiry_Date.clear();
		Expiry_Date.sendKeys(Expiry);

		rp.movetoelement(Security_Code);
		Security_Code.clear();
		Security_Code.sendKeys(CVV);

		System.out.println("Payment Method : Credit Card");
		System.out.println("Card Details   : Entered");
		System.out.println("Result         : PASS");

		Report_Listen.log_print_in_report().pass("Checkout payment details entered successfully.");

		// Required Agreements
		List<WebElement> Checkboxes = p.Agree_Checkboxes();

		for(WebElement Checkbox : Checkboxes){

			WebElement Checkbox_Input = Checkbox.findElement(By.xpath(".//input[@type='checkbox']"));

			if(!Checkbox_Input.isSelected()){
				rp.movetoelement(Checkbox);
				Checkbox.click();
			}
		}

		System.out.println("---------------- AGREEMENTS ----------------");
		System.out.println("Result : COMPLETED");

		Report_Listen.log_print_in_report().pass("Required agreements selected successfully.");

		// Submit Checkout
		WebElement Pay_Button = p.Checkout_Pay_Button();

		rp.movetoelement(Pay_Button);
		Pay_Button.click();

		System.out.println("---------------- ORDER CONFIRMATION ----------------");

		Checkout_Error = rp.check_element_visibility(p.Checkout_Retryable_Errors(), 3);

		if(Checkout_Error){

			String Error_Message = p.Checkout_Retryable_Errors().get(0).getText().trim();

			System.out.println("Result : WARNING");
			System.out.println("Reason : " + Error_Message);

			Report_Listen.log_print_in_report().warning("Checkout submission failed: " + Error_Message);

			if(Attempt==2){

				Report_Listen.log_print_in_report().fail("Checkout failed after retry: " + Error_Message);

				throw new IllegalStateException("Checkout retry failed: " + Error_Message);
			}

			System.out.println("Action : Hard Refresh and retry checkout");

			rp.Hard_Refresh();
		}
		else{

			try{

				WebElement Thank_You_Message = p.Thank_You_Message();

				String Expected_Message = "Thank you, " + First_Name + "!";
				String Actual_Message = Thank_You_Message.getText().trim();

				System.out.println("Expected : " + Expected_Message);
				System.out.println("Actual   : " + Actual_Message);

				if(!Actual_Message.equalsIgnoreCase(Expected_Message)){

					System.out.println("Result : FAIL");

					Report_Listen.log_print_in_report().fail("Order confirmation mismatch. Expected: " + Expected_Message + " | Actual: " + Actual_Message);

					throw new IllegalStateException("Order confirmation validation failed.");
				}

				System.out.println("Result  : PASS");
				System.out.println("Status  : Order submitted successfully");
				System.out.println("Attempt : " + Attempt);

				Report_Listen.log_print_in_report().pass("Order confirmation validated: " + Actual_Message);
				Report_Listen.log_print_in_report().pass("Storefront checkout completed for: " + Product_Name);

				return;
			}
			catch(org.openqa.selenium.TimeoutException e){

				Checkout_Error = rp.check_element_visibility(p.Checkout_Retryable_Errors(), 2);

				if(!Checkout_Error){

					Report_Listen.log_print_in_report().fail("Checkout result could not be confirmed for: " + Product_Name);

					throw new IllegalStateException("Checkout confirmation not received. Verify order status before retrying.", e);
				}

				if(Attempt==2){

					Report_Listen.log_print_in_report().fail("Checkout error remains active after retry.");

					throw new IllegalStateException("Checkout retry failed.", e);
				}

				System.out.println("Action : Refresh checkout and retry once");

				rp.Hard_Refresh();
			}
		}
	}
}






public void Medical_Q_and_A_Resolver(WebElement Assesment_form, TreeMap<String, String> Form_Data) throws IOException, InterruptedException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Form_Data.get("Product Name");
	int Total_Pages = Integer.parseInt(Assesment_form.getAttribute("data-page-count"));

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                  MEDICAL QUESTIONNAIRE");
	System.out.println("============================================================");
	System.out.println("Product     : " + Product_Name);
	System.out.println("Total Pages : " + Total_Pages);
	Report_Listen.log_print_in_report().info("Starting Medical Questionnaire: " + Product_Name);

	for(int Page_Number=1; Page_Number<Total_Pages; Page_Number++){

		p.Medical_Intake_Active_Page();
		List<WebElement> Question_Fields = p.Medical_Intake_Fields();

		System.out.println("---------------- PAGE " + (Page_Number+1) + " ----------------");

		for(WebElement Question_Field : Question_Fields){

			if(Question_Field.isDisplayed()){

				String Question_Name = Question_Field.getAttribute("data-intake-field");
				String Question_Type = Question_Field.getAttribute("data-intake-type");
				String Answer = Form_Data.getOrDefault("Q&A " + Question_Name, "");

				if("textarea".equals(Question_Type)){
					String Text = Question_Name.equals("additional_notes") ? Form_Data.getOrDefault("Notes", "") : Answer;

					if(!Text.isBlank()){
						WebElement Textarea = Question_Field.findElement(By.tagName("textarea"));
						rp.movetoelement(Textarea);
						Textarea.sendKeys(Text);
						System.out.println("Text Entered : " + Question_Name);
					}
					else if("1".equals(Question_Field.getAttribute("data-intake-required"))){
						throw new IllegalStateException("Required questionnaire answer missing: " + Question_Name);
					}
				}
				else if("choice-multi".equals(Question_Type)){
					String Option_XPath = Answer.isBlank() ? ".//label[.//input[@value='no' or @value='none' or @value='no-first-time' or @value='no-known-allergies' or @value='not-applicable' or @value='consent-to-proceed']]" : ".//label[.//input[@value='" + Answer + "']]";
					WebElement Option_Label = Question_Field.findElement(By.xpath(Option_XPath));
					rp.movetoelement(Option_Label);
					Option_Label.click();
					System.out.println("Question : " + Question_Name + " | Answer : " + Option_Label.getText().trim());
				}
			}
		}

		WebElement Action_Button = Page_Number==Total_Pages-1 ? p.Medical_Intake_Submit_Button() : p.Medical_Intake_Next_Button();
		rp.movetoelement(Action_Button);
		Action_Button.click();

		System.out.println("Page " + (Page_Number+1) + " : COMPLETED");
		Report_Listen.log_print_in_report().pass("Medical Questionnaire Page " + (Page_Number+1) + " completed.");
	}

	System.out.println("Product : " + Product_Name);
	System.out.println("Result  : SUBMISSION ATTEMPTED");
	Report_Listen.log_print_in_report().info("Medical Questionnaire submission attempted: " + Product_Name);
}




public TreeMap<String, String> Order_Details_Collector(){

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	TreeMap<String, String> Order_Details = new TreeMap<String, String>();

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                  ORDER DETAILS COLLECTION");
	System.out.println("============================================================");

	Report_Listen.log_print_in_report().info("Starting Order Details Collection.");

	// Order Confirmation Elements
	WebElement Order_Number = p.Order_Number();
	WebElement Thank_You_Message = p.Thank_You_Message();
	WebElement Order_Status = p.Order_Status();
	WebElement Doctor_Review_Status = p.Doctor_Review_Status();
	WebElement Prescription_Status = p.Prescription_Status();

	// Customer and Address Elements
	WebElement Order_Email = p.Order_Email();
	WebElement Order_Phone = p.Order_Phone();
	WebElement Payment_Method = p.Payment_Method();
	WebElement Shipping_Address = p.Shipping_Address();
	WebElement Billing_Address = p.Billing_Address();

	// Product and Payment Summary Elements
	WebElement Order_Product = p.Order_Product();
	WebElement Order_Quantity = p.Order_Quantity();
	WebElement Order_Item_Price = p.Order_Item_Price();
	WebElement Order_Subtotal = p.Order_Subtotal();
	WebElement Consultation_Fee = p.Consultation_Fee();
	WebElement Order_Total = p.Order_Total();
	WebElement Payment_Notice = p.Payment_Notice();

	// Collect Order Confirmation
	rp.movetoelement(Order_Status);

	Order_Details.put("Order Number", Order_Number.getText().trim());
	Order_Details.put("Thank You Message", Thank_You_Message.getText().trim());
	Order_Details.put("Order Status", Order_Status.getText().trim());
	Order_Details.put("Doctor Review Status", Doctor_Review_Status.getText().trim());
	Order_Details.put("Prescription Status", Prescription_Status.getText().trim());

	// Collect Customer and Address Details
	rp.movetoelement(Order_Email);

	Order_Details.put("Email", Order_Email.getText().trim());
	Order_Details.put("Phone", Order_Phone.getText().trim());
	Order_Details.put("Payment Method", Payment_Method.getText().trim());
	Order_Details.put("Shipping Address", Shipping_Address.getText().trim());
	Order_Details.put("Billing Address", Billing_Address.getText().trim());

	// Collect Product Details
	rp.movetoelement(Order_Product);

	Order_Details.put("Product Name", Order_Product.getText().trim());
	Order_Details.put("Quantity", Order_Quantity.getText().trim());
	Order_Details.put("Item Price", Order_Item_Price.getText().trim());

	// Collect Order Payment Details
	rp.movetoelement(Order_Total);

	Order_Details.put("Subtotal", Order_Subtotal.getText().trim());
	Order_Details.put("Consultation Fee", Consultation_Fee.getText().trim());
	Order_Details.put("Total", Order_Total.getText().trim());
	Order_Details.put("Payment Notice", Payment_Notice.getText().trim());

	System.out.println("---------------- COLLECTED ORDER DETAILS ----------------");
	System.out.println("Order Number        : " + Order_Details.get("Order Number"));
	System.out.println("Product             : " + Order_Details.get("Product Name"));
	System.out.println("Quantity            : " + Order_Details.get("Quantity"));
	System.out.println("Total               : " + Order_Details.get("Total"));
	System.out.println("Order Status        : " + Order_Details.get("Order Status"));
	System.out.println("Doctor Review       : " + Order_Details.get("Doctor Review Status"));
	System.out.println("Prescription Status : " + Order_Details.get("Prescription Status"));
	System.out.println("Fields Collected    : " + Order_Details.size());
	System.out.println("Result              : COLLECTION COMPLETED");

	Report_Listen.log_print_in_report().info("Order Number: " + Order_Details.get("Order Number"));
	Report_Listen.log_print_in_report().info("Product: " + Order_Details.get("Product Name"));
	Report_Listen.log_print_in_report().info("Total: " + Order_Details.get("Total"));
	Report_Listen.log_print_in_report().info("Order details collected successfully. Fields: " + Order_Details.size());

	return Order_Details;
}




public void Treatment_Variant_Selector(TreeMap<String, String> Form_Data){

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Form_Data.get("Product Name");
	String Expected_Variant = Form_Data.get("Treatment Variant");
	String Expected_Subscription = Form_Data.get("Subscription Type");

	Boolean Variant_Presence = rp.check_element_visibility(p.Optional_Treatment_Plan_Options(), 2);

	if(!Variant_Presence){

		System.out.println("---------------- TREATMENT VARIANT ----------------");
		System.out.println("Product : " + Product_Name);
		System.out.println("Variant : Not available");
		System.out.println("Action  : Continue checkout");

		Report_Listen.log_print_in_report().info("No treatment variant panel displayed for: " + Product_Name + ". Continuing checkout.");

		return;
	}

	if(Expected_Variant == null || Expected_Variant.isBlank()){

		System.out.println("Treatment Variant : Keeping default selection");

		Report_Listen.log_print_in_report().info("No treatment variant supplied for: " + Product_Name + ". Keeping default selection.");

		return;
	}

	List<WebElement> Treatment_Plans = p.Optional_Treatment_Plan_Options();

	System.out.println();
	System.out.println("---------------- TREATMENT VARIANT SELECTION ----------------");
	System.out.println("Product          : " + Product_Name);
	System.out.println("Expected Variant : " + Expected_Variant);

	for(WebElement Treatment_Plan : Treatment_Plans){

		WebElement Variant_Label = Treatment_Plan.findElement(By.xpath(".//span[contains(@class,'block') and contains(@class,'font-semibold')]"));

		String Actual_Variant = Variant_Label.getText().trim();
		String Normalized_Expected_Variant = Expected_Variant.replaceAll("[,\\s]+$", "");
		String Normalized_Actual_Variant = Actual_Variant.replaceAll("[,\\s]+$", "");

		if(Normalized_Actual_Variant.equalsIgnoreCase(Normalized_Expected_Variant)){

			String Actual_Billing = Treatment_Plan.findElement(By.xpath(".//span[contains(@class,'block') and contains(@class,'text-muted')]")).getText().trim();

			if(!"true".equalsIgnoreCase(Treatment_Plan.getAttribute("aria-pressed"))){

				rp.movetoelement(Treatment_Plan);
				Treatment_Plan.click();
			}

			System.out.println("Actual Variant   : " + Actual_Variant);
			System.out.println("Admin Mapping    : " + Expected_Subscription);
			System.out.println("Storefront Label : " + Actual_Billing);
			System.out.println("Result           : PASS");

			Report_Listen.log_print_in_report().pass("Treatment variant selected successfully: " + Product_Name + " | " + Actual_Variant);

			if(Expected_Subscription != null && Expected_Subscription.contains("Recurring") && Actual_Billing.equalsIgnoreCase("Billed once")){

				System.out.println("WARNING : Storefront billing label differs from Admin subscription mapping.");

				Report_Listen.log_print_in_report().warning("Subscription display mismatch for " + Product_Name + " | " + Actual_Variant + ". Admin: " + Expected_Subscription + " | Storefront: " + Actual_Billing);
			}

			return;
		}
	}

	Report_Listen.log_print_in_report().fail("Requested treatment variant not found: " + Product_Name + " | " + Expected_Variant);

	throw new IllegalStateException("Requested treatment variant not found: " + Expected_Variant);
}


	
	
	
	
	
}
