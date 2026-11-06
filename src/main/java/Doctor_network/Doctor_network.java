package Doctor_network;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import AsterMD.Project.AsterMD.Data_Reader;
import Listerners.Report_Listen;
import Locaters.Dr_Network_locaters;
import Repeatative_codes.Repeat;
import Store.Frontend_Store_Front;

public class Doctor_network extends Frontend_Store_Front{
	public Doctor_network(){}

	
	
	
	
	public void Simulator_Accessor(WebDriver d) throws IOException, InterruptedException{
		
		
		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Data_Reader f = new Data_Reader();

		String url = f.Data_Fetcher("Simulator_URL");

		d.navigate().to(url);
		Thread.sleep(800);

		p.Landed_in_Simulator();

		System.out.println("Landed in Simulator");
		
		}
	
	
	
	
	public void Dr_network_Accessor(String Network ,String Module, WebDriver d) throws IOException, InterruptedException{
		
		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Repeat rp = new Repeat(d);
		
		
		Simulator_Accessor(d);
		WebElement Navbar= p.Header_Nav_Bar();
		
		List<WebElement> Nav_options= Navbar.findElements(By.xpath(".//a[contains(@class,'nav-link')]"));
		rp.wait_for_theElement(Nav_options);
		
		Super_loop:
		for(WebElement Nav_option:Nav_options){
			
			String option_text=Nav_option.getText().trim();
			
			if(option_text.contains(Network)){
				
				rp.movetoelement(Nav_option);
				Nav_option.click();
				
				WebElement Dropdown_list=p.Dropdown();
				List<WebElement> Dropdown_options= Dropdown_list.findElements(By.xpath(".//a"));
				rp.wait_for_theElement(Dropdown_options);
				
				for(WebElement Dropdown_option:Dropdown_options){
					
					String Dropdown_option_text=Dropdown_option.getText().trim();
					
					if(Dropdown_option_text.equalsIgnoreCase(Module)){
						
						rp.movetoelement(Dropdown_option);
						Dropdown_option.click();
						rp.wait_for_invisibilty_of_theElement(Dropdown_list);
						break Super_loop;
					}}}}}
	
	
	
	public String beluga_visit_check_and_Authorize(TreeMap<String,String> Data, String Expected_ID, WebDriver d) throws IOException, InterruptedException{
		
		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Repeat rp = new Repeat(d);
		
		String Patient_Name = Data.get("First Name") + " " + Data.get("Last Name");
		
		Assert.assertTrue(Expected_ID != null && !Expected_ID.isBlank(), "The expected ID from the current admin record is required before selecting a Beluga visit.");
		
		Expected_ID = Expected_ID.trim();

		System.out.println();
		System.out.println("============================================================");
		System.out.println("                 BELUGA VISIT AND DOCTOR DETAILS");
		System.out.println("============================================================");
		System.out.println("Network          : Beluga Health");
		System.out.println("Module           : Visits");
		System.out.println("Expected Patient : " + Patient_Name);
		Report_Listen.log_print_in_report().info("Starting Beluga visit search and doctor-name retrieval | Network: Beluga Health | Module: Visits | Patient: " + Patient_Name);

		Dr_network_Accessor("Beluga Health","Visits",d);
		p.Visit_Table();

		System.out.println();
		System.out.println("---------------- PATIENT SEARCH INPUT ----------------");
		WebElement Search_Input = p.Search();
		rp.movetoelement(Search_Input);
		Search_Input.clear();
		Search_Input.sendKeys(Patient_Name);
		System.out.println("Search Input : " + Patient_Name);
		System.out.println("Action       : Patient name entered in Visits search.");
		Report_Listen.log_print_in_report().info("Visits search input entered | Patient: " + Patient_Name);

		List<WebElement> rows = p.Visit_Rows();
		System.out.println();
		System.out.println("---------------- SEARCH RESULTS ----------------");
		System.out.println("Searched Patient        : " + Patient_Name);
		System.out.println("Visit Rows After Search : " + rows.size());
		Report_Listen.log_print_in_report().info("Visits search results retrieved | Patient: " + Patient_Name + " | Visit Rows After Search: " + rows.size());

		for(WebElement row : rows){
			if(!row.isDisplayed()){
				continue;
			}
			String Actual_ID = p.Visit_ID_Cell(row).getText().trim();
			WebElement patient_name_cell = row.findElement(Dr_Network_locaters.Visit_Patient);
			String patient_name_cell_text = patient_name_cell.getText().trim().split("\\R", 2)[0].trim();

			System.out.println();
			System.out.println("---------------- VISIT MATCH CHECK ----------------");
			System.out.println("Expected Patient : " + Patient_Name);
			System.out.println("Actual Patient   : " + patient_name_cell_text);
			System.out.println("Expected ID      : " + Expected_ID);
			System.out.println("Actual ID        : " + Actual_ID);
			Report_Listen.log_print_in_report().info("Beluga visit match check | Expected Patient: " + Patient_Name + " | Actual Patient: " + patient_name_cell_text + " | Expected ID: " + Expected_ID + " | Actual ID: " + Actual_ID);

			if(patient_name_cell_text.equalsIgnoreCase(Patient_Name) && Expected_ID.equals(Actual_ID)){
				
				System.out.println("Result           : MATCH FOUND");
				Report_Listen.log_print_in_report().pass("Matching Beluga visit found | Patient: " + Patient_Name + " | Expected ID: " + Expected_ID + " | Actual ID: " + Actual_ID);
				rp.movetoelement(row);
				row.click();
				System.out.println("Action           : Matching visit row clicked.");
				Report_Listen.log_print_in_report().info("Clicked matching visit row | Patient: " + Patient_Name + " | ID: " + Actual_ID);

				String Actual_Master_ID = p.Visit_Master_ID().getText().trim();
				String Actual_Patient_Email = p.Visit_Patient_Email().getText().trim();
				Assert.assertEquals(Actual_Master_ID, Expected_ID, "The opened Beluga visit belongs to a different treatment case.");
				Assert.assertEquals(Actual_Patient_Email, Data.get("Email"), "The opened Beluga visit belongs to a different patient.");
				System.out.println("Verified Master ID : " + Actual_Master_ID);
				Report_Listen.log_print_in_report().info("Beluga visit identity verified | Patient: " + Patient_Name + " | Email: " + Actual_Patient_Email + " | Master ID: " + Actual_Master_ID);

				System.out.println();
				System.out.println("---------------- DOCTOR TAB NAVIGATION ----------------");
				System.out.println("Expected Tab : Doctor");
				Report_Listen.log_print_in_report().info("Accessing Visit Details tabs | Patient: " + Patient_Name + " | Expected Tab: Doctor");
				WebElement Visit_Details_tab = p.Visit_details_tabs();
				List<WebElement> Tabs = Visit_Details_tab.findElements(By.xpath(".//a[@class='nav-link' or @role='tab']"));
				rp.wait_for_theElement(Tabs);
				System.out.println("Tabs Found   : " + Tabs.size());
				Report_Listen.log_print_in_report().info("Visit Details tabs retrieved | Total Tabs: " + Tabs.size());

				for(WebElement Tab : Tabs){
					String Tabname = Tab.getText().trim();
					if(Tabname.equalsIgnoreCase("Doctor")){
						rp.movetoelement(Tab);
						Tab.click();
						System.out.println("Actual Tab   : " + Tabname);
						System.out.println("Action       : Doctor tab clicked.");
						Report_Listen.log_print_in_report().info("Doctor tab clicked | Patient: " + Patient_Name + " | Tab: " + Tabname);
						break;
					}
				}

				System.out.println();
				System.out.println("---------------- DOCTOR NAME RETRIEVAL ----------------");
				WebElement Dr_Name_field = p.Doctor_Name_Field();
				String Assigned_Dr_Name = Dr_Name_field.getDomProperty("value");
				System.out.println("Patient     : " + Patient_Name);
				System.out.println("Doctor Name : " + Assigned_Dr_Name);
				Report_Listen.log_print_in_report().info("Doctor name field read | Patient: " + Patient_Name + " | Doctor Name: " + Assigned_Dr_Name);
				
				if(Assigned_Dr_Name == null || Assigned_Dr_Name.trim().matches("(?i)(|[-\\u2013\\u2014]+|none|null|n/?a|not (available|assigned|provided)|unassigned)")){
					System.out.println("Result      : WARNING | Beluga doctor name is unavailable as an exact comparison source.");
					Report_Listen.log_print_in_report().warning("Beluga doctor name unavailable | Patient: " + Patient_Name + " | Actual: " + Assigned_Dr_Name + " | Exact admin doctor comparison cannot be verified.");
				}

				System.out.println();
				System.out.println("Result : Visit navigation and doctor-name retrieval completed.");
				Report_Listen.log_print_in_report().info("Visit navigation and doctor-name retrieval completed | Patient: " + Patient_Name + " | Doctor Name: " + Assigned_Dr_Name);
	
	    
				Dr_network_Accessor("Shared tools","Webhook Sender",d);
	    
				Select Network_Select = new Select(p.network());
				Select Event_Select = new Select(p.Event());
				Select Target_Endpoint_Select = new Select(p.Target_Endpoint());
	    
				Network_Select.selectByVisibleText("Beluga Health");
				Event_Select.selectByVisibleText("Consult concluded");
				Target_Endpoint_Select.selectByVisibleText("My Beluga ( Ayan )");
		
				WebElement Generate=p.Generate_Button();
				rp.movetoelement(Generate);
				Generate.click();
		
				WebElement Payload_TextArea = p.Payload_JSON();
				int Payload_Wait_Time = 30;

				System.out.println();
				System.out.println("---------------- WEBHOOK PAYLOAD ----------------");
				System.out.println("Action         : Waiting for the payload to populate.");
				System.out.println("Timeout Seconds: " + Payload_Wait_Time);
				Report_Listen.log_print_in_report().info("Waiting for webhook payload | Timeout Seconds: " + Payload_Wait_Time);

				String Payload_Value = rp.wait_for_non_empty_textarea_value(Payload_TextArea, Payload_Wait_Time);

				System.out.println("Result         : Payload populated.");
				System.out.println("Payload        : " + Payload_Value);
				Report_Listen.log_print_in_report().info("Webhook payload populated | Payload: " + Payload_Value);

				Map<?,?> Payload_Data = new Json().toType(Payload_Value, Map.class);
				
				Object Payload_Master_ID = Payload_Data.get("masterId");
				
				System.out.println("Expected Master ID : " + Expected_ID);
				System.out.println("Payload Master ID  : " + Payload_Master_ID);
				Report_Listen.log_print_in_report().info("Webhook case verification | Expected Master ID: " + Expected_ID + " | Payload Master ID: " + Payload_Master_ID);
				Assert.assertEquals(Payload_Master_ID, Expected_ID, "Generated webhook targets a different or unidentified treatment case. Send was not clicked.");

				WebElement SendButton = p.Send_Button();
				rp.movetoelement(SendButton);
				SendButton.click();

				System.out.println("Action         : Send button clicked.");
				Report_Listen.log_print_in_report().info("Webhook Send button clicked.");

				System.out.println();
				System.out.println("---------------- WEBHOOK RESPONSE VALIDATION ----------------");
				System.out.println("Patient  : " + Patient_Name);
				System.out.println("Expected : Visible HTTP 200 success result.");
				Report_Listen.log_print_in_report().info("Validating webhook response | Patient: " + Patient_Name + " | Expected: Visible HTTP 200 success result.");

				Boolean Webhook_Success_Visible = p.Webhook_HTTP_200_Success_Visible();

				if(Webhook_Success_Visible){
					System.out.println("Actual   : HTTP 200 success result is visible.");
					System.out.println("Result   : PASS");
					Report_Listen.log_print_in_report().pass("Webhook submission | Patient: " + Patient_Name + " | HTTP 200 success result visible | Result: PASS");
				}
				else{
					System.out.println("Actual   : HTTP 200 success result was not visible within the timeout.");
					System.out.println("Result   : FAIL");
					Report_Listen.log_print_in_report().fail("Webhook submission | Patient: " + Patient_Name + " | HTTP 200 success result was not visible within the timeout | Result: FAIL");
					Assert.fail("Webhook submission failed: HTTP 200 success result was not visible for patient: " + Patient_Name);
				}
				return Assigned_Dr_Name;
			}
			System.out.println("Result           : NO MATCH");
		}

		System.out.println("Result : FAIL | Intended Beluga visit was not found | Patient: " + Patient_Name + " | Expected ID: " + Expected_ID);
		Report_Listen.log_print_in_report().fail("Intended Beluga visit was not found | Patient: " + Patient_Name + " | Expected ID: " + Expected_ID + " | No webhook was sent.");
		throw new IllegalStateException("Intended Beluga visit was not found for patient: " + Patient_Name + " | Expected ID: " + Expected_ID + ". No webhook was sent.");

	}
	

}
