package AsterMD.Project.AsterMD;

import java.util.List;

import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.ExtentTest;

import Listerners.Report_Listen;
import Locaters.Side_menu_locaters;

public class Side_Menu_Navigator extends Login{
	
	
	public void Side_Menu_Navigation(String menu_option) throws Exception {
	ExtentTest log = Report_Listen.log_print_in_report();
	int step = 1;

	log.info("Side Menu Step " + step + ": Initializing side-menu locators.");
	System.out.println("🔹 Side Menu Step " + step + ": Initializing side-menu locators.");

	Side_menu_locaters p = new Side_menu_locaters(d);
	step++;

	log.info("Side Menu Step " + step + ": Checking whether the side menu is already accessible.");
	System.out.println("🔹 Side Menu Step " + step + ": Checking whether the side menu is already accessible.");

	try {
		p.Side_menu();

		log.pass("Side menu is already accessible. Additional login is not required.");
		System.out.println("✅ Side menu is already accessible. Additional login is not required.");
	} catch (Exception mm) {
		log.warning("Side menu was not accessible. Login flow will now be executed.");
		System.out.println("⚠️ Side menu was not accessible. Login flow will now be executed.");

		if (mm.getMessage() != null) {
			log.info("Initial side-menu access failure details: " + mm.getMessage());
			System.out.println("ℹ️ Initial side-menu access failure details: " + mm.getMessage());
		}

		login();

		log.info("Side Menu Step " + step + ": Login flow completed. Rechecking side-menu availability.");
		System.out.println("🔹 Side Menu Step " + step + ": Login flow completed. Rechecking side-menu availability.");

		p.Side_menu();

		log.pass("Side menu became accessible after login.");
		System.out.println("✅ Side menu became accessible after login.");
	}
	step++;

	log.info("Side Menu Step " + step + ": Retrieving all available side-menu options.");
	System.out.println("🔹 Side Menu Step " + step + ": Retrieving all available side-menu options.");

	List<WebElement> menu_options = p.options();

	log.info("Total side-menu options retrieved: " + menu_options.size());
	System.out.println("ℹ️ Total side-menu options retrieved: " + menu_options.size());
	step++;

	boolean Menu_option_found = false;

	log.info("Side Menu Step " + step + ": Searching for the requested menu option: " + menu_option);
	System.out.println("🔹 Side Menu Step " + step + ": Searching for the requested menu option: " + menu_option);

	for (WebElement option : menu_options) {
		if (option.getText().equalsIgnoreCase(menu_option)) {
			log.info("Matching side-menu option found: " + option.getText());
			System.out.println("🔹 Matching side-menu option found: " + option.getText());

			option.click();
			Menu_option_found = true;

			log.pass("Requested side-menu option clicked successfully: " + menu_option);
			System.out.println("✅ Requested side-menu option clicked successfully: " + menu_option);
			break;
		}
	}

	if (!Menu_option_found) {
		log.warning("Requested side-menu option was not found among the available options: " + menu_option);
		System.out.println("⚠️ Requested side-menu option was not found among the available options: " + menu_option);
	}
}

}
