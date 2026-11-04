package AsterMD.Project.AsterMD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Listerners.Report_Listen;
import Locaters.Settings_Module_Locater;
import Repeatative_codes.Repeat;

public class Settings_Module extends Product_Module{
	
	

	public void Settings_Module_Accessor() throws Exception {

		Settings_Module_Locater p = new Settings_Module_Locater(d);

		System.out.println();
		System.out.println("---------------- CHANNEL MODULE ----------------");
		System.out.println("Action : Open Channels module");

		Report_Listen.log_print_in_report().info("---------------- CHANNEL MODULE ----------------");
		Report_Listen.log_print_in_report().info("Action: Open Channels module");

		Side_Menu_Navigation("Settings");

	}
		
	
	
	public void Settings_Sub_Module_Accessor(String Sub_Mod_name){
		
		
		Settings_Module_Locater p = new Settings_Module_Locater(d);
		Repeat rp = new Repeat(d);
		
         WebElement SubMenu =p.Submenu();
      
         List<WebElement> Submenu_Options=SubMenu.findElements(By.xpath(".//li"));
         Boolean Submenu_found=rp.check_element_visibility(SubMenu, 3);
         if(Submenu_found){
        	 
        	 for(WebElement Submenu_Option:Submenu_Options){
        		 
        		 String Text=Submenu_Option.getText().trim();
        		 
        		 
        		 if(Text.equalsIgnoreCase(Sub_Mod_name)){
        			 
        			 Submenu_Option.click();
        			 break;
        			 
        		 }}}}
	
	
	
	
	     public void Extension_Id_Configure() throws Exception{
		
		
	    	 Settings_Module_Accessor();
	    	 Settings_Sub_Module_Accessor("Extensions");
		
		
		
		
		
		
	}
	

}
