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
	String Product_Name = data.getOrDefault("Product Name", "");
	Boolean Shared_Teleform = Product_Name.equalsIgnoreCase("AsterRefluxa Digestive Relief Capsules") || Product_Name.equalsIgnoreCase("AsterSomnera Sleep Support Tablets") || Product_Name.equalsIgnoreCase("AsterMigraEase Headache Support Tablets");

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
	Expected_Data.put("Medications", data.get("Intake Q&A - List all medicines and supplements you currently take, including doses and frequency. Enter None if you take none."));
	String Patient_Name = Expected_Data.get("First Name") + " " + Expected_Data.get("Last Name");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                 ADMIN PATIENT DETAILS VERIFICATION");
	System.out.println("============================================================");
	System.out.println("Patient : " + Patient_Name);
	System.out.println("Product : " + Product_Name);
	Report_Listen.log_print_in_report().info("Verifying Admin Patient Details against Storefront and Intake DataProvider for: " + Patient_Name);

	// Actual Patient Details from Admin UI
	WebElement Details_Title = p.Admin_Patient_Details_Title();
	Assert.assertEquals(Details_Title.getText().trim(), "Patient Details", "Admin Patient Details section not found.");
	List<WebElement> Sections = p.Treatment_Details_cards();
	
	WebElement Patient_details_section = Sections.get(0);
	
	List<WebElement> Patient_Details_Rows = Patient_details_section.findElements(By.xpath(".//div[contains(@class,'ant-row css')]//div[contains(@class,'mb-20 ant-flex css')]"));
	
	TreeMap<String,String> Actual_Data = new TreeMap<String,String>();
	
	for(WebElement Patient_Details_Row : Patient_Details_Rows){
		
		WebElement Label = Patient_Details_Row.findElement(By.xpath(".//span[contains(@class,'text-muted font-')]"));
		WebElement Values = Patient_Details_Row.findElement(By.xpath(".//span[contains(@class,'text-dark')]"));
		
		String Label_text = Label.getText().trim();
		String Values_text = Values.getText().trim();
		
		if(Label_text.equals("Date of Birth")){
			Values_text = Values_text.replaceAll("\\s*\\([^)]*\\)\\s*$", "").trim();
		}
		if(Label_text.equals("Phone")){
			Values_text = Values_text.replaceAll("\\D", "");
		}
		
		Actual_Data.put(Label_text, Values_text);
	}

	// Compare Expected and Actual Patient Details
	int Fields_Checked = 0, Passed = 0, Failed = 0, Excluded = 0;
	System.out.println();
	System.out.println("---------------- PATIENT DETAILS COMPARISON ----------------");
	
	for(String Field : Expected_Data.keySet()){
		
		String Expected_Value = Expected_Data.get(Field);
		String Actual_Value = Actual_Data.get(Field);
		
		if(Shared_Teleform && (Field.equals("Height") || Field.equals("Weight"))){
			
			Excluded++;
			System.out.println();
			System.out.println("Field              : " + Field);
			System.out.println("DataProvider Value : " + Expected_Value);
			System.out.println("Result             : NOT VALIDATED");
			System.out.println("Reason             : Field was not submitted through the current Intake Form.");
			Report_Listen.log_print_in_report().info("Field: " + Field + " | DataProvider Value: " + Expected_Value + " | Result: NOT VALIDATED | Reason: Field was not submitted through the current Intake Form.");
			
			continue;
		}
		
		Fields_Checked++;
		
		System.out.println();
		System.out.println("Field    : " + Field);
		System.out.println("Expected : " + Expected_Value);
		System.out.println("Actual   : " + Actual_Value);
		
		
		if(Expected_Value != null && Expected_Value.equals(Actual_Value)){
			Passed++;
			System.out.println("Result   : PASS");
			Report_Listen.log_print_in_report().pass("Field: " + Field + " | Expected: " + Expected_Value + " | Actual: " + Actual_Value + " | Result: PASS");
		}
		
		else{
			Failed++;
			System.out.println("Result   : FAIL");
			Report_Listen.log_print_in_report().fail("Field: " + Field + " | Expected: " + Expected_Value + " | Actual: " + Actual_Value + " | Result: FAIL");
		}
	}

	// Final Verification Result
	System.out.println();
	System.out.println("============================================================");
	System.out.println("                 PATIENT VERIFICATION RESULT");
	System.out.println("============================================================");
	System.out.println("Patient         : " + Patient_Name);
	System.out.println("Product         : " + Product_Name);
	System.out.println("Total Fields    : " + Expected_Data.size());
	System.out.println("Fields Checked  : " + Fields_Checked);
	System.out.println("Passed          : " + Passed);
	System.out.println("Failed          : " + Failed);
	System.out.println("Excluded        : " + Excluded);
	System.out.println("Overall Result  : " + (Failed == 0 ? "PASS" : "FAIL"));
	System.out.println("============================================================");
	Report_Listen.log_print_in_report().info("Patient: " + Patient_Name + " | Product: " + Product_Name + " | Total Fields: " + Expected_Data.size() + " | Fields Checked: " + Fields_Checked + " | Passed: " + Passed + " | Failed: " + Failed + " | Excluded: " + Excluded);
	
	if(Failed == 0){
		Report_Listen.log_print_in_report().pass("Admin Patient Details verification completed successfully for: " + Patient_Name);
	}
	else{
		Report_Listen.log_print_in_report().fail("Admin Patient Details verification failed for: " + Patient_Name + " | Failed Fields: " + Failed);
	}
	
	Assert.assertEquals(Failed, 0, "Admin Patient Details verification failed for: " + Patient_Name);
}

 
  
  
  
  
  
  
}
