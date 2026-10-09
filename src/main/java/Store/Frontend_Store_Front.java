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

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Product Name", "NAD+ Injectable");
	data1.put("First Name", "Raisa");
	data1.put("Last Name", "Belova");
	data1.put("Email", "raisa.belova.astermdqa260901@yopmail.com");
	data1.put("Phone", "2025550180");
	data1.put("Date of Birth", "02/14/1990");
	data1.put("State", "Alabama");
	data1.put("Unit System", "Metric (kg/cm)");
	data1.put("Height", "78");
	data1.put("Weight", "79");
	data1.put("Notes", "I would like to understand the NAD+ Injectable treatment process, expected consultation requirements, recommended monitoring, and any precautions that should be discussed before beginning treatment.");
	data1.put("Address", "101 QA Meadow Lane");
	data1.put("City", "Birmingham");
	data1.put("Delivery State", "Alabama");
	data1.put("Zipcode", "35203");
	data1.put("Cardholder Name", "Raisa Belova");
	data1.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Product Name", "Digital Body Weight Scale");
	data2.put("First Name", "Leander");
	data2.put("Last Name", "Vogt");
	data2.put("Email", "leander.vogt.astermdqa260902@yopmail.com");
	data2.put("Phone", "2025550181");
	data2.put("Date of Birth", "06/23/1993");
	data2.put("State", "Alaska");
	data2.put("Unit System", "Imperial (lbs/inches)");
	data2.put("Height", "65");
	data2.put("Weight", "138");
	data2.put("Notes", "I am interested in using the Digital Body Weight Scale to monitor my weight regularly and would appreciate guidance on recording accurate measurements.");
	data2.put("Address", "202 QA Harbor Avenue");
	data2.put("City", "Anchorage");
	data2.put("Delivery State", "Alaska");
	data2.put("Zipcode", "99501");
	data2.put("Cardholder Name", "Leander Vogt");
	data2.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Product Name", "Tirzepatide");
	data3.put("First Name", "Ilya");
	data3.put("Last Name", "Gromov");
	data3.put("Email", "ilya.gromov.astermdqa260903@yopmail.com");
	data3.put("Phone", "2025550182");
	data3.put("Date of Birth", "10/07/1987");
	data3.put("State", "Arizona");
	data3.put("Unit System", "Metric (kg/cm)");
	data3.put("Height", "82");
	data3.put("Weight", "96");
	data3.put("Notes", "I would like to discuss whether Tirzepatide is an appropriate option based on my medical history, current weight, lifestyle, and treatment goals.");
	data3.put("Address", "303 QA Desert Road");
	data3.put("City", "Phoenix");
	data3.put("Delivery State", "Arizona");
	data3.put("Zipcode", "85004");
	data3.put("Cardholder Name", "Ilya Gromov");
	data3.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Product Name", "Testosterone Injectable");
	data4.put("First Name", "Petar");
	data4.put("Last Name", "Novak");
	data4.put("Email", "petar.novak.astermdqa260904@yopmail.com");
	data4.put("Phone", "2025550183");
	data4.put("Date of Birth", "04/18/1984");
	data4.put("State", "Arkansas");
	data4.put("Unit System", "Imperial (lbs/inches)");
	data4.put("Height", "72");
	data4.put("Weight", "205");
	data4.put("Notes", "I would like to understand the evaluation, laboratory testing, follow-up requirements, and potential risks associated with Testosterone Injectable treatment.");
	data4.put("Address", "404 QA River Street");
	data4.put("City", "Little Rock");
	data4.put("Delivery State", "Arkansas");
	data4.put("Zipcode", "72201");
	data4.put("Cardholder Name", "Petar Novak");
	data4.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Product Name", "Wellness Starter Kit");
	data5.put("First Name", "Milena");
	data5.put("Last Name", "Zoric");
	data5.put("Email", "milena.zoric.astermdqa260905@yopmail.com");
	data5.put("Phone", "2025550184");
	data5.put("Date of Birth", "12/11/1996");
	data5.put("State", "California");
	data5.put("Unit System", "Metric (kg/cm)");
	data5.put("Height", "65");
	data5.put("Weight", "63");
	data5.put("Notes", "I am interested in the Wellness Starter Kit and would appreciate information about its contents, intended usage, and any specific usage precautions.");
	data5.put("Address", "505 QA Sunset Boulevard");
	data5.put("City", "Los Angeles");
	data5.put("Delivery State", "California");
	data5.put("Zipcode", "90012");
	data5.put("Cardholder Name", "Milena Zoric");
	data5.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Product Name", "Semaglutide");
	data6.put("First Name", "Valentin");
	data6.put("Last Name", "Kravets");
	data6.put("Email", "valentin.kravets.astermdqa260906@yopmail.com");
	data6.put("Phone", "2025550185");
	data6.put("Date of Birth", "09/25/1991");
	data6.put("State", "Colorado");
	data6.put("Unit System", "Imperial (lbs/inches)");
	data6.put("Height", "66");
	data6.put("Weight", "181");
	data6.put("Notes", "I would like to discuss Semaglutide treatment eligibility, possible side effects, follow-up consultations, and the importance of monitoring my progress.");
	data6.put("Address", "606 QA Mountain View Lane");
	data6.put("City", "Denver");
	data6.put("Delivery State", "Colorado");
	data6.put("Zipcode", "80202");
	data6.put("Cardholder Name", "Valentin Kravets");
	data6.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Product Name", "NAD+ Injectable");
	data7.put("First Name", "Freya");
	data7.put("Last Name", "Lindholm");
	data7.put("Email", "freya.lindholm.astermdqa260907@yopmail.com");
	data7.put("Phone", "2025550186");
	data7.put("Date of Birth", "01/30/1982");
	data7.put("State", "Connecticut");
	data7.put("Unit System", "Metric (kg/cm)");
	data7.put("Height", "88");
	data7.put("Weight", "92");
	data7.put("Notes", "Before proceeding with NAD+ Injectable, I would like the healthcare provider to review my current supplements, general wellness goals, and any relevant medical considerations.");
	data7.put("Address", "707 QA Capitol Street");
	data7.put("City", "Hartford");
	data7.put("Delivery State", "Connecticut");
	data7.put("Zipcode", "06103");
	data7.put("Cardholder Name", "Freya Lindholm");
	data7.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Product Name", "Digital Body Weight Scale");
	data8.put("First Name", "Casimir");
	data8.put("Last Name", "Nowicki");
	data8.put("Email", "casimir.nowicki.astermdqa260908@yopmail.com");
	data8.put("Phone", "2025550187");
	data8.put("Date of Birth", "07/16/1998");
	data8.put("State", "Delaware");
	data8.put("Unit System", "Imperial (lbs/inches)");
	data8.put("Height", "63");
	data8.put("Weight", "126");
	data8.put("Notes", "I plan to use the Digital Body Weight Scale for regular measurements and would like to know whether the recorded results can be used during future healthcare consultations.");
	data8.put("Address", "808 QA Market Lane");
	data8.put("City", "Wilmington");
	data8.put("Delivery State", "Delaware");
	data8.put("Zipcode", "19801");
	data8.put("Cardholder Name", "Casimir Nowicki");
	data8.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Product Name", "Tirzepatide");
	data9.put("First Name", "Daria");
	data9.put("Last Name", "Melnik");
	data9.put("Email", "daria.melnik.astermdqa260909@yopmail.com");
	data9.put("Phone", "2025550188");
	data9.put("Date of Birth", "03/09/1979");
	data9.put("State", "Florida");
	data9.put("Unit System", "Metric (kg/cm)");
	data9.put("Height", "74");
	data9.put("Weight", "91");
	data9.put("Notes", "I would appreciate a detailed discussion regarding Tirzepatide, including treatment suitability, expected monitoring, dietary considerations, and potential interactions with existing medications.");
	data9.put("Address", "909 QA Palm Court");
	data9.put("City", "Orlando");
	data9.put("Delivery State", "Florida");
	data9.put("Zipcode", "32801");
	data9.put("Cardholder Name", "Daria Melnik");
	data9.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Product Name", "Testosterone Injectable");
	data10.put("First Name", "Henrik");
	data10.put("Last Name", "Dahlgren");
	data10.put("Email", "henrik.dahlgren.astermdqa260910@yopmail.com");
	data10.put("Phone", "2025550189");
	data10.put("Date of Birth", "11/21/1989");
	data10.put("State", "Georgia");
	data10.put("Unit System", "Imperial (lbs/inches)");
	data10.put("Height", "74");
	data10.put("Weight", "224");
	data10.put("Notes", "I would like to discuss symptoms and concerns with a licensed provider before considering Testosterone Injectable. Please advise whether additional medical assessment or laboratory testing is necessary.");
	data10.put("Address", "1010 QA Peachtree Lane");
	data10.put("City", "Atlanta");
	data10.put("Delivery State", "Georgia");
	data10.put("Zipcode", "30303");
	data10.put("Cardholder Name", "Henrik Dahlgren");
	data10.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Product Name", "Wellness Starter Kit");
	data11.put("First Name", "Varvara");
	data11.put("Last Name", "Lysenko");
	data11.put("Email", "varvara.lysenko.astermdqa260911@yopmail.com");
	data11.put("Phone", "2025550190");
	data11.put("Date of Birth", "05/13/1995");
	data11.put("State", "Hawaii");
	data11.put("Unit System", "Metric (kg/cm)");
	data11.put("Height", "61");
	data11.put("Weight", "58");
	data11.put("Notes", "I would like to understand how to incorporate the Wellness Starter Kit into my existing personal-care routine and whether there are any specific usage precautions.");
	data11.put("Address", "1111 QA Ocean View Drive");
	data11.put("City", "Honolulu");
	data11.put("Delivery State", "Hawaii");
	data11.put("Zipcode", "96813");
	data11.put("Cardholder Name", "Varvara Lysenko");
	data11.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Product Name", "Semaglutide");
	data12.put("First Name", "Tadeusz");
	data12.put("Last Name", "Kaczmarek");
	data12.put("Email", "tadeusz.kaczmarek.astermdqa260912@yopmail.com");
	data12.put("Phone", "2025550191");
	data12.put("Date of Birth", "08/27/1985");
	data12.put("State", "Idaho");
	data12.put("Unit System", "Imperial (lbs/inches)");
	data12.put("Height", "67");
	data12.put("Weight", "194");
	data12.put("Notes", "I am interested in discussing whether Semaglutide could be suitable for my circumstances. I would also like guidance regarding follow-up appointments, treatment monitoring, and potential adverse effects.");
	data12.put("Address", "1212 QA Valley Road");
	data12.put("City", "Boise");
	data12.put("Delivery State", "Idaho");
	data12.put("Zipcode", "83702");
	data12.put("Cardholder Name", "Tadeusz Kaczmarek");
	data12.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Product Name", "NAD+ Injectable");
	data13.put("First Name", "Zoya");
	data13.put("Last Name", "Vereshchagina");
	data13.put("Email", "zoya.vereshchagina.astermdqa260913@yopmail.com");
	data13.put("Phone", "2025550192");
	data13.put("Date of Birth", "06/04/1978");
	data13.put("State", "Illinois");
	data13.put("Unit System", "Metric (kg/cm)");
	data13.put("Height", "85");
	data13.put("Weight", "88");
	data13.put("Notes", "My primary objective is to understand the potential benefits, limitations, and risks of NAD+ Injectable. I would appreciate a careful review of my medical history before any treatment decision.");
	data13.put("Address", "1313 QA Lakeshore Lane");
	data13.put("City", "Chicago");
	data13.put("Delivery State", "Illinois");
	data13.put("Zipcode", "60601");
	data13.put("Cardholder Name", "Zoya Vereshchagina");
	data13.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Product Name", "Digital Body Weight Scale");
	data14.put("First Name", "Florian");
	data14.put("Last Name", "Eberhardt");
	data14.put("Email", "florian.eberhardt.astermdqa260914@yopmail.com");
	data14.put("Phone", "2025550193");
	data14.put("Date of Birth", "02/22/1999");
	data14.put("State", "Indiana");
	data14.put("Unit System", "Imperial (lbs/inches)");
	data14.put("Height", "62");
	data14.put("Weight", "118");
	data14.put("Notes", "I want to track changes in my body weight consistently using the Digital Body Weight Scale. Please provide recommendations for maintaining consistent measurement conditions.");
	data14.put("Address", "1414 QA Circle Avenue");
	data14.put("City", "Indianapolis");
	data14.put("Delivery State", "Indiana");
	data14.put("Zipcode", "46204");
	data14.put("Cardholder Name", "Florian Eberhardt");
	data14.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Product Name", "Tirzepatide");
	data15.put("First Name", "Oksana");
	data15.put("Last Name", "Grishina");
	data15.put("Email", "oksana.grishina.astermdqa260915@yopmail.com");
	data15.put("Phone", "2025550194");
	data15.put("Date of Birth", "12/03/1981");
	data15.put("State", "Iowa");
	data15.put("Unit System", "Metric (kg/cm)");
	data15.put("Height", "76");
	data15.put("Weight", "97");
	data15.put("Notes", "I would like the healthcare provider to review my medical background before determining whether Tirzepatide is appropriate. I am particularly interested in understanding treatment eligibility, required follow-up, and safety considerations.");
	data15.put("Address", "1515 QA Prairie Street");
	data15.put("City", "Des Moines");
	data15.put("Delivery State", "Iowa");
	data15.put("Zipcode", "50309");
	data15.put("Cardholder Name", "Oksana Grishina");
	data15.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Product Name", "Testosterone Injectable");
	data16.put("First Name", "Milan");
	data16.put("Last Name", "Vukovic");
	data16.put("Email", "milan.vukovic.astermdqa260916@yopmail.com");
	data16.put("Phone", "2025550195");
	data16.put("Date of Birth", "07/19/1992");
	data16.put("State", "Kansas");
	data16.put("Unit System", "Imperial (lbs/inches)");
	data16.put("Height", "71");
	data16.put("Weight", "196");
	data16.put("Notes", "Before starting Testosterone Injectable, I would like to understand the clinical evaluation process, possible contraindications, necessary laboratory tests, and how treatment response would be monitored.");
	data16.put("Address", "1616 QA Central Avenue");
	data16.put("City", "Wichita");
	data16.put("Delivery State", "Kansas");
	data16.put("Zipcode", "67202");
	data16.put("Cardholder Name", "Milan Vukovic");
	data16.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Product Name", "Wellness Starter Kit");
	data17.put("First Name", "Elizaveta");
	data17.put("Last Name", "Belikova");
	data17.put("Email", "elizaveta.belikova.astermdqa260917@yopmail.com");
	data17.put("Phone", "2025550196");
	data17.put("Date of Birth", "04/26/2000");
	data17.put("State", "Kentucky");
	data17.put("Unit System", "Metric (kg/cm)");
	data17.put("Height", "68");
	data17.put("Weight", "72");
	data17.put("Notes", "I would appreciate detailed instructions regarding the Wellness Starter Kit, including the proper use of each included item, recommended storage conditions, and precautions relevant to sensitive skin.");
	data17.put("Address", "1717 QA Bluegrass Road");
	data17.put("City", "Louisville");
	data17.put("Delivery State", "Kentucky");
	data17.put("Zipcode", "40202");
	data17.put("Cardholder Name", "Elizaveta Belikova");
	data17.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Product Name", "Semaglutide");
	data18.put("First Name", "Pascal");
	data18.put("Last Name", "Moreau");
	data18.put("Email", "pascal.moreau.astermdqa260918@yopmail.com");
	data18.put("Phone", "2025550197");
	data18.put("Date of Birth", "10/15/1988");
	data18.put("State", "Louisiana");
	data18.put("Unit System", "Imperial (lbs/inches)");
	data18.put("Height", "64");
	data18.put("Weight", "157");
	data18.put("Notes", "I would like to discuss Semaglutide with the healthcare provider and understand whether it is suitable for me. Please explain the clinical assessment process, monitoring requirements, potential side effects, and available alternatives.");
	data18.put("Address", "1818 QA Crescent Street");
	data18.put("City", "New Orleans");
	data18.put("Delivery State", "Louisiana");
	data18.put("Zipcode", "70112");
	data18.put("Cardholder Name", "Pascal Moreau");
	data18.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Product Name", "NAD+ Injectable");
	data19.put("First Name", "Vera");
	data19.put("Last Name", "Kolesnikova");
	data19.put("Email", "vera.kolesnikova.astermdqa260919@yopmail.com");
	data19.put("Phone", "2025550198");
	data19.put("Date of Birth", "01/08/1975");
	data19.put("State", "Maine");
	data19.put("Unit System", "Metric (kg/cm)");
	data19.put("Height", "92");
	data19.put("Weight", "90");
	data19.put("Notes", "I am seeking professional guidance about NAD+ Injectable and would like to discuss the available clinical evidence, potential risks, treatment expectations, and whether additional health information is required before proceeding.");
	data19.put("Address", "1919 QA Pine Street");
	data19.put("City", "Portland");
	data19.put("Delivery State", "Maine");
	data19.put("Zipcode", "04101");
	data19.put("Cardholder Name", "Vera Kolesnikova");
	data19.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Product Name", "Digital Body Weight Scale");
	data20.put("First Name", "Arvid");
	data20.put("Last Name", "Nystrom");
	data20.put("Email", "arvid.nystrom.astermdqa260920@yopmail.com");
	data20.put("Phone", "2025550199");
	data20.put("Date of Birth", "09/02/1997");
	data20.put("State", "California");
	data20.put("Unit System", "Imperial (lbs/inches)");
	data20.put("Height", "69");
	data20.put("Weight", "145");
	data20.put("Notes", "I would like information about using the Digital Body Weight Scale for long-term weight tracking, interpreting measurement changes, and sharing recorded values with my healthcare provider during future consultations.");
	data20.put("Address", "2020 QA Pacific Lane");
	data20.put("City", "San Diego");
	data20.put("Delivery State", "California");
	data20.put("Zipcode", "92101");
	data20.put("Cardholder Name", "Arvid Nystrom");
	data20.putAll(Shared_Checkout_Data);

	return new Object[][] {/*
		{ data1 },
		{ data2 },
		{ data3 },
		{ data4 },
		{ data5 },
		{ data6 },
		{ data7 },
		{ data8 },*/
		{ data9 },/*
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
		{ data20 } */
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

			WebElement Add_to_Cart_Button = Medicine_Card.findElement(By.xpath(".//a[contains(@class,'bg-primary')]"));

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

		// Check Existing Checkout Errors
		Boolean Checkout_Error = rp.check_element_visibility(p.Checkout_Retryable_Errors(), 2);

		if(Checkout_Error && Attempt==1){

			System.out.println("Checkout Error : Detected");
			System.out.println("Action         : Hard Refresh");

			Report_Listen.log_print_in_report().warning("Checkout error detected before submission. Refreshing checkout page.");

			rp.Hard_Refresh();
		}

		// Verify Checkout Page
		p.Address_Field();

		Checkout_Error = rp.check_element_visibility(p.Checkout_Retryable_Errors(), 2);

		if(Checkout_Error){

			String Error_Message = p.Checkout_Retryable_Errors().get(0).getText().trim();

			System.out.println("Result : FAIL");
			System.out.println("Reason : " + Error_Message);

			Report_Listen.log_print_in_report().fail("Checkout restriction persists after refresh: " + Error_Message);

			throw new IllegalStateException("Checkout cannot proceed: " + Error_Message);
		}

		// Contact Information Elements
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

		// Delivery Information Elements
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

		// Payment Information Elements
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

		// Detect Both Checkout Errors
		Checkout_Error = rp.check_element_visibility(p.Checkout_Retryable_Errors(), 3);

		if(!Checkout_Error){

			try{

				WebElement Thank_You_Message = p.Thank_You_Message();

				String Expected_Message = "Thank you, " + First_Name + "!";
				String Actual_Message = Thank_You_Message.getText().trim();

				System.out.println("Expected : " + Expected_Message);
				System.out.println("Actual   : " + Actual_Message);

				if(!Actual_Message.equalsIgnoreCase(Expected_Message)){

					System.out.println("Result : FAIL");
					System.out.println("Reason : Order confirmation message mismatch.");

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

					System.out.println("Result : FAIL");
					System.out.println("Reason : Order confirmation not displayed.");

					Report_Listen.log_print_in_report().fail("Checkout result could not be confirmed for: " + Product_Name);

					throw new IllegalStateException("Checkout confirmation not received. Verify order status before attempting another payment.", e);
				}
			}
		}

		// Handle Checkout Error and Retry
		if(Checkout_Error){

			String Error_Message = p.Checkout_Retryable_Errors().get(0).getText().trim();

			System.out.println("Result : WARNING");
			System.out.println("Reason : " + Error_Message);

			Report_Listen.log_print_in_report().warning("Checkout submission failed: " + Error_Message);

			if(Attempt==2){

				System.out.println("Result : FAIL");
				System.out.println("Reason : Checkout error persists after retry.");

				Report_Listen.log_print_in_report().fail("Checkout failed after two attempts. Reason: " + Error_Message);

				throw new IllegalStateException("Checkout retry failed: " + Error_Message);
			}

			System.out.println("Action : Hard Refresh and retry checkout");

			Report_Listen.log_print_in_report().warning("Refreshing checkout and refilling all fields for second attempt.");

			rp.Hard_Refresh();
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


	
	
	
	
	
	
}
