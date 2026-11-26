package AsterMD.Project.AsterMD;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Doctor_network.Doctor_network;
import Listerners.Report_Listen;
import Locaters.Product_Module_Locaters;
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
	System.out.println();
	System.out.println("Step " + step + " : Treatment Module locator class initialized.");

	step++;

	// Navigate to Treatments Module
	System.out.println();
	System.out.println("---------------- TREATMENTS MODULE NAVIGATION ----------------");

	Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Navigate to Treatments through the side menu.");
	System.out.println("Step " + step + " : Navigating to Treatments through the side menu.");

	Side_Menu_Navigation("Treatments");

	Report_Listen.log_print_in_report().pass("Treatments side-menu navigation completed successfully.");
	System.out.println();
	System.out.println("Result : Treatments module navigation completed.");

	step++;

	// Verify Treatment Module Navigation Bar
	System.out.println();
	System.out.println("---------------- TREATMENT NAVIGATION BAR ----------------");

	Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Verify the Treatment Module top navigation bar.");
	System.out.println("Step " + step + " : Verifying Treatment Module top navigation bar.");

	p.Top_Navigation_bar();

	Report_Listen.log_print_in_report().pass("Treatment Module top navigation bar verified successfully.");
	System.out.println();
	System.out.println("Result : Treatment Module navigation bar verified.");

	step++;

	// Verify Treatments Module and Retrieve Rows
	System.out.println();
	System.out.println("---------------- TREATMENT LIST ACCESS ----------------");

	Report_Listen.log_print_in_report().info("<b>Step " + step + ":</b> Verify Treatments module visibility and retrieve treatment rows.");
	System.out.println("Step " + step + " : Checking Treatments module visibility.");

	Boolean is_Visible = rp.check_element_visibility(p.Landed_In_Treatment_Module, 6);

	if(is_Visible){

		System.out.println();
		System.out.println("Treatments Module Visible : " + is_Visible);

		List<WebElement> rows = p.Rows();
		
		Boolean row_visibilty = rp.check_element_visibility(rows, 6);
		
		

		System.out.println();
		System.out.println("Treatment Rows Retrieved : " + rows.size());
		System.out.println("Result : PASS - Treatment list accessed successfully.");

		Report_Listen.log_print_in_report().pass("Treatment Module is visible. Treatment rows retrieved: " + rows.size());
		
		if(row_visibilty==true) {

		return rows; }
		else {
			
			return null;
			
		}
	}
	else{

		System.out.println();
		System.out.println("Treatments Module Visible : " + is_Visible);
		System.out.println("Result : FAIL - Treatments module is not visible.");

		Report_Listen.log_print_in_report().fail("Treatments module is not visible. Unable to retrieve treatment rows.");

		return null;
	}
}

   @Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
   public void Treatment_Patient_Details_Check(TreeMap<String,String> Patient_Data, TreeMap<String,String> Product_Data) throws Exception{

    Boolean Checkout_Only = Boolean.parseBoolean(Product_Data.get("Checkout Only"));

    if(Checkout_Only == true){

        String Skip_Message = "Treatment Patient Details Check | Product: " + Product_Data.get("Product Name") + " | Result: SKIPPED | Reason: Checkout-only product";

        System.out.println();
        System.out.println(Skip_Message);
        Report_Listen.log_print_in_report().info(Skip_Message);

        }
    else{

        Repeat rp = new Repeat(d);
        Product_Module_Locaters p = new Product_Module_Locaters(d);
        Treatment_Module_Locaters pp = new Treatment_Module_Locaters(d);

        String Patient_Name = Patient_Data.get("First Name") + " " + Patient_Data.get("Last Name");
        String Product_Name = Product_Data.get("Product Name");
        String Doctor_Name = Patient_Data.get("Doctor Name");
        String Expected_Status = "Prescription Issued";

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                TREATMENT PATIENT DETAILS CHECK");
        System.out.println("============================================================");
        System.out.println("Expected Patient : " + Patient_Name);
        System.out.println("Product          : " + Product_Name);
        System.out.println("Expected Doctor  : " + Doctor_Name);
        System.out.println("Expected Status  : " + Expected_Status);

        Report_Listen.log_print_in_report().info("Starting Treatment Patient Details verification | Patient: " + Patient_Name + " | Product: " + Product_Name);

        List<WebElement> Rows = Treatment_Module_Accessor();

        System.out.println();
        System.out.println("---------- TREATMENT PATIENT SEARCH ----------");
        System.out.println("Expected Patient : " + Patient_Name);
        System.out.println("Total Rows       : " + Rows.size());

        Main_row_loop:
        for(WebElement Row : Rows){

            List<WebElement> Text_Cells = pp.Treatment_Row_Text_Cells(Row);

            for(WebElement Text_Cell : Text_Cells){

                String Cell_Text = Text_Cell.getText().replaceAll("\\s+", " ").trim();

                if(Cell_Text.equalsIgnoreCase(Patient_Name)){

                    WebElement View_Button = pp.Row_View_Button(Row);
                    rp.movetoelement(View_Button);
                    View_Button.click();

                    Admin_Patient_Details_Verification(Patient_Data, Product_Data, Doctor_Name, Expected_Status);

                    break Main_row_loop;

                }
                else{

                    WebElement Patient_Search = p.Search();
                    Patient_Search.clear();
                    Patient_Search.sendKeys(Patient_Name);
                    Thread.sleep(1990);

                    List<WebElement> Filtered_Rows = pp.Rows();

                    for(WebElement Filtered_Row : Filtered_Rows){

                        List<WebElement> Filtered_Text_Cells = pp.Treatment_Row_Text_Cells(Filtered_Row);

                        for(WebElement Filtered_Text_Cell : Filtered_Text_Cells){

                            String Filtered_Cell_Text = Filtered_Text_Cell.getText().replaceAll("\\s+", " ").trim();

                            if(Filtered_Cell_Text.equalsIgnoreCase(Patient_Name)){

                                WebElement View_Button = pp.Row_View_Button(Filtered_Row);
                                rp.movetoelement(View_Button);
                                View_Button.click();

                                Admin_Patient_Details_Verification(Patient_Data, Product_Data, Doctor_Name, Expected_Status);

                                break Main_row_loop;

                            }

                        }

                    }

                    break Main_row_loop;

                }

            }

        }

    }

}
   
   
   
	@Test(dataProvider="Storefront_Product_Data", dataProviderClass=Frontend_Store_Front.class)
	public void Intake_form_Admin_Check(TreeMap<String,String> Patient_Data, TreeMap<String,String> Product_Data) throws Exception{

		Boolean Checkout_Only = Boolean.parseBoolean(Product_Data.get("Checkout Only"));

		if(Checkout_Only == true){

			String Skip_Message = "Admin Intake Check | Product: " + Product_Data.get("Product Name") + " | Result: SKIPPED | Reason: Checkout-only product";

			System.out.println();
			System.out.println(Skip_Message);
			Report_Listen.log_print_in_report().info(Skip_Message);

		}
		else{

			Treatment_Module_Locaters p = new Treatment_Module_Locaters(d);
			Repeat rp = new Repeat(d);
			List<String> Mismatches = new ArrayList<String>();

			String Patient_Name = Patient_Data.get("First Name") + " " + Patient_Data.get("Last Name");
			String Product_Name = Product_Data.get("Product Name");
			String Scenario = "Admin Intake Check | Patient: " + Patient_Name + " | Product: " + Product_Name;

			System.out.println();
			System.out.println("---------------- ADMIN INTAKE FORM CHECK ----------------");
			System.out.println(Scenario);
			Report_Listen.log_print_in_report().info(Scenario);

			List<WebElement> Rows = Treatment_Module_Accessor();
			Assert.assertNotNull(Rows, "Admin treatment rows are unavailable.");

			Main_loop_row:{

				for(WebElement Row : Rows){

					List<WebElement> Text_Cells = p.Treatment_Row_Text_Cells(Row);

					for(WebElement Text_Cell : Text_Cells){

						if(Text_Cell.getText().replaceAll("\\s+", " ").trim().equalsIgnoreCase(Patient_Name)){

							WebElement View_Button = p.Row_View_Button(Row);
							rp.movetoelement(View_Button);
							View_Button.click();

							WebElement Details_Title = p.Admin_Patient_Details_Title();
							String Actual_Details_Title = Details_Title.getText().trim();
							Assert.assertEquals(Actual_Details_Title, "Patient Details", "Admin Patient Details section not found.");

							Admin_Intake_Data_Verification(Product_Data, Mismatches);
							break Main_loop_row;

						}

					}

				}

				Assert.fail("Treatment patient not found | Patient: " + Patient_Name);

			}

			Assert.assertTrue(Mismatches.size() == 0, Scenario + "\n" + String.join("\n", Mismatches));
			System.out.println();
			System.out.println("Admin Intake : PASS");
			Report_Listen.log_print_in_report().pass(Scenario + " | Result: PASS");

		}

	}

	public void Admin_Patient_Details_Verification(TreeMap<String,String> Patient_Data, TreeMap<String,String> Product_Data, String Doctor_Name, String Expected_Status) throws IOException, InterruptedException{

		Treatment_Module_Locaters p = new Treatment_Module_Locaters(d);
		Repeat rp = new Repeat(d);
		Doctor_network Dr_Network = new Doctor_network();
		TreeMap<String,String> Expected_Data = new TreeMap<String,String>();
		TreeMap<String,String> Actual_Data = new TreeMap<String,String>();
		List<String> Mismatches = new ArrayList<String>();

		String Patient_Name = Patient_Data.get("First Name") + " " + Patient_Data.get("Last Name");
		String Product_Name = Product_Data.get("Product Name");

		WebElement Details_Title = p.Admin_Patient_Details_Title();
		String Actual_Details_Title = Details_Title.getText().trim();
		Assert.assertEquals(Actual_Details_Title, "Patient Details", "Admin Patient Details section not found.");

		String Treatment_Details_URL = d.getCurrentUrl();
		List<WebElement> Treatment_Details_Cards = p.Treatment_Details_cards();
		WebElement Patient_Details_Card = Treatment_Details_Cards.get(0);
		List<WebElement> Patient_Details_Rows = p.Admin_Patient_Details_Rows(Patient_Details_Card);
	    rp.wait_for_theElement(Patient_Details_Rows);

		String Case_ID = "";

		for(WebElement Patient_Details_Row : Patient_Details_Rows){

			WebElement Patient_Details_Label = p.Admin_Patient_Details_Label(Patient_Details_Row);
			String Label_text = Patient_Details_Label.getText().trim();

			if(Label_text.equals("Case ID")){

				WebElement Value = p.Admin_Patient_Details_Value(Patient_Details_Row);
				Case_ID = Value.getText().trim();

				if(Case_ID.endsWith("...") || Case_ID.endsWith("…")){

					String Case_ID_Prefix = Case_ID.replaceFirst("(?:\\.{3}|…)$", "").trim();

					if(Case_ID_Prefix.isBlank()){

						throw new IllegalStateException("Admin Case ID has no visible prefix for the tooltip lookup.");

					}

					rp.movetoelement(Value);
					WebElement Case_ID_Tooltip = p.Admin_Case_ID_Tooltip();
					String Full_Case_ID = Case_ID_Tooltip.getDomProperty("textContent").trim();

					if(Full_Case_ID.startsWith(Case_ID_Prefix) == false || Full_Case_ID.length() <= Case_ID_Prefix.length() || Full_Case_ID.contains("...") || Full_Case_ID.contains("…")){

						Assert.fail("Admin Case ID tooltip does not complete the displayed Case ID | Patient: " + Patient_Name + " | Displayed: " + Case_ID + " | Tooltip: " + Full_Case_ID);

					}

					Case_ID = Full_Case_ID;

				}

				break;

			}

		}

		Assert.assertTrue(Case_ID.isBlank() == false, "Admin Case ID is required before sending the webhook | Patient: " + Patient_Name);

		String Payload_Doctor_Name = Dr_Network.beluga_visit_check_and_Authorize(Patient_Data, Case_ID, Doctor_Name, d);

		d.navigate().to(Treatment_Details_URL);

		Details_Title = p.Admin_Patient_Details_Title();
		Actual_Details_Title = Details_Title.getText().trim();
		Assert.assertEquals(Actual_Details_Title, "Patient Details", "Admin Patient Details section not found after the webhook.");

	   List<WebElement> Refetched_Patient_Details_Rows = p.Admin_Patient_Details_Rows();
		Boolean Rows_Visibilty = rp.check_element_visibility(Refetched_Patient_Details_Rows, 8);
		Assert.assertTrue(Rows_Visibilty == true, "Patient Details rows did not become visible after the webhook.");
		
		
		if(Rows_Visibilty) {
			
		for(WebElement Patient_Details_Row : Refetched_Patient_Details_Rows){
			
            WebElement Label =p.Admin_Patient_Details_Label(Patient_Details_Row);
            rp.wait_for_theElement(Label);
			String Label_text = Label.getText().trim();
			WebElement Value = p.Admin_Patient_Details_Value(Patient_Details_Row);
			String Value_text = Value.getText().trim();

			if(Label_text.equals("Case ID") && (Value_text.endsWith("...") || Value_text.endsWith("…"))){

				String Case_ID_Prefix = Value_text.replaceFirst("(?:\\.{3}|…)$", "").trim();

				if(Case_ID_Prefix.isBlank()){

					throw new IllegalStateException("Admin Case ID has no visible prefix for the tooltip lookup.");

				}

				rp.movetoelement(Value);
				WebElement Case_ID_Tooltip = p.Admin_Case_ID_Tooltip();
				String Full_Case_ID = Case_ID_Tooltip.getDomProperty("textContent").trim();

				if(Full_Case_ID.startsWith(Case_ID_Prefix) == false || Full_Case_ID.length() <= Case_ID_Prefix.length() || Full_Case_ID.contains("...") || Full_Case_ID.contains("…")){

					Assert.fail("Admin Case ID tooltip does not complete the displayed Case ID | Patient: " + Patient_Name + " | Displayed: " + Value_text + " | Tooltip: " + Full_Case_ID);

				}

				Value_text = Full_Case_ID;

			}

			if(Label_text.equals("Email") && (Value_text.endsWith("...") || Value_text.endsWith("…"))){

				WebElement Email_Info_Icon = p.Admin_Email_Info_Icon();
				rp.movetoelement(Email_Info_Icon);

				WebElement Email_Tooltip = p.Admin_Email_Tooltip();
				Value_text = Email_Tooltip.getDomProperty("textContent").trim();

			}

			if(Label_text.equals("Date of Birth")){

				Value_text = Value_text.replaceAll("\\s*\\([^)]*\\)\\s*$", "").trim();

			}

			if(Label_text.equals("Phone")){

				Value_text = Value_text.replaceAll("\\D", "");

			}

			Actual_Data.put(Label_text, Value_text.replaceAll("\\s+", " ").trim());

		} }

		//Assert.assertEquals(Actual_Data.get("Case ID"), Case_ID, "The reopened Admin order has a different Case ID.");

		Expected_Data.put("First Name", Patient_Data.get("First Name"));
		Expected_Data.put("Last Name", Patient_Data.get("Last Name"));
		Expected_Data.put("Email", Patient_Data.get("Email"));
		Expected_Data.put("Phone", Patient_Data.get("Phone").replaceAll("\\D", ""));
		Expected_Data.put("Date of Birth", Patient_Data.get("Date of Birth"));
		Expected_Data.put("Gender", Patient_Data.get("Biological Sex at Birth"));

		if(Expected_Status != null && Expected_Status.isBlank() == false){

			Expected_Data.put("Status", Expected_Status.trim());

		}

		if(Payload_Doctor_Name.isBlank()){

			System.out.println();
			System.out.println("Doctor : WARNING | No docName was sent in the webhook.");
			Report_Listen.log_print_in_report().warning("Doctor comparison skipped | No docName in sent payload | Case ID: " + Case_ID);

		}
		else{

			Expected_Data.put("Doctor", Payload_Doctor_Name.replaceAll("\\s+", " ").trim());

		}

		System.out.println();
		System.out.println("---------------- ADMIN PATIENT DETAILS AFTER WEBHOOK ----------------");
		System.out.println("Patient: " + Patient_Name + " | Case ID: " + Case_ID);
		Report_Listen.log_print_in_report().info("Reopened Admin order | Patient: " + Patient_Name + " | Case ID: " + Case_ID);

		for(String Label_text : Expected_Data.keySet()){

			String Expected_Value = Expected_Data.get(Label_text);
			String Actual_Value = Actual_Data.get(Label_text);
			String Comparison = "Label: " + Label_text + " | Expected: " + Expected_Value + " | Actual: " + Actual_Value;

			if(Expected_Value != null && Expected_Value.equals(Actual_Value)){

				System.out.println();
				System.out.println("PASS | " + Comparison);
				Report_Listen.log_print_in_report().pass(Comparison);

			}
			else if(Label_text.equals("Doctor") && (Actual_Value == null || Actual_Value.isBlank() || Actual_Value.equals("--"))){

				System.out.println();
				System.out.println("WARNING | Admin Doctor is missing | " + Comparison);
				Report_Listen.log_print_in_report().warning("Admin Doctor is missing | " + Comparison);

			}
			else{

				System.out.println();
				System.out.println("FAIL | " + Comparison);
				Report_Listen.log_print_in_report().fail(Comparison);
				Mismatches.add(Comparison);

			}

		}

		Admin_Intake_Data_Verification(Product_Data, Mismatches);
		Assert.assertTrue(Mismatches.size() == 0, "Admin verification failed | Patient: " + Patient_Name + " | Product: " + Product_Name + "\n" + String.join("\n", Mismatches));

	}

	
	
	
	
	
	
	private void Admin_Intake_Data_Verification(TreeMap<String,String> Product_Data, List<String> Mismatches){

		Treatment_Module_Locaters p = new Treatment_Module_Locaters(d);
		Repeat rp = new Repeat(d);
		TreeMap<String,String> Expected_Intake_Data = new TreeMap<String,String>();
		TreeMap<String,List<String>> Actual_Intake_Data = new TreeMap<String,List<String>>(String.CASE_INSENSITIVE_ORDER);

		for(String Key : Product_Data.keySet()){

			if(Key.startsWith("Intake Q&A - ") || Key.equals("Intake Reason") || Key.equals("Notes")){

				String Label_text = Key.replaceFirst("^Intake Q&A - ", "").replaceFirst("^\\d+[.)]\\s*", "").replaceAll("[\\s:*]+$", "").replaceAll("\\s+", " ").trim();
				Expected_Intake_Data.put(Label_text, Product_Data.get(Key));

			}

		}

		List<WebElement> Sections = p.Treatment_Details_cards();
		int Section_Count = Sections.size();
		Assert.assertTrue(Section_Count > 4, "Admin Intake Forms section was not found.");

		WebElement Intake_Section = Sections.get(4);
		rp.movetoelement(Intake_Section);
		List<WebElement> Intake_Form_Rows = Intake_Section.findElements(By.xpath(".//tr[contains(@class,'ant-table-row ant-table-row-level-0')]"));
		Boolean Intake_Form_Rows_Visible = rp.check_element_visibility(Intake_Form_Rows, 6);
		Assert.assertTrue(Intake_Form_Rows_Visible == true, "Admin Intake form rows did not become visible.");

		for(WebElement Intake_Form_Row : Intake_Form_Rows){

			String Form_Row_Text = Intake_Form_Row.getText().trim().replaceAll("\\R", " | ");
			WebElement View_Button = Intake_Form_Row.findElement(By.xpath(".//span[@class='ant-btn-icon']/.."));
			rp.movetoelement(View_Button);
			View_Button.click();

			System.out.println();
			System.out.println("Intake Form : " + Form_Row_Text);
			Report_Listen.log_print_in_report().info("Intake Form | " + Form_Row_Text);

			WebElement Intake_Popup = p.Intake_popup_form();
			List<WebElement> Intake_Popup_Rows = Intake_Popup.findElements(By.xpath(".//div[contains(@class,'ant-flex-align-flex-start')]"));

			for(WebElement Intake_Popup_Row : Intake_Popup_Rows){

				List<WebElement> Labels = Intake_Popup_Row.findElements(By.xpath(".//span[contains(@class,'flex-grow-')]"));
				List<WebElement> Values = Intake_Popup_Row.findElements(By.xpath(".//span[@class='font-14 text-dark']"));

				if(Labels.size() == Values.size()){

					for(int i=0; i<Labels.size(); i++){

						WebElement Intake_Label = Labels.get(i);
						String Label_text = Intake_Label.getText().trim().replaceFirst("(?i)^Intake Q&A\\s*-\\s*", "").replaceFirst("^\\d+[.)]\\s*", "").replaceAll("[\\s:*]+$", "").replaceAll("\\s+", " ").trim();
						WebElement Intake_Value = Values.get(i);
						String Value_text = Intake_Value.getText().replaceAll("\\s+", " ").trim();

						if(Label_text.equalsIgnoreCase("Which concern are you requesting care for?")){

							Label_text = "Intake Reason";

						}
						else if(Label_text.equalsIgnoreCase("Tell the clinician anything else about your symptoms, triggers, previous tests, or questions.")){

							Label_text = "Notes";

						}

						if(Actual_Intake_Data.containsKey(Label_text) == false){

							Actual_Intake_Data.put(Label_text, new ArrayList<String>());

						}

						Actual_Intake_Data.get(Label_text).add(Value_text);

					}

				}

			}

			WebElement Close_Button = Intake_Popup.findElement(By.xpath(".//span[@aria-label='Close']"));
			rp.movetoelement(Close_Button);
			Close_Button.click();
			rp.wait_for_invisibilty_of_theElement(Intake_Popup);

		}

		System.out.println();
		System.out.println("---------------- DATAPROVIDER VS ADMIN INTAKE ----------------");

		for(String Label_text : Expected_Intake_Data.keySet()){

			String Expected_Value = Expected_Intake_Data.get(Label_text);
			List<String> Actual_Values = Actual_Intake_Data.getOrDefault(Label_text, List.of());
			String Comparison = "Intake Label: " + Label_text + " | Expected: " + Expected_Value + " | Actual: " + Actual_Values;

			System.out.println();
			System.out.println("Question : " + Label_text);
			System.out.println("Expected : " + Expected_Value);
			System.out.println("Actual   : " + Actual_Values);

			if(Expected_Value != null && Actual_Values.contains(Expected_Value.replaceAll("\\s+", " ").trim())){

				System.out.println("Result   : PASS");
				Report_Listen.log_print_in_report().pass(Comparison);

			}
			else{

				System.out.println();
				System.out.println("Result   : FAIL");
				Report_Listen.log_print_in_report().fail(Comparison);
				Mismatches.add(Comparison);

			}

		}

	}

}
