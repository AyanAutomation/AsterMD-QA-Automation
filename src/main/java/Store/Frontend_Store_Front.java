package Store;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.stream.IntStream;

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
	public Object[][] Storefront_Patient_Details_Data(){

		TreeMap<String,String> Shared_Patient_Data = new TreeMap<String,String>();
		Shared_Patient_Data.put("Delivery Country", "United States");
		Shared_Patient_Data.put("Card Number", "1444444444444440");
		Shared_Patient_Data.put("Expiry Date", "12/29");
		Shared_Patient_Data.put("Security Code", "123");
		Shared_Patient_Data.put("Patient Password", "Password@123");
		Shared_Patient_Data.put("Weight Loss Goal", "21-50 lbs");
		Shared_Patient_Data.put("Biological Sex at Birth", "Female");

		TreeMap<String,String> Boston_Patient_Data = new TreeMap<String,String>(Shared_Patient_Data);
		Boston_Patient_Data.put("State", "Massachusetts");
		Boston_Patient_Data.put("Residential State", "MA");
		Boston_Patient_Data.put("Current Location State", "MA");
		Boston_Patient_Data.put("Unit System", "Imperial (lbs/inches)");
		Boston_Patient_Data.put("City", "Boston");
		Boston_Patient_Data.put("Delivery State", "Massachusetts");
		Boston_Patient_Data.put("Zipcode", "02108");
		Boston_Patient_Data.put("ZIP Code", "02108");
		Boston_Patient_Data.put("SSN", "1234");

		// Patient 1
		TreeMap<String,String> Patient_1 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_1.put("First Name", "Maeve");
		Patient_1.put("Last Name", "Whitaker");
		Patient_1.put("Email", "maeve.whitaker.astermd261112batch1020@yopmail.com");
		Patient_1.put("Phone", "3125550120");
		Patient_1.put("Date of Birth", "06/12/1992");
		Patient_1.put("State", "Washington");
		Patient_1.put("Residential State", "WA");
		Patient_1.put("Current Location State", "WA");
		Patient_1.put("Unit System", "Imperial (lbs/inches)");
		Patient_1.put("Height", "65");
		Patient_1.put("Weight", "143");
		Patient_1.put("Address", "1301 QA Pine Avenue");
		Patient_1.put("City", "Seattle");
		Patient_1.put("Delivery State", "Washington");
		Patient_1.put("Zipcode", "98101");
		Patient_1.put("ZIP Code", "98101");
		Patient_1.put("Cardholder Name", "Maeve Whitaker");
		Patient_1.put("SSN", "1234");
		Patient_1.put("ID Verification Image", "ID_Verification_data01.png");

		// Patient 2
		TreeMap<String,String> Patient_2 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_2.put("First Name", "Alina");
		Patient_2.put("Last Name", "Brookfield");
		Patient_2.put("Email", "alina.brookfield.astermd261112batch1021@yopmail.com");
		Patient_2.put("Phone", "3125550121");
		Patient_2.put("Date of Birth", "04/19/1995");
		Patient_2.put("State", "Illinois");
		Patient_2.put("Residential State", "IL");
		Patient_2.put("Current Location State", "IL");
		Patient_2.put("Unit System", "Imperial (lbs/inches)");
		Patient_2.put("Height", "66");
		Patient_2.put("Weight", "151");
		Patient_2.put("Address", "1302 QA Lake Avenue");
		Patient_2.put("City", "Chicago");
		Patient_2.put("Delivery State", "Illinois");
		Patient_2.put("Zipcode", "60601");
		Patient_2.put("ZIP Code", "60601");
		Patient_2.put("Cardholder Name", "Alina Brookfield");
		Patient_2.put("SSN", "1234");
		Patient_2.put("ID Verification Image", "ID_Verification_data02.png");

		// Patient 3
		TreeMap<String,String> Patient_3 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_3.put("First Name", "Blythe");
		Patient_3.put("Last Name", "Penrose");
		Patient_3.put("Email", "blythe.penrose.astermd261112batch1022@yopmail.com");
		Patient_3.put("Phone", "3125550122");
		Patient_3.put("Date of Birth", "10/22/1988");
		Patient_3.put("State", "Colorado");
		Patient_3.put("Residential State", "CO");
		Patient_3.put("Current Location State", "CO");
		Patient_3.put("Unit System", "Imperial (lbs/inches)");
		Patient_3.put("Height", "67");
		Patient_3.put("Weight", "149");
		Patient_3.put("Address", "1303 QA Oak Street");
		Patient_3.put("City", "Denver");
		Patient_3.put("Delivery State", "Colorado");
		Patient_3.put("Zipcode", "80202");
		Patient_3.put("ZIP Code", "80202");
		Patient_3.put("Cardholder Name", "Blythe Penrose");
		Patient_3.put("SSN", "1234");
		Patient_3.put("ID Verification Image", "ID_Verification_data03.png");

		// Patient 4
		TreeMap<String,String> Patient_4 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_4.put("First Name", "Bridget");
		Patient_4.put("Last Name", "Sloane");
		Patient_4.put("Email", "bridget.sloane.astermd261112batch1023@yopmail.com");
		Patient_4.put("Phone", "3125550123");
		Patient_4.put("Date of Birth", "03/17/1991");
		Patient_4.put("State", "Arizona");
		Patient_4.put("Residential State", "AZ");
		Patient_4.put("Current Location State", "AZ");
		Patient_4.put("Unit System", "Imperial (lbs/inches)");
		Patient_4.put("Height", "64");
		Patient_4.put("Weight", "139");
		Patient_4.put("Address", "1304 QA Desert Lane");
		Patient_4.put("City", "Phoenix");
		Patient_4.put("Delivery State", "Arizona");
		Patient_4.put("Zipcode", "85004");
		Patient_4.put("ZIP Code", "85004");
		Patient_4.put("Cardholder Name", "Bridget Sloane");
		Patient_4.put("SSN", "1234");
		Patient_4.put("ID Verification Image", "ID_Verification_data04.png");

		// Patient 5
		TreeMap<String,String> Patient_5 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_5.put("First Name", "Naomi");
		Patient_5.put("Last Name", "Hensley");
		Patient_5.put("Email", "naomi.hensley.astermd261112batch1024@yopmail.com");
		Patient_5.put("Phone", "3125550124");
		Patient_5.put("Date of Birth", "12/08/1993");
		Patient_5.put("State", "Oregon");
		Patient_5.put("Residential State", "OR");
		Patient_5.put("Current Location State", "OR");
		Patient_5.put("Unit System", "Imperial (lbs/inches)");
		Patient_5.put("Height", "65");
		Patient_5.put("Weight", "146");
		Patient_5.put("Address", "1305 QA River Road");
		Patient_5.put("City", "Portland");
		Patient_5.put("Delivery State", "Oregon");
		Patient_5.put("Zipcode", "97204");
		Patient_5.put("ZIP Code", "97204");
		Patient_5.put("Cardholder Name", "Naomi Hensley");
		Patient_5.put("SSN", "1234");
		Patient_5.put("ID Verification Image", "ID_Verification_data05.png");

		// Patient 6
		TreeMap<String,String> Patient_6 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_6.put("First Name", "Serena");
		Patient_6.put("Last Name", "Northcott");
		Patient_6.put("Email", "serena.northcott.astermd261112batch1025@yopmail.com");
		Patient_6.put("Phone", "3125550125");
		Patient_6.put("Date of Birth", "07/24/1990");
		Patient_6.put("State", "California");
		Patient_6.put("Residential State", "CA");
		Patient_6.put("Current Location State", "CA");
		Patient_6.put("Unit System", "Imperial (lbs/inches)");
		Patient_6.put("Height", "66");
		Patient_6.put("Weight", "155");
		Patient_6.put("Address", "1306 QA Harbor Drive");
		Patient_6.put("City", "San Diego");
		Patient_6.put("Delivery State", "California");
		Patient_6.put("Zipcode", "92101");
		Patient_6.put("ZIP Code", "92101");
		Patient_6.put("Cardholder Name", "Serena Northcott");
		Patient_6.put("SSN", "1234");
		Patient_6.put("ID Verification Image", "ID_Verification_data06.png");

		// Patient 7
		TreeMap<String,String> Patient_7 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_7.put("First Name", "Keira");
		Patient_7.put("Last Name", "Ellington");
		Patient_7.put("Email", "keira.ellington.astermd261112batch1026@yopmail.com");
		Patient_7.put("Phone", "3125550126");
		Patient_7.put("Date of Birth", "02/11/1996");
		Patient_7.put("State", "Florida");
		Patient_7.put("Residential State", "FL");
		Patient_7.put("Current Location State", "FL");
		Patient_7.put("Unit System", "Imperial (lbs/inches)");
		Patient_7.put("Height", "68");
		Patient_7.put("Weight", "158");
		Patient_7.put("Address", "1307 QA Franklin Street");
		Patient_7.put("City", "Tampa");
		Patient_7.put("Delivery State", "Florida");
		Patient_7.put("Zipcode", "33602");
		Patient_7.put("ZIP Code", "33602");
		Patient_7.put("Cardholder Name", "Keira Ellington");
		Patient_7.put("SSN", "1234");
		Patient_7.put("ID Verification Image", "ID_Verification_data07.png");

		// Patient 8
		TreeMap<String,String> Patient_8 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_8.put("First Name", "Matilda");
		Patient_8.put("Last Name", "Hawthorne");
		Patient_8.put("Email", "matilda.hawthorne.astermd261112batch1027@yopmail.com");
		Patient_8.put("Phone", "3125550127");
		Patient_8.put("Date of Birth", "01/19/1990");
		Patient_8.put("State", "New York");
		Patient_8.put("Residential State", "NY");
		Patient_8.put("Current Location State", "NY");
		Patient_8.put("Unit System", "Imperial (lbs/inches)");
		Patient_8.put("Height", "65");
		Patient_8.put("Weight", "144");
		Patient_8.put("Address", "1308 QA Madison Avenue");
		Patient_8.put("City", "New York");
		Patient_8.put("Delivery State", "New York");
		Patient_8.put("Zipcode", "10001");
		Patient_8.put("ZIP Code", "10001");
		Patient_8.put("Cardholder Name", "Matilda Hawthorne");
		Patient_8.put("SSN", "1234");
		Patient_8.put("ID Verification Image", "ID_Verification_data08.png");

		// Patient 9
		TreeMap<String,String> Patient_9 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_9.put("First Name", "Elise");
		Patient_9.put("Last Name", "Fairchild");
		Patient_9.put("Email", "elise.fairchild.astermd261112batch1028@yopmail.com");
		Patient_9.put("Phone", "3125550128");
		Patient_9.put("Date of Birth", "11/14/1994");
		Patient_9.put("State", "Texas");
		Patient_9.put("Residential State", "TX");
		Patient_9.put("Current Location State", "TX");
		Patient_9.put("Unit System", "Imperial (lbs/inches)");
		Patient_9.put("Height", "67");
		Patient_9.put("Weight", "152");
		Patient_9.put("Address", "1309 QA Congress Avenue");
		Patient_9.put("City", "Austin");
		Patient_9.put("Delivery State", "Texas");
		Patient_9.put("Zipcode", "78701");
		Patient_9.put("ZIP Code", "78701");
		Patient_9.put("Cardholder Name", "Elise Fairchild");
		Patient_9.put("SSN", "1234");
		Patient_9.put("ID Verification Image", "ID_Verification_data09.png");

		// Patient 10
		TreeMap<String,String> Patient_10 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_10.put("First Name", "Astrid");
		Patient_10.put("Last Name", "Redmond");
		Patient_10.put("Email", "astrid.redmond.astermd261112batch1029@yopmail.com");
		Patient_10.put("Phone", "3125550129");
		Patient_10.put("Date of Birth", "05/05/1989");
		Patient_10.put("State", "Massachusetts");
		Patient_10.put("Residential State", "MA");
		Patient_10.put("Current Location State", "MA");
		Patient_10.put("Unit System", "Imperial (lbs/inches)");
		Patient_10.put("Height", "66");
		Patient_10.put("Weight", "148");
		Patient_10.put("Address", "1310 QA Beacon Street");
		Patient_10.put("City", "Boston");
		Patient_10.put("Delivery State", "Massachusetts");
		Patient_10.put("Zipcode", "02108");
		Patient_10.put("ZIP Code", "02108");
		Patient_10.put("Cardholder Name", "Astrid Redmond");
		Patient_10.put("SSN", "1234");
		Patient_10.put("ID Verification Image", "ID_Verification_data10.png");

		// Patient 11
		TreeMap<String,String> Patient_11 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_11.put("First Name", "Sylvie");
		Patient_11.put("Last Name", "Delaney");
		Patient_11.put("Email", "sylvie.delaney.astermd261112batch1030@yopmail.com");
		Patient_11.put("Phone", "3125550130");
		Patient_11.put("Date of Birth", "09/02/1995");
		Patient_11.put("State", "Minnesota");
		Patient_11.put("Residential State", "MN");
		Patient_11.put("Current Location State", "MN");
		Patient_11.put("Unit System", "Imperial (lbs/inches)");
		Patient_11.put("Height", "64");
		Patient_11.put("Weight", "137");
		Patient_11.put("Address", "1311 QA Hennepin Avenue");
		Patient_11.put("City", "Minneapolis");
		Patient_11.put("Delivery State", "Minnesota");
		Patient_11.put("Zipcode", "55401");
		Patient_11.put("ZIP Code", "55401");
		Patient_11.put("Cardholder Name", "Sylvie Delaney");
		Patient_11.put("SSN", "1234");
		Patient_11.put("ID Verification Image", "ID_Verification_data11.png");

		// Patient 12
		TreeMap<String,String> Patient_12 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_12.put("First Name", "Vivian");
		Patient_12.put("Last Name", "Langley");
		Patient_12.put("Email", "vivian.langley.astermd261112batch1031@yopmail.com");
		Patient_12.put("Phone", "3125550131");
		Patient_12.put("Date of Birth", "08/18/1992");
		Patient_12.put("State", "Georgia");
		Patient_12.put("Residential State", "GA");
		Patient_12.put("Current Location State", "GA");
		Patient_12.put("Unit System", "Imperial (lbs/inches)");
		Patient_12.put("Height", "68");
		Patient_12.put("Weight", "161");
		Patient_12.put("Address", "1312 QA Peachtree Street");
		Patient_12.put("City", "Atlanta");
		Patient_12.put("Delivery State", "Georgia");
		Patient_12.put("Zipcode", "30303");
		Patient_12.put("ZIP Code", "30303");
		Patient_12.put("Cardholder Name", "Vivian Langley");
		Patient_12.put("SSN", "1234");
		Patient_12.put("ID Verification Image", "ID_Verification_data12.png");

		// Patient 13
		TreeMap<String,String> Patient_13 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_13.put("First Name", "Elodie");
		Patient_13.put("Last Name", "Prescott");
		Patient_13.put("Email", "elodie.prescott.astermd261112batch1032@yopmail.com");
		Patient_13.put("Phone", "3125550132");
		Patient_13.put("Date of Birth", "04/29/1987");
		Patient_13.put("State", "North Carolina");
		Patient_13.put("Residential State", "NC");
		Patient_13.put("Current Location State", "NC");
		Patient_13.put("Unit System", "Imperial (lbs/inches)");
		Patient_13.put("Height", "65");
		Patient_13.put("Weight", "150");
		Patient_13.put("Address", "1313 QA Tryon Street");
		Patient_13.put("City", "Charlotte");
		Patient_13.put("Delivery State", "North Carolina");
		Patient_13.put("Zipcode", "28202");
		Patient_13.put("ZIP Code", "28202");
		Patient_13.put("Cardholder Name", "Elodie Prescott");
		Patient_13.put("SSN", "1234");
		Patient_13.put("ID Verification Image", "ID_Verification_data13.png");

		// Patient 14
		TreeMap<String,String> Patient_14 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_14.put("First Name", "Juliette");
		Patient_14.put("Last Name", "Sinclair");
		Patient_14.put("Email", "juliette.sinclair.astermd261112batch1033@yopmail.com");
		Patient_14.put("Phone", "3125550133");
		Patient_14.put("Date of Birth", "12/03/1996");
		Patient_14.put("State", "Ohio");
		Patient_14.put("Residential State", "OH");
		Patient_14.put("Current Location State", "OH");
		Patient_14.put("Unit System", "Imperial (lbs/inches)");
		Patient_14.put("Height", "66");
		Patient_14.put("Weight", "142");
		Patient_14.put("Address", "1314 QA High Street");
		Patient_14.put("City", "Columbus");
		Patient_14.put("Delivery State", "Ohio");
		Patient_14.put("Zipcode", "43215");
		Patient_14.put("ZIP Code", "43215");
		Patient_14.put("Cardholder Name", "Juliette Sinclair");
		Patient_14.put("SSN", "1234");
		Patient_14.put("ID Verification Image", "ID_Verification_data14.png");

		// Patient 15
		TreeMap<String,String> Patient_15 = new TreeMap<String,String>(Shared_Patient_Data);
		Patient_15.put("First Name", "Margot");
		Patient_15.put("Last Name", "Merriweather");
		Patient_15.put("Email", "margot.merriweather.astermd261112batch1034@yopmail.com");
		Patient_15.put("Phone", "3125550134");
		Patient_15.put("Date of Birth", "07/09/1991");
		Patient_15.put("State", "Pennsylvania");
		Patient_15.put("Residential State", "PA");
		Patient_15.put("Current Location State", "PA");
		Patient_15.put("Unit System", "Imperial (lbs/inches)");
		Patient_15.put("Height", "65");
		Patient_15.put("Weight", "147");
		Patient_15.put("Address", "1315 QA Market Street");
		Patient_15.put("City", "Philadelphia");
		Patient_15.put("Delivery State", "Pennsylvania");
		Patient_15.put("Zipcode", "19103");
		Patient_15.put("ZIP Code", "19103");
		Patient_15.put("Cardholder Name", "Margot Merriweather");
		Patient_15.put("SSN", "1234");
		Patient_15.put("ID Verification Image", "ID_Verification_data15.png");

		// Patient 21
		TreeMap<String,String> Patient_21 = new TreeMap<String,String>(Boston_Patient_Data);
		Patient_21.put("First Name", "Phoebe");
		Patient_21.put("Last Name", "Halstead");
		Patient_21.put("Email", "phoebe.halstead.astermd261112batch1035@yopmail.com");
		Patient_21.put("Phone", "3125550135");
		Patient_21.put("Date of Birth", "02/24/1993");
		Patient_21.put("Height", "65");
		Patient_21.put("Weight", "143");
		Patient_21.put("Address", "1322 QA Beacon Street");
		Patient_21.put("Cardholder Name", "Phoebe Halstead");
		Patient_21.put("ID Verification Image", "ID_Verification_data10.png");

		// Patient 22
		TreeMap<String,String> Patient_22 = new TreeMap<String,String>(Boston_Patient_Data);
		Patient_22.put("First Name", "Audrey");
		Patient_22.put("Last Name", "Fenwick");
		Patient_22.put("Email", "audrey.fenwick.astermd261112batch1036@yopmail.com");
		Patient_22.put("Phone", "3125550136");
		Patient_22.put("Date of Birth", "09/16/1990");
		Patient_22.put("Height", "66");
		Patient_22.put("Weight", "151");
		Patient_22.put("Address", "1323 QA Charles Street");
		Patient_22.put("Cardholder Name", "Audrey Fenwick");
		Patient_22.put("ID Verification Image", "ID_Verification_data11.png");

		// Patient 23
		TreeMap<String,String> Patient_23 = new TreeMap<String,String>(Boston_Patient_Data);
		Patient_23.put("First Name", "Nina");
		Patient_23.put("Last Name", "Bellamy");
		Patient_23.put("Email", "nina.bellamy.astermd261112batch1037@yopmail.com");
		Patient_23.put("Phone", "3125550137");
		Patient_23.put("Date of Birth", "07/08/1995");
		Patient_23.put("Height", "67");
		Patient_23.put("Weight", "149");
		Patient_23.put("Address", "1324 QA Park Street");
		Patient_23.put("Cardholder Name", "Nina Bellamy");
		Patient_23.put("ID Verification Image", "ID_Verification_data12.png");

		// Patient 24
		TreeMap<String,String> Patient_24 = new TreeMap<String,String>(Boston_Patient_Data);
		Patient_24.put("First Name", "Livia");
		Patient_24.put("Last Name", "Kenwood");
		Patient_24.put("Email", "livia.kenwood.astermd261112batch1038@yopmail.com");
		Patient_24.put("Phone", "3125550138");
		Patient_24.put("Date of Birth", "11/19/1991");
		Patient_24.put("Height", "64");
		Patient_24.put("Weight", "157");
		Patient_24.put("Address", "1325 QA Temple Street");
		Patient_24.put("Cardholder Name", "Livia Kenwood");
		Patient_24.put("ID Verification Image", "ID_Verification_data13.png");

		return new Object[][] {
			{ Patient_1 }, /*
			{ Patient_2 },
			{ Patient_3 },
			{ Patient_4 },
			{ Patient_5 },
			{ Patient_6 },
			{ Patient_7 },
			{ Patient_8 },
			{ Patient_9 },
			{ Patient_10 },
			{ Patient_11 },
			{ Patient_12 },
			{ Patient_13 },
			{ Patient_14 },
			{ Patient_15 },
			{ Patient_21 },
			{ Patient_22 },
			{ Patient_23 },
			{ Patient_24 }, */
		};
	}
   
	
	
	@DataProvider
	public Object[][] Storefront_Product_Variant_And_Intake_Data(){

		String Medication_Question_Key = "Intake Q&A - Are you currently taking any of the following medicines or supplements, either regularly or as needed? Select all that apply. Select None only if you take no medicines or supplements.";
		String Medication_Details_Key = "Intake Q&A - List all medicines and supplements you currently take, including doses and frequency. Enter None if you take none.";

		TreeMap<String,String> Shared_Intake_Data = new TreeMap<String,String>();
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

		// Product 1 - AsterSomnera - 30 Tablet Supply
		TreeMap<String,String> Product_1 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_1.put("Product Name", "AsterSomnera Sleep Support Tablets");
		Product_1.put("Treatment Variant", "30 Tablet Supply");
		Product_1.put("Subscription Type", "One-Time Sale");
		Product_1.put("Expected Price", "40.00");
		Product_1.put("VRIO Offer ID", "");
		Product_1.put("VRIO Product ID", "");
		Product_1.put("Notes", "I would like to discuss sleep quality, occasional sleeplessness, and appropriate sleep support options.");
		Product_1.put(Medication_Question_Key, "Melatonin");
		Product_1.put(Medication_Details_Key, "Melatonin, dose unknown, taken on some nights.");
		Product_1.putAll(Sleep_Intake_Data);

		// Product 2 - AsterSomnera - 60 Tablet Supply
		TreeMap<String,String> Product_2 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_2.put("Product Name", "AsterSomnera Sleep Support Tablets");
		Product_2.put("Treatment Variant", "60 Tablet Supply");
		Product_2.put("Subscription Type", "One-Time Sale");
		Product_2.put("Expected Price", "74.00");
		Product_2.put("VRIO Offer ID", "");
		Product_2.put("VRIO Product ID", "");
		Product_2.put("Notes", "I would like information about irregular sleep patterns, sleep treatment precautions, and improving nighttime rest.");
		Product_2.put(Medication_Question_Key, "Diphenhydramine");
		Product_2.put(Medication_Details_Key, "Diphenhydramine, dose unknown, taken occasionally.");
		Product_2.putAll(Sleep_Intake_Data);

		// Product 3 - AsterSomnera - 90 Tablet Supply
		TreeMap<String,String> Product_3 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_3.put("Product Name", "AsterSomnera Sleep Support Tablets");
		Product_3.put("Treatment Variant", "90 Tablet Supply");
		Product_3.put("Subscription Type", "One-Time Sale");
		Product_3.put("Expected Price", "106.00");
		Product_3.put("VRIO Offer ID", "");
		Product_3.put("VRIO Product ID", "");
		Product_3.put("Notes", "I would like to discuss long-term sleep support, treatment eligibility, possible side effects, and follow-up care.");
		Product_3.put(Medication_Question_Key, "Doxylamine");
		Product_3.put(Medication_Details_Key, "Doxylamine, dose unknown, taken as needed at night.");
		Product_3.putAll(Sleep_Intake_Data);

		// Product 4 - AsterSomnera - 30 Tablet Supply
		TreeMap<String,String> Product_4 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_4.put("Product Name", "AsterSomnera Sleep Support Tablets");
		Product_4.put("Treatment Variant", "30 Tablet Supply");
		Product_4.put("Subscription Type", "One-Time Sale");
		Product_4.put("Expected Price", "40.00");
		Product_4.put("VRIO Offer ID", "");
		Product_4.put("VRIO Product ID", "");
		Product_4.put("Notes", "I would like guidance on falling asleep faster, maintaining regular sleep schedules, and treatment suitability.");
		Product_4.put(Medication_Question_Key, "Zolpidem");
		Product_4.put(Medication_Details_Key, "Zolpidem, dose unknown, taken at bedtime as needed.");
		Product_4.putAll(Sleep_Intake_Data);

		// Product 5 - AsterSomnera - 60 Tablet Supply
		TreeMap<String,String> Product_5 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_5.put("Product Name", "AsterSomnera Sleep Support Tablets");
		Product_5.put("Treatment Variant", "60 Tablet Supply");
		Product_5.put("Subscription Type", "One-Time Sale");
		Product_5.put("Expected Price", "74.00");
		Product_5.put("VRIO Offer ID", "");
		Product_5.put("VRIO Product ID", "");
		Product_5.put("Notes", "I would like to understand sleep improvement options, possible medication interactions, and appropriate treatment duration.");
		Product_5.put(Medication_Question_Key, "Other medicine or supplement (list it in the next question)");
		Product_5.put(Medication_Details_Key, "Eszopiclone, dose unknown, taken at bedtime on some nights.");
		Product_5.putAll(Sleep_Intake_Data);

		// Product 6 - AsterSomnera - 90 Tablet Supply
		TreeMap<String,String> Product_6 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_6.put("Product Name", "AsterSomnera Sleep Support Tablets");
		Product_6.put("Treatment Variant", "90 Tablet Supply");
		Product_6.put("Subscription Type", "One-Time Sale");
		Product_6.put("Expected Price", "106.00");
		Product_6.put("VRIO Offer ID", "");
		Product_6.put("VRIO Product ID", "");
		Product_6.put("Notes", "I would like information about recurring insomnia symptoms, sleep regulation, medication precautions, and follow-up monitoring.");
		Product_6.put(Medication_Question_Key, "Famotidine");
		Product_6.put(Medication_Details_Key, "Famotidine, dose unknown, taken as needed.");
		Product_6.putAll(Sleep_Intake_Data);

		// Product 7 - AsterSomnera - 30 Tablet Supply
		TreeMap<String,String> Product_7 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_7.put("Product Name", "AsterSomnera Sleep Support Tablets");
		Product_7.put("Treatment Variant", "30 Tablet Supply");
		Product_7.put("Subscription Type", "One-Time Sale");
		Product_7.put("Expected Price", "40.00");
		Product_7.put("VRIO Offer ID", "");
		Product_7.put("VRIO Product ID", "");
		Product_7.put("Notes", "I would like to improve sleep consistency and discuss safe treatment options for occasional sleep difficulties.");
		Product_7.put(Medication_Question_Key, "Pantoprazole");
		Product_7.put(Medication_Details_Key, "Pantoprazole, dose unknown, taken daily.");
		Product_7.putAll(Sleep_Intake_Data);

		// Product 8 - AsterMigraEase
		TreeMap<String,String> Product_8 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_8.put("Product Name", "AsterMigraEase Headache Support Tablets");
		Product_8.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
		Product_8.put("Subscription Type", "One-Time Sale");
		Product_8.put("Expected Price", "47.90");
		Product_8.put("VRIO Offer ID", "");
		Product_8.put("VRIO Product ID", "");
		Product_8.put("Notes", "I would like to discuss frequent headaches, migraine triggers, treatment precautions, and preventive recommendations.");
		Product_8.put(Medication_Question_Key, "Acetaminophen");
		Product_8.put(Medication_Details_Key, "Acetaminophen, dose unknown, taken as needed for headaches.");
		Product_8.putAll(Migraine_Intake_Data);

		// Product 9 - AsterMigraEase
		TreeMap<String,String> Product_9 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_9.put("Product Name", "AsterMigraEase Headache Support Tablets");
		Product_9.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
		Product_9.put("Subscription Type", "One-Time Sale");
		Product_9.put("Expected Price", "47.90");
		Product_9.put("VRIO Offer ID", "");
		Product_9.put("VRIO Product ID", "");
		Product_9.put("Notes", "I would like information about migraine episodes, headache frequency, treatment suitability, and potential medication interactions.");
		Product_9.put(Medication_Question_Key, "Ibuprofen");
		Product_9.put(Medication_Details_Key, "Ibuprofen, dose unknown, taken as needed for headaches.");
		Product_9.putAll(Migraine_Intake_Data);

		// Product 10 - AsterMigraEase
		TreeMap<String,String> Product_10 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_10.put("Product Name", "AsterMigraEase Headache Support Tablets");
		Product_10.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
		Product_10.put("Subscription Type", "One-Time Sale");
		Product_10.put("Expected Price", "47.90");
		Product_10.put("VRIO Offer ID", "");
		Product_10.put("VRIO Product ID", "");
		Product_10.put("Notes", "I would like advice regarding recurring migraine symptoms, medication safety, headache monitoring, and follow-up care.");
		Product_10.put(Medication_Question_Key, "Naproxen");
		Product_10.put(Medication_Details_Key, "Naproxen, dose unknown, taken as needed for headaches.");
		Product_10.putAll(Migraine_Intake_Data);

		// Product 11 - AsterMigraEase
		TreeMap<String,String> Product_11 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_11.put("Product Name", "AsterMigraEase Headache Support Tablets");
		Product_11.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
		Product_11.put("Subscription Type", "One-Time Sale");
		Product_11.put("Expected Price", "47.90");
		Product_11.put("VRIO Offer ID", "");
		Product_11.put("VRIO Product ID", "");
		Product_11.put("Notes", "I would like to discuss headache severity, migraine-related discomfort, possible treatment side effects, and preventive measures.");
		Product_11.put(Medication_Question_Key, "Sumatriptan");
		Product_11.put(Medication_Details_Key, "Sumatriptan, dose unknown, taken during migraine episodes as needed.");
		Product_11.putAll(Migraine_Intake_Data);

		// Product 12 - AsterMigraEase
		TreeMap<String,String> Product_12 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_12.put("Product Name", "AsterMigraEase Headache Support Tablets");
		Product_12.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
		Product_12.put("Subscription Type", "One-Time Sale");
		Product_12.put("Expected Price", "47.90");
		Product_12.put("VRIO Offer ID", "");
		Product_12.put("VRIO Product ID", "");
		Product_12.put("Notes", "I would like information about migraine prevention, treatment eligibility, possible interactions, and clinical guidance.");
		Product_12.put(Medication_Question_Key, "Topiramate");
		Product_12.put(Medication_Details_Key, "Topiramate, dose unknown, taken daily.");
		Product_12.putAll(Migraine_Intake_Data);

		// Product 13 - AsterMigraEase
		TreeMap<String,String> Product_13 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_13.put("Product Name", "AsterMigraEase Headache Support Tablets");
		Product_13.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
		Product_13.put("Subscription Type", "One-Time Sale");
		Product_13.put("Expected Price", "47.90");
		Product_13.put("VRIO Offer ID", "");
		Product_13.put("VRIO Product ID", "");
		Product_13.put("Notes", "I would like to discuss migraine symptom tracking, treatment precautions, and suitable headache management options.");
		Product_13.put(Medication_Question_Key, "Other medicine or supplement (list it in the next question)");
		Product_13.put(Medication_Details_Key, "Rizatriptan, dose unknown, taken during migraine episodes as needed.");
		Product_13.putAll(Migraine_Intake_Data);

		// Product 14 - AsterMigraEase
		TreeMap<String,String> Product_14 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_14.put("Product Name", "AsterMigraEase Headache Support Tablets");
		Product_14.put("Treatment Variant", "AsterMigraEase Headache Support Tablets");
		Product_14.put("Subscription Type", "One-Time Sale");
		Product_14.put("Expected Price", "47.90");
		Product_14.put("VRIO Offer ID", "");
		Product_14.put("VRIO Product ID", "");
		Product_14.put("Notes", "I would like advice on recurring headaches, migraine treatment safety, medication precautions, and preventive care.");
		Product_14.put(Medication_Question_Key, "Calcium carbonate");
		Product_14.put(Medication_Details_Key, "Calcium carbonate, dose unknown, taken as needed.");
		Product_14.putAll(Migraine_Intake_Data);

		// Product 15 - AsterRefluxa
		TreeMap<String,String> Product_15 = new TreeMap<String,String>(Shared_Intake_Data);
		Product_15.put("Product Name", "AsterRefluxa Digestive Relief Capsules");
		Product_15.put("Treatment Variant", "");
		Product_15.put("Subscription Type", "Monthly / 30-Day Recurring");
		Product_15.put("Expected Price", "");
		Product_15.put("VRIO Offer ID", "");
		Product_15.put("VRIO Product ID", "");
		Product_15.put("Notes", "I would like information about digestive discomfort, recurring acid reflux, treatment suitability, and dietary recommendations.");
		Product_15.put(Medication_Question_Key, "Omeprazole");
		Product_15.put(Medication_Details_Key, "Omeprazole, dose unknown, taken daily.");
		Product_15.putAll(Reflux_Intake_Data);

		// Detailed Page 3 Medical History Answers
		String Allergy_Details_Key = "Intake Q&A - List your allergies and what reaction each causes. Enter None if you have no known allergies.";
		String Medical_History_Key = "Intake Q&A - List your medical conditions, relevant mental health history, and significant past illnesses or operations. Enter None if you have none to report.";
		String Substance_Use_Key = "Intake Q&A - Describe your caffeine, nicotine, alcohol, cannabis or other substance use, including amount and frequency. Enter None if you use none.";

		Product_1.put(Allergy_Details_Key, "Grass pollen causes sneezing and watery eyes in spring. Nickel jewelry leaves an itchy rash where it touches my skin.");
		Product_1.put(Medical_History_Key, "I have seasonal allergic rhinitis and have had trouble falling asleep for several months. I had an appendectomy in 2016 and recovered fully.");
		Product_1.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee most mornings and have one glass of wine about once a month. I do not use nicotine, cannabis, or other substances.");

		Product_2.put(Allergy_Details_Key, "Dust exposure makes me sneeze and gives me itchy eyes. Adhesive tape can leave a red patch that itches for a day.");
		Product_2.put(Medical_History_Key, "I have mild hand eczema that flares in winter. I had my wisdom teeth removed in 2017 and recovered without complications.");
		Product_2.put(Substance_Use_Key, "I drink two 8-ounce cups of black tea on weekdays, one at breakfast and one at lunch. I do not use nicotine, alcohol, cannabis, or other substances.");

		Product_3.put(Allergy_Details_Key, "Cat dander gives me a runny nose and watery eyes. Latex gloves make the skin on my hands red and itchy.");
		Product_3.put(Medical_History_Key, "I have eczema that flares in dry weather. I had my tonsils removed as a child and recovered without complications.");
		Product_3.put(Substance_Use_Key, "I have one 12-ounce coffee three mornings a week and one 12-ounce beer about twice a month. I do not use nicotine, cannabis, or other substances.");

		Product_4.put(Allergy_Details_Key, "Tree pollen causes sneezing and itchy, watery eyes in spring. Adhesive bandages sometimes leave a red, itchy patch.");
		Product_4.put(Medical_History_Key, "I have seasonal allergic rhinitis and ongoing difficulty falling asleep. I had an appendectomy in 2017 and recovered without complications.");
		Product_4.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee on weekday mornings and one cup of black tea on about two afternoons a week. I do not use nicotine, alcohol, cannabis, or other substances.");

		Product_5.put(Allergy_Details_Key, "Mold exposure causes nasal congestion and watery eyes. Fragranced lotions sometimes cause an itchy rash on my arms.");
		Product_5.put(Medical_History_Key, "I had childhood asthma and have had no flare in recent years. I attended counseling for work-related anxiety in 2021 and completed it that year.");
		Product_5.put(Substance_Use_Key, "I have one 8-ounce green tea with breakfast on most days. I drink alcohol about once every two months, usually one glass of wine. I do not use nicotine, cannabis, or other substances.");

		Product_6.put(Allergy_Details_Key, "Dog dander causes sneezing and itchy eyes after prolonged exposure. Adhesive tape leaves a red patch that fades the next day.");
		Product_6.put(Medical_History_Key, "I have intermittent acid reflux, mainly after large or late meals. My gallbladder was removed in 2019 and I recovered without complications.");
		Product_6.put(Substance_Use_Key, "I drink one 8-ounce coffee four mornings a week and one glass of wine about twice a month. I do not use nicotine, cannabis, or other substances.");

		Product_7.put(Allergy_Details_Key, "Nickel earrings cause an itchy red rash on my earlobes. Ragweed pollen gives me congestion and watery eyes in late summer.");
		Product_7.put(Medical_History_Key, "I was diagnosed with acid reflux in 2023. I had iron deficiency in 2020, and my follow-up blood tests returned to normal.");
		Product_7.put(Substance_Use_Key, "I have one 12-ounce iced tea on two or three days a week and one 12-ounce beer on some weekends. I do not use nicotine, cannabis, or other substances.");

		Product_8.put(Allergy_Details_Key, "Dust mites cause sneezing and nasal congestion when I clean. Adhesive bandages cause mild itching around the edges.");
		Product_8.put(Medical_History_Key, "I have recurring headaches with light sensitivity and a history of seasonal allergies. I recovered fully from a sinus infection in 2022.");
		Product_8.put(Substance_Use_Key, "I have one 8-ounce cup of coffee each morning and one glass of wine roughly once a month. I do not use nicotine, cannabis, or other substances.");

		Product_9.put(Allergy_Details_Key, "Ragweed gives me sneezing and itchy eyes in the fall. Latex gloves cause an itchy rash on my hands.");
		Product_9.put(Medical_History_Key, "I have recurrent headaches and seasonal allergies. I had a mild concussion in 2017 and recovered after follow-up.");
		Product_9.put(Substance_Use_Key, "I drink one 12-ounce coffee on workdays. I use a nicotine vape about twice a week, usually three to five puffs. I do not use alcohol, cannabis, or other substances.");

		Product_10.put(Allergy_Details_Key, "Birch pollen makes my eyes water and causes a runny nose. Nickel watchbands leave an itchy patch on my wrist.");
		Product_10.put(Medical_History_Key, "I have recurring headaches and neck tension after long periods at my desk. I had an uncomplicated tonsillectomy as a teenager.");
		Product_10.put(Substance_Use_Key, "I drink two 8-ounce cups of coffee on most weekdays and one glass of wine about twice a month. I do not use nicotine, cannabis, or other substances.");

		Product_11.put(Allergy_Details_Key, "Pet dander causes sneezing and a stuffy nose. Some adhesive dressings leave an itchy rash for one to two days.");
		Product_11.put(Medical_History_Key, "I have recurring headaches that sometimes come with nausea. I attended counseling for anxiety in 2020 and completed the course of care.");
		Product_11.put(Substance_Use_Key, "I drink one 8-ounce cup of black tea most mornings and have one 12-ounce beer about once a month. I do not use nicotine, cannabis, or other substances.");

		Product_12.put(Allergy_Details_Key, "Cedar pollen causes itchy eyes and sneezing during pollen season. Adhesive bandages can leave a small red rash.");
		Product_12.put(Medical_History_Key, "I have a history of seizures and continue routine follow-ups. My last seizure was several years ago, and I also report recurring headaches.");
		Product_12.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee on two mornings a week. I do not use nicotine, alcohol, cannabis, or other substances.");

		Product_13.put(Allergy_Details_Key, "Cat dander causes nasal congestion and itchy eyes. Some scented soaps leave an itchy rash on my hands.");
		Product_13.put(Medical_History_Key, "I have recurring headaches with light sensitivity and a history of motion sickness. I had a small skin cyst removed in 2021 and healed without complications.");
		Product_13.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee most mornings and have one 12-ounce beer about once a month. I do not use nicotine, cannabis, or other substances.");

		Product_14.put(Allergy_Details_Key, "Grass pollen causes a runny nose and watery eyes. Metal belt buckles sometimes leave an itchy rash where they touch my skin.");
		Product_14.put(Medical_History_Key, "I have occasional acid reflux after large meals and recurrent headaches. I had an appendectomy in 2014 and recovered fully.");
		Product_14.put(Substance_Use_Key, "I have one 8-ounce cup of green tea four mornings a week and one glass of wine about once a month. I do not use nicotine, cannabis, or other substances.");

		Product_15.put(Allergy_Details_Key, "Dust mites give me sneezing and congestion. Latex gloves cause redness and itching where they touch my skin.");
		Product_15.put(Medical_History_Key, "A clinician diagnosed reflux in 2022. I have had burning and a sour taste after meals for several months. I had an appendectomy in 2016 and recovered without complications.");
		Product_15.put(Substance_Use_Key, "I drink one 8-ounce coffee in the morning on weekdays and have one glass of wine about twice a month. I do not use nicotine, cannabis, or other substances.");

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

		TreeMap<String,String> AsterMigraNova_Shared_Data = new TreeMap<String,String>(Shared_Intake_Data);
		AsterMigraNova_Shared_Data.putAll(Migraine_Intake_Data);
		AsterMigraNova_Shared_Data.put("Product Name", "AsterMigraNova Migraine Wellness Tablets");
		AsterMigraNova_Shared_Data.put("Subscription Type", "One-Time Sale");
		AsterMigraNova_Shared_Data.put("VRIO Offer ID", "");
		AsterMigraNova_Shared_Data.put("VRIO Product ID", "");

		// Product 21 - AsterMigraNova - 15 Tablets
		TreeMap<String,String> Product_21 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
		Product_21.put("Treatment Variant", "AsterMigraNova - 15 Tablets");
		Product_21.put("Expected Price", "18.00");
		Product_21.put("Notes", "A missed meal sometimes precedes a headache. I would like to discuss the recurring visual changes with the clinician.");
		Product_21.put(Medication_Question_Key, "Naproxen");
		Product_21.put(Medication_Details_Key, "Naproxen, dose unknown, taken as needed for headache relief. I used it on three days in the last 30 days.");
		Product_21.put(Allergy_Details_Key, "Grass pollen gives me itchy eyes and a runny nose. Adhesive tape can leave an itchy patch.");
		Product_21.put(Medical_History_Key, "I have seasonal allergies and recurring headaches. I recovered fully after an appendectomy in 2017.");
		Product_21.put(Substance_Use_Key, "I drink one 8-ounce cup of coffee most mornings. I have one glass of wine about once a month.");
		Product_21.put(MigraNova_Relief_Days_Key, "1-4 days");
		Product_21.put(MigraNova_Diagnosed_Key, "No");
		Product_21.put(MigraNova_Pattern_Key, "The headaches started about 18 months ago. They have followed a similar pattern over the past six months.");
		Product_21.put(MigraNova_Frequency_Key, "1-3 days");
		Product_21.put(MigraNova_Duration_Key, "4-24 hours");
		Product_21.put(MigraNova_Symptoms_Key, "I get moderate throbbing pain around my left temple with light sensitivity and occasional nausea.");
		Product_21.put(MigraNova_Aura_Key, "Yes");
		Product_21.put(MigraNova_Aura_Details_Key, "Sometimes I see a bright zigzag about 15 minutes before the headache. It clears after about 10 minutes.");
		Product_21.put(MigraNova_Impact_Key, "I have to pause or reduce activities");
		Product_21.put(MigraNova_Previous_Treatment_Key, "Resting in a dark room helps with the light sensitivity. Naproxen gave partial pain relief on three headache days last month.");

		// Product 22 - AsterMigraNova - 30 Tablets
		TreeMap<String,String> Product_22 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
		Product_22.put("Treatment Variant", "AsterMigraNova - 30 Tablets");
		Product_22.put("Expected Price", "29.99");
		Product_22.put("Notes", "Headaches often follow long stretches of screen work. I would like to discuss how to track that pattern.");
		Product_22.put(Medication_Question_Key, "Ibuprofen");
		Product_22.put(Medication_Details_Key, "Ibuprofen, dose unknown, taken as needed for headaches. I used it on six days in the last 30 days.");
		Product_22.put(Allergy_Details_Key, "Dust exposure causes sneezing and watery eyes. Nickel earrings leave an itchy rash.");
		Product_22.put(Medical_History_Key, "I have mild eczema that flares in winter. I recovered without complications after wisdom tooth removal in 2018.");
		Product_22.put(Substance_Use_Key, "I drink one cup of black tea most mornings and one cup on some afternoons.");
		Product_22.put(MigraNova_Relief_Days_Key, "5-9 days");
		Product_22.put(MigraNova_Diagnosed_Key, "No");
		Product_22.put(MigraNova_Pattern_Key, "The headaches began about two years ago. For the past few months they have occurred on about six days each month.");
		Product_22.put(MigraNova_Frequency_Key, "4-14 days");
		Product_22.put(MigraNova_Duration_Key, "4-24 hours");
		Product_22.put(MigraNova_Symptoms_Key, "The pain is usually on the right side, with sensitivity to sound. Walking upstairs can make the pain worse.");
		Product_22.put(MigraNova_Aura_Key, "No");
		Product_22.put(MigraNova_Aura_Details_Key, "My vision and sensation stay normal before and during the headache.");
		Product_22.put(MigraNova_Impact_Key, "I can continue with some difficulty");
		Product_22.put(MigraNova_Previous_Treatment_Key, "Taking a screen break and drinking water helped a little. I used ibuprofen on six headache days this month and usually felt partial relief.");

		// Product 23 - AsterMigraNova - 60 Tablets
		TreeMap<String,String> Product_23 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
		Product_23.put("Treatment Variant", "AsterMigraNova - 60 Tablets");
		Product_23.put("Expected Price", "49.99");
		Product_23.put("Notes", "Poor sleep sometimes precedes a longer attack. I would like the clinician to review my recent headache diary.");
		Product_23.put(Medication_Question_Key, "Sumatriptan");
		Product_23.put(Medication_Details_Key, "Sumatriptan, dose unknown, taken as prescribed during attacks. I used it on four days in the last 30 days.");
		Product_23.put(Allergy_Details_Key, "Cat dander causes itchy eyes and congestion. Some scented lotions leave an itchy rash on my arms.");
		Product_23.put(Medical_History_Key, "A clinician diagnosed migraine in 2023. I also have seasonal allergic rhinitis and recovered fully after a sinus infection in 2022.");
		Product_23.put(Substance_Use_Key, "I drink one cup of coffee three mornings a week and one 12-ounce beer about once a month.");
		Product_23.put(MigraNova_Relief_Days_Key, "1-4 days");
		Product_23.put(MigraNova_Diagnosed_Key, "Yes");
		Product_23.put(MigraNova_Pattern_Key, "These headaches began about three years ago. They have affected roughly eight days per month for the last six months.");
		Product_23.put(MigraNova_Frequency_Key, "4-14 days");
		Product_23.put(MigraNova_Duration_Key, "More than 24 hours up to 3 days");
		Product_23.put(MigraNova_Symptoms_Key, "I get strong pulsing pain on one side of my head, nausea, and sensitivity to both light and sound.");
		Product_23.put(MigraNova_Aura_Key, "Yes");
		Product_23.put(MigraNova_Aura_Details_Key, "A shimmering spot slowly spreads across my vision before some attacks. It usually clears within 20 minutes.");
		Product_23.put(MigraNova_Impact_Key, "I cannot carry out usual activities");
		Product_23.put(MigraNova_Previous_Treatment_Key, "Sumatriptan gave partial relief on four days this month. Rest in a quiet, dark room helped me get through longer attacks.");

		// Product 24 - AsterMigraNova - 90 Tablets
		TreeMap<String,String> Product_24 = new TreeMap<String,String>(AsterMigraNova_Shared_Data);
		Product_24.put("Treatment Variant", "AsterMigraNova - 90 Tablets");
		Product_24.put("Expected Price", "69.99");
		Product_24.put("Notes", "I would like the clinician to review the headache frequency since I started the current preventive medicine.");
		Product_24.put(Medication_Question_Key, "Topiramate");
		Product_24.put(Medication_Details_Key, "Topiramate, dose unknown, taken daily as prescribed for prevention. I used no headache-relief medicine in the last 30 days.");
		Product_24.put(Allergy_Details_Key, "Ragweed gives me nasal congestion and itchy eyes. Latex gloves make my hands red and itchy.");
		Product_24.put(Medical_History_Key, "A clinician diagnosed migraine several years ago. I have mild reflux after late meals and had an uncomplicated tonsillectomy as a teenager.");
		Product_24.put(Substance_Use_Key, "I drink one cup of decaffeinated coffee with breakfast most days. I have one glass of wine about twice a month.");
		Product_24.put(MigraNova_Relief_Days_Key, "0 days");
		Product_24.put(MigraNova_Diagnosed_Key, "Yes");
		Product_24.put(MigraNova_Pattern_Key, "The headaches started about four years ago. They have occurred on about eight days a month since the current prevention routine stabilized.");
		Product_24.put(MigraNova_Frequency_Key, "4-14 days");
		Product_24.put(MigraNova_Duration_Key, "Less than 4 hours");
		Product_24.put(MigraNova_Symptoms_Key, "I usually have moderate pain over my right temple, with some light sensitivity. It often eases after two to three hours of rest.");
		Product_24.put(MigraNova_Aura_Key, "No");
		Product_24.put(MigraNova_Aura_Details_Key, "The pain develops gradually. My vision and sensation stay normal throughout the usual episode.");
		Product_24.put(MigraNova_Impact_Key, "I have to pause or reduce activities");
		Product_24.put(MigraNova_Previous_Treatment_Key, "Daily topiramate as prescribed reduced how often the headaches occur. A brief rest in a dark room helps during episodes.");

		return new Object[][] {
			{ Product_1 },/*
			{ Product_2 },
			{ Product_3 },
			{ Product_4 },
			{ Product_5 },
			{ Product_6 },
			{ Product_7 },
			{ Product_8 },
			{ Product_9 },
			{ Product_10 },
			{ Product_11 },
			{ Product_12 },
			{ Product_13 },
			{ Product_14 },
			{ Product_15 },
			{ Product_21 },
			{ Product_22 },
			{ Product_23 },
			{ Product_24 },
			*/
		};
	}
	
	
	
	

@DataProvider
@SuppressWarnings("unchecked")
public Object[][] Storefront_Product_Data(){

	Object[][] Patient_Datas = Storefront_Patient_Details_Data();
	Object[][] Product_Intake_Datas = Storefront_Product_Variant_And_Intake_Data();

	int n = IntStream.of(Patient_Datas.length, Product_Intake_Datas.length).min().orElse(0);

	Object[][] combined_data = new Object[n][2];
	int i = 0;

	while(i < n){

		combined_data[i][0] = new TreeMap<String,String>((TreeMap<String,String>) Patient_Datas[i][0]);
		combined_data[i][1] = new TreeMap<String,String>((TreeMap<String,String>) Product_Intake_Datas[i][0]);

		i++;

	}

	return combined_data;
}










@Test(dataProvider="Storefront_Product_Data")
public void Product_Choose(TreeMap<String,String> Patient_Data, TreeMap<String,String> Product_Data) throws IOException, InterruptedException{

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	// Manual Flow Switch
	boolean Proceed_To_Checkout_Directly = true;

	String Product_Name = Product_Data.get("Product Name");

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

			Checkout_Manager(Patient_Data, Product_Data);;

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



 public void Checkout_Manager(TreeMap<String,String> Patient_Data, TreeMap<String,String> Product_Data){

	StoreFront_Locaters p = new StoreFront_Locaters(d);
	Repeat rp = new Repeat(d);

	String Product_Name = Product_Data.get("Product Name");
	String First_Name = Patient_Data.get("First Name");
	String Last_Name = Patient_Data.get("Last Name");
	String Email = Patient_Data.get("Email");
	String Phone = Patient_Data.get("Phone");
	String Address = Patient_Data.get("Address");
	String City = Patient_Data.get("City");
	String State = Patient_Data.get("Delivery State");
	String Zipcode = Patient_Data.get("Zipcode");
	String Card_Number = Patient_Data.get("Card Number");
	String Expiry = Patient_Data.get("Expiry Date");
	String CVV = Patient_Data.get("Security Code");

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
		Treatment_Variant_Selector(Product_Data);

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
