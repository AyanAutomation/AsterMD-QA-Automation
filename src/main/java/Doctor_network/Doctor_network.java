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

		System.out.println();
		System.out.println("============================================================");
		System.out.println("                 BELUGA VISIT PATIENT NAMES");
		System.out.println("============================================================");
		System.out.println("Network : Beluga Health");
		System.out.println("Module  : Visits");
		Report_Listen.log_print_in_report().info("Starting patient-name retrieval | Network: Beluga Health | Module: Visits");

		Dr_network_Accessor("Beluga Health","Visits");
		WebElement visit_Table = p.Visit_Table();
		List<WebElement> rows = visit_Table.findElements(By.xpath(".//tr[@class='bl-row-link']"));

		System.out.println("Total Visit Rows : " + rows.size());
		Report_Listen.log_print_in_report().info("Beluga Visits table accessed | Total Visit Rows: " + rows.size());

		for(WebElement row : rows){
			WebElement patient_name_cell = row.findElement(By.xpath(".//td[3]"));
			String patient_name_cell_text = patient_name_cell.getText().trim().split("\\R", 2)[0].trim();
			System.out.println();
			System.out.println("Patient Name : " + patient_name_cell_text);
			Report_Listen.log_print_in_report().info("Patient Name: " + patient_name_cell_text);
		}

		System.out.println();
		System.out.println("Result : Patient-name retrieval completed.");
		Report_Listen.log_print_in_report().info("Patient-name retrieval completed | Total Visit Rows: " + rows.size());
	}
	

}
