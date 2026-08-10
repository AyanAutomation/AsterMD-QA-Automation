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
	data1.put("First Name", "Henrik");
	data1.put("Middle Name", "Wilhelm");
	data1.put("Last Name", "Baumann");
	data1.put("Email", "henrik.baumann31@yopmail.com");
	data1.put("Phone Number", "+1 214-555-0131");
	data1.put("Address Line 1", "1845 Elm Street");
	data1.put("Address Line 2", "Apartment 7B");
	data1.put("Country", "United States");
	data1.put("State", "Texas");
	data1.put("City", "Dallas");
	data1.put("ZIP / Postal Code", "75201");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("First Name", "Luisa");
	data2.put("Middle Name", "Margarete");
	data2.put("Last Name", "Reinhardt");
	data2.put("Email", "luisa.reinhardt32@yopmail.com");
	data2.put("Phone Number", "+1 619-555-0132");
	data2.put("Address Line 1", "735 Broadway");
	data2.put("Address Line 2", "Suite 308");
	data2.put("Country", "United States");
	data2.put("State", "California");
	data2.put("City", "San Diego");
	data2.put("ZIP / Postal Code", "92101");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("First Name", "Konstantin");
	data3.put("Middle Name", "Georg");
	data3.put("Last Name", "Mertens");
	data3.put("Email", "konstantin.mertens33@yopmail.com");
	data3.put("Phone Number", "+1 512-555-0133");
	data3.put("Address Line 1", "410 Congress Avenue");
	data3.put("Address Line 2", "Floor 5");
	data3.put("Country", "United States");
	data3.put("State", "Texas");
	data3.put("City", "Austin");
	data3.put("ZIP / Postal Code", "78701");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("First Name", "Anneliese");
	data4.put("Middle Name", "Klara");
	data4.put("Last Name", "Vogt");
	data4.put("Email", "anneliese.vogt34@yopmail.com");
	data4.put("Phone Number", "+1 313-555-0134");
	data4.put("Address Line 1", "525 Woodward Avenue");
	data4.put("Address Line 2", "Apartment 12A");
	data4.put("Country", "United States");
	data4.put("State", "Michigan");
	data4.put("City", "Detroit");
	data4.put("ZIP / Postal Code", "48226");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("First Name", "Dominik");
	data5.put("Middle Name", "Rainer");
	data5.put("Last Name", "Franke");
	data5.put("Email", "dominik.franke35@yopmail.com");
	data5.put("Phone Number", "+1 317-555-0135");
	data5.put("Address Line 1", "135 North Pennsylvania Street");
	data5.put("Address Line 2", "Unit 410");
	data5.put("Country", "United States");
	data5.put("State", "Indiana");
	data5.put("City", "Indianapolis");
	data5.put("ZIP / Postal Code", "46204");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("First Name", "Carolin");
	data6.put("Middle Name", "Johanna");
	data6.put("Last Name", "Dietrich");
	data6.put("Email", "carolin.dietrich36@yopmail.com");
	data6.put("Phone Number", "+1 414-555-0136");
	data6.put("Address Line 1", "730 North Milwaukee Street");
	data6.put("Address Line 2", "Apartment 6C");
	data6.put("Country", "United States");
	data6.put("State", "Wisconsin");
	data6.put("City", "Milwaukee");
	data6.put("ZIP / Postal Code", "53202");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("First Name", "Benedikt");
	data7.put("Middle Name", "Lorenz");
	data7.put("Last Name", "Schäfer");
	data7.put("Email", "benedikt.schaefer37@yopmail.com");
	data7.put("Phone Number", "+1 901-555-0137");
	data7.put("Address Line 1", "155 Madison Avenue");
	data7.put("Address Line 2", "Suite 520");
	data7.put("Country", "United States");
	data7.put("State", "Tennessee");
	data7.put("City", "Memphis");
	data7.put("ZIP / Postal Code", "38103");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("First Name", "Friederike");
	data8.put("Middle Name", "Pauline");
	data8.put("Last Name", "Engel");
	data8.put("Email", "friederike.engel38@yopmail.com");
	data8.put("Phone Number", "+1 502-555-0138");
	data8.put("Address Line 1", "640 South Fourth Street");
	data8.put("Address Line 2", "Apartment 10D");
	data8.put("Country", "United States");
	data8.put("State", "Kentucky");
	data8.put("City", "Louisville");
	data8.put("ZIP / Postal Code", "40202");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("First Name", "Gregor");
	data9.put("Middle Name", "Matthias");
	data9.put("Last Name", "Stein");
	data9.put("Email", "gregor.stein39@yopmail.com");
	data9.put("Phone Number", "+1 410-555-0139");
	data9.put("Address Line 1", "20 South Charles Street");
	data9.put("Address Line 2", "Floor 8");
	data9.put("Country", "United States");
	data9.put("State", "Maryland");
	data9.put("City", "Baltimore");
	data9.put("ZIP / Postal Code", "21201");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("First Name", "Isabella");
	data10.put("Middle Name", "Therese");
	data10.put("Last Name", "Roth");
	data10.put("Email", "isabella.roth40@yopmail.com");
	data10.put("Phone Number", "+1 505-555-0140");
	data10.put("Address Line 1", "201 Central Avenue NW");
	data10.put("Address Line 2", "Apartment 4A");
	data10.put("Country", "United States");
	data10.put("State", "New Mexico");
	data10.put("City", "Albuquerque");
	data10.put("ZIP / Postal Code", "87102");

	TreeMap<String, String> data11 = new TreeMap<String, String>();
	data11.put("First Name", "Christoph");
	data11.put("Middle Name", "Anton");
	data11.put("Last Name", "Heinrich");
	data11.put("Email", "christoph.heinrich41@yopmail.com");
	data11.put("Phone Number", "+1 402-555-0141");
	data11.put("Address Line 1", "1620 Dodge Street");
	data11.put("Address Line 2", "Suite 215");
	data11.put("Country", "United States");
	data11.put("State", "Nebraska");
	data11.put("City", "Omaha");
	data11.put("ZIP / Postal Code", "68102");

	TreeMap<String, String> data12 = new TreeMap<String, String>();
	data12.put("First Name", "Melanie");
	data12.put("Middle Name", "Rosalie");
	data12.put("Last Name", "Sommer");
	data12.put("Email", "melanie.sommer42@yopmail.com");
	data12.put("Phone Number", "+1 405-555-0142");
	data12.put("Address Line 1", "115 North Robinson Avenue");
	data12.put("Address Line 2", "Apartment 9B");
	data12.put("Country", "United States");
	data12.put("State", "Oklahoma");
	data12.put("City", "Oklahoma City");
	data12.put("ZIP / Postal Code", "73102");

	TreeMap<String, String> data13 = new TreeMap<String, String>();
	data13.put("First Name", "Valentin");
	data13.put("Middle Name", "Josef");
	data13.put("Last Name", "Kramer");
	data13.put("Email", "valentin.kramer43@yopmail.com");
	data13.put("Phone Number", "+1 804-555-0143");
	data13.put("Address Line 1", "901 East Main Street");
	data13.put("Address Line 2", "Floor 6");
	data13.put("Country", "United States");
	data13.put("State", "Virginia");
	data13.put("City", "Richmond");
	data13.put("ZIP / Postal Code", "23219");

	TreeMap<String, String> data14 = new TreeMap<String, String>();
	data14.put("First Name", "Paulina");
	data14.put("Middle Name", "Dorothea");
	data14.put("Last Name", "Jäger");
	data14.put("Email", "paulina.jaeger44@yopmail.com");
	data14.put("Phone Number", "+1 401-555-0144");
	data14.put("Address Line 1", "150 Westminster Street");
	data14.put("Address Line 2", "Apartment 5E");
	data14.put("Country", "United States");
	data14.put("State", "Rhode Island");
	data14.put("City", "Providence");
	data14.put("ZIP / Postal Code", "02903");

	TreeMap<String, String> data15 = new TreeMap<String, String>();
	data15.put("First Name", "Johannes");
	data15.put("Middle Name", "Erik");
	data15.put("Last Name", "Pfeiffer");
	data15.put("Email", "johannes.pfeiffer45@yopmail.com");
	data15.put("Phone Number", "+1 205-555-0145");
	data15.put("Address Line 1", "2101 Fourth Avenue North");
	data15.put("Address Line 2", "Suite 330");
	data15.put("Country", "United States");
	data15.put("State", "Alabama");
	data15.put("City", "Birmingham");
	data15.put("ZIP / Postal Code", "35203");

	TreeMap<String, String> data16 = new TreeMap<String, String>();
	data16.put("First Name", "Alina");
	data16.put("Middle Name", "Beatrix");
	data16.put("Last Name", "Kühn");
	data16.put("Email", "alina.kuehn46@yopmail.com");
	data16.put("Phone Number", "+1 208-555-0146");
	data16.put("Address Line 1", "950 West Bannock Street");
	data16.put("Address Line 2", "Apartment 11A");
	data16.put("Country", "United States");
	data16.put("State", "Idaho");
	data16.put("City", "Boise");
	data16.put("ZIP / Postal Code", "83702");

	TreeMap<String, String> data17 = new TreeMap<String, String>();
	data17.put("First Name", "Fabian");
	data17.put("Middle Name", "Michael");
	data17.put("Last Name", "Arnold");
	data17.put("Email", "fabian.arnold47@yopmail.com");
	data17.put("Phone Number", "+1 603-555-0147");
	data17.put("Address Line 1", "88 North Main Street");
	data17.put("Address Line 2", "Floor 4");
	data17.put("Country", "United States");
	data17.put("State", "New Hampshire");
	data17.put("City", "Concord");
	data17.put("ZIP / Postal Code", "03301");

	TreeMap<String, String> data18 = new TreeMap<String, String>();
	data18.put("First Name", "Miriam");
	data18.put("Middle Name", "Elise");
	data18.put("Last Name", "Bergmann");
	data18.put("Email", "miriam.bergmann48@yopmail.com");
	data18.put("Phone Number", "+1 501-555-0148");
	data18.put("Address Line 1", "500 President Clinton Avenue");
	data18.put("Address Line 2", "Apartment 3C");
	data18.put("Country", "United States");
	data18.put("State", "Arkansas");
	data18.put("City", "Little Rock");
	data18.put("ZIP / Postal Code", "72201");

	TreeMap<String, String> data19 = new TreeMap<String, String>();
	data19.put("First Name", "Cedric");
	data19.put("Middle Name", "Andreas");
	data19.put("Last Name", "Ulrich");
	data19.put("Email", "cedric.ulrich49@yopmail.com");
	data19.put("Phone Number", "+1 207-555-0149");
	data19.put("Address Line 1", "120 Exchange Street");
	data19.put("Address Line 2", "Suite 205");
	data19.put("Country", "United States");
	data19.put("State", "Maine");
	data19.put("City", "Portland");
	data19.put("ZIP / Postal Code", "04101");

	TreeMap<String, String> data20 = new TreeMap<String, String>();
	data20.put("First Name", "Helena");
	data20.put("Middle Name", "Mathilda");
	data20.put("Last Name", "Eberhardt");
	data20.put("Email", "helena.eberhardt50@yopmail.com");
	data20.put("Phone Number", "+1 843-555-0150");
	data20.put("Address Line 1", "165 King Street");
	data20.put("Address Line 2", "Apartment 8D");
	data20.put("Country", "United States");
	data20.put("State", "South Carolina");
	data20.put("City", "Charleston");
	data20.put("ZIP / Postal Code", "29401");

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
