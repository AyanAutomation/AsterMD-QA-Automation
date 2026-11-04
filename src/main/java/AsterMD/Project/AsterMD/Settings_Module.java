package AsterMD.Project.AsterMD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Listerners.Report_Listen;
import Locaters.Channel_Module_Locaters;
import Locaters.Settings_Module_Locater;
import Repeatative_codes.Repeat;

public class Settings_Module extends Product_Module{

	public void Settings_Module_Accessor() throws Exception{

		System.out.println();
		System.out.println("---------------- SETTINGS MODULE ----------------");
		System.out.println("Action : Open Settings module.");

		Report_Listen.log_print_in_report().info("Opening Settings module.");

		Side_Menu_Navigation("Settings");

		System.out.println("Result : Settings module opened.");

		Report_Listen.log_print_in_report().info("Settings module opened.");
	}

	public void Settings_Sub_Module_Accessor(String Sub_Mod_name){

		Settings_Module_Locater p = new Settings_Module_Locater(d);
		Repeat rp = new Repeat(d);

		WebElement SubMenu = p.Submenu();
		List<WebElement> Submenu_Options = SubMenu.findElements(By.xpath(".//li"));

		System.out.println();
		System.out.println("---------------- SETTINGS SUBMODULE ----------------");
		System.out.println("Expected Submodule : " + Sub_Mod_name);

		for(WebElement Submenu_Option : Submenu_Options){

			String Text = Submenu_Option.getText().trim();

			if(Text.equalsIgnoreCase(Sub_Mod_name)){

				rp.movetoelement(Submenu_Option);
				Submenu_Option.click();

				System.out.println("Actual Submodule   : " + Text);
				System.out.println("Action             : Submodule selected.");

				Report_Listen.log_print_in_report().info("Settings submodule selected | Expected: " + Sub_Mod_name + " | Actual: " + Text);

				break;
			}
		}
	}

	
	
	
	@Test
	public void Extension_Id_Configure() throws Exception{

		Settings_Module_Locater p = new Settings_Module_Locater(d);
		Repeat rp = new Repeat(d);
		Assertion Assert_Check = new Assertion();
		Channel_Module_Locaters cp = new Channel_Module_Locaters(d);

		String Extension_Name = "Identity Verification";
		String Expected_Verification_Form = "ID Verification";

		System.out.println();
		System.out.println("============================================================");
		System.out.println("          IDENTITY VERIFICATION EXTENSION CONFIGURATION");
		System.out.println("============================================================");
		System.out.println("Extension            : " + Extension_Name);
		System.out.println("Verification Process : Verify in Patient Portal");
		System.out.println("ID Upload            : Checked");
		System.out.println("SSN Input            : Checked");
		System.out.println("Verification Form    : " + Expected_Verification_Form);

		Report_Listen.log_print_in_report().info("Verifying Identity Verification settings | Process: Verify in Patient Portal | ID Upload: Checked | SSN Input: Checked | Verification Form: " + Expected_Verification_Form);

		Settings_Module_Accessor();
		Settings_Sub_Module_Accessor("Extensions");
		p.Landed_in_extension_Module();
        Thread.sleep(800);
		List<WebElement> Cards = p.Cards();

		for(WebElement Card : Cards){

			String Card_Text = Card.findElement(By.xpath(".//h3")).getText().trim();

			if(Card_Text.equalsIgnoreCase(Extension_Name)){

				WebElement Settings_Button = Card.findElement(By.xpath(".//button[contains(@class,'ant-btn-color-default') and contains(@class,'ant-btn-variant-outlined')]"));
				rp.wait_for_theElement(Settings_Button);
				rp.movetoelement(Settings_Button);
				Settings_Button.click();

				System.out.println();
				System.out.println("---------------- EXTENSION SETTINGS ----------------");
				System.out.println("Expected Extension : " + Extension_Name);
				System.out.println("Actual Extension   : " + Card_Text);
				System.out.println("Action             : Settings button clicked.");

				Report_Listen.log_print_in_report().info("Extension settings opened | Expected: " + Extension_Name + " | Actual: " + Card_Text);

				break;
			}
		}

		WebElement Form = p.Popup_Form();

		WebElement Patient_Portal_Radio = p.Verify_in_Patient_Portal_Radio();
		Boolean Patient_Portal_Checked = Patient_Portal_Radio.isSelected();

		if(Patient_Portal_Checked && p.ID_Upload_Checkbox().isSelected() && p.SSN_Input_Checkbox().isSelected() && p.Verification_Form_Dropdown().getText().trim().equals(Expected_Verification_Form)){

			System.out.println();
			System.out.println("---------------- EXISTING CONFIGURATION ----------------");
			System.out.println("Verification Process : Verify in Patient Portal");
			System.out.println("ID Upload            : Checked");
			System.out.println("SSN Input            : Checked");
			System.out.println("Verification Form    : " + Expected_Verification_Form);
			System.out.println("Action               : All settings already match. Closing with Cancel.");

			Report_Listen.log_print_in_report().info("All Identity Verification settings already match | Action: Click Cancel | Save: Skipped");

			WebElement Cancel_Button = p.Cancel_Button();
			rp.movetoelement(Cancel_Button);
			Cancel_Button.click();

			rp.wait_for_invisibilty_of_theElement(Form);

			System.out.println("Popup                : Closed");
			System.out.println("Result               : PASS");

			Report_Listen.log_print_in_report().pass("Identity Verification configuration is correct | Process: Verify in Patient Portal | ID Upload: Checked | SSN Input: Checked | Verification Form: " + Expected_Verification_Form + " | Popup closed using Cancel | Result: PASS");
		}
		else{

			System.out.println();
			System.out.println("---------------- VERIFICATION PROCESS ----------------");
			System.out.println("Expected : Verify in Patient Portal");
			System.out.println("Checked  : " + Patient_Portal_Checked);

			if(Patient_Portal_Checked){

				System.out.println("Action   : Verify in Patient Portal is already selected.");

				Report_Listen.log_print_in_report().info("Verify in Patient Portal | Already selected.");
			}
			else{

				WebElement Patient_Portal_Option = p.Verify_in_Patient_Portal_Option();
				rp.movetoelement(Patient_Portal_Option);
				Patient_Portal_Option.click();

				System.out.println("Action   : Verify in Patient Portal selected.");

				Report_Listen.log_print_in_report().info("Verification process updated | Selected: Verify in Patient Portal");
			}

			WebElement ID_Upload_Checkbox = p.ID_Upload_Checkbox();
			Boolean ID_Upload_Checked = ID_Upload_Checkbox.isSelected();

			System.out.println();
			System.out.println("---------------- ID UPLOAD ----------------");
			System.out.println("Expected : Checked");
			System.out.println("Checked  : " + ID_Upload_Checked);

			if(ID_Upload_Checked){

				System.out.println("Action   : ID Upload is already checked.");

				Report_Listen.log_print_in_report().info("ID Upload | Already checked.");
			}
			else{

				WebElement ID_Upload_Option = p.ID_Upload_Option();
				rp.movetoelement(ID_Upload_Option);
				ID_Upload_Option.click();

				System.out.println("Action   : ID Upload checked.");

				Report_Listen.log_print_in_report().info("ID Upload | Action: Checked.");
			}

			WebElement SSN_Input_Checkbox = p.SSN_Input_Checkbox();
			Boolean SSN_Input_Checked = SSN_Input_Checkbox.isSelected();

			System.out.println();
			System.out.println("---------------- SSN INPUT ----------------");
			System.out.println("Expected : Checked");
			System.out.println("Checked  : " + SSN_Input_Checked);

			if(SSN_Input_Checked){

				System.out.println("Action   : SSN Input is already checked.");

				Report_Listen.log_print_in_report().info("SSN Input | Already checked.");
			}
			else{

				WebElement SSN_Input_Option = p.SSN_Input_Option();
				rp.movetoelement(SSN_Input_Option);
				SSN_Input_Option.click();

				System.out.println("Action   : SSN Input checked.");

				Report_Listen.log_print_in_report().info("SSN Input | Action: Checked.");
			}

			WebElement Verification_Form_Dropdown = p.Verification_Form_Dropdown();
			String Current_Verification_Form = Verification_Form_Dropdown.getText().trim();

			System.out.println();
			System.out.println("---------------- VERIFICATION FORM ----------------");
			System.out.println("Expected : " + Expected_Verification_Form);
			System.out.println("Actual   : " + Current_Verification_Form);

			if(Current_Verification_Form.equals(Expected_Verification_Form)){

				System.out.println("Action   : ID Verification is already selected.");

				Report_Listen.log_print_in_report().info("Verification Form | Expected: " + Expected_Verification_Form + " | Actual: " + Current_Verification_Form + " | Already selected.");
			}
			else{

				rp.movetoelement(Verification_Form_Dropdown);
				Verification_Form_Dropdown.click();

				WebElement Verification_Form_Search = p.Verification_Form_Search();
				Verification_Form_Search.clear();
				Verification_Form_Search.sendKeys(Expected_Verification_Form);
				Thread.sleep(800);
				Boolean List_Presence = rp.check_element_visibility(cp.First_Virtual_List_holder, 3);

			if(List_Presence) {	
		   		
				WebElement Verification_Form_List=cp.First_Virtual_List_holder;
				List<WebElement> Form_Options = Verification_Form_List.findElements(By.xpath(".//div[contains(@class,'ant-select-item ant-select-item-option ant-select-item-option-')]"));
                rp.wait_for_theElement(Form_Options);
				for(WebElement Form_Option : Form_Options){

					String Option_Text = Form_Option.getText().trim();

					if(Option_Text.equals(Expected_Verification_Form)){

						rp.movetoelement(Form_Option);
						Form_Option.click();

						System.out.println("Action   : " + Option_Text + " selected.");

						Report_Listen.log_print_in_report().info("Verification Form updated | Selected: " + Option_Text);

						break;
					}
				}
			}
			}
			Boolean Actual_Patient_Portal_Checked = p.Verify_in_Patient_Portal_Radio().isSelected();
			Boolean Actual_ID_Upload_Checked = p.ID_Upload_Checkbox().isSelected();
			Boolean Actual_SSN_Input_Checked = p.SSN_Input_Checkbox().isSelected();
			String Actual_Verification_Form = p.Verification_Form_Dropdown().getText().trim();

			System.out.println();
			System.out.println("---------------- VERIFY UPDATED SETTINGS ----------------");
			System.out.println("Verify in Patient Portal | Expected: true | Actual: " + Actual_Patient_Portal_Checked);
			System.out.println("ID Upload                | Expected: true | Actual: " + Actual_ID_Upload_Checked);
			System.out.println("SSN Input                | Expected: true | Actual: " + Actual_SSN_Input_Checked);
			System.out.println("Verification Form        | Expected: " + Expected_Verification_Form + " | Actual: " + Actual_Verification_Form);

			Report_Listen.log_print_in_report().info("Updated settings | Patient Portal: " + Actual_Patient_Portal_Checked + " | ID Upload: " + Actual_ID_Upload_Checked + " | SSN Input: " + Actual_SSN_Input_Checked + " | Verification Form: " + Actual_Verification_Form);

			Assert_Check.assertTrue(Actual_Patient_Portal_Checked, "Verify in Patient Portal should be selected before saving.");
			Assert_Check.assertTrue(Actual_ID_Upload_Checked, "ID Upload should be checked before saving.");
			Assert_Check.assertTrue(Actual_SSN_Input_Checked, "SSN Input should be checked before saving.");
			Assert_Check.assertEquals(Actual_Verification_Form, Expected_Verification_Form, "Verification Form should be ID Verification before saving.");

			WebElement Save_Settings_Button = p.Save_Button();
			rp.movetoelement(Save_Settings_Button);
			Save_Settings_Button.click();

			System.out.println();
			System.out.println("---------------- SAVE IDENTITY VERIFICATION SETTINGS ----------------");
			System.out.println("Action : Save Settings button clicked.");

			Report_Listen.log_print_in_report().info("Save Settings clicked after correcting and verifying the Identity Verification configuration.");

			WebElement Confirmation_Message = p.Success_Toast();
			String Confirmation_Message_Text = Confirmation_Message.getText().trim();

			rp.wait_for_invisibilty_of_theElement(Form);

			System.out.println("Message : " + Confirmation_Message_Text);
			System.out.println("Popup   : Closed");
			System.out.println("Result  : PASS");

			Report_Listen.log_print_in_report().info("Identity Verification settings confirmation | Message: " + Confirmation_Message_Text);
			Report_Listen.log_print_in_report().pass("Identity Verification settings saved | Process: Verify in Patient Portal | ID Upload: Checked | SSN Input: Checked | Verification Form: " + Actual_Verification_Form + " | Popup closed | Result: PASS");
		}
	}
}
