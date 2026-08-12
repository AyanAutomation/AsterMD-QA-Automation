package AsterMD.Project.AsterMD;

import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Listerners.Report_Listen;
import Locaters.Channel_Module_Locaters;
import Repeatative_codes.Repeat;
import Locaters.Channel_Module_Locaters;

public class Channels_Module extends Patient_Module{
	
	public WebElement Channel_Module_Accessor() throws Exception {

		Channel_Module_Locaters p = new Channel_Module_Locaters(d);

		try {

			Report_Listen.log_print_in_report().info("──────────────────── 👥 Channel MODULE ACCESS ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the Channels module through the application Side Menu.");

			System.out.println("👥 Channel MODULE ACCESS");
			System.out.println();

			System.out.println("🔹 Navigating to the Channels module through the Side Menu.");
			System.out.println();

			Side_Menu_Navigation("Channels");

			Report_Listen.log_print_in_report().pass("✅ Channels module navigation completed successfully.");
			System.out.println("✅ Channels module navigation completed successfully.");
			System.out.println();

			Report_Listen.log_print_in_report().info("──────────────────── ➕ Channel ADD ACCESS ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve the Channel Add button from the Channels module.");

			System.out.println("➕ Channel ADD ACCESS");
			System.out.println();

			System.out.println("🔹 Retrieving the Channel Add button.");
			System.out.println();

			WebElement Add_Button = p.Channel_Add_Button();

			Report_Listen.log_print_in_report().pass("✅ Channel Add button retrieved successfully.");
			System.out.println("✅ Channel Add button retrieved successfully.");
			System.out.println();

			return Add_Button;

		} catch(Exception e) {

			if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Channel Module access failed. Failure reason: " + e.getMessage());

			System.out.println("❌ Channel Module access failed.");
			System.out.println();

			System.out.println("❌ Failure reason: " + e.getMessage());
			System.out.println();

			throw e;
		}
	}
	
	
	
@DataProvider
public Object[][] Channel_Create_Data() {

	TreeMap<String, String> data1 = new TreeMap<String, String>();
	data1.put("Channel Name", "RheinCare Public API");
	data1.put("Access Rule", "Allow access from any IP address");
	data1.put("API Contact Email", "rheincare.public.api@yopmail.com");

	TreeMap<String, String> data2 = new TreeMap<String, String>();
	data2.put("Channel Name", "RheinCare Partner Integration API");
	data2.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data2.put("Whitelist IP Address 1", "192.0.2.10");
	data2.put("Whitelist IP Address 2", "198.51.100.25");
	data2.put("Whitelist IP Address 3", "203.0.113.15");
	data2.put("Whitelist IP Address 4", "192.0.2.26");
	data2.put("Whitelist IP Address 5", "198.51.100.37");
	data2.put("Whitelist IP Address 6", "203.0.113.48");
	data2.put("Whitelist IP Address 7", "192.0.2.59");
	data2.put("Whitelist IP Address 8", "198.51.100.70");
	data2.put("Whitelist IP Address 9", "203.0.113.81");
	data2.put("Whitelist IP Address 10", "192.0.2.92");
	data2.put("Whitelist IP Address 11", "198.51.100.103");
	data2.put("Whitelist IP Address 12", "203.0.113.114");
	data2.put("API Contact Email", "rheincare.partner.integration@yopmail.com");

	TreeMap<String, String> data3 = new TreeMap<String, String>();
	data3.put("Channel Name", "RheinCare Mobile App API");
	data3.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data3.put("Whitelist IP Address 1", "203.0.113.50");
	data3.put("Whitelist IP Address 2", "203.0.113.51");
	data3.put("Whitelist IP Address 3", "203.0.113.52");
	data3.put("Whitelist IP Address 4", "203.0.113.53");
	data3.put("Whitelist IP Address 5", "203.0.113.54");
	data3.put("Whitelist IP Address 6", "203.0.113.55");
	data3.put("Whitelist IP Address 7", "203.0.113.56");
	data3.put("Whitelist IP Address 8", "203.0.113.57");
	data3.put("Whitelist IP Address 9", "203.0.113.58");
	data3.put("Whitelist IP Address 10", "203.0.113.59");
	data3.put("Whitelist IP Address 11", "203.0.113.60");
	data3.put("Whitelist IP Address 12", "203.0.113.61");
	data3.put("API Contact Email", "rheincare.mobile.app@yopmail.com");

	TreeMap<String, String> data4 = new TreeMap<String, String>();
	data4.put("Channel Name", "RheinCare Web Portal API");
	data4.put("Access Rule", "Allow access from any IP address");
	data4.put("API Contact Email", "rheincare.web.portal@yopmail.com");

	TreeMap<String, String> data5 = new TreeMap<String, String>();
	data5.put("Channel Name", "RheinCare Telehealth API");
	data5.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data5.put("Whitelist IP Address 1", "192.0.2.0/28");
	data5.put("Whitelist IP Address 2", "198.51.100.0/30");
	data5.put("Whitelist IP Address 3", "203.0.113.0/29");
	data5.put("Whitelist IP Address 4", "192.0.2.32/28");
	data5.put("Whitelist IP Address 5", "198.51.100.32/29");
	data5.put("Whitelist IP Address 6", "203.0.113.32/28");
	data5.put("Whitelist IP Address 7", "192.0.2.64/29");
	data5.put("Whitelist IP Address 8", "198.51.100.64/28");
	data5.put("Whitelist IP Address 9", "203.0.113.64/30");
	data5.put("Whitelist IP Address 10", "192.0.2.96/28");
	data5.put("Whitelist IP Address 11", "198.51.100.96/29");
	data5.put("Whitelist IP Address 12", "203.0.113.96/28");
	data5.put("API Contact Email", "rheincare.telehealth@yopmail.com");

	TreeMap<String, String> data6 = new TreeMap<String, String>();
	data6.put("Channel Name", "RheinCare Internal Services API");
	data6.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data6.put("Whitelist IP Address 1", "2001:db8:100::10");
	data6.put("Whitelist IP Address 2", "2001:db8:100::11");
	data6.put("Whitelist IP Address 3", "2001:db8:100::12");
	data6.put("Whitelist IP Address 4", "2001:db8:100::13");
	data6.put("Whitelist IP Address 5", "2001:db8:100::14");
	data6.put("Whitelist IP Address 6", "2001:db8:100::15");
	data6.put("Whitelist IP Address 7", "2001:db8:100::16");
	data6.put("Whitelist IP Address 8", "2001:db8:100::17");
	data6.put("Whitelist IP Address 9", "2001:db8:100::18");
	data6.put("Whitelist IP Address 10", "2001:db8:100::19");
	data6.put("Whitelist IP Address 11", "2001:db8:100::20");
	data6.put("Whitelist IP Address 12", "2001:db8:100::21");
	data6.put("API Contact Email", "rheincare.internal.services@yopmail.com");

	TreeMap<String, String> data7 = new TreeMap<String, String>();
	data7.put("Channel Name", "RheinCare Analytics API");
	data7.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data7.put("Whitelist IP Address 1", "2001:db8:200::/64");
	data7.put("Whitelist IP Address 2", "192.0.2.128/29");
	data7.put("Whitelist IP Address 3", "198.51.100.128/28");
	data7.put("Whitelist IP Address 4", "203.0.113.128/29");
	data7.put("Whitelist IP Address 5", "2001:db8:201::/64");
	data7.put("Whitelist IP Address 6", "192.0.2.144/28");
	data7.put("Whitelist IP Address 7", "198.51.100.144/29");
	data7.put("Whitelist IP Address 8", "203.0.113.144/28");
	data7.put("Whitelist IP Address 9", "2001:db8:202::/64");
	data7.put("Whitelist IP Address 10", "192.0.2.160/29");
	data7.put("Whitelist IP Address 11", "198.51.100.160/28");
	data7.put("Whitelist IP Address 12", "203.0.113.160/29");
	data7.put("API Contact Email", "rheincare.analytics@yopmail.com");

	TreeMap<String, String> data8 = new TreeMap<String, String>();
	data8.put("Channel Name", "RheinCare Doctor Network API");
	data8.put("Access Rule", "Allow access from any IP address");
	data8.put("API Contact Email", "rheincare.doctor.network@yopmail.com");

	TreeMap<String, String> data9 = new TreeMap<String, String>();
	data9.put("Channel Name", "RheinCare Order Management API");
	data9.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data9.put("Whitelist IP Address 1", "198.51.100.80");
	data9.put("Whitelist IP Address 2", "198.51.100.81");
	data9.put("Whitelist IP Address 3", "198.51.100.82");
	data9.put("Whitelist IP Address 4", "2001:db8:300::20");
	data9.put("Whitelist IP Address 5", "192.0.2.180");
	data9.put("Whitelist IP Address 6", "203.0.113.181");
	data9.put("Whitelist IP Address 7", "198.51.100.182");
	data9.put("Whitelist IP Address 8", "2001:db8:300::21");
	data9.put("Whitelist IP Address 9", "192.0.2.183");
	data9.put("Whitelist IP Address 10", "203.0.113.184");
	data9.put("Whitelist IP Address 11", "198.51.100.185");
	data9.put("Whitelist IP Address 12", "2001:db8:300::22");
	data9.put("API Contact Email", "rheincare.order.management@yopmail.com");

	TreeMap<String, String> data10 = new TreeMap<String, String>();
	data10.put("Channel Name", "RheinCare Secure Client API");
	data10.put("Access Rule", "Allow access from whitelisted IP addresses only");
	data10.put("Whitelist IP Address 1", "192.0.2.200");
	data10.put("Whitelist IP Address 2", "192.0.2.201");
	data10.put("Whitelist IP Address 3", "203.0.113.0/29");
	data10.put("Whitelist IP Address 4", "2001:db8:400::/64");
	data10.put("Whitelist IP Address 5", "198.51.100.202");
	data10.put("Whitelist IP Address 6", "203.0.113.203");
	data10.put("Whitelist IP Address 7", "192.0.2.204");
	data10.put("Whitelist IP Address 8", "2001:db8:401::/64");
	data10.put("Whitelist IP Address 9", "198.51.100.205");
	data10.put("Whitelist IP Address 10", "203.0.113.206");
	data10.put("Whitelist IP Address 11", "192.0.2.207");
	data10.put("Whitelist IP Address 12", "2001:db8:402::/64");
	data10.put("API Contact Email", "rheincare.secure.client@yopmail.com");

	return new Object[][] {
		{ data1 },
		{ data2 },
		{ data3 },
		{ data4 },
		{ data5 },
		{ data6 },
		{ data7 },
		{ data8 },
		{ data9 },
		{ data10 } 
	};
}	
	
	
	
@Test(dataProvider="Channel_Create_Data")
public void Channel_Add(TreeMap<String, String> Channel_data) throws Exception{
		
	Channel_Module_Locaters p = new Channel_Module_Locaters(d);
	Repeat rp = new Repeat(d);
		
	String Channel_Name = Channel_data.get("Channel Name");
	String Access_Rule = Channel_data.get("Access Rule");
	String API_Contact_Mail = Channel_data.get("API Contact Email");
	
	
		
	WebElement Channel_Add_Button = Channel_Module_Accessor();
	Channel_Add_Button.click();	
	
	WebElement Popup = p.Popup_Modal();
	List<WebElement> Cards = Popup.findElements(By.xpath(".//*[contains(@class,'_channelTypeCard')]"));
	WebElement API_Channel = Cards.get(0);
	API_Channel.click();
	
	WebElement Next_Button = p.Next_Button();
	rp.movetoelement(Next_Button);
	Next_Button.click();
	
	WebElement Channel_Form = p.Popup_Form();
	List<WebElement> Inputs;

	try {
		Inputs = p.Channel_Add_Form_Inputs(Channel_Form);
	} 
	catch(Exception e) {
		Thread.sleep(800);

		Report_Listen.log_print_in_report().warning("⚠️ Initial Channel form input retrieval failed. Retrying field retrieval.");

		System.out.println("⚠️ Initial Channel form input retrieval failed. Retrying.");
		System.out.println();

		Inputs = p.Channel_Add_Form_Inputs(Channel_Form);
	}
	
	WebElement Channel_Name_Input_Field = Inputs.get(0);
	Channel_Name_Input_Field.sendKeys(Channel_Name);
	
	
	
	if(Channel_data.containsKey("Whitelist IP Address 1")&&Access_Rule.contains("Allow access from whitelisted IP addresses only")){
		
		
		int Whitelist_IP_Count = 0;
		
		for(String Key : Channel_data.keySet()) {
			if(Key.contains("Whitelist IP Address")) {
				Whitelist_IP_Count++;
			}
		}
		
		
		System.out.println("Total IP Indexes: " + Whitelist_IP_Count);
		
		WebElement Whitelist_IP_Addresses_Input_Field = Inputs.get(1);
		
		for(int i=1;i<=Whitelist_IP_Count;i++) {
			
			String Ip_Address = Channel_data.get("Whitelist IP Address " + i);
			
			Whitelist_IP_Addresses_Input_Field.sendKeys(Ip_Address);
			Whitelist_IP_Addresses_Input_Field.sendKeys(Keys.ENTER);
			
			System.out.println("Whitelist IP Address " + i + ": " + Ip_Address);}}
	
	if(Access_Rule.contains("Allow access from any IP address")){
		
		WebElement Allow_Any_Ip= p.Allow_Any_IP_Radio_Button();
		rp.movetoelement(Allow_Any_Ip);
		Allow_Any_Ip.click();}
	
	WebElement Submit_Button = p.Next_Button();
	Submit_Button.click();
	WebElement Generate_Button= p.Generate_API_Token_Button();
	rp.movetoelement(Generate_Button);
	Generate_Button.click();
	WebElement ClientIdLabel= p.CLient_Id_Label();
	WebElement Client_Id_Label_Value = ClientIdLabel.findElement(By.xpath("./../..//input"));
	rp.wait_for_theElement(Client_Id_Label_Value);
	String Client_Id = Client_Id_Label_Value.getAttribute("value");
	System.out.println("Client_Id : " + Client_Id);
	System.out.println();
	WebElement API_Mail_Input = p.API_Contact_Mail_input();
	API_Mail_Input.sendKeys(API_Contact_Mail);
	p.Done_Button().click();
	WebElement Confirmation_Message = p.Success_Toast();
	String Confirmation_Message_Text = Confirmation_Message.getText().trim();

	Report_Listen.log_print_in_report().pass("✅ Confirmation Message: " + Confirmation_Message_Text);
	System.out.println("✅ Confirmation message displayed: " + Confirmation_Message_Text);
	System.out.println();

	Report_Listen.log_print_in_report().pass("✅ Channel creation completed successfully for Product: " + Channel_Name);
	System.out.println("✅ Channel creation completed successfully for Product: " + Channel_Name);
	System.out.println();
	List<WebElement> Card_texts=p.First_channel_card_text_in_list();
	boolean Channel_Found = false;
	for(WebElement Card_text:Card_texts){
		
		String Text = Card_text.getText().trim();
		Channel_Found = Text.contains(Channel_Name) ? true : Channel_Found;
		
	}

	String Verification_Message = Channel_Found ? "✅ Newly created Channel found in the Channel list: " + Channel_Name : "❌ Newly created Channel was not found in the Channel list: " + Channel_Name;

	Report_Listen.log_print_in_report().log(Channel_Found ? Status.PASS : Status.FAIL, Verification_Message);
	System.out.println(Verification_Message);
	System.out.println();

	
}

 






}
