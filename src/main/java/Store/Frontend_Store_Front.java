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

		System.out.println("Store Front");}

	



   

@DataProvider
public Object[][] Storefront_Product_Data(){

	String Medication_Question_Key = "Intake Q&A - Are you currently taking any of the following medicines or supplements, either regularly or as needed? Select all that apply. Select None only if you take no medicines or supplements.";
	String Medication_Details_Key = "Intake Q&A - List all medicines and supplements you currently take, including doses and frequency. Enter None if you take none.";

	// Shared Checkout Data
	TreeMap<String,String> Shared_Checkout_Data = new TreeMap<String,String>();
	Shared_Checkout_Data.put("Delivery Country", "United States");
	Shared_Checkout_Data.put("Card Number", "1444444444444440");
	Shared_Checkout_Data.put("Expiry Date", "12/29");
	Shared_Checkout_Data.put("Security Code", "123");
	Shared_Checkout_Data.put("Patient Password", "Password@123");
	Shared_Checkout_Data.put("Weight Loss Goal", "21-50 lbs");

	// Shared Five-Page Intake Form Data - Synthetic QA Answers
	TreeMap<String,String> Shared_Intake_Data = new TreeMap<String,String>();
	Shared_Intake_Data.put("Biological Sex at Birth", "Female");
	Shared_Intake_Data.put("Intake Q&A - Are you pregnant, breastfeeding, or planning a pregnancy?", "No");

	// AsterSomnera - Sleep Intake Questions
	TreeMap<String,String> Sleep_Intake_Data = new TreeMap<String,String>();
	Sleep_Intake_Data.put("Intake Reason", "Sleep or insomnia");
	Sleep_Intake_Data.put("Intake Q&A - What is your main sleep difficulty?", "Falling asleep");
	Sleep_Intake_Data.put("Intake Q&A - How long have you had this sleep difficulty?", "3 months or longer");
	Sleep_Intake_Data.put("Intake Q&A - How many nights a week do you have difficulty sleeping?", "3-4 nights");
	Sleep_Intake_Data.put("Intake Q&A - How much does poor sleep affect your daytime activities?", "Mildly");
	Sleep_Intake_Data.put("Intake Q&A - Do you snore loudly, wake up gasping, or have a diagnosis of sleep apnea?", "No");
	Sleep_Intake_Data.put("Intake Q&A - Describe the treatments or changes you have tried for sleep and how they worked. Enter None if you have tried none.", "Tried a regular bedtime and reduced evening screen time; sleep difficulty continues.");

	// AsterMigraEase - Migraine Intake Questions
	TreeMap<String,String> Migraine_Intake_Data = new TreeMap<String,String>();
	Migraine_Intake_Data.put("Intake Reason", "Migraine or recurring headaches");
	Migraine_Intake_Data.put("Intake Q&A - Has a clinician previously diagnosed you with migraine?", "No");
	Migraine_Intake_Data.put("Intake Q&A - On how many days a month do you have a headache?", "1-3 days");
	Migraine_Intake_Data.put("Intake Q&A - How long does a typical headache last?", "4-24 hours");
	Migraine_Intake_Data.put("Intake Q&A - Describe your usual headache: where it hurts, severity, and any nausea, light or sound sensitivity, visual changes, or other symptoms.", "Recurring moderate one-sided headache with light sensitivity and occasional nausea; no new visual symptoms.");
	Migraine_Intake_Data.put("Intake Q&A - Do you currently have a sudden extremely severe headache, new weakness, difficulty speaking, confusion, or loss of vision?", "No");
	Migraine_Intake_Data.put("Intake Q&A - List headache treatments you have tried, how often you use them, and how they worked. Enter None if you have tried none.", "Tried rest in a dark room and hydration during headache episodes with partial relief.");

	// AsterRefluxa - Reflux Intake Questions
	TreeMap<String,String> Reflux_Intake_Data = new TreeMap<String,String>();
	Reflux_Intake_Data.put("Intake Reason", "Heartburn or acid reflux");
	Reflux_Intake_Data.put("Intake Q&A - Which symptom is most troublesome?", "Both");
	Reflux_Intake_Data.put("Intake Q&A - How long have you had these symptoms?", "3 months or longer");
	Reflux_Intake_Data.put("Intake Q&A - How often do you experience these symptoms?", "1-2 days a week");
	Reflux_Intake_Data.put("Intake Q&A - Have you had difficulty or pain when swallowing, persistent vomiting, blood in vomit, black stools, or unexplained weight loss?", "No");
	Reflux_Intake_Data.put("Intake Q&A - Describe reflux treatments or lifestyle changes you have tried and how they worked. Enter None if you have tried none.", "Tried smaller meals and avoiding late-night food with partial relief.");

	// Dataset 1 - AsterSomnera - 30 Tablet Supply
	TreeMap<String,String> data1 = new TreeMap<String,String>();
	data1.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data1.put("Treatment Variant", "30 Tablet Supply");
	data1.put("Subscription Type", "One-Time Sale");
	data1.put("Expected Price", "40.00");
	data1.put("VRIO Offer ID", "");
	data1.put("VRIO Product ID", "");
	data1.put("First Name", "Maeve");
	data1.put("Last Name", "Whitaker");
	data1.put("Email", "maeve.whitaker.astermd261112batch1020@yopmail.com");
	data1.put("Phone", "3125550120");
	data1.put("Date of Birth", "06/12/1992");
	data1.put("State", "Washington");
	data1.put("Residential State", "WA");
	data1.put("Current Location State", "WA");
	data1.put("Unit System", "Imperial (lbs/inches)");
	data1.put("Height", "65");
	data1.put("Weight", "143");
	data1.put("Notes", "I would like to discuss sleep quality, occasional sleeplessness, and appropriate sleep support options.");
	data1.put("Address", "1301 QA Pine Avenue");
	data1.put("City", "Seattle");
	data1.put("Delivery State", "Washington");
	data1.put("Zipcode", "98101");
	data1.put("ZIP Code", "98101");
	data1.put("Cardholder Name", "Maeve Whitaker");
	data1.putAll(Shared_Checkout_Data);
	data1.putAll(Shared_Intake_Data);
	data1.put(Medication_Question_Key, "Melatonin");
	data1.put(Medication_Details_Key, "Melatonin, dose unknown, taken on some nights.");
	data1.putAll(Sleep_Intake_Data);
	data1.put("SSN", "1234");
	data1.put("ID Verification Image", "ID_Verification_data01.png");

	// Dataset 2 - AsterSomnera - 60 Tablet Supply
	TreeMap<String,String> data2 = new TreeMap<String,String>();
	data2.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data2.put("Treatment Variant", "60 Tablet Supply");
	data2.put("Subscription Type", "One-Time Sale");
	data2.put("Expected Price", "74.00");
	data2.put("VRIO Offer ID", "");
	data2.put("VRIO Product ID", "");
	data2.put("First Name", "Alina");
	data2.put("Last Name", "Brookfield");
	data2.put("Email", "alina.brookfield.astermd261112batch1021@yopmail.com");
	data2.put("Phone", "3125550121");
	data2.put("Date of Birth", "04/19/1995");
	data2.put("State", "Illinois");
	data2.put("Residential State", "IL");
	data2.put("Current Location State", "IL");
	data2.put("Unit System", "Imperial (lbs/inches)");
	data2.put("Height", "66");
	data2.put("Weight", "151");
	data2.put("Notes", "I would like information about irregular sleep patterns, sleep treatment precautions, and improving nighttime rest.");
	data2.put("Address", "1302 QA Lake Avenue");
	data2.put("City", "Chicago");
	data2.put("Delivery State", "Illinois");
	data2.put("Zipcode", "60601");
	data2.put("ZIP Code", "60601");
	data2.put("Cardholder Name", "Alina Brookfield");
	data2.putAll(Shared_Checkout_Data);
	data2.putAll(Shared_Intake_Data);
	data2.put(Medication_Question_Key, "Diphenhydramine");
	data2.put(Medication_Details_Key, "Diphenhydramine, dose unknown, taken occasionally.");
	data2.putAll(Sleep_Intake_Data);
	data2.put("SSN", "1234");
	data2.put("ID Verification Image", "ID_Verification_data02.png");

	// Dataset 3 - AsterSomnera - 90 Tablet Supply
	TreeMap<String,String> data3 = new TreeMap<String,String>();
	data3.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data3.put("Treatment Variant", "90 Tablet Supply");
	data3.put("Subscription Type", "One-Time Sale");
	data3.put("Expected Price", "106.00");
	data3.put("VRIO Offer ID", "");
	data3.put("VRIO Product ID", "");
	data3.put("First Name", "Blythe");
	data3.put("Last Name", "Penrose");
	data3.put("Email", "blythe.penrose.astermd261112batch1022@yopmail.com");
	data3.put("Phone", "3125550122");
	data3.put("Date of Birth", "10/22/1988");
	data3.put("State", "Colorado");
	data3.put("Residential State", "CO");
	data3.put("Current Location State", "CO");
	data3.put("Unit System", "Imperial (lbs/inches)");
	data3.put("Height", "67");
	data3.put("Weight", "149");
	data3.put("Notes", "I would like to discuss long-term sleep support, treatment eligibility, possible side effects, and follow-up care.");
	data3.put("Address", "1303 QA Oak Street");
	data3.put("City", "Denver");
	data3.put("Delivery State", "Colorado");
	data3.put("Zipcode", "80202");
	data3.put("ZIP Code", "80202");
	data3.put("Cardholder Name", "Blythe Penrose");
	data3.putAll(Shared_Checkout_Data);
	data3.putAll(Shared_Intake_Data);
	data3.put(Medication_Question_Key, "Doxylamine");
	data3.put(Medication_Details_Key, "Doxylamine, dose unknown, taken as needed at night.");
	data3.putAll(Sleep_Intake_Data);
	data3.put("SSN", "1234");
	data3.put("ID Verification Image", "ID_Verification_data03.png");

	// Dataset 4 - AsterSomnera - 30 Tablet Supply
	TreeMap<String,String> data4 = new TreeMap<String,String>();
	data4.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data4.put("Treatment Variant", "30 Tablet Supply");
	data4.put("Subscription Type", "One-Time Sale");
	data4.put("Expected Price", "40.00");
	data4.put("VRIO Offer ID", "");
	data4.put("VRIO Product ID", "");
	data4.put("First Name", "Bridget");
	data4.put("Last Name", "Sloane");
	data4.put("Email", "bridget.sloane.astermd261112batch1023@yopmail.com");
	data4.put("Phone", "3125550123");
	data4.put("Date of Birth", "03/17/1991");
	data4.put("State", "Arizona");
	data4.put("Residential State", "AZ");
	data4.put("Current Location State", "AZ");
	data4.put("Unit System", "Imperial (lbs/inches)");
	data4.put("Height", "64");
	data4.put("Weight", "139");
	data4.put("Notes", "I would like guidance on falling asleep faster, maintaining regular sleep schedules, and treatment suitability.");
	data4.put("Address", "1304 QA Desert Lane");
	data4.put("City", "Phoenix");
	data4.put("Delivery State", "Arizona");
	data4.put("Zipcode", "85004");
	data4.put("ZIP Code", "85004");
	data4.put("Cardholder Name", "Bridget Sloane");
	data4.putAll(Shared_Checkout_Data);
	data4.putAll(Shared_Intake_Data);
	data4.put(Medication_Question_Key, "Zolpidem");
	data4.put(Medication_Details_Key, "Zolpidem, dose unknown, taken at bedtime as needed.");
	data4.putAll(Sleep_Intake_Data);
	data4.put("SSN", "1234");
	data4.put("ID Verification Image", "ID_Verification_data04.png");

	// Dataset 5 - AsterSomnera - 60 Tablet Supply
	TreeMap<String,String> data5 = new TreeMap<String,String>();
	data5.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data5.put("Treatment Variant", "60 Tablet Supply");
	data5.put("Subscription Type", "One-Time Sale");
	data5.put("Expected Price", "74.00");
	data5.put("VRIO Offer ID", "");
	data5.put("VRIO Product ID", "");
	data5.put("First Name", "Naomi");
	data5.put("Last Name", "Hensley");
	data5.put("Email", "naomi.hensley.astermd261112batch1024@yopmail.com");
	data5.put("Phone", "3125550124");
	data5.put("Date of Birth", "12/08/1993");
	data5.put("State", "Oregon");
	data5.put("Residential State", "OR");
	data5.put("Current Location State", "OR");
	data5.put("Unit System", "Imperial (lbs/inches)");
	data5.put("Height", "65");
	data5.put("Weight", "146");
	data5.put("Notes", "I would like to understand sleep improvement options, possible medication interactions, and appropriate treatment duration.");
	data5.put("Address", "1305 QA River Road");
	data5.put("City", "Portland");
	data5.put("Delivery State", "Oregon");
	data5.put("Zipcode", "97204");
	data5.put("ZIP Code", "97204");
	data5.put("Cardholder Name", "Naomi Hensley");
	data5.putAll(Shared_Checkout_Data);
	data5.putAll(Shared_Intake_Data);
	data5.put(Medication_Question_Key, "Other medicine or supplement (list it in the next question)");
	data5.put(Medication_Details_Key, "Eszopiclone, dose unknown, taken at bedtime on some nights.");
	data5.putAll(Sleep_Intake_Data);
	data5.put("SSN", "1234");
	data5.put("ID Verification Image", "ID_Verification_data05.png");

	// Dataset 6 - AsterSomnera - 90 Tablet Supply
	TreeMap<String,String> data6 = new TreeMap<String,String>();
	data6.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data6.put("Treatment Variant", "90 Tablet Supply");
	data6.put("Subscription Type", "One-Time Sale");
	data6.put("Expected Price", "106.00");
	data6.put("VRIO Offer ID", "");
	data6.put("VRIO Product ID", "");
	data6.put("First Name", "Serena");
	data6.put("Last Name", "Northcott");
	data6.put("Email", "serena.northcott.astermd261112batch1025@yopmail.com");
	data6.put("Phone", "3125550125");
	data6.put("Date of Birth", "07/24/1990");
	data6.put("State", "California");
	data6.put("Residential State", "CA");
	data6.put("Current Location State", "CA");
	data6.put("Unit System", "Imperial (lbs/inches)");
	data6.put("Height", "66");
	data6.put("Weight", "155");
	data6.put("Notes", "I would like information about recurring insomnia symptoms, sleep regulation, medication precautions, and follow-up monitoring.");
	data6.put("Address", "1306 QA Harbor Drive");
	data6.put("City", "San Diego");
	data6.put("Delivery State", "California");
	data6.put("Zipcode", "92101");
	data6.put("ZIP Code", "92101");
	data6.put("Cardholder Name", "Serena Northcott");
	data6.putAll(Shared_Checkout_Data);
	data6.putAll(Shared_Intake_Data);
	data6.put(Medication_Question_Key, "Famotidine");
	data6.put(Medication_Details_Key, "Famotidine, dose unknown, taken as needed.");
	data6.putAll(Sleep_Intake_Data);
	data6.put("SSN", "1234");
	data6.put("ID Verification Image", "ID_Verification_data06.png");

	// Dataset 7 - AsterSomnera - 30 Tablet Supply
	TreeMap<String,String> data7 = new TreeMap<String,String>();
	data7.put("Product Name", "AsterSomnera Sleep Support Tablets");
	data7.put("Treatment Variant", "30 Tablet Supply");
	data7.put("Subscription Type", "One-Time Sale");
	data7.put("Expected Price", "40.00");
	data7.put("VRIO Offer ID", "");
	data7.put("VRIO Product ID", "");
	data7.put("First Name", "Keira");
	data7.put("Last Name", "Ellington");
	data7.put("Email", "keira.ellington.astermd261112batch1026@yopmail.com");
	data7.put("Phone", "3125550126");
	data7.put("Date of Birth", "02/11/1996");
	data7.put("State", "Florida");
	data7.put("Residential State", "FL");
	data7.put("Current Location State", "FL");
	data7.put("Unit System", "Imperial (lbs/inches)");
	data7.put("Height", "68");
	data7.put("Weight", "158");
	data7.put("Notes", "I would like to improve sleep consistency and discuss safe treatment options for occasional sleep difficulties.");
	data7.put("Address", "1307 QA Franklin Street");
	data7.put("City", "Tampa");
	data7.put("Delivery State", "Florida");
	data7.put("Zipcode", "33602");
	data7.put("ZIP Code", "33602");
	data7.put("Cardholder Name", "Keira Ellington");
	data7.putAll(Shared_Checkout_Data);
	data7.putAll(Shared_Intake_Data);
	data7.put(Medication_Question_Key, "Pantoprazole");
	data7.put(Medication_Details_Key, "Pantoprazole, dose unknown, taken daily.");
	data7.putAll(Sleep_Intake_Data);
	data7.put("SSN", "1234");
	data7.put("ID Verification Image", "ID_Verification_data07.png");

	// Dataset 8 - AsterMigraEase
	TreeMap<String,String> data8 = new TreeMap<String,String>();
	data8.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data8.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
	data8.put("Subscription Type", "One-Time Sale");
	data8.put("Expected Price", "47.90");
	data8.put("VRIO Offer ID", "");
	data8.put("VRIO Product ID", "");
	data8.put("First Name", "Matilda");
	data8.put("Last Name", "Hawthorne");
	data8.put("Email", "matilda.hawthorne.astermd261112batch1027@yopmail.com");
	data8.put("Phone", "3125550127");
	data8.put("Date of Birth", "01/19/1990");
	data8.put("State", "New York");
	data8.put("Residential State", "NY");
	data8.put("Current Location State", "NY");
	data8.put("Unit System", "Imperial (lbs/inches)");
	data8.put("Height", "65");
	data8.put("Weight", "144");
	data8.put("Notes", "I would like to discuss frequent headaches, migraine triggers, treatment precautions, and preventive recommendations.");
	data8.put("Address", "1308 QA Madison Avenue");
	data8.put("City", "New York");
	data8.put("Delivery State", "New York");
	data8.put("Zipcode", "10001");
	data8.put("ZIP Code", "10001");
	data8.put("Cardholder Name", "Matilda Hawthorne");
	data8.putAll(Shared_Checkout_Data);
	data8.putAll(Shared_Intake_Data);
	data8.put(Medication_Question_Key, "Acetaminophen");
	data8.put(Medication_Details_Key, "Acetaminophen, dose unknown, taken as needed for headaches.");
	data8.putAll(Migraine_Intake_Data);
	data8.put("SSN", "1234");
	data8.put("ID Verification Image", "ID_Verification_data08.png");

	// Dataset 9 - AsterMigraEase
	TreeMap<String,String> data9 = new TreeMap<String,String>();
	data9.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data9.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
	data9.put("Subscription Type", "One-Time Sale");
	data9.put("Expected Price", "47.90");
	data9.put("VRIO Offer ID", "");
	data9.put("VRIO Product ID", "");
	data9.put("First Name", "Elise");
	data9.put("Last Name", "Fairchild");
	data9.put("Email", "elise.fairchild.astermd261112batch1028@yopmail.com");
	data9.put("Phone", "3125550128");
	data9.put("Date of Birth", "11/14/1994");
	data9.put("State", "Texas");
	data9.put("Residential State", "TX");
	data9.put("Current Location State", "TX");
	data9.put("Unit System", "Imperial (lbs/inches)");
	data9.put("Height", "67");
	data9.put("Weight", "152");
	data9.put("Notes", "I would like information about migraine episodes, headache frequency, treatment suitability, and potential medication interactions.");
	data9.put("Address", "1309 QA Congress Avenue");
	data9.put("City", "Austin");
	data9.put("Delivery State", "Texas");
	data9.put("Zipcode", "78701");
	data9.put("ZIP Code", "78701");
	data9.put("Cardholder Name", "Elise Fairchild");
	data9.putAll(Shared_Checkout_Data);
	data9.putAll(Shared_Intake_Data);
	data9.put(Medication_Question_Key, "Ibuprofen");
	data9.put(Medication_Details_Key, "Ibuprofen, dose unknown, taken as needed for headaches.");
	data9.putAll(Migraine_Intake_Data);
	data9.put("SSN", "1234");
	data9.put("ID Verification Image", "ID_Verification_data09.png");

	// Dataset 10 - AsterMigraEase
	TreeMap<String,String> data10 = new TreeMap<String,String>();
	data10.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data10.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
	data10.put("Subscription Type", "One-Time Sale");
	data10.put("Expected Price", "47.90");
	data10.put("VRIO Offer ID", "");
	data10.put("VRIO Product ID", "");
	data10.put("First Name", "Astrid");
	data10.put("Last Name", "Redmond");
	data10.put("Email", "astrid.redmond.astermd261112batch1029@yopmail.com");
	data10.put("Phone", "3125550129");
	data10.put("Date of Birth", "05/05/1989");
	data10.put("State", "Massachusetts");
	data10.put("Residential State", "MA");
	data10.put("Current Location State", "MA");
	data10.put("Unit System", "Imperial (lbs/inches)");
	data10.put("Height", "66");
	data10.put("Weight", "148");
	data10.put("Notes", "I would like advice regarding recurring migraine symptoms, medication safety, headache monitoring, and follow-up care.");
	data10.put("Address", "1310 QA Beacon Street");
	data10.put("City", "Boston");
	data10.put("Delivery State", "Massachusetts");
	data10.put("Zipcode", "02108");
	data10.put("ZIP Code", "02108");
	data10.put("Cardholder Name", "Astrid Redmond");
	data10.putAll(Shared_Checkout_Data);
	data10.putAll(Shared_Intake_Data);
	data10.put(Medication_Question_Key, "Naproxen");
	data10.put(Medication_Details_Key, "Naproxen, dose unknown, taken as needed for headaches.");
	data10.putAll(Migraine_Intake_Data);
	data10.put("SSN", "1234");
	data10.put("ID Verification Image", "ID_Verification_data10.png");

	// Dataset 11 - AsterMigraEase
	TreeMap<String,String> data11 = new TreeMap<String,String>();
	data11.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data11.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
	data11.put("Subscription Type", "One-Time Sale");
	data11.put("Expected Price", "47.90");
	data11.put("VRIO Offer ID", "");
	data11.put("VRIO Product ID", "");
	data11.put("First Name", "Sylvie");
	data11.put("Last Name", "Delaney");
	data11.put("Email", "sylvie.delaney.astermd261112batch1030@yopmail.com");
	data11.put("Phone", "3125550130");
	data11.put("Date of Birth", "09/02/1995");
	data11.put("State", "Minnesota");
	data11.put("Residential State", "MN");
	data11.put("Current Location State", "MN");
	data11.put("Unit System", "Imperial (lbs/inches)");
	data11.put("Height", "64");
	data11.put("Weight", "137");
	data11.put("Notes", "I would like to discuss headache severity, migraine-related discomfort, possible treatment side effects, and preventive measures.");
	data11.put("Address", "1311 QA Hennepin Avenue");
	data11.put("City", "Minneapolis");
	data11.put("Delivery State", "Minnesota");
	data11.put("Zipcode", "55401");
	data11.put("ZIP Code", "55401");
	data11.put("Cardholder Name", "Sylvie Delaney");
	data11.putAll(Shared_Checkout_Data);
	data11.putAll(Shared_Intake_Data);
	data11.put(Medication_Question_Key, "Sumatriptan");
	data11.put(Medication_Details_Key, "Sumatriptan, dose unknown, taken during migraine episodes as needed.");
	data11.putAll(Migraine_Intake_Data);
	data11.put("SSN", "1234");
	data11.put("ID Verification Image", "ID_Verification_data11.png");

	// Dataset 12 - AsterMigraEase
	TreeMap<String,String> data12 = new TreeMap<String,String>();
	data12.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data12.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
	data12.put("Subscription Type", "One-Time Sale");
	data12.put("Expected Price", "47.90");
	data12.put("VRIO Offer ID", "");
	data12.put("VRIO Product ID", "");
	data12.put("First Name", "Vivian");
	data12.put("Last Name", "Langley");
	data12.put("Email", "vivian.langley.astermd261112batch1031@yopmail.com");
	data12.put("Phone", "3125550131");
	data12.put("Date of Birth", "08/18/1992");
	data12.put("State", "Georgia");
	data12.put("Residential State", "GA");
	data12.put("Current Location State", "GA");
	data12.put("Unit System", "Imperial (lbs/inches)");
	data12.put("Height", "68");
	data12.put("Weight", "161");
	data12.put("Notes", "I would like information about migraine prevention, treatment eligibility, possible interactions, and clinical guidance.");
	data12.put("Address", "1312 QA Peachtree Street");
	data12.put("City", "Atlanta");
	data12.put("Delivery State", "Georgia");
	data12.put("Zipcode", "30303");
	data12.put("ZIP Code", "30303");
	data12.put("Cardholder Name", "Vivian Langley");
	data12.putAll(Shared_Checkout_Data);
	data12.putAll(Shared_Intake_Data);
	data12.put(Medication_Question_Key, "Topiramate");
	data12.put(Medication_Details_Key, "Topiramate, dose unknown, taken daily.");
	data12.putAll(Migraine_Intake_Data);
	data12.put("SSN", "1234");
	data12.put("ID Verification Image", "ID_Verification_data12.png");

	// Dataset 13 - AsterMigraEase
	TreeMap<String,String> data13 = new TreeMap<String,String>();
	data13.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data13.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
	data13.put("Subscription Type", "One-Time Sale");
	data13.put("Expected Price", "47.90");
	data13.put("VRIO Offer ID", "");
	data13.put("VRIO Product ID", "");
	data13.put("First Name", "Elodie");
	data13.put("Last Name", "Prescott");
	data13.put("Email", "elodie.prescott.astermd261112batch1032@yopmail.com");
	data13.put("Phone", "3125550132");
	data13.put("Date of Birth", "04/29/1987");
	data13.put("State", "North Carolina");
	data13.put("Residential State", "NC");
	data13.put("Current Location State", "NC");
	data13.put("Unit System", "Imperial (lbs/inches)");
	data13.put("Height", "65");
	data13.put("Weight", "150");
	data13.put("Notes", "I would like to discuss migraine symptom tracking, treatment precautions, and suitable headache management options.");
	data13.put("Address", "1313 QA Tryon Street");
	data13.put("City", "Charlotte");
	data13.put("Delivery State", "North Carolina");
	data13.put("Zipcode", "28202");
	data13.put("ZIP Code", "28202");
	data13.put("Cardholder Name", "Elodie Prescott");
	data13.putAll(Shared_Checkout_Data);
	data13.putAll(Shared_Intake_Data);
	data13.put(Medication_Question_Key, "Other medicine or supplement (list it in the next question)");
	data13.put(Medication_Details_Key, "Rizatriptan, dose unknown, taken during migraine episodes as needed.");
	data13.putAll(Migraine_Intake_Data);
	data13.put("SSN", "1234");
	data13.put("ID Verification Image", "ID_Verification_data13.png");

	// Dataset 14 - AsterMigraEase
	TreeMap<String,String> data14 = new TreeMap<String,String>();
	data14.put("Product Name", "AsterMigraEase Headache Support Tablets");
	data14.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
	data14.put("Subscription Type", "One-Time Sale");
	data14.put("Expected Price", "47.90");
	data14.put("VRIO Offer ID", "");
	data14.put("VRIO Product ID", "");
	data14.put("First Name", "Juliette");
	data14.put("Last Name", "Sinclair");
	data14.put("Email", "juliette.sinclair.astermd261112batch1033@yopmail.com");
	data14.put("Phone", "3125550133");
	data14.put("Date of Birth", "12/03/1996");
	data14.put("State", "Ohio");
	data14.put("Residential State", "OH");
	data14.put("Current Location State", "OH");
	data14.put("Unit System", "Imperial (lbs/inches)");
	data14.put("Height", "66");
	data14.put("Weight", "142");
	data14.put("Notes", "I would like advice on recurring headaches, migraine treatment safety, medication precautions, and preventive care.");
	data14.put("Address", "1314 QA High Street");
	data14.put("City", "Columbus");
	data14.put("Delivery State", "Ohio");
	data14.put("Zipcode", "43215");
	data14.put("ZIP Code", "43215");
	data14.put("Cardholder Name", "Juliette Sinclair");
	data14.putAll(Shared_Checkout_Data);
	data14.putAll(Shared_Intake_Data);
	data14.put(Medication_Question_Key, "Calcium carbonate");
	data14.put(Medication_Details_Key, "Calcium carbonate, dose unknown, taken as needed.");
	data14.putAll(Migraine_Intake_Data);
	data14.put("SSN", "1234");
	data14.put("ID Verification Image", "ID_Verification_data14.png");

	// Dataset 15 - AsterRefluxa
	TreeMap<String,String> data15 = new TreeMap<String,String>();
	data15.put("Product Name", "AsterRefluxa Digestive Relief Capsules");
	data15.put("Treatment Variant", "");
	data15.put("Subscription Type", "Monthly / 30-Day Recurring");
	data15.put("Expected Price", "");
	data15.put("VRIO Offer ID", "");
	data15.put("VRIO Product ID", "");
	data15.put("First Name", "Margot");
	data15.put("Last Name", "Merriweather");
	data15.put("Email", "margot.merriweather.astermd261112batch1034@yopmail.com");
	data15.put("Phone", "3125550134");
	data15.put("Date of Birth", "07/09/1991");
	data15.put("State", "Pennsylvania");
	data15.put("Residential State", "PA");
	data15.put("Current Location State", "PA");
	data15.put("Unit System", "Imperial (lbs/inches)");
	data15.put("Height", "65");
	data15.put("Weight", "147");
	data15.put("Notes", "I would like information about digestive discomfort, recurring acid reflux, treatment suitability, and dietary recommendations.");
	data15.put("Address", "1315 QA Market Street");
	data15.put("City", "Philadelphia");
	data15.put("Delivery State", "Pennsylvania");
	data15.put("Zipcode", "19103");
	data15.put("ZIP Code", "19103");
	data15.put("Cardholder Name", "Margot Merriweather");
	data15.putAll(Shared_Checkout_Data);
	data15.putAll(Shared_Intake_Data);
	data15.put(Medication_Question_Key, "Omeprazole");
	data15.put(Medication_Details_Key, "Omeprazole, dose unknown, taken daily.");
	data15.putAll(Reflux_Intake_Data);
	data15.put("SSN", "1234");
	data15.put("ID Verification Image", "ID_Verification_data15.png");

	// Detailed Page 3 Medical History Answers
	String Allergy_Details_Key = "Intake Q&A - List your allergies and what reaction each causes. Enter None if you have no known allergies.";
	String Medical_History_Key = "Intake Q&A - List your medical conditions, relevant mental health history, and significant past illnesses or operations. Enter None if you have none to report.";
	String Substance_Use_Key = "Intake Q&A - Describe your caffeine, nicotine, alcohol, cannabis or other substance use, including amount and frequency. Enter None if you use none.";

	data1.put(Allergy_Details_Key, "Grass pollen causes sneezing and watery eyes in spring. Nickel jewelry leaves an itchy rash where it touches my skin.");
	data1.put(Medical_History_Key, "I have seasonal allergic rhinitis and have had trouble falling asleep for several months. I had an appendectomy in 2016 and recovered fully.");
	data1.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee most mornings and have one glass of wine about once a month. I do not use nicotine, cannabis, or other substances.");

	data2.put(Allergy_Details_Key, "Dust exposure makes me sneeze and gives me itchy eyes. Adhesive tape can leave a red patch that itches for a day.");
	data2.put(Medical_History_Key, "I have mild hand eczema that flares in winter. I had my wisdom teeth removed in 2017 and recovered without complications.");
	data2.put(Substance_Use_Key, "I drink two 8-ounce cups of black tea on weekdays, one at breakfast and one at lunch. I do not use nicotine, alcohol, cannabis, or other substances.");

	data3.put(Allergy_Details_Key, "Cat dander gives me a runny nose and watery eyes. Latex gloves make the skin on my hands red and itchy.");
	data3.put(Medical_History_Key, "I have eczema that flares in dry weather. I had my tonsils removed as a child and recovered without complications.");
	data3.put(Substance_Use_Key, "I have one 12-ounce coffee three mornings a week and one 12-ounce beer about twice a month. I do not use nicotine, cannabis, or other substances.");

	data4.put(Allergy_Details_Key, "Tree pollen causes sneezing and itchy, watery eyes in spring. Adhesive bandages sometimes leave a red, itchy patch.");
	data4.put(Medical_History_Key, "I have seasonal allergic rhinitis and ongoing difficulty falling asleep. I had an appendectomy in 2017 and recovered without complications.");
	data4.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee on weekday mornings and one cup of black tea on about two afternoons a week. I do not use nicotine, alcohol, cannabis, or other substances.");

	data5.put(Allergy_Details_Key, "Mold exposure causes nasal congestion and watery eyes. Fragranced lotions sometimes cause an itchy rash on my arms.");
	data5.put(Medical_History_Key, "I had childhood asthma and have had no flare in recent years. I attended counseling for work-related anxiety in 2021 and completed it that year.");
	data5.put(Substance_Use_Key, "I have one 8-ounce green tea with breakfast on most days. I drink alcohol about once every two months, usually one glass of wine. I do not use nicotine, cannabis, or other substances.");

	data6.put(Allergy_Details_Key, "Dog dander causes sneezing and itchy eyes after prolonged exposure. Adhesive tape leaves a red patch that fades the next day.");
	data6.put(Medical_History_Key, "I have intermittent acid reflux, mainly after large or late meals. My gallbladder was removed in 2019 and I recovered without complications.");
	data6.put(Substance_Use_Key, "I drink one 8-ounce coffee four mornings a week and one glass of wine about twice a month. I do not use nicotine, cannabis, or other substances.");

	data7.put(Allergy_Details_Key, "Nickel earrings cause an itchy red rash on my earlobes. Ragweed pollen gives me congestion and watery eyes in late summer.");
	data7.put(Medical_History_Key, "I was diagnosed with acid reflux in 2023. I had iron deficiency in 2020, and my follow-up blood tests returned to normal.");
	data7.put(Substance_Use_Key, "I have one 12-ounce iced tea on two or three days a week and one 12-ounce beer on some weekends. I do not use nicotine, cannabis, or other substances.");

	data8.put(Allergy_Details_Key, "Dust mites cause sneezing and nasal congestion when I clean. Adhesive bandages cause mild itching around the edges.");
	data8.put(Medical_History_Key, "I have recurring headaches with light sensitivity and a history of seasonal allergies. I recovered fully from a sinus infection in 2022.");
	data8.put(Substance_Use_Key, "I have one 8-ounce cup of coffee each morning and one glass of wine roughly once a month. I do not use nicotine, cannabis, or other substances.");

	data9.put(Allergy_Details_Key, "Ragweed gives me sneezing and itchy eyes in the fall. Latex gloves cause an itchy rash on my hands.");
	data9.put(Medical_History_Key, "I have recurrent headaches and seasonal allergies. I had a mild concussion in 2017 and recovered after follow-up.");
	data9.put(Substance_Use_Key, "I drink one 12-ounce coffee on workdays. I use a nicotine vape about twice a week, usually three to five puffs. I do not use alcohol, cannabis, or other substances.");

	data10.put(Allergy_Details_Key, "Birch pollen makes my eyes water and causes a runny nose. Nickel watchbands leave an itchy patch on my wrist.");
	data10.put(Medical_History_Key, "I have recurring headaches and neck tension after long periods at my desk. I had an uncomplicated tonsillectomy as a teenager.");
	data10.put(Substance_Use_Key, "I drink two 8-ounce cups of coffee on most weekdays and one glass of wine about twice a month. I do not use nicotine, cannabis, or other substances.");

	data11.put(Allergy_Details_Key, "Pet dander causes sneezing and a stuffy nose. Some adhesive dressings leave an itchy rash for one to two days.");
	data11.put(Medical_History_Key, "I have recurring headaches that sometimes come with nausea. I attended counseling for anxiety in 2020 and completed the course of care.");
	data11.put(Substance_Use_Key, "I drink one 8-ounce cup of black tea most mornings and have one 12-ounce beer about once a month. I do not use nicotine, cannabis, or other substances.");

	data12.put(Allergy_Details_Key, "Cedar pollen causes itchy eyes and sneezing during pollen season. Adhesive bandages can leave a small red rash.");
	data12.put(Medical_History_Key, "I have a history of seizures and continue routine follow-ups. My last seizure was several years ago, and I also report recurring headaches.");
	data12.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee on two mornings a week. I do not use nicotine, alcohol, cannabis, or other substances.");

	data13.put(Allergy_Details_Key, "Cat dander causes nasal congestion and itchy eyes. Some scented soaps leave an itchy rash on my hands.");
	data13.put(Medical_History_Key, "I have recurring headaches with light sensitivity and a history of motion sickness. I had a small skin cyst removed in 2021 and healed without complications.");
	data13.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee most mornings and have one 12-ounce beer about once a month. I do not use nicotine, cannabis, or other substances.");

	data14.put(Allergy_Details_Key, "Grass pollen causes a runny nose and watery eyes. Metal belt buckles sometimes leave an itchy rash where they touch my skin.");
	data14.put(Medical_History_Key, "I have occasional acid reflux after large meals and recurrent headaches. I had an appendectomy in 2014 and recovered fully.");
	data14.put(Substance_Use_Key, "I have one 8-ounce cup of green tea four mornings a week and one glass of wine about once a month. I do not use nicotine, cannabis, or other substances.");

	data15.put(Allergy_Details_Key, "Dust mites give me sneezing and congestion. Latex gloves cause redness and itching where they touch my skin.");
	data15.put(Medical_History_Key, "A clinician diagnosed reflux in 2022. I have had burning and a sour taste after meals for several months. I had an appendectomy in 2016 and recovered without complications.");
	data15.put(Substance_Use_Key, "I drink one 8-ounce coffee in the morning on weekdays and have one glass of wine about twice a month. I do not use nicotine, cannabis, or other substances.");

	// AsterMigraNova intake question keys
	String MigraNova_Relief_Days_Key = "Intake Q&A - In the last 30 days, on how many days did you take medicine to relieve a headache?";
	String MigraNova_Diagnosed_Key = "Intake Q&A - Has a clinician previously diagnosed you with migraine?";
	String MigraNova_Pattern_Key = "Intake Q&A - When did your headaches start, and have they recently changed in frequency, severity, or location?";
	String MigraNova_Frequency_Key = "Intake Q&A - On how many days a month do you have a headache?";
	String MigraNova_Duration_Key = "Intake Q&A - How long does a typical headache last?";
	String MigraNova_Symptoms_Key = "Intake Q&A - Describe your usual headache: where it hurts, severity, and any nausea, light or sound sensitivity, visual changes, or other symptoms.";
	String MigraNova_Aura_Key = "Intake Q&A - Before or during your usual headaches, do you notice symptoms that go away, such as flashing lights, zigzag lines, or tingling?";
	String MigraNova_Aura_Details_Key = "Intake Q&A - If you notice these symptoms, describe what happens, when it starts in relation to the headache, and how long it lasts.";
	String MigraNova_Impact_Key = "Intake Q&A - How much do your headaches interfere with work, school, or usual daily activities?";
	String MigraNova_Previous_Treatment_Key = "Intake Q&A - List headache treatments you have tried, how often you use them, and how they worked. Enter None if you have tried none.";

	// Shared data for the four AsterMigraNova checkout variants
	TreeMap<String,String> AsterMigraNova_Shared_Data = new TreeMap<String,String>(Shared_Checkout_Data);
	AsterMigraNova_Shared_Data.putAll(Shared_Intake_Data);
	AsterMigraNova_Shared_Data.putAll(Migraine_Intake_Data);
	AsterMigraNova_Shared_Data.put("Product Name", "AsterMigraNova Migraine Wellness Tablets");
	AsterMigraNova_Shared_Data.put("Subscription Type", "One-Time Sale");
	AsterMigraNova_Shared_Data.put("VRIO Offer ID", "");
	AsterMigraNova_Shared_Data.put("VRIO Product ID", "");
	AsterMigraNova_Shared_Data.put("State", "Massachusetts");
	AsterMigraNova_Shared_Data.put("Residential State", "MA");
	AsterMigraNova_Shared_Data.put("Current Location State", "MA");
	AsterMigraNova_Shared_Data.put("Unit System", "Imperial (lbs/inches)");
	AsterMigraNova_Shared_Data.put("City", "Boston");
	AsterMigraNova_Shared_Data.put("Delivery State", "Massachusetts");
	AsterMigraNova_Shared_Data.put("Zipcode", "02108");
	AsterMigraNova_Shared_Data.put("ZIP Code", "02108");
	AsterMigraNova_Shared_Data.put("SSN", "1234");

	// Dataset 21 - AsterMigraNova - 15 Tablets
	TreeMap<String,String> data21 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
	data21.put("Treatment Variant", "AsterMigraNova - 15 Tablets");
	data21.put("Expected Price", "18.00");
	data21.put("First Name", "Phoebe");
	data21.put("Last Name", "Halstead");
	data21.put("Email", "phoebe.halstead.astermd261112batch1035@yopmail.com");
	data21.put("Phone", "3125550135");
	data21.put("Date of Birth", "02/24/1993");
	data21.put("Height", "65");
	data21.put("Weight", "143");
	data21.put("Address", "1322 QA Beacon Street");
	data21.put("Cardholder Name", "Phoebe Halstead");
	data21.put("Notes", "A missed meal sometimes precedes a headache. I would like to discuss the recurring visual changes with the clinician.");
	data21.put("ID Verification Image", "ID_Verification_data10.png");

	data21.put(Medication_Question_Key, "Naproxen");
	data21.put(Medication_Details_Key, "Naproxen, dose unknown, taken as needed for headache relief. I used it on three days in the last 30 days.");
	data21.put(Allergy_Details_Key, "Grass pollen gives me itchy eyes and a runny nose. Adhesive tape can leave an itchy patch.");
	data21.put(Medical_History_Key, "I have seasonal allergies and recurring headaches. I recovered fully after an appendectomy in 2017.");
	data21.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee most mornings. I have one glass of wine about once a month.");
	data21.put(MigraNova_Relief_Days_Key, "1-4 days");
	data21.put(MigraNova_Diagnosed_Key, "No");
	data21.put(MigraNova_Pattern_Key, "The headaches started about 18 months ago. They have followed a similar pattern over the past six months.");
	data21.put(MigraNova_Frequency_Key, "1-3 days");
	data21.put(MigraNova_Duration_Key, "4-24 hours");
	data21.put(MigraNova_Symptoms_Key, "I get moderate throbbing pain around my left temple with light sensitivity and occasional nausea.");
	data21.put(MigraNova_Aura_Key, "Yes");
	data21.put(MigraNova_Aura_Details_Key, "Sometimes I see a bright zigzag about 15 minutes before the headache. It clears after about 10 minutes.");
	data21.put(MigraNova_Impact_Key, "I have to pause or reduce activities");
	data21.put(MigraNova_Previous_Treatment_Key, "Resting in a dark room helps with the light sensitivity. Naproxen gave partial pain relief on three headache days last month.");

	// Dataset 22 - AsterMigraNova - 30 Tablets
	TreeMap<String,String> data22 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
	data22.put("Treatment Variant", "AsterMigraNova - 30 Tablets");
	data22.put("Expected Price", "29.99");
	data22.put("First Name", "Audrey");
	data22.put("Last Name", "Fenwick");
	data22.put("Email", "audrey.fenwick.astermd261112batch1036@yopmail.com");
	data22.put("Phone", "3125550136");
	data22.put("Date of Birth", "09/16/1990");
	data22.put("Height", "66");
	data22.put("Weight", "151");
	data22.put("Address", "1323 QA Charles Street");
	data22.put("Cardholder Name", "Audrey Fenwick");
	data22.put("Notes", "Headaches often follow long stretches of screen work. I would like to discuss how to track that pattern.");
	data22.put("ID Verification Image", "ID_Verification_data11.png");

	data22.put(Medication_Question_Key, "Ibuprofen");
	data22.put(Medication_Details_Key, "Ibuprofen, dose unknown, taken as needed for headaches. I used it on six days in the last 30 days.");
	data22.put(Allergy_Details_Key, "Dust exposure causes sneezing and watery eyes. Nickel earrings leave an itchy rash.");
	data22.put(Medical_History_Key, "I have mild eczema that flares in winter. I recovered without complications after wisdom tooth removal in 2018.");
	data22.put(Substance_Use_Key, "I drink one cup of black tea most mornings and one cup on some afternoons.");
	data22.put(MigraNova_Relief_Days_Key, "5-9 days");
	data22.put(MigraNova_Diagnosed_Key, "No");
	data22.put(MigraNova_Pattern_Key, "The headaches began about two years ago. For the past few months they have occurred on about six days each month.");
	data22.put(MigraNova_Frequency_Key, "4-14 days");
	data22.put(MigraNova_Duration_Key, "4-24 hours");
	data22.put(MigraNova_Symptoms_Key, "The pain is usually on the right side, with sensitivity to sound. Walking upstairs can make the pain worse.");
	data22.put(MigraNova_Aura_Key, "No");
	data22.put(MigraNova_Aura_Details_Key, "My vision and sensation stay normal before and during the headache.");
	data22.put(MigraNova_Impact_Key, "I can continue with some difficulty");
	data22.put(MigraNova_Previous_Treatment_Key, "Taking a screen break and drinking water helped a little. I used ibuprofen on six headache days this month and usually felt partial relief.");

	// Dataset 23 - AsterMigraNova - 60 Tablets
	TreeMap<String,String> data23 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
	data23.put("Treatment Variant", "AsterMigraNova - 60 Tablets");
	data23.put("Expected Price", "49.99");
	data23.put("First Name", "Nina");
	data23.put("Last Name", "Bellamy");
	data23.put("Email", "nina.bellamy.astermd261112batch1037@yopmail.com");
	data23.put("Phone", "3125550137");
	data23.put("Date of Birth", "07/08/1995");
	data23.put("Height", "67");
	data23.put("Weight", "149");
	data23.put("Address", "1324 QA Park Street");
	data23.put("Cardholder Name", "Nina Bellamy");
	data23.put("Notes", "Poor sleep sometimes precedes a longer attack. I would like the clinician to review my recent headache diary.");
	data23.put("ID Verification Image", "ID_Verification_data12.png");

	data23.put(Medication_Question_Key, "Sumatriptan");
	data23.put(Medication_Details_Key, "Sumatriptan, dose unknown, taken as prescribed during attacks. I used it on four days in the last 30 days.");
	data23.put(Allergy_Details_Key, "Cat dander causes itchy eyes and congestion. Some scented lotions leave an itchy rash on my arms.");
	data23.put(Medical_History_Key, "A clinician diagnosed migraine in 2023. I also have seasonal allergic rhinitis and recovered fully after a sinus infection in 2022.");
	data23.put(Substance_Use_Key, "I drink one cup of coffee three mornings a week and one 12-ounce beer about once a month.");
	data23.put(MigraNova_Relief_Days_Key, "1-4 days");
	data23.put(MigraNova_Diagnosed_Key, "Yes");
	data23.put(MigraNova_Pattern_Key, "These headaches began about three years ago. They have affected roughly eight days per month for the last six months.");
	data23.put(MigraNova_Frequency_Key, "4-14 days");
	data23.put(MigraNova_Duration_Key, "More than 24 hours up to 3 days");
	data23.put(MigraNova_Symptoms_Key, "I get strong pulsing pain on one side of my head, nausea, and sensitivity to both light and sound.");
	data23.put(MigraNova_Aura_Key, "Yes");
	data23.put(MigraNova_Aura_Details_Key, "A shimmering spot slowly spreads across my vision before some attacks. It usually clears within 20 minutes.");
	data23.put(MigraNova_Impact_Key, "I cannot carry out usual activities");
	data23.put(MigraNova_Previous_Treatment_Key, "Sumatriptan gave partial relief on four days this month. Rest in a quiet, dark room helped me get through longer attacks.");

	// Dataset 24 - AsterMigraNova - 90 Tablets
	TreeMap<String,String> data24 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
	data24.put("Treatment Variant", "AsterMigraNova - 90 Tablets");
	data24.put("Expected Price", "69.99");
	data24.put("First Name", "Livia");
	data24.put("Last Name", "Kenwood");
	data24.put("Email", "livia.kenwood.astermd261112batch1038@yopmail.com");
	data24.put("Phone", "3125550138");
	data24.put("Date of Birth", "11/19/1991");
	data24.put("Height", "64");
	data24.put("Weight", "157");
	data24.put("Address", "1325 QA Temple Street");
	data24.put("Cardholder Name", "Livia Kenwood");
	data24.put("Notes", "I would like the clinician to review the headache frequency since I started the current preventive medicine.");
	data24.put("ID Verification Image", "ID_Verification_data13.png");

	data24.put(Medication_Question_Key, "Topiramate");
	data24.put(Medication_Details_Key, "Topiramate, dose unknown, taken daily as prescribed for prevention. I used no headache-relief medicine in the last 30 days.");
	data24.put(Allergy_Details_Key, "Ragweed gives me nasal congestion and itchy eyes. Latex gloves make my hands red and itchy.");
	data24.put(Medical_History_Key, "A clinician diagnosed migraine several years ago. I have mild reflux after late meals and had an uncomplicated tonsillectomy as a teenager.");
	data24.put(Substance_Use_Key, "I drink one cup of decaffeinated coffee with breakfast most days. I have one glass of wine about twice a month.");
	data24.put(MigraNova_Relief_Days_Key, "0 days");
	data24.put(MigraNova_Diagnosed_Key, "Yes");
	data24.put(MigraNova_Pattern_Key, "The headaches started about four years ago. They have occurred on about eight days a month since the current prevention routine stabilized.");
	data24.put(MigraNova_Frequency_Key, "4-14 days");
	data24.put(MigraNova_Duration_Key, "Less than 4 hours");
	data24.put(MigraNova_Symptoms_Key, "I usually have moderate pain over my right temple, with some light sensitivity. It often eases after two to three hours of rest.");
	data24.put(MigraNova_Aura_Key, "No");
	data24.put(MigraNova_Aura_Details_Key, "The pain develops gradually. My vision and sensation stay normal throughout the usual episode.");
	data24.put(MigraNova_Impact_Key, "I have to pause or reduce activities");
	data24.put(MigraNova_Previous_Treatment_Key, "Daily topiramate as prescribed reduced how often the headaches occur. A brief rest in a dark room helps during episodes.");

	return new Object[][] { /*
		{ data1 }, 
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
		{ data14 }, */
		{ data15 }, /*
		{ data21 },
		{ data22 },
		{ data23 },
		{ data24 }  */
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
	WebElement View_All = p.View_All_Treatment_Button();
	rp.movetoelement(View_All);
	View_All.click();
	rp.wait_for_invisibilty_of_theElement(View_All);
	Boolean Second_Page_Visibilty= rp.check_element_visibility(p.Landed_in_second_page, 3);  
	Boolean Treatment_Grid= rp.check_element_visibility(p.Optional_Second_Treatment_List(), 3);   
	
   if(Second_Page_Visibilty && Treatment_Grid) {
	   
	WebElement second_prod_list=p.Optional_Second_Treatment_List();   
	rp.movetoelement(second_prod_list);   
	
	List<WebElement> Medicine_Cards = second_prod_list.findElements(By.xpath(".//article"));

	for(WebElement Medicine_Card : Medicine_Cards){

		String Medicine_Name = Medicine_Card.findElement(By.xpath(".//h2")).getText().trim();

		if(Medicine_Name.equalsIgnoreCase(Product_Name)){
           
			rp.movetoelement(Medicine_Card);   
			WebElement Add_to_Cart_Button = Medicine_Card.findElement(By.xpath(".//a[contains(@class,'inline-flex items-center justify-center gap-2 rounded-sm border border-border')]"));

			rp.movetoelement(Add_to_Cart_Button);
			Add_to_Cart_Button.click();

			System.out.println("---------------- PRODUCT SELECTION ----------------");
			System.out.println("Expected : " + Product_Name);
			System.out.println("Actual   : " + Medicine_Name);
			System.out.println("Result   : PASS");

			Report_Listen.log_print_in_report().pass("Product selected: " + Medicine_Name);
      

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
		} }
	}
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
