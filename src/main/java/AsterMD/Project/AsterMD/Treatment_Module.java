package AsterMD.Project.AsterMD;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Listerners.Report_Listen;
import Locaters.Treatment_Module_Locaters;
import Repeatative_codes.Repeat;
import Store.Frontend_Store_Front;

public class Treatment_Module extends Product_Module{
	
	
	
  public List<WebElement> Treatment_Module_Accessor() throws Exception {

	int step = 1;
	Repeat rp = new Repeat(d);

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                    TREATMENT MODULE ACCESS");
	System.out.println("============================================================");

	Report_Listen.log_print_in_report().info("──────────────────── TREATMENT MODULE ACCESS ────────────────────");
	Report_Listen.log_print_in_report().info("<b>Action:</b> Initialize Treatment Module locators and navigate to the Treatments module.");

	// Initialize Treatment Module Locators
	Treatment_Module_Locaters p = new Treatment_Module_Locaters(d);

	Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Treatment Module locator class initialized.");
	System.out.println("Step " + step + " : Treatment Module locator class initialized.");

	step++;

	// Navigate to Treatments Module
	System.out.println();
	System.out.println("---------------- TREATMENTS MODULE NAVIGATION ----------------");

	Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Navigate to Treatments through the side menu.");
	System.out.println("Step " + step + " : Navigating to Treatments through the side menu.");

	Side_Menu_Navigation("Treatments");

	Report_Listen.log_print_in_report().pass("Treatments side-menu navigation completed successfully.");
	System.out.println("Result : Treatments module navigation completed.");

	step++;

	// Verify Treatment Module Navigation Bar
	System.out.println();
	System.out.println("---------------- TREATMENT NAVIGATION BAR ----------------");

	Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Verify the Treatment Module top navigation bar.");
	System.out.println("Step " + step + " : Verifying Treatment Module top navigation bar.");

	p.Top_Navigation_bar();

	Report_Listen.log_print_in_report().pass("Treatment Module top navigation bar verified successfully.");
	System.out.println("Result : Treatment Module navigation bar verified.");

	step++;

	// Verify Treatments Module and Retrieve Rows
	System.out.println();
	System.out.println("---------------- TREATMENT LIST ACCESS ----------------");

	Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Verify Treatments module visibility and retrieve treatment rows.");
	System.out.println("Step " + step + " : Checking Treatments module visibility.");

	Boolean is_Visible = rp.check_element_visibility(p.Landed_In_Treatment_Module, 4);

	if(is_Visible){

		System.out.println("Treatments Module Visible : " + is_Visible);

		List<WebElement> rows = p.Rows();

		System.out.println("Treatment Rows Retrieved : " + rows.size());
		System.out.println("Result : PASS - Treatment list accessed successfully.");

		Report_Listen.log_print_in_report().pass("Treatment Module is visible. Treatment rows retrieved: " + rows.size());

		return rows;
	}
	else{

		System.out.println("Treatments Module Visible : " + is_Visible);
		System.out.println("Result : FAIL - Treatments module is not visible.");

		Report_Listen.log_print_in_report().fail("Treatments module is not visible. Unable to retrieve treatment rows.");

		return null;
	}
}



@Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
public void Treatment_Patient_Details_Check(TreeMap<String,String> data) throws Exception{

	String Patient_Name = data.get("First Name") + " " + data.get("Last Name");
	Repeat rp = new Repeat(d);

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                TREATMENT PATIENT DETAILS CHECK");
	System.out.println("============================================================");
	System.out.println("Expected Patient : " + Patient_Name);

	Report_Listen.log_print_in_report().info("Starting Treatment Module patient verification for: " + Patient_Name);

	// Access Treatment Module
	List<WebElement> Rows = Treatment_Module_Accessor();

	System.out.println();
	System.out.println("---------- TREATMENT LIST VERIFICATION ----------");
	System.out.println("Total Treatment Rows : " + Rows.size());
	System.out.println("Searching Patient    : " + Patient_Name);

	Report_Listen.log_print_in_report().info("Searching Treatment Module records for patient: " + Patient_Name);

	// Search Patient in Treatment Table
	for(WebElement Row : Rows){

		List<WebElement> Text_Cells = Row.findElements(By.xpath(".//td//span[contains(@class,'text-dark')]"));
		WebElement View_Button = Row.findElement(By.xpath(".//span[@class='ant-btn-icon']/.."));

		for(WebElement Text_Cell : Text_Cells){

			String Cell_Text = Text_Cell.getText().trim();

			if(Cell_Text.contains(Patient_Name)){

				System.out.println();
				System.out.println("---------- PATIENT MATCH RESULT ----------");
				System.out.println("Expected Patient : " + Patient_Name);
				System.out.println("Actual Patient   : " + Cell_Text);
				System.out.println("Result           : PASS");

				Report_Listen.log_print_in_report().pass("Patient found in Treatment Module. Expected: " + Patient_Name + " | Actual: " + Cell_Text);

				// Open Matching Treatment Details Using View Button
				System.out.println();
				System.out.println("---------- TREATMENT DETAILS NAVIGATION ----------");
				System.out.println("Patient : " + Patient_Name);
				System.out.println("Action  : Click View button of matching treatment row.");

				rp.movetoelement(View_Button);
				View_Button.click();

				Report_Listen.log_print_in_report().info("Clicked View button for matching patient: " + Patient_Name);

				// Verify Admin Patient Details Against DataProvider
				System.out.println();
				System.out.println("---------- ADMIN PATIENT DETAILS VERIFICATION ----------");
				System.out.println("Patient : " + Patient_Name);
				System.out.println("Action  : Compare Admin Patient Details with Storefront and Intake DataProvider.");

				Report_Listen.log_print_in_report().info("Starting Admin Patient Details field-by-field comparison for: " + Patient_Name);

				Admin_Patient_Details_Verification(data);

				// Final Verification Result
				System.out.println();
				System.out.println("============================================================");
				System.out.println("             TREATMENT PATIENT VERIFICATION RESULT");
				System.out.println("============================================================");
				System.out.println("Patient : " + Patient_Name);
				System.out.println("Result  : PASS");
				System.out.println("Reason  : Patient found and Admin details verification completed successfully.");

				Report_Listen.log_print_in_report().pass("Treatment Patient Details verification completed successfully for: " + Patient_Name);

				return;
			}
		}
	}

	// Patient Not Found
	System.out.println();
	System.out.println("---------- PATIENT MATCH RESULT ----------");
	System.out.println("Expected Patient : " + Patient_Name);
	System.out.println("Actual Patient   : Not Found");
	System.out.println("Result           : FAIL");

	Report_Listen.log_print_in_report().fail("Patient not found in Treatment Module: " + Patient_Name);
	Assert.fail("Treatment Module patient verification failed. Patient not found: " + Patient_Name);
}



  

public void Admin_Patient_Details_Verification(TreeMap<String,String> data){

	Treatment_Module_Locaters p = new Treatment_Module_Locaters(d);

	// Expected Patient Details from DataProvider
	TreeMap<String,String> Expected_Data = new TreeMap<String,String>();
	Expected_Data.put("First Name", data.get("First Name"));
	Expected_Data.put("Last Name", data.get("Last Name"));
	Expected_Data.put("Email", data.get("Email"));
	Expected_Data.put("Phone", data.get("Phone").replaceAll("\\D", ""));
	Expected_Data.put("Date of Birth", data.get("Date of Birth"));
	Expected_Data.put("Gender", data.get("Biological Sex at Birth"));
	Expected_Data.put("Height", data.get("Height"));
	Expected_Data.put("Weight", data.get("Weight"));
	Expected_Data.put("Medications", data.get("Intake Q&A - Do you take any prescription medication?"));

	String Patient_Name = Expected_Data.get("First Name") + " " + Expected_Data.get("Last Name");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                 ADMIN PATIENT DETAILS VERIFICATION");
	System.out.println("============================================================");
	System.out.println("Patient : " + Patient_Name);

	Report_Listen.log_print_in_report().info("Verifying Admin Patient Details against Storefront and Intake DataProvider for: " + Patient_Name);

	// Verify Patient Details Section
	WebElement Details_Title = p.Admin_Patient_Details_Title();
	Assert.assertEquals(Details_Title.getText().trim(), "Patient Details", "Admin Patient Details section not found.");

	// Retrieve Admin Patient Details Elements
	WebElement First_Name_Field = p.Admin_Patient_First_Name();
	WebElement Last_Name_Field = p.Admin_Patient_Last_Name();
	WebElement Email_Field = p.Admin_Patient_Email();
	WebElement Phone_Field = p.Admin_Patient_Phone();
	WebElement DOB_Field = p.Admin_Patient_DOB();
	WebElement Gender_Field = p.Admin_Patient_Gender();
	WebElement Height_Field = p.Admin_Patient_Height();
	WebElement Weight_Field = p.Admin_Patient_Weight();
	WebElement Medications_Field = p.Admin_Patient_Medications();

	// Normalize Admin Phone and DOB
	String Actual_Phone = Phone_Field.getText().replaceAll("\\D", "");
	if(Actual_Phone.length() == 11 && Actual_Phone.startsWith("1")){
		Actual_Phone = Actual_Phone.substring(1);
	}

	String Actual_DOB = DOB_Field.getText().trim().replaceFirst("\\s*\\(.*$", "");

	// Actual Patient Details from Admin Panel
	TreeMap<String,String> Actual_Data = new TreeMap<String,String>();
	Actual_Data.put("First Name", First_Name_Field.getText().trim());
	Actual_Data.put("Last Name", Last_Name_Field.getText().trim());
	Actual_Data.put("Email", Email_Field.getText().trim());
	Actual_Data.put("Phone", Actual_Phone);
	Actual_Data.put("Date of Birth", Actual_DOB);
	Actual_Data.put("Gender", Gender_Field.getText().trim());
	Actual_Data.put("Height", Height_Field.getText().trim());
	Actual_Data.put("Weight", Weight_Field.getText().trim());
	Actual_Data.put("Medications", Medications_Field.getText().trim());

	// Compare DataProvider and Admin Details
	int Passed = 0;
	int Failed = 0;

	System.out.println();
	System.out.println("---------------- PATIENT DETAILS COMPARISON ----------------");

	for(Map.Entry<String,String> Entry : Expected_Data.entrySet()){

		String Field_Name = Entry.getKey();
		String Expected_Value = Entry.getValue();
		String Actual_Value = Actual_Data.get(Field_Name);

		System.out.println();
		System.out.println("Field    : " + Field_Name);
		System.out.println("Expected : " + Expected_Value);
		System.out.println("Actual   : " + Actual_Value);

		if(Expected_Value.equals(Actual_Value)){
			Passed++;
			System.out.println("Result   : PASS");
			Report_Listen.log_print_in_report().pass(Field_Name + " matched | Expected: " + Expected_Value + " | Actual: " + Actual_Value);
		}
		else{
			Failed++;
			System.out.println("Result   : FAIL");
			Report_Listen.log_print_in_report().fail(Field_Name + " mismatch | Expected: " + Expected_Value + " | Actual: " + Actual_Value);
		}
	}

	// Final Verification Summary
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                  PATIENT VERIFICATION RESULT");
	System.out.println("============================================================");
	System.out.println("Patient        : " + Patient_Name);
	System.out.println("Fields Checked : " + Expected_Data.size());
	System.out.println("Passed         : " + Passed);
	System.out.println("Failed         : " + Failed);
	System.out.println("Overall Result : " + (Failed == 0 ? "PASS" : "FAIL"));

	if(Failed == 0){
		Report_Listen.log_print_in_report().pass("All " + Passed + " patient details matched successfully for: " + Patient_Name);
	}
	else{
		Report_Listen.log_print_in_report().fail("Patient details mismatch for: " + Patient_Name + " | Passed: " + Passed + " | Failed: " + Failed);
	}

	Assert.assertEquals(Failed, 0, "Admin Patient Details verification failed for: " + Patient_Name);
}
 
  
  
  
  
  
  
}
