package AsterMD.Project.AsterMD;

import java.util.List;

import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;

import Listerners.Report_Listen;
import Locaters.Side_menu_locaters;

public class Side_Menu_Navigator extends Login{
	
	
public void Side_Menu_Navigation(String menu_option) throws Exception {

	Side_menu_locaters p = new Side_menu_locaters(d);

	try {

		Report_Listen.log_print_in_report().info("──────────────────── 🧭 SIDE MENU NAVIGATION ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Navigate to the requested Side Menu option = " + menu_option);

		System.out.println("🧭 SIDE MENU NAVIGATION");
		System.out.println();

		System.out.println("🔹 Requested Side Menu option: " + menu_option);
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 🔎 SESSION & SIDE MENU CHECK ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Perform a short Side Menu visibility check to determine whether an authenticated session is already available.");

		System.out.println("🔎 SESSION & SIDE MENU CHECK");
		System.out.println();

		System.out.println("🔹 Checking whether the Side Menu is available in the current session.");
		System.out.println();

		boolean Side_Menu_Available = p.Side_Menu_Presence_Check();

		if(!Side_Menu_Available) {

			Report_Listen.log_print_in_report().info("──────────────────── 🔐 LOGIN REQUIRED ────────────────────");
			Report_Listen.log_print_in_report().info("<b>Action:</b> Side Menu was not detected within the short availability period. Executing Login flow.");

			System.out.println("🔐 LOGIN REQUIRED");
			System.out.println();

			System.out.println("🔹 Side Menu was not detected. Executing Login flow.");
			System.out.println();

			login();

			Report_Listen.log_print_in_report().pass("✅ Login flow completed successfully.");
			System.out.println("✅ Login flow completed successfully.");
			System.out.println();

		} else {

			Report_Listen.log_print_in_report().pass("✅ Side Menu detected successfully. Existing authenticated session will be used and Login flow will be skipped.");

			System.out.println("✅ Side Menu detected successfully.");
			System.out.println();

			System.out.println("✅ Existing authenticated session will be used. Login flow skipped.");
			System.out.println();
		}

		Report_Listen.log_print_in_report().info("──────────────────── 📂 SIDE MENU ACCESS ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve the Side Menu using the normal locator wait.");

		System.out.println("📂 SIDE MENU ACCESS");
		System.out.println();

		System.out.println("🔹 Retrieving the Side Menu.");
		System.out.println();

		p.Side_menu();

		Report_Listen.log_print_in_report().pass("✅ Side Menu retrieved successfully.");
		System.out.println("✅ Side Menu retrieved successfully.");
		System.out.println();

		Report_Listen.log_print_in_report().info("──────────────────── 📋 SIDE MENU OPTION RETRIEVAL ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Retrieve all available Side Menu options.");

		System.out.println("📋 SIDE MENU OPTION RETRIEVAL");
		System.out.println();

		System.out.println("🔹 Retrieving all available Side Menu options.");
		System.out.println();

		List<WebElement> menu_options = p.options();

		Report_Listen.log_print_in_report().info("<b>Total Available Side Menu Options:</b> " + menu_options.size());

		System.out.println("ℹ️ Total Side Menu options retrieved: " + menu_options.size());
		System.out.println();

		boolean Menu_option_found = false;

		Report_Listen.log_print_in_report().info("──────────────────── 🔎 SIDE MENU OPTION SEARCH ────────────────────");
		Report_Listen.log_print_in_report().info("<b>Action:</b> Search for the requested Side Menu option = " + menu_option);

		System.out.println("🔎 SIDE MENU OPTION SEARCH");
		System.out.println();

		System.out.println("🔹 Searching for Side Menu option: " + menu_option);
		System.out.println();

		for(WebElement option : menu_options) {

			String Available_Menu_Option = option.getText().trim();

			if(Available_Menu_Option.equalsIgnoreCase(menu_option)) {

				Report_Listen.log_print_in_report().info("──────────────────── 🖱️ SIDE MENU OPTION SELECTION ────────────────────");
				Report_Listen.log_print_in_report().info("<b>Action:</b> Matching Side Menu option found. Selecting = " + menu_option);

				System.out.println("🖱️ SIDE MENU OPTION SELECTION");
				System.out.println();

				System.out.println("🔹 Matching Side Menu option found: " + Available_Menu_Option);
				System.out.println();

				option.click();

				Menu_option_found = true;

				Report_Listen.log_print_in_report().pass("✅ Requested Side Menu option selected successfully: " + menu_option);

				System.out.println("✅ Requested Side Menu option selected successfully: " + menu_option);
				System.out.println();

				break;
			}
		}

		if(!Menu_option_found) {

			Report_Listen.log_print_in_report().warning("──────────────────── ⚠️ SIDE MENU OPTION NOT FOUND ────────────────────");
			Report_Listen.log_print_in_report().warning("<b>Warning:</b> Requested Side Menu option '" + menu_option + "' was not found among the available options.");

			System.out.println("⚠️ SIDE MENU OPTION NOT FOUND");
			System.out.println();

			System.out.println("⚠️ Requested Side Menu option was not found: " + menu_option);
			System.out.println();
		}

	} catch(Exception e) {

		if(Report_Listen.log_print_in_report() != null) Report_Listen.log_print_in_report().fail("❌ Side Menu navigation failed for option '" + menu_option + "'. Failure reason: " + e.getMessage());

		System.out.println("❌ Side Menu navigation failed for option: " + menu_option);
		System.out.println();

		System.out.println("❌ Failure reason: " + e.getMessage());
		System.out.println();

		throw e;
	}
}

}
