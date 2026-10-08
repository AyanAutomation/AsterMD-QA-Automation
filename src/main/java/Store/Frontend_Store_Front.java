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

public class Frontend_Store_Front extends Patient_Module{
	
	

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

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Product Name", "NAD+ Injectable");
	data1.put("First Name", "Alexei");
	data1.put("Last Name", "Morozov");
	data1.put("Email", "alexei.morozov01@example.com");
	data1.put("Phone", "2025550100");
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
	data1.put("Cardholder Name", "Alexei Morozov");
	data1.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Product Name", "Digital Body Weight Scale");
	data2.put("First Name", "Elena");
	data2.put("Last Name", "Kuznetsova");
	data2.put("Email", "elena.kuznetsova02@example.com");
	data2.put("Phone", "2025550101");
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
	data2.put("Cardholder Name", "Elena Kuznetsova");
	data2.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Product Name", "Tirzepatide");
	data3.put("First Name", "Lukas");
	data3.put("Last Name", "Schneider");
	data3.put("Email", "lukas.schneider03@example.com");
	data3.put("Phone", "2025550102");
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
	data3.put("Cardholder Name", "Lukas Schneider");
	data3.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Product Name", "Testosterone Injectable");
	data4.put("First Name", "Dmitri");
	data4.put("Last Name", "Volkov");
	data4.put("Email", "dmitri.volkov04@example.com");
	data4.put("Phone", "2025550103");
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
	data4.put("Cardholder Name", "Dmitri Volkov");
	data4.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Product Name", "Wellness Starter Kit");
	data5.put("First Name", "Sophie");
	data5.put("Last Name", "Becker");
	data5.put("Email", "sophie.becker05@example.com");
	data5.put("Phone", "2025550104");
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
	data5.put("Cardholder Name", "Sophie Becker");
	data5.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Product Name", "Semaglutide");
	data6.put("First Name", "Anastasia");
	data6.put("Last Name", "Ivanova");
	data6.put("Email", "anastasia.ivanova06@example.com");
	data6.put("Phone", "2025550105");
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
	data6.put("Cardholder Name", "Anastasia Ivanova");
	data6.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Product Name", "NAD+ Injectable");
	data7.put("First Name", "Jonas");
	data7.put("Last Name", "Weber");
	data7.put("Email", "jonas.weber07@example.com");
	data7.put("Phone", "2025550106");
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
	data7.put("Cardholder Name", "Jonas Weber");
	data7.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Product Name", "Digital Body Weight Scale");
	data8.put("First Name", "Anna");
	data8.put("Last Name", "Hoffmann");
	data8.put("Email", "anna.hoffmann08@example.com");
	data8.put("Phone", "2025550107");
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
	data8.put("Cardholder Name", "Anna Hoffmann");
	data8.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Product Name", "Tirzepatide");
	data9.put("First Name", "Nikolai");
	data9.put("Last Name", "Sokolov");
	data9.put("Email", "nikolai.sokolov09@example.com");
	data9.put("Phone", "2025550108");
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
	data9.put("Cardholder Name", "Nikolai Sokolov");
	data9.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Product Name", "Testosterone Injectable");
	data10.put("First Name", "Felix");
	data10.put("Last Name", "Wagner");
	data10.put("Email", "felix.wagner10@example.com");
	data10.put("Phone", "2025550109");
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
	data10.put("Cardholder Name", "Felix Wagner");
	data10.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("Product Name", "Wellness Starter Kit");
	data11.put("First Name", "Maria");
	data11.put("Last Name", "Petrova");
	data11.put("Email", "maria.petrova11@example.com");
	data11.put("Phone", "2025550110");
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
	data11.put("Cardholder Name", "Maria Petrova");
	data11.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("Product Name", "Semaglutide");
	data12.put("First Name", "Olga");
	data12.put("Last Name", "Smirnova");
	data12.put("Email", "olga.smirnova12@example.com");
	data12.put("Phone", "2025550111");
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
	data12.put("Cardholder Name", "Olga Smirnova");
	data12.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("Product Name", "NAD+ Injectable");
	data13.put("First Name", "Maximilian");
	data13.put("Last Name", "Fischer");
	data13.put("Email", "maximilian.fischer13@example.com");
	data13.put("Phone", "2025550112");
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
	data13.put("Cardholder Name", "Maximilian Fischer");
	data13.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("Product Name", "Digital Body Weight Scale");
	data14.put("First Name", "Emilia");
	data14.put("Last Name", "Nowak");
	data14.put("Email", "emilia.nowak14@example.com");
	data14.put("Phone", "2025550113");
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
	data14.put("Cardholder Name", "Emilia Nowak");
	data14.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("Product Name", "Tirzepatide");
	data15.put("First Name", "Mikhail");
	data15.put("Last Name", "Petrov");
	data15.put("Email", "mikhail.petrov15@example.com");
	data15.put("Phone", "2025550114");
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
	data15.put("Cardholder Name", "Mikhail Petrov");
	data15.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("Product Name", "Testosterone Injectable");
	data16.put("First Name", "Anton");
	data16.put("Last Name", "Kruger");
	data16.put("Email", "anton.kruger16@example.com");
	data16.put("Phone", "2025550115");
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
	data16.put("Cardholder Name", "Anton Kruger");
	data16.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("Product Name", "Wellness Starter Kit");
	data17.put("First Name", "Natalia");
	data17.put("Last Name", "Orlova");
	data17.put("Email", "natalia.orlova17@example.com");
	data17.put("Phone", "2025550116");
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
	data17.put("Cardholder Name", "Natalia Orlova");
	data17.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("Product Name", "Semaglutide");
	data18.put("First Name", "Viktoria");
	data18.put("Last Name", "Mueller");
	data18.put("Email", "viktoria.mueller18@example.com");
	data18.put("Phone", "2025550117");
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
	data18.put("Cardholder Name", "Viktoria Mueller");
	data18.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("Product Name", "NAD+ Injectable");
	data19.put("First Name", "Pavel");
	data19.put("Last Name", "Romanov");
	data19.put("Email", "pavel.romanov19@example.com");
	data19.put("Phone", "2025550118");
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
	data19.put("Cardholder Name", "Pavel Romanov");
	data19.putAll(Shared_Checkout_Data);

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("Product Name", "Digital Body Weight Scale");
	data20.put("First Name", "Clara");
	data20.put("Last Name", "Dubois");
	data20.put("Email", "clara.dubois20@example.com");
	data20.put("Phone", "2025550119");
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
	data20.put("Cardholder Name", "Clara Dubois");
	data20.putAll(Shared_Checkout_Data);

	return new Object[][] {
		{ data1 },/*
		{ data2 },
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

	String Product_Name = Product_data.get("Product Name");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                  STOREFRONT PRODUCT");
	System.out.println("============================================================");
	System.out.println("Expected Product : " + Product_Name);

	Report_Listen.log_print_in_report().info("Storefront Product: " + Product_Name);

	Store_Front_lander();

	WebElement Prod_Section = p.Treatments_Product_Section();
	rp.Scroll_to_element(Prod_Section);

	List<WebElement> Medicine_Cards = p.Product_Cards();

	for(WebElement Medicine_Card : Medicine_Cards){

		String Medicine_Name = Medicine_Card.findElement(By.xpath(".//h3")).getText().trim();

		if(Medicine_Name.equalsIgnoreCase(Product_Name)){

			WebElement Add_to_Cart_Button = Medicine_Card.findElement(By.xpath(".//a[contains(@class,'bg-primary')]"));
			Add_to_Cart_Button.click();

			System.out.println("---------------- PRODUCT SELECTION ----------------");
			System.out.println("Expected : " + Product_Name);
			System.out.println("Actual   : " + Medicine_Name);
			System.out.println("Result   : PASS");

			Report_Listen.log_print_in_report().pass("Product selected: " + Medicine_Name);

			Boolean Second_List_Presence = rp.check_element_visibility(p.Second_Treatment_List(), 2);

			if(Second_List_Presence){

				System.out.println("---------------- SECONDARY PRODUCT LIST ----------------");
				System.out.println("Action : Select Product");

				Second_Product_List_Product_Choose(Product_Name);

				System.out.println("Result : PASS");

				Report_Listen.log_print_in_report().pass("Secondary Product selected successfully.");
			}
			else{

				System.out.println("Secondary Product List : Not displayed");
				Report_Listen.log_print_in_report().info("Secondary Product list not displayed.");
			}

			Boolean Assesment_Button_Presence = rp.check_element_visibility(p.Star_Assesment_Button(), 2);

			if(Assesment_Button_Presence){

				System.out.println("---------------- PRODUCT ASSESSMENT ----------------");
				System.out.println("Action : Complete Patient Assessment");

				Report_Listen.log_print_in_report().info("Starting Patient Assessment.");

				WebElement Assesment_Button = p.Star_Assesment_Button();
				Assesment_executor(Assesment_Button, Product_data);

				System.out.println("Result : PASS");

				Report_Listen.log_print_in_report().pass("Assessment execution completed.");
			}
			else{

				System.out.println("Assessment : Not displayed");

				Report_Listen.log_print_in_report().info("Assessment not displayed for Product: " + Product_Name);
			}

			// Existing assessment/review flow must navigate to Checkout before this call.

			System.out.println("---------------- CHECKOUT ----------------");
			System.out.println("Action : Enter Delivery and Payment details");

			Report_Listen.log_print_in_report().info("Starting Storefront Checkout.");

			Checkout_Manager(Product_data);

			System.out.println("Result : PASS");

			Report_Listen.log_print_in_report().pass("Checkout details entered successfully.");

			System.out.println();
			System.out.println("============================================================");
			System.out.println("                 STOREFRONT FLOW COMPLETED");
			System.out.println("============================================================");
			System.out.println("Product : " + Product_Name);
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

			rp.movetoelement(Medicine_Card);

			WebElement Add_to_Cart_Button = Medicine_Card.findElement(By.xpath(".//a[contains(@class,'bg-primary')]"));
			rp.wait_for_theElement(Add_to_Cart_Button);
			rp.movetoelement(Add_to_Cart_Button);
			Add_to_Cart_Button.click();

			System.out.println("Actual : " + Medicine_Name);
			System.out.println("Result : PASS");

			Report_Listen.log_print_in_report().pass("Secondary Product selected: " + Medicine_Name);

			break;
		}

		if(Medicine_Card.equals(Medicine_Cards.get(Medicine_Cards.size()-1))){

			System.out.println("Result : FAIL");
			System.out.println("Reason : Product not found in secondary list.");

			Report_Listen.log_print_in_report().fail("Product not found in secondary list: " + Product_name);

			throw new NoSuchElementException("Product not found in secondary list: " + Product_name);
		}
	}
}

	



public void Assesment_executor(WebElement Assesment_Button, TreeMap<String, String> Form_Data) throws IOException, InterruptedException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String First_Name = Form_Data.get("First Name");
	String Last_Name = Form_Data.get("Last Name");
	String Email = Form_Data.get("Email");
	String Phone = Form_Data.get("Phone");
	String Date_Of_Birth = Form_Data.get("Date of Birth");
	String State = Form_Data.get("State");
	String Unit_System = Form_Data.get("Unit System");
	String Height = Form_Data.get("Height");
	String Weight = Form_Data.get("Weight");

	System.out.println();
	System.out.println("================ PATIENT ASSESSMENT ================");
	System.out.println("Patient : " + First_Name + " " + Last_Name);

	Report_Listen.log_print_in_report().info("---------------- PATIENT ASSESSMENT ----------------");
	Report_Listen.log_print_in_report().info("Patient: " + First_Name + " " + Last_Name);

	Assesment_Button.click();
    Thread.sleep(800);
	WebElement Assesment_form = p.Form();
	Boolean Form_Presence = rp.check_element_visibility(Assesment_form, 2);

	if(Form_Presence){

		List<WebElement> Form_Fields = Assesment_form.findElements(By.xpath(".//input[@id='intake-first_name' or @id='intake-last_name' or @id='intake-email' or @id='intake-phone' or @id='intake-date_of_birth' or @id='intake-bmi_height' or @id='intake-bmi_weight']"));

		WebElement State_Dropdown = Assesment_form.findElement(By.xpath(".//select[@id='intake-state']"));
		Select s1 = new Select(State_Dropdown);

		WebElement Unit_System_Dropdown = Assesment_form.findElement(By.xpath(".//select[@id='intake-bmi_unit_system']"));
		Select s2 = new Select(Unit_System_Dropdown);

		System.out.println("---------------- PERSONAL INFORMATION ----------------");

		Form_Fields.get(0).sendKeys(First_Name);
		Form_Fields.get(1).sendKeys(Last_Name);
		Form_Fields.get(2).sendKeys(Email);
		Form_Fields.get(3).sendKeys(Phone);
		Form_Fields.get(4).sendKeys(Date_Of_Birth);

		System.out.println("First Name    : " + First_Name);
		System.out.println("Last Name     : " + Last_Name);
		System.out.println("Email         : " + Email);
		System.out.println("Phone         : " + Phone);
		System.out.println("Date of Birth : " + Date_Of_Birth);
		System.out.println("Result        : PASS");

		Report_Listen.log_print_in_report().pass("Patient personal information entered successfully.");

		System.out.println("---------------- STATE & UNIT SYSTEM ----------------");

		s1.selectByVisibleText(State);
		s2.selectByVisibleText(Unit_System);

		System.out.println("State       : " + State);
		System.out.println("Unit System : " + Unit_System);
		System.out.println("Result      : PASS");

		Report_Listen.log_print_in_report().pass("State selected: " + State);
		Report_Listen.log_print_in_report().pass("Unit System selected: " + Unit_System);

		System.out.println("---------------- HEIGHT & WEIGHT ----------------");

		Form_Fields.get(5).sendKeys(Height);
		Form_Fields.get(6).sendKeys(Weight);

		System.out.println("Height : " + Height);
		System.out.println("Weight : " + Weight);
		System.out.println("Result : PASS");

		Report_Listen.log_print_in_report().pass("Height and Weight entered successfully.");

		System.out.println("---------------- ASSESSMENT SUBMISSION ----------------");
		System.out.println("Action : Click Continue");

		Report_Listen.log_print_in_report().info("Action: Click Continue");

		WebElement Continue_Button = p.Continue_Button();
		rp.movetoelement(Continue_Button);
		Continue_Button.click();
		Q_and_A_Resolver(Form_Data);
		System.out.println("Result : PASS");
		System.out.println();

	Report_Listen.log_print_in_report().pass("Assessment Continue button clicked successfully.");

		System.out.println("================ ASSESSMENT STEP COMPLETED ================");
		System.out.println("Patient : " + First_Name + " " + Last_Name);
		System.out.println("Result  : PASS");

		Report_Listen.log_print_in_report().pass("Patient Assessment step completed.");
	}
	else{

		System.out.println("---------------- ASSESSMENT FAILED ----------------");
		System.out.println("Result : FAIL");
		System.out.println("Reason : Assessment form not displayed.");

		Report_Listen.log_print_in_report().fail("Assessment form not displayed.");

		throw new NoSuchElementException("Assessment form not displayed.");
	}
}

	

public void Q_and_A_Resolver(TreeMap<String, String> Form_Data) throws IOException, InterruptedException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String Notes = Form_Data.get("Notes");

	WebElement Page_One = p.Page_One_form();
	List<WebElement> Option_labels = Page_One.findElements(By.xpath(".//label"));

	for(WebElement Option_label : Option_labels){

		String Option_text = Option_label.getText().trim();

		if(Option_text.equalsIgnoreCase("None") || Option_text.equalsIgnoreCase("No")){
			rp.movetoelement(Option_label);
			Option_label.click();
		}
	}

	WebElement First_Page_Continue_Button = Page_One.findElement(By.xpath(".//button[contains(@class,'bg-primary')]"));
	rp.movetoelement(First_Page_Continue_Button);
	First_Page_Continue_Button.click();

	WebElement Page_Two = p.Page_Two_form();
	List<WebElement> Option_Two_labels = Page_Two.findElements(By.xpath(".//label"));

	for(WebElement Option_Two_label : Option_Two_labels){

		String Option_text = Option_Two_label.getText().trim();

		if(Option_text.contains("health") || Option_text.contains("No")){
			rp.movetoelement(Option_Two_label);
			Option_Two_label.click();
		}
	}

	WebElement Second_Page_Continue_Button = Page_Two.findElement(By.xpath(".//button[contains(@class,'bg-primary')]"));
	rp.movetoelement(Second_Page_Continue_Button);
	Second_Page_Continue_Button.click();

	WebElement Page_Three = p.Page_Three_form();
	List<WebElement> Option_Three_labels = Page_Three.findElements(By.xpath(".//label"));

	for(WebElement Option_Three_label : Option_Three_labels){

		String Option_text = Option_Three_label.getText().trim();

		if(Option_text.contains("None") || Option_text.contains("No")){
			rp.movetoelement(Option_Three_label);
			Option_Three_label.click();
		}
	}

	WebElement Third_Page_Continue_Button = Page_Three.findElement(By.xpath(".//button[contains(@class,'bg-primary')]"));
	rp.movetoelement(Third_Page_Continue_Button);
	Third_Page_Continue_Button.click();

	WebElement Page_Four = p.Page_Four_form();
	List<WebElement> Option_Four_labels = Page_Four.findElements(By.xpath(".//label"));

	for(WebElement Option_Four_label : Option_Four_labels){

		String Option_text = Option_Four_label.getText().trim();

		if(Option_text.contains("No")){

			rp.movetoelement(Option_Four_label);
			Option_Four_label.click();

			Boolean Pregnancy_status_Option_visibility = rp.check_element_visibility(p.Pregnancy_Status_No_Option(), 2);

			if(Pregnancy_status_Option_visibility){
				p.Pregnancy_Status_No_Option().click();
			}
		}
	}

	WebElement Fourth_Page_Continue_Button = Page_Four.findElement(By.xpath(".//button[contains(@class,'bg-primary')]"));
	rp.movetoelement(Fourth_Page_Continue_Button);
	Fourth_Page_Continue_Button.click();

	WebElement Page_Five = p.Page_Five_form();
	List<WebElement> Option_Page_Five_labels = Page_Five.findElements(By.xpath(".//label"));

	for(WebElement Option_Page_Five_label : Option_Page_Five_labels){

		String Option_text = Option_Page_Five_label.getText().trim();

		if(Option_text.contains("No")){
			rp.movetoelement(Option_Page_Five_label);
			Option_Page_Five_label.click();
		}
	}

	WebElement Fifth_Page_Continue_Button = Page_Five.findElement(By.xpath(".//button[contains(@class,'bg-primary')]"));
	rp.movetoelement(Fifth_Page_Continue_Button);
	Fifth_Page_Continue_Button.click();

	System.out.println();
	System.out.println("---------------- ASSESSMENT NOTES ----------------");

	WebElement Page_Six = p.Page_Six_form();
	WebElement Notes_Field = p.Notes_textarea();
	Notes_Field.sendKeys(Notes);

	System.out.println("Notes  : " + Notes);
	System.out.println("Result : PASS");

	Report_Listen.log_print_in_report().pass("Assessment Notes entered successfully.");

	List<WebElement> Option_Page_Six_labels = Page_Six.findElements(By.xpath(".//label"));

	for(WebElement Option_Page_Six_label : Option_Page_Six_labels){

		String Option_text = Option_Page_Six_label.getText().trim();

		if(Option_text.contains("consent")){
			rp.movetoelement(Option_Page_Six_label);
			Option_Page_Six_label.click();
		}
	}

	WebElement Six_Page_Continue_Button = Page_Six.findElement(By.xpath(".//button[contains(@class,'bg-primary')]"));
	rp.movetoelement(Six_Page_Continue_Button);
	Six_Page_Continue_Button.click();

	System.out.println();
	System.out.println("---------------- ASSESSMENT QUESTIONNAIRE ----------------");
	System.out.println("Action : Continue to Review");
	System.out.println("Result : PASS");

	Report_Listen.log_print_in_report().pass("Assessment questionnaire Continue button clicked successfully.");
}

	

public void Checkout_Manager(TreeMap<String, String> Form_Data){

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Form_Data.get("Product Name");
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

	Report_Listen.log_print_in_report().info("---------------- STOREFRONT CHECKOUT ----------------");
	Report_Listen.log_print_in_report().info("Product: " + Product_Name);

	Boolean Checkout_Section_Visibility = rp.check_element_visibility(p.Checkout_Form(), 2);

	if(Checkout_Section_Visibility){

		WebElement Address_Field = p.Address_Field();
		WebElement City_Field = p.City_Field();
		WebElement Zipcode_Field = p.Zipcode_Field();
		WebElement State_Dropdown = p.State_Dropdown();
		WebElement Card_num = p.Card_Number();
		WebElement Expiry_Date = p.expiry_date();
		WebElement Security_Code = p.Security_Code();

		System.out.println();
		System.out.println("---------------- DELIVERY DETAILS ----------------");

		rp.movetoelement(Address_Field);
		Address_Field.sendKeys(Address);

		rp.movetoelement(City_Field);
		City_Field.sendKeys(City);

		Select s = new Select(State_Dropdown);
		s.selectByVisibleText(State);

		rp.movetoelement(Zipcode_Field);
		Zipcode_Field.sendKeys(Zipcode);

		System.out.println("Address : " + Address);
		System.out.println("City    : " + City);
		System.out.println("State   : " + State);
		System.out.println("Zipcode : " + Zipcode);
		System.out.println("Result  : PASS");

		Report_Listen.log_print_in_report().info("Delivery Address: " + Address + ", " + City + ", " + State + " - " + Zipcode);
		Report_Listen.log_print_in_report().pass("Delivery details entered successfully.");

		System.out.println();
		System.out.println("---------------- PAYMENT DETAILS ----------------");

		rp.movetoelement(Card_num);
		Card_num.sendKeys(Card_Number);

		Expiry_Date.sendKeys(Expiry);
		Security_Code.sendKeys(CVV);

		System.out.println("Payment Method : Credit card");
		System.out.println("Card Details   : Entered");
		System.out.println("Result         : PASS");

		Report_Listen.log_print_in_report().pass("Payment card fields entered successfully.");

		System.out.println();
		System.out.println("---------------- AGREEMENTS ----------------");

		List<WebElement> Checkboxes = p.Agree_Checkboxes();

		for(WebElement Checkbox : Checkboxes){

			if(!Checkbox.isSelected()){
				rp.movetoelement(Checkbox);
				Checkbox.click();
			}
		}

		WebElement Pay_Button = p.Checkout_Pay_Button();
		rp.movetoelement(Pay_Button);
		Pay_Button.click();
		System.out.println("Action : Select required agreements");
		System.out.println("Result : PASS");

		Report_Listen.log_print_in_report().pass("Agreement checkbox processing completed.");

		System.out.println();
		System.out.println("============================================================");
		System.out.println("                  CHECKOUT DETAILS ENTERED");
		System.out.println("============================================================");
		System.out.println("Product : " + Product_Name);
		System.out.println("Result  : PASS");

		Report_Listen.log_print_in_report().pass("Checkout fields entered for Product: " + Product_Name);
	}
	else{

		System.out.println("Result : FAIL");
		System.out.println("Reason : Checkout form not displayed.");

		Report_Listen.log_print_in_report().fail("Checkout form not displayed for Product: " + Product_Name);

		throw new NoSuchElementException("Checkout form not displayed.");
	}
}

	
	
}
