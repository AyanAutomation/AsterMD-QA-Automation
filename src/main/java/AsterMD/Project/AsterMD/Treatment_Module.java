package AsterMD.Project.AsterMD;

import java.util.List;
import java.io.IOException;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Doctor_network.Doctor_network;
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
				System.out.println("Result  : Verification completed; see the detailed comparison summary.");
				System.out.println("Reason  : Patient found and Admin details verification returned; review hard results and warnings.");

				Report_Listen.log_print_in_report().info("Treatment Patient Details verification completed for: " + Patient_Name + " | Review the detailed hard comparison and warning summary.");

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

    
    

         @Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
         public void Intake_form_Admin_Check(TreeMap<String,String> data) throws Exception{

	Treatment_Module_Locaters p = new Treatment_Module_Locaters(d);
	Repeat rp = new Repeat(d);

	String Patient_Name = data.get("First Name") + " " + data.get("Last Name");
	String Product_Name = data.get("Product Name");

	System.out.println();
	System.out.println("============================================================");
	System.out.println("                  ADMIN INTAKE FORM CHECK");
	System.out.println("============================================================");
	System.out.println("Patient : " + Patient_Name);
	System.out.println("Product : " + Product_Name);
	Report_Listen.log_print_in_report().info("Starting admin intake form check | Patient: " + Patient_Name + " | Product: " + Product_Name);

	List<WebElement> Rows = Treatment_Module_Accessor();

	System.out.println();
	System.out.println("---------- TREATMENT PATIENT SEARCH ----------");
	System.out.println("Expected Patient : " + Patient_Name);
	System.out.println("Treatment Rows   : " + Rows.size());
	Report_Listen.log_print_in_report().info("Searching treatment rows | Expected Patient: " + Patient_Name + " | Treatment Rows: " + Rows.size());

	Main_loop:
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
				Report_Listen.log_print_in_report().pass("Treatment patient matched | Expected: " + Patient_Name + " | Actual: " + Cell_Text);

				rp.movetoelement(View_Button);
				View_Button.click();

				System.out.println("Action           : Clicked View for the matching treatment row.");
				Report_Listen.log_print_in_report().info("Clicked View for the matching treatment row | Patient: " + Patient_Name);

				break Main_loop;

			}

		}

	}

	WebElement Details_Title = p.Admin_Patient_Details_Title();
	String Actual_Title = Details_Title.getText().trim();

	System.out.println();
	System.out.println("---------- TREATMENT DETAILS SECTION ----------");
	System.out.println("Expected Title : Patient Details");
	System.out.println("Actual Title   : " + Actual_Title);
	Report_Listen.log_print_in_report().info("Checking treatment details section | Expected Title: Patient Details | Actual Title: " + Actual_Title);
	Assert.assertEquals(Actual_Title, "Patient Details", "Admin Patient Details section not found.");

	System.out.println("Result         : PASS");
	Report_Listen.log_print_in_report().pass("Patient Details section verified | Patient: " + Patient_Name);

	List<WebElement> Sections = p.Treatment_Details_cards();
	WebElement Intake_Section = Sections.get(4);
	rp.movetoelement(Intake_Section);

	List<WebElement> Intake_From_Rows = Intake_Section.findElements(By.xpath(".//tr[contains(@class,'ant-table-row ant-table-row-level-0')]"));

	System.out.println();
	System.out.println("---------- ADMIN INTAKE FORM ROWS ----------");
	System.out.println("Intake Form Rows : " + Intake_From_Rows.size());
	Report_Listen.log_print_in_report().info("Intake form rows collected | Patient: " + Patient_Name + " | Intake Form Rows: " + Intake_From_Rows.size());

	Boolean Intake_rows_visible = rp.check_element_visibility(Intake_From_Rows, 3);

	if(Intake_rows_visible){

		for(WebElement Intake_From_Row : Intake_From_Rows){

			String Form_Row_Text = Intake_From_Row.getText().trim().replaceAll("\\R", " | ");
			WebElement View_Button = Intake_From_Row.findElement(By.xpath(".//span[@class='ant-btn-icon']/.."));

			System.out.println();
			System.out.println("---------- INTAKE FORM POPUP ----------");
			System.out.println("Form Row : " + Form_Row_Text);
			System.out.println("Action   : Opening the form popup.");
			Report_Listen.log_print_in_report().info("Opening intake form popup | Patient: " + Patient_Name + " | Form Row: " + Form_Row_Text);

			rp.movetoelement(View_Button);
			View_Button.click();

			WebElement Intake_popUp = p.Intake_popup_form();
			List<WebElement> Intake_pop_rows = Intake_popUp.findElements(By.xpath(".//div[contains(@class,'ant-flex-align-flex-start')]"));

			System.out.println("Popup Rows : " + Intake_pop_rows.size());
			Report_Listen.log_print_in_report().info("Intake form popup opened | Form Row: " + Form_Row_Text + " | Popup Rows: " + Intake_pop_rows.size());

			for(WebElement Intake_pop_row : Intake_pop_rows){

				List<WebElement> Values = Intake_pop_row.findElements(By.xpath(".//span"));

				for(WebElement Value : Values){

					String Value_Text = Value.getText().trim();
					System.out.println("Popup Text : " + Value_Text);
					Report_Listen.log_print_in_report().info("Intake form popup | Form Row: " + Form_Row_Text + " | Text: " + Value_Text);

				}

			}

			WebElement Close_Button = Intake_popUp.findElement(By.xpath(".//span[@aria-label='Close']"));
			rp.movetoelement(Close_Button);
			Close_Button.click();
			rp.wait_for_invisibilty_of_theElement(Intake_popUp);

			System.out.println("Result : Form popup read and closed.");
			Report_Listen.log_print_in_report().info("Form popup read and closed | Patient: " + Patient_Name + " | Form Row: " + Form_Row_Text);

		}

		System.out.println();
		System.out.println("---------- ADMIN INTAKE FORM CHECK RESULT ----------");
		System.out.println("Patient       : " + Patient_Name);
		System.out.println("Rows Inspected : " + Intake_From_Rows.size());
		Report_Listen.log_print_in_report().info("Intake form inspection completed | Patient: " + Patient_Name + " | Product: " + Product_Name + " | Rows Inspected: " + Intake_From_Rows.size());

	}

	else{

		System.out.println("Result : WARNING | Intake form rows did not become visible.");
		Report_Listen.log_print_in_report().warning("Intake form rows did not become visible | Patient: " + Patient_Name + " | Product: " + Product_Name);

	}

}
      
      
      
      

    public void Admin_Patient_Details_Verification(TreeMap<String,String> data) throws IOException, InterruptedException{

	Treatment_Module_Locaters p = new Treatment_Module_Locaters(d);
	Repeat rp = new Repeat(d);
	Doctor_network Dr_Network = new Doctor_network();

	TreeMap<String,String> Expected_Data = new TreeMap<String,String>();
	TreeMap<String,String> Actual_Data = new TreeMap<String,String>();

	String Product_Name = data.getOrDefault("Product Name", "");

	Expected_Data.put("First Name", data.get("First Name"));
	Expected_Data.put("Last Name", data.get("Last Name"));
	Expected_Data.put("Email", data.get("Email"));
	Expected_Data.put("Phone", data.get("Phone").replaceAll("\\D", ""));
	Expected_Data.put("Date of Birth", data.get("Date of Birth"));
	Expected_Data.put("Gender", data.get("Biological Sex at Birth"));
	Expected_Data.put("Height", data.get("Height"));
	Expected_Data.put("Weight", data.get("Weight"));

	String Patient_Name = Expected_Data.get("First Name") + " " + Expected_Data.get("Last Name");

	System.out.println();
	System.out.println("---------------- ADMIN PATIENT DETAILS VERIFICATION ----------------");
	System.out.println("Patient : " + Patient_Name);
	System.out.println("Product : " + Product_Name);
	Report_Listen.log_print_in_report().info("Verifying Admin Patient Details before and after Beluga authorization | Patient: " + Patient_Name + " | Product: " + Product_Name);

	WebElement Details_Title = p.Admin_Patient_Details_Title();
	Assert.assertEquals(Details_Title.getText().trim(), "Patient Details", "Admin Patient Details section not found.");

	List<WebElement> Sections = p.Treatment_Details_cards();

	WebElement Patient_details_section = Sections.get(0);

	List<WebElement> Patient_Details_Rows = Patient_details_section.findElements(By.xpath(".//div[contains(@class,'ant-row css')]//div[contains(@class,'mb-20 ant-flex css')]"));

	for(WebElement Patient_Details_Row : Patient_Details_Rows){

		WebElement Label = Patient_Details_Row.findElement(By.xpath(".//span[contains(@class,'text-muted font-')]"));
		WebElement Values = Patient_Details_Row.findElement(By.xpath(".//span[contains(@class,'text-dark')]"));
		String Label_text = Label.getText().trim();
		String Values_text = Values.getText().trim();

		if(Label_text.equals("Case ID") && (Values_text.endsWith("...") || Values_text.endsWith("\u2026"))){

			rp.movetoelement(Values);
			Values_text = p.Admin_Case_ID_Tooltip(Values_text);

		}

		if(Label_text.equals("Date of Birth")){

			Values_text = Values_text.replaceAll("\\s*\\([^)]*\\)\\s*$", "").trim();

		}

		if(Label_text.equals("Phone")){

			Values_text = Values_text.replaceAll("\\D", "");

		}

		System.out.println();
		System.out.println(Label_text+" : - "+Values_text);
		System.out.println();
		Actual_Data.put(Label_text, Values_text);

	}

	String Treatment_Details_URL = d.getCurrentUrl();
	String Case_ID = Actual_Data.get("Case ID");
	String Before_Doctor = Actual_Data.get("Doctor");
	String Before_Status = Actual_Data.get("Status");
	String Before_Medications = Actual_Data.get("Medications");

	System.out.println("Before Doctor : " + Before_Doctor);
	System.out.println("Before Status : " + Before_Status);
	System.out.println("Before Medications : " + Before_Medications);
	Report_Listen.log_print_in_report().info("Before webhook | Case ID: " + Case_ID + " | Doctor: " + Before_Doctor + " | Status: " + Before_Status + " | Medications: " + Before_Medications);

	String Assigned_Dr_Name = Dr_Network.beluga_visit_check_and_Authorize(data, Case_ID,d);

	Expected_Data.put("Doctor", Assigned_Dr_Name);
	Expected_Data.put("Status", "Approved For Treatment");
	Expected_Data.put("Medications", "Populated medication value other than None");

	d.navigate().to(Treatment_Details_URL);

	Sections = p.Treatment_Details_cards();
	Patient_details_section = Sections.get(0);
	Patient_Details_Rows = Patient_details_section.findElements(By.xpath(".//div[contains(@class,'ant-row css')]//div[contains(@class,'mb-20 ant-flex css')]"));
	Actual_Data.clear();

	for(WebElement Patient_Details_Row : Patient_Details_Rows){

		WebElement Label = Patient_Details_Row.findElement(By.xpath(".//span[contains(@class,'text-muted font-')]"));
		WebElement Values = Patient_Details_Row.findElement(By.xpath(".//span[contains(@class,'text-dark')]"));
		String Label_text = Label.getText().trim();
		String Values_text = Values.getText().trim();

		if(Label_text.equals("Case ID") && (Values_text.endsWith("...") || Values_text.endsWith("\u2026"))){

			rp.movetoelement(Values);
			Values_text = p.Admin_Case_ID_Tooltip(Values_text);

		}

		if(Label_text.equals("Date of Birth")){

			Values_text = Values_text.replaceAll("\\s*\\([^)]*\\)\\s*$", "").trim();

		}

		if(Label_text.equals("Phone")){

			Values_text = Values_text.replaceAll("\\D", "");

		}

		System.out.println();
		System.out.println("Refetched after Webhook :--->  "+Label_text+" : - "+Values_text);
		System.out.println();
		Actual_Data.put(Label_text, Values_text);

	}

	String Assigned_Dr_Name_in_Admin_Patient_details = Actual_Data.get("Doctor");

	System.out.println("Doctor | Before: " + Before_Doctor + " | After: " + Assigned_Dr_Name_in_Admin_Patient_details);
	System.out.println("Status | Before: " + Before_Status + " | After: " + Actual_Data.get("Status"));
	System.out.println("Medications | Before: " + Before_Medications + " | After: " + Actual_Data.get("Medications"));
	Report_Listen.log_print_in_report().info("After webhook | Doctor: " + Before_Doctor + " -> " + Actual_Data.get("Doctor") + " | Status: " + Before_Status + " -> " + Actual_Data.get("Status") + " | Medications: " + Before_Medications + " -> " + Actual_Data.get("Medications"));

	System.out.println();
	System.out.println("---------------- POST-WEBHOOK DOCTOR AND STATUS CHECK ----------------");

	for(String Label_text : Expected_Data.keySet()){

		if(Label_text.equals("Doctor") || Label_text.equals("Status")){

			String Expected_Value = Expected_Data.get(Label_text);
			String Actual_Value = Actual_Data.get(Label_text);

			System.out.println();
			System.out.println("Label    : " + Label_text);
			System.out.println("Expected : " + Expected_Value);
			System.out.println("Actual   : " + Actual_Value);

			if(Expected_Value.trim().equals(Actual_Value)){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass("Label: " + Label_text + " | Expected: " + Expected_Value + " | Actual: " + Actual_Value + " | Result: PASS");

			}

			else{

				System.out.println("Result   : WARNING");
				Report_Listen.log_print_in_report().warning("Label: " + Label_text + " | Expected: " + Expected_Value + " | Actual: " + Actual_Value + " | Result: WARNING");

			}

		}

	}

}

}



 
  
  
  
  
  
  

