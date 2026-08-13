package AsterMD.Project.AsterMD;

import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Listerners.Report_Listen;
import Locaters.Patient_Module_Locaters;
import Locaters.Product_Module_Locaters;

public class Patient_Module extends Product_Module {
	
	public WebElement Patient_Module_Accessor() throws Exception {

		Patient_Module_Locaters p = new Patient_Module_Locaters(d);

		try {

			Report_Listen.log_print_in_report().info("──────────────────── 👥 PATIENT MODULE ACCESS ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the Patients module through the application Side Menu.");

			System.out.println("👥 PATIENT MODULE ACCESS");
			System.out.println();

			System.out.println("🔹 Navigating to the Patients module through the Side Menu.");
			System.out.println();

			Side_Menu_Navigation("Patients");

			Report_Listen.log_print_in_report().pass("✅ Patients module navigation completed successfully.");
			System.out.println("✅ Patients module navigation completed successfully.");
			System.out.println();

			Report_Listen.log_print_in_report().info("──────────────────── ➕ PATIENT ADD ACCESS ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve the Patient Add button from the Patients module.");

			System.out.println("➕ PATIENT ADD ACCESS");
			System.out.println();

			System.out.println("🔹 Retrieving the Patient Add button.");
			System.out.println();

			WebElement Add_Button = p.Patient_Add_Button();

			Report_Listen.log_print_in_report().pass("✅ Patient Add button retrieved successfully.");
			System.out.println("✅ Patient Add button retrieved successfully.");
			System.out.println();

			return Add_Button;

		} catch(Exception e) {

			if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Patient Module access failed. Failure reason: " + e.getMessage());

			System.out.println("❌ Patient Module access failed.");
			System.out.println();

			System.out.println("❌ Failure reason: " + e.getMessage());
			System.out.println();

			throw e;
		}
	}
	
	
	
	
@DataProvider(name="Patient_Create_Data")
public Object[][] Patient_Create_Data(){

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("First Name", "Lorenz");
	data1.put("Middle Name", "Nikolaus");
	data1.put("Last Name", "Thiel");
	data1.put("Email", "lorenz.thiel51@yopmail.com");
	data1.put("Phone Number", "+1 617-555-0151");
	data1.put("Address Line 1", "245 Beacon Street");
	data1.put("Address Line 2", "Apartment 6B");
	data1.put("Country", "United States");
	data1.put("State", "Massachusetts");
	data1.put("City", "Boston");
	data1.put("ZIP / Postal Code", "02116");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("First Name", "Svenja");
	data2.put("Middle Name", "Marianne");
	data2.put("Last Name", "Busch");
	data2.put("Email", "svenja.busch52@yopmail.com");
	data2.put("Phone Number", "+1 720-555-0152");
	data2.put("Address Line 1", "1660 Blake Street");
	data2.put("Address Line 2", "Suite 420");
	data2.put("Country", "United States");
	data2.put("State", "Colorado");
	data2.put("City", "Denver");
	data2.put("ZIP / Postal Code", "80202");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("First Name", "Manuel");
	data3.put("Middle Name", "Christoph");
	data3.put("Last Name", "Reuter");
	data3.put("Email", "manuel.reuter53@yopmail.com");
	data3.put("Phone Number", "+1 415-555-0153");
	data3.put("Address Line 1", "865 Mission Street");
	data3.put("Address Line 2", "Apartment 10C");
	data3.put("Country", "United States");
	data3.put("State", "California");
	data3.put("City", "San Francisco");
	data3.put("ZIP / Postal Code", "94103");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("First Name", "Katharina");
	data4.put("Middle Name", "Ingrid");
	data4.put("Last Name", "Ahrens");
	data4.put("Email", "katharina.ahrens54@yopmail.com");
	data4.put("Phone Number", "+1 602-555-0154");
	data4.put("Address Line 1", "525 East Monroe Street");
	data4.put("Address Line 2", "Unit 207");
	data4.put("Country", "United States");
	data4.put("State", "Arizona");
	data4.put("City", "Phoenix");
	data4.put("ZIP / Postal Code", "85004");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("First Name", "Nils");
	data5.put("Middle Name", "Frederik");
	data5.put("Last Name", "Götz");
	data5.put("Email", "nils.goetz55@yopmail.com");
	data5.put("Phone Number", "+1 206-555-0155");
	data5.put("Address Line 1", "1420 Fourth Avenue");
	data5.put("Address Line 2", "Floor 8");
	data5.put("Country", "United States");
	data5.put("State", "Washington");
	data5.put("City", "Seattle");
	data5.put("ZIP / Postal Code", "98101");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("First Name", "Mareike");
	data6.put("Middle Name", "Louisa");
	data6.put("Last Name", "Schilling");
	data6.put("Email", "mareike.schilling56@yopmail.com");
	data6.put("Phone Number", "+1 512-555-0156");
	data6.put("Address Line 1", "720 Brazos Street");
	data6.put("Address Line 2", "Apartment 11A");
	data6.put("Country", "United States");
	data6.put("State", "Texas");
	data6.put("City", "Austin");
	data6.put("ZIP / Postal Code", "78701");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("First Name", "Till");
	data7.put("Middle Name", "Alexander");
	data7.put("Last Name", "Breuer");
	data7.put("Email", "till.breuer57@yopmail.com");
	data7.put("Phone Number", "+1 404-555-0157");
	data7.put("Address Line 1", "410 Peachtree Street NE");
	data7.put("Address Line 2", "Suite 315");
	data7.put("Country", "United States");
	data7.put("State", "Georgia");
	data7.put("City", "Atlanta");
	data7.put("ZIP / Postal Code", "30308");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("First Name", "Jasmin");
	data8.put("Middle Name", "Elena");
	data8.put("Last Name", "Hagedorn");
	data8.put("Email", "jasmin.hagedorn58@yopmail.com");
	data8.put("Phone Number", "+1 704-555-0158");
	data8.put("Address Line 1", "330 South Church Street");
	data8.put("Address Line 2", "Apartment 4D");
	data8.put("Country", "United States");
	data8.put("State", "North Carolina");
	data8.put("City", "Charlotte");
	data8.put("ZIP / Postal Code", "28202");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("First Name", "Armin");
	data9.put("Middle Name", "Wolfgang");
	data9.put("Last Name", "Klose");
	data9.put("Email", "armin.klose59@yopmail.com");
	data9.put("Phone Number", "+1 312-555-0159");
	data9.put("Address Line 1", "605 North Michigan Avenue");
	data9.put("Address Line 2", "Floor 12");
	data9.put("Country", "United States");
	data9.put("State", "Illinois");
	data9.put("City", "Chicago");
	data9.put("ZIP / Postal Code", "60611");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("First Name", "Vivien");
	data10.put("Middle Name", "Annika");
	data10.put("Last Name", "Riedel");
	data10.put("Email", "vivien.riedel60@yopmail.com");
	data10.put("Phone Number", "+1 503-555-0160");
	data10.put("Address Line 1", "515 SW Morrison Street");
	data10.put("Address Line 2", "Apartment 703");
	data10.put("Country", "United States");
	data10.put("State", "Oregon");
	data10.put("City", "Portland");
	data10.put("ZIP / Postal Code", "97204");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("First Name", "Ruben");
	data11.put("Middle Name", "Sebastian");
	data11.put("Last Name", "Wirth");
	data11.put("Email", "ruben.wirth61@yopmail.com");
	data11.put("Phone Number", "+1 615-555-0161");
	data11.put("Address Line 1", "215 Commerce Street");
	data11.put("Address Line 2", "Suite 520");
	data11.put("Country", "United States");
	data11.put("State", "Tennessee");
	data11.put("City", "Nashville");
	data11.put("ZIP / Postal Code", "37201");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("First Name", "Maike");
	data12.put("Middle Name", "Josefine");
	data12.put("Last Name", "Körner");
	data12.put("Email", "maike.koerner62@yopmail.com");
	data12.put("Phone Number", "+1 614-555-0162");
	data12.put("Address Line 1", "380 East Broad Street");
	data12.put("Address Line 2", "Apartment 9F");
	data12.put("Country", "United States");
	data12.put("State", "Ohio");
	data12.put("City", "Columbus");
	data12.put("ZIP / Postal Code", "43215");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("First Name", "Torben");
	data13.put("Middle Name", "Julius");
	data13.put("Last Name", "Groß");
	data13.put("Email", "torben.gross63@yopmail.com");
	data13.put("Phone Number", "+1 702-555-0163");
	data13.put("Address Line 1", "425 Fremont Street");
	data13.put("Address Line 2", "Unit 16B");
	data13.put("Country", "United States");
	data13.put("State", "Nevada");
	data13.put("City", "Las Vegas");
	data13.put("ZIP / Postal Code", "89101");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("First Name", "Corinna");
	data14.put("Middle Name", "Sabine");
	data14.put("Last Name", "Möller");
	data14.put("Email", "corinna.moeller64@yopmail.com");
	data14.put("Phone Number", "+1 305-555-0164");
	data14.put("Address Line 1", "980 Biscayne Boulevard");
	data14.put("Address Line 2", "Apartment 14A");
	data14.put("Country", "United States");
	data14.put("State", "Florida");
	data14.put("City", "Miami");
	data14.put("ZIP / Postal Code", "33132");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("First Name", "Hannes");
	data15.put("Middle Name", "Benedikt");
	data15.put("Last Name", "Stahl");
	data15.put("Email", "hannes.stahl65@yopmail.com");
	data15.put("Phone Number", "+1 215-555-0165");
	data15.put("Address Line 1", "730 Walnut Street");
	data15.put("Address Line 2", "Floor 5");
	data15.put("Country", "United States");
	data15.put("State", "Pennsylvania");
	data15.put("City", "Philadelphia");
	data15.put("ZIP / Postal Code", "19106");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("First Name", "Elisa");
	data16.put("Middle Name", "Valerie");
	data16.put("Last Name", "Niemann");
	data16.put("Email", "elisa.niemann66@yopmail.com");
	data16.put("Phone Number", "+1 801-555-0166");
	data16.put("Address Line 1", "455 South State Street");
	data16.put("Address Line 2", "Apartment 8C");
	data16.put("Country", "United States");
	data16.put("State", "Utah");
	data16.put("City", "Salt Lake City");
	data16.put("ZIP / Postal Code", "84111");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("First Name", "Kilian");
	data17.put("Middle Name", "Moritz");
	data17.put("Last Name", "Finke");
	data17.put("Email", "kilian.finke67@yopmail.com");
	data17.put("Phone Number", "+1 313-555-0167");
	data17.put("Address Line 1", "610 Woodward Avenue");
	data17.put("Address Line 2", "Suite 725");
	data17.put("Country", "United States");
	data17.put("State", "Michigan");
	data17.put("City", "Detroit");
	data17.put("ZIP / Postal Code", "48226");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("First Name", "Ramona");
	data18.put("Middle Name", "Theresa");
	data18.put("Last Name", "Lenz");
	data18.put("Email", "ramona.lenz68@yopmail.com");
	data18.put("Phone Number", "+1 504-555-0168");
	data18.put("Address Line 1", "725 Magazine Street");
	data18.put("Address Line 2", "Apartment 5E");
	data18.put("Country", "United States");
	data18.put("State", "Louisiana");
	data18.put("City", "New Orleans");
	data18.put("ZIP / Postal Code", "70130");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("First Name", "Jannik");
	data19.put("Middle Name", "Oliver");
	data19.put("Last Name", "Ehlers");
	data19.put("Email", "jannik.ehlers69@yopmail.com");
	data19.put("Phone Number", "+1 602-555-0169");
	data19.put("Address Line 1", "310 North Central Avenue");
	data19.put("Address Line 2", "Floor 9");
	data19.put("Country", "United States");
	data19.put("State", "Arizona");
	data19.put("City", "Phoenix");
	data19.put("ZIP / Postal Code", "85004");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("First Name", "Meike");
	data20.put("Middle Name", "Caroline");
	data20.put("Last Name", "Tiedemann");
	data20.put("Email", "meike.tiedemann70@yopmail.com");
	data20.put("Phone Number", "+1 816-555-0170");
	data20.put("Address Line 1", "1220 Walnut Street");
	data20.put("Address Line 2", "Apartment 6A");
	data20.put("Country", "United States");
	data20.put("State", "Missouri");
	data20.put("City", "Kansas City");
	data20.put("ZIP / Postal Code", "64106");

	return new Object[][] {
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
		{ data14 },
		{ data15 },
		{ data16 },
		{ data17 },
		{ data18 },
		{ data19 },
		{ data20 }
	};
}
	
	
	
@Test(dataProvider="Patient_Create_Data")
public void Add_Patient(TreeMap<String, String> Patient_data) throws Exception {

	String First_Name = Patient_data.get("First Name");
	String Middle_Name = Patient_data.get("Middle Name");
	String Last_Name = Patient_data.get("Last Name");
	String Email = Patient_data.get("Email");
	String Phone_Number = Patient_data.get("Phone Number");
	String Address_Line_1 = Patient_data.get("Address Line 1");
	String Address_Line_2 = Patient_data.get("Address Line 2");
	String Country = Patient_data.get("Country");
	String State = Patient_data.get("State");
	String City = Patient_data.get("City");
	String ZIP_Postal_Code = Patient_data.get("ZIP / Postal Code");

	Product_Module_Locaters pp = new Product_Module_Locaters(d);
	Patient_Module_Locaters p = new Patient_Module_Locaters(d);

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 👤 PATIENT CREATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Scenario Title:</b> Create a new Patient in the AsterMD Patient Module");
		Report_Listen.log_print_in_report().info("<b>Description:</b> Open the Patient Add form, enter the patient's personal, contact and address information, submit the form and verify successful patient creation.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> Patient Name = " + First_Name + " " + Middle_Name + " " + Last_Name + " | Email = " + Email + " | Country = " + Country + " | State = " + State + " | City = " + City);
		Report_Listen.log_print_in_report().info("<b>Expected:</b> Patient should be created successfully and a success confirmation notification should be displayed.");

		System.out.println("👤 PATIENT CREATION");
		System.out.println();

		System.out.println("🔹 Starting Patient creation for: " + First_Name + " " + Last_Name);
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 📝 PATIENT FORM ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Access the Patients module and open the Patient Add form.");

		System.out.println("📝 PATIENT FORM ACCESS");
		System.out.println();

		System.out.println("🔹 Accessing the Patients module and opening the Patient Add form.");
		System.out.println();

		WebElement Patient_Add_Button = Patient_Module_Accessor();

		Patient_Add_Button.click();

		Report_Listen.log_print_in_report().pass("✅ Patient Add button clicked successfully.");
		System.out.println("✅ Patient Add button clicked successfully.");
		System.out.println();

		WebElement Patient_Form = p.Popup_Form();

		Report_Listen.log_print_in_report().pass("✅ Patient Add popup form displayed successfully.");
		System.out.println("✅ Patient Add popup form displayed successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🔎 PATIENT FORM FIELD RETRIEVAL ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve all required Patient Add form input fields.");

		System.out.println("🔎 PATIENT FORM FIELD RETRIEVAL");
		System.out.println();

		System.out.println("🔹 Retrieving Patient Add form input fields.");
		System.out.println();

		List<WebElement> Inputs;

		try {

			Inputs = p.Patient_Add_Form_Inputs(Patient_Form);

		} catch(Exception e) {

			Thread.sleep(800);

			Report_Listen.log_print_in_report().warning("⚠️ Initial Patient form input retrieval failed. Retrying field retrieval.");

			System.out.println("⚠️ Initial Patient form input retrieval failed. Retrying.");
			System.out.println();

			Inputs = p.Patient_Add_Form_Inputs(Patient_Form);
		}

		WebElement First_Name_Field = Inputs.get(0);
		WebElement Middle_Name_Field = Inputs.get(1);
		WebElement Last_Name_Field = Inputs.get(2);
		WebElement Email_Field = Inputs.get(3);
		WebElement Phone_Number_Field = Inputs.get(4);
		WebElement Address_Line_1_Field = Inputs.get(5);
		WebElement Address_Line_2_Field = Inputs.get(6);
		WebElement Country_Field = Inputs.get(7);
		WebElement City_Field = Inputs.get(8);
		WebElement Zipcode_Field = Inputs.get(9);

		Report_Listen.log_print_in_report().pass("✅ Required Patient Add form input fields retrieved successfully.");
		System.out.println("✅ Required Patient Add form input fields retrieved successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 👤 PATIENT PERSONAL DETAILS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter the patient's First Name, Middle Name and Last Name.");

		System.out.println("👤 PATIENT PERSONAL DETAILS");
		System.out.println();

		System.out.println("🔹 Entering Patient personal details.");
		System.out.println();

		First_Name_Field.sendKeys(First_Name);

		Report_Listen.log_print_in_report().info("<b>First Name:</b> " + First_Name);
		System.out.println("✅ First Name entered: " + First_Name);
		System.out.println();

		Middle_Name_Field.sendKeys(Middle_Name);

		Report_Listen.log_print_in_report().info("<b>Middle Name:</b> " + Middle_Name);
		System.out.println("✅ Middle Name entered: " + Middle_Name);
		System.out.println();

		Last_Name_Field.sendKeys(Last_Name);

		Report_Listen.log_print_in_report().info("<b>Last Name:</b> " + Last_Name);
		System.out.println("✅ Last Name entered: " + Last_Name);
		System.out.println();

		Report_Listen.log_print_in_report().pass("✅ Patient personal details entered successfully.");
		System.out.println("✅ Patient personal details entered successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 📧 PATIENT CONTACT DETAILS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter the patient's Email Address and Phone Number.");

		System.out.println("📧 PATIENT CONTACT DETAILS");
		System.out.println();

		System.out.println("🔹 Entering Patient contact details.");
		System.out.println();

		Email_Field.sendKeys(Email);

		Report_Listen.log_print_in_report().info("<b>Email:</b> " + Email);
		System.out.println("✅ Email entered: " + Email);
		System.out.println();

		Phone_Number_Field.sendKeys(Phone_Number);

		Report_Listen.log_print_in_report().info("<b>Phone Number:</b> " + Phone_Number);
		System.out.println("✅ Phone Number entered: " + Phone_Number);
		System.out.println();

		Report_Listen.log_print_in_report().pass("✅ Patient contact details entered successfully.");
		System.out.println("✅ Patient contact details entered successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🏠 PATIENT ADDRESS DETAILS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter Address Line 1 and Address Line 2.");

		System.out.println("🏠 PATIENT ADDRESS DETAILS");
		System.out.println();

		System.out.println("🔹 Entering Patient address details.");
		System.out.println();

		Address_Line_1_Field.sendKeys(Address_Line_1);

		Report_Listen.log_print_in_report().info("<b>Address Line 1:</b> " + Address_Line_1);
		System.out.println("✅ Address Line 1 entered: " + Address_Line_1);
		System.out.println();

		Address_Line_2_Field.sendKeys(Address_Line_2);

		Report_Listen.log_print_in_report().info("<b>Address Line 2:</b> " + Address_Line_2);
		System.out.println("✅ Address Line 2 entered: " + Address_Line_2);
		System.out.println();

		Report_Listen.log_print_in_report().pass("✅ Patient address lines entered successfully.");
		System.out.println("✅ Patient address lines entered successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🌎 COUNTRY SELECTION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Select Patient Country = " + Country);

		System.out.println("🌎 COUNTRY SELECTION");
		System.out.println();

		System.out.println("🔹 Selecting Patient Country: " + Country);
		System.out.println();

		Country_Field.sendKeys(Country);

		WebElement Country_list = pp.First_Virtual_List_holder();
		List<WebElement> Country_list_options = Country_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

		for(WebElement option : Country_list_options) {

			if(option.getText().equals(Country)) {

				option.click();

				Report_Listen.log_print_in_report().pass("✅ Country selected successfully: " + Country);
				System.out.println("✅ Country selected successfully: " + Country);
				System.out.println();

				break;
			}
		}

		Thread.sleep(800);

		Report_Listen.log_print_in_report().info("──────────────────── 📍 STATE SELECTION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Select Patient State = " + State);

		System.out.println("📍 STATE SELECTION");
		System.out.println();

		System.out.println("🔹 Selecting Patient State: " + State);
		System.out.println();

		WebElement State_Input_Field = Patient_Form.findElement(By.xpath(".//input[@id='state']"));

		State_Input_Field.sendKeys(State);

		WebElement State_type_list = p.Second_Virtual_List_holder();
		List<WebElement> State_type_list_options = State_type_list.findElements(By.xpath(".//*[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option')]"));

		for(WebElement option : State_type_list_options) {

			if(option.getText().equals(State)) {

				option.click();

				Report_Listen.log_print_in_report().pass("✅ State selected successfully: " + State);
				System.out.println("✅ State selected successfully: " + State);
				System.out.println();

				break;
			}
		}

		Report_Listen.log_print_in_report().info("──────────────────── 🏙️ CITY & POSTAL CODE ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Enter Patient City and ZIP / Postal Code.");
		Report_Listen.log_print_in_report().info("<b>Input:</b> City = " + City + " | ZIP / Postal Code = " + ZIP_Postal_Code);

		System.out.println("🏙️ CITY & POSTAL CODE");
		System.out.println();

		System.out.println("🔹 Entering Patient City: " + City);
		System.out.println();

		City_Field.sendKeys(City);

		System.out.println("✅ City entered successfully.");
		System.out.println();

		System.out.println("🔹 Entering ZIP / Postal Code: " + ZIP_Postal_Code);
		System.out.println();

		Zipcode_Field.sendKeys(ZIP_Postal_Code);

		Report_Listen.log_print_in_report().pass("✅ Patient City and ZIP / Postal Code entered successfully.");
		System.out.println("✅ Patient City and ZIP / Postal Code entered successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 💾 PATIENT FORM SUBMISSION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Submit the completed Patient Add form.");

		System.out.println("💾 PATIENT FORM SUBMISSION");
		System.out.println();

		System.out.println("🔹 Submitting the Patient Add form.");
		System.out.println();

		WebElement Submit_Button = p.Create_Button();

		Submit_Button.click();

		Report_Listen.log_print_in_report().pass("✅ Patient Create button clicked successfully.");
		System.out.println("✅ Patient Create button clicked successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── ✅ PATIENT CREATION VERIFICATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Capture and verify the Patient creation success notification.");

		System.out.println("✅ PATIENT CREATION VERIFICATION");
		System.out.println();

		System.out.println("🔹 Verifying Patient creation success notification.");
		System.out.println();

		WebElement Confirmation_Message = p.Success_Toast();
		String Confirmation_Message_Text = Confirmation_Message.getText().trim();

		Report_Listen.log_print_in_report().pass("✅ Confirmation Message: " + Confirmation_Message_Text);
		System.out.println("✅ Confirmation message displayed: " + Confirmation_Message_Text);
		System.out.println();

		Report_Listen.log_print_in_report().pass("✅ Patient creation completed successfully for: " + First_Name + " " + Last_Name);
		System.out.println("✅ Patient creation completed successfully for: " + First_Name + " " + Last_Name);
		System.out.println();

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Patient creation failed for '" + First_Name + " " + Last_Name + "'. Failure reason: " + e.getMessage());

		System.out.println("❌ Patient creation failed for: " + First_Name + " " + Last_Name);
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}
	
	

	
	
	
	
	

}
