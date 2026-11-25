package Doctor_network;

import java.io.IOException;
import java.util.ArrayList;
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
	
	
	
	

	public String beluga_visit_check_and_Authorize(TreeMap<String,String> Patient_Data, String Case_ID, String Doctor_Name, WebDriver d) throws IOException, InterruptedException{

		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Repeat rp = new Repeat(d);

		String Patient_Name = Patient_Data.get("First Name") + " " + Patient_Data.get("Last Name");
		String Patient_Email = Patient_Data.get("Email");
		String Network = "Beluga Health";
		String Event = "Prescription written";
		String Target_Endpoint = "My Beluga ( Ayan )";

		Assert.assertTrue(Case_ID != null && Case_ID.isBlank() == false, "Admin Case ID is required | Patient: " + Patient_Name);
		String CaseID = Case_ID.trim();

		System.out.println();
		System.out.println("---------------- BELUGA VISIT VERIFICATION ----------------");
		System.out.println("Patient: " + Patient_Name + " | Case ID: " + CaseID);
		Report_Listen.log_print_in_report().info("Searching Beluga Visits | Patient: " + Patient_Name + " | Case ID: " + CaseID);

		Dr_network_Accessor(Network, "Visits", d);
		p.Visit_Table();

		WebElement Search_Input = p.Search();
		rp.movetoelement(Search_Input);
		Search_Input.clear();
		Search_Input.sendKeys(Patient_Name);
		Thread.sleep(800);

		List<WebElement> Rows = p.Visit_Rows();
		Boolean Visit_Rows_Visible = rp.check_element_visibility(Rows, 3);
		Assert.assertTrue(Visit_Rows_Visible == true, "Beluga visit rows did not become visible | Patient: " + Patient_Name);

		Visit_Loop:{

			for(WebElement Row : Rows){

				WebElement Visit_ID_Link = p.Visit_ID_Cell(Row);
				String Actual_ID = Visit_ID_Link.getText().trim();

				if(Actual_ID.contains("..") || Actual_ID.contains("…")){

					Actual_ID = Visit_ID_Link.getDomAttribute("title");

				}

				WebElement Visit_Patient_Cell = Row.findElement(Dr_Network_locaters.Visit_Patient);
				String Actual_Patient_Name = Visit_Patient_Cell.getText().trim().split("\\R", 2)[0].trim();

				if(Actual_Patient_Name.equalsIgnoreCase(Patient_Name) && CaseID.equals(Actual_ID)){

					rp.movetoelement(Row);
					Row.click();

					WebElement Visit_Master_ID_Field = p.Visit_Master_ID();
					String Actual_Master_ID = Visit_Master_ID_Field.getText().trim();
					Assert.assertEquals(Actual_Master_ID, CaseID, "Beluga visit Case ID mismatch.");
					WebElement Visit_Patient_Email_Field = p.Visit_Patient_Email();
					String Actual_Patient_Email = Visit_Patient_Email_Field.getText().trim();
					Assert.assertEquals(Actual_Patient_Email, Patient_Email, "Beluga visit patient email mismatch.");

					System.out.println("Beluga Visit : PASS | Case ID and email verified.");
					Report_Listen.log_print_in_report().pass("Beluga visit verified | Patient: " + Patient_Name + " | Case ID: " + CaseID);
					break Visit_Loop;

				}

			}

			Assert.fail("No Beluga visit matched the patient and Case ID | Patient: " + Patient_Name + " | Case ID: " + CaseID);

		}

		return Webhook_Event_Trigger(Network, Event, Target_Endpoint, CaseID, Patient_Name, Doctor_Name, d);

	}

	public String Webhook_Event_Trigger(String Network, String Event, String Target_Endpoint, String Case_ID, String Patient_Name, String Doctor_Name, WebDriver d) throws IOException, InterruptedException{

		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Repeat rp = new Repeat(d);
		Json Payload_Json = new Json();
		List<Object> Payload_Items = new ArrayList<Object>();

		Assert.assertTrue(Case_ID != null && Case_ID.isBlank() == false, "Case ID is required for the webhook | Event: " + Event);
		String CaseID = Case_ID.trim();
		String Webhook_Scenario = "Network: " + Network + " | Event: " + Event + " | Endpoint: " + Target_Endpoint + " | Patient: " + Patient_Name + " | Case ID: " + CaseID;

		System.out.println();
		System.out.println("---------------- WEBHOOK EVENT TRIGGER ----------------");
		System.out.println(Webhook_Scenario);
		Report_Listen.log_print_in_report().info("Generating webhook payload | " + Webhook_Scenario);

		Dr_network_Accessor("Shared tools", "Webhook Sender", d);

		WebElement Network_Dropdown = p.network();
		Select Network_Select = new Select(Network_Dropdown);
		Network_Select.selectByVisibleText(Network);
		WebElement Event_Dropdown = p.Event();
		Select Event_Select = new Select(Event_Dropdown);
		Event_Select.selectByVisibleText(Event);
		WebElement Target_Endpoint_Dropdown = p.Target_Endpoint();
		Select Target_Endpoint_Select = new Select(Target_Endpoint_Dropdown);
		Target_Endpoint_Select.selectByVisibleText(Target_Endpoint);

		WebElement Generate = p.Generate_Button();
		rp.movetoelement(Generate);
		Generate.click();

		WebElement Payload_TextArea = p.Payload_JSON();
		String Payload_Value = rp.wait_for_non_empty_textarea_value(Payload_TextArea, 30);
		Object Payload_Data = Payload_Json.toType(Payload_Value, Json.OBJECT_TYPE);
		String Original_Payload = Payload_Json.toJson(Payload_Data);

		Boolean Override_Doctor = Doctor_Name != null && Doctor_Name.isBlank() == false && Doctor_Name.trim().equalsIgnoreCase("N/A") == false;
		String Payload_Case_ID = "";
		String Payload_Doctor_Name = "";

		Payload_Items.add(Payload_Data);

		for(int i=0; i<Payload_Items.size(); i++){

			Object Payload_Item = Payload_Items.get(i);

			if(Payload_Item instanceof Map<?,?> Payload_Object){

				@SuppressWarnings("unchecked")
				Map<String,Object> Payload_Fields = (Map<String,Object>) Payload_Object;

				if(Payload_Fields.containsKey("masterId")){

					Payload_Fields.put("masterId", CaseID);
					Payload_Case_ID = CaseID;

				}

				if(Override_Doctor == true && Payload_Fields.containsKey("docName")){

					Payload_Fields.put("docName", Doctor_Name.trim());

				}

				if(Payload_Fields.get("docName") instanceof String Doctor_Text && Doctor_Text.isBlank() == false){

					Assert.assertTrue(Payload_Doctor_Name.isBlank() || Payload_Doctor_Name.equals(Doctor_Text), "Webhook payload contains different doctor names.");
					Payload_Doctor_Name = Doctor_Text;

				}

				Payload_Items.addAll(Payload_Fields.values());

			}
			else if(Payload_Item instanceof List<?> Payload_Array){

				Payload_Items.addAll(Payload_Array);

			}

		}

		Assert.assertEquals(Payload_Case_ID, CaseID, "Generated webhook payload is missing masterId | " + Webhook_Scenario);

		Boolean Beluga_Prescription_Written = Network.equalsIgnoreCase("Beluga Health") && Event.equalsIgnoreCase("Prescription written");

		if(Beluga_Prescription_Written == true && Override_Doctor == true){

			Assert.assertEquals(Payload_Doctor_Name, Doctor_Name.trim(), "Generated Prescription written payload is missing docName.");

		}

		String Updated_Payload = Payload_Json.toJson(Payload_Data);

		if(Updated_Payload.equals(Original_Payload) == false){

			Payload_TextArea.clear();
			Payload_TextArea.sendKeys(Updated_Payload);

		}

		Object Actual_Payload = Payload_Json.toType(Payload_TextArea.getDomProperty("value"), Json.OBJECT_TYPE);
		Assert.assertTrue(Payload_Data.equals(Actual_Payload), "The webhook textarea did not retain the verified payload.");

		System.out.println("Webhook Payload | Case ID: " + Payload_Case_ID + " | docName: " + Payload_Doctor_Name);
		Report_Listen.log_print_in_report().info("Verified webhook payload | Case ID: " + Payload_Case_ID + " | docName: " + Payload_Doctor_Name);

		WebElement Send_Button = p.Send_Button();
		rp.movetoelement(Send_Button);
		Send_Button.click();

		Boolean Webhook_Success_Visible = p.Webhook_HTTP_200_Success_Visible();
		Assert.assertTrue(Webhook_Success_Visible, "Webhook did not return a visible HTTP 200 result | " + Webhook_Scenario);

		System.out.println("Webhook : PASS | HTTP 200 | " + Webhook_Scenario);
		Report_Listen.log_print_in_report().pass("Webhook returned HTTP 200 | " + Webhook_Scenario + " | docName: " + Payload_Doctor_Name);

		return Payload_Doctor_Name;

	}

}
