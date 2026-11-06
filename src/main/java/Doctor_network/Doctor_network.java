package Doctor_network;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import AsterMD.Project.AsterMD.Data_Reader;
import Listerners.Report_Listen;
import Locaters.Dr_Network_locaters;
import Locaters.StoreFront_Locaters;
import Repeatative_codes.Repeat;
import Store.Frontend_Store_Front;

public class Doctor_network extends Frontend_Store_Front{
	
	
	
	
	public void Simulator_Accessor() throws IOException, InterruptedException{
		
		
		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Data_Reader f = new Data_Reader();

		String url = f.Data_Fetcher("Simulator_URL");

		d.navigate().to(url);
		Thread.sleep(800);

		p.Landed_in_Simulator();

		System.out.println("Landed in Simulator");
		
		}
	
	
	
	
	public void Dr_network_Accessor(String Network ,String Module) throws IOException, InterruptedException{
		
		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Repeat rp = new Repeat(d);
		
		
		Simulator_Accessor();
		WebElement Navbar= p.Header_Nav_Bar();
		
		List<WebElement> Nav_options= Navbar.findElements(By.xpath(".//a[contains(@class,'nav-link')]"));
		rp.wait_for_theElement(Nav_options);
		
		Super_loop:
		for(WebElement Nav_option:Nav_options){
			
			String option_text=Nav_option.getText().trim();
			
			if(option_text.equalsIgnoreCase(Network)){
				
				Nav_option.click();
				
				WebElement Dropdown_list=p.Dropdown();
				List<WebElement> Dropdown_options= Dropdown_list.findElements(By.xpath(".//a"));
				rp.wait_for_theElement(Dropdown_options);
				
				for(WebElement Dropdown_option:Dropdown_options){
					
					String Dropdown_option_text=Dropdown_option.getText().trim();
					
					if(Dropdown_option_text.equalsIgnoreCase(Module)){
						
						Dropdown_option.click();
						rp.wait_for_invisibilty_of_theElement(Dropdown_list);
						break Super_loop;
					}}}}}
	
	
	
	@Test(dataProvider="Storefront_Product_Data")
	public void beluga_visit_check_and_Authorize(TreeMap<String,String> Data) throws IOException, InterruptedException{
		Dr_Network_locaters p = new Dr_Network_locaters(d);
		Repeat rp = new Repeat(d);
		String Patient_Name = Data.get("First Name") + " " + Data.get("Last Name");

		System.out.println();
		System.out.println("============================================================");
		System.out.println("                 BELUGA VISIT AND DOCTOR DETAILS");
		System.out.println("============================================================");
		System.out.println("Network          : Beluga Health");
		System.out.println("Module           : Visits");
		System.out.println("Expected Patient : " + Patient_Name);
		Report_Listen.log_print_in_report().info("Starting Beluga visit search and doctor-name retrieval | Network: Beluga Health | Module: Visits | Patient: " + Patient_Name);

		Dr_network_Accessor("Beluga Health","Visits");
		WebElement visit_Table = p.Visit_Table();

		System.out.println();
		System.out.println("---------------- PATIENT SEARCH INPUT ----------------");
		WebElement Search_Input = p.Search();
		rp.movetoelement(Search_Input);
		Search_Input.sendKeys(Patient_Name);
		System.out.println("Search Input : " + Patient_Name);
		System.out.println("Action       : Patient name entered in Visits search.");
		Report_Listen.log_print_in_report().info("Visits search input entered | Patient: " + Patient_Name);
		Thread.sleep(500);

		List<WebElement> rows = visit_Table.findElements(By.xpath(".//tr[@class='bl-row-link']"));
		System.out.println();
		System.out.println("---------------- SEARCH RESULTS ----------------");
		System.out.println("Searched Patient        : " + Patient_Name);
		System.out.println("Visit Rows After Search : " + rows.size());
		Report_Listen.log_print_in_report().info("Visits search results retrieved | Patient: " + Patient_Name + " | Visit Rows After Search: " + rows.size());

		for(WebElement row : rows){
			WebElement patient_name_cell = row.findElement(By.xpath(".//td[3]"));
			String patient_name_cell_text = patient_name_cell.getText().trim().split("\\R", 2)[0].trim();
			System.out.println();
			System.out.println("---------------- PATIENT MATCH CHECK ----------------");
			System.out.println("Expected Patient : " + Patient_Name);
			System.out.println("Actual Patient   : " + patient_name_cell_text);

			if(patient_name_cell_text.equalsIgnoreCase(Patient_Name)){
				System.out.println("Result           : MATCH FOUND");
				Report_Listen.log_print_in_report().pass("Matching patient found in Beluga Visits | Expected: " + Patient_Name + " | Actual: " + patient_name_cell_text);
				row.click();
				System.out.println("Action           : Matching visit row clicked.");
				Report_Listen.log_print_in_report().info("Clicked matching visit row | Patient: " + Patient_Name);
				break;
			}

			System.out.println("Result           : NO MATCH");
			Report_Listen.log_print_in_report().info("Visit row does not match the searched patient | Expected: " + Patient_Name + " | Actual: " + patient_name_cell_text);
		}

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
		String Assigned_Dr_Name = Dr_Name_field.getAttribute("value");
		System.out.println("Patient     : " + Patient_Name);
		System.out.println("Doctor Name : " + Assigned_Dr_Name);
		Report_Listen.log_print_in_report().info("Doctor name field read | Patient: " + Patient_Name + " | Doctor Name: " + Assigned_Dr_Name);

		System.out.println();
		System.out.println("Result : Visit navigation and doctor-name retrieval completed.");
		Report_Listen.log_print_in_report().info("Visit navigation and doctor-name retrieval completed | Patient: " + Patient_Name + " | Doctor Name: " + Assigned_Dr_Name);
	}
	

}
