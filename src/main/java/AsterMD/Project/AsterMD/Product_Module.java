package AsterMD.Project.AsterMD;

import java.util.List;
import com.aventstack.extentreports.ExtentTest;

import Listerners.Report_Listen;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locaters.Product_Module_Locaters;

public class Product_Module extends Side_Menu_Navigator{

	
	@Test
public void Product_Module_Accessor() throws Exception {
	ExtentTest log = Report_Listen.log_print_in_report();
	int step = 1;

	log.info("Product Module Step " + step + ": Initializing Product Module locators.");
	System.out.println("🔹 Product Module Step " + step + ": Initializing Product Module locators.");

	Product_Module_Locaters p = new Product_Module_Locaters(d);
	step++;

	log.info("Product Module Step " + step + ": Navigating to the Catalog option through the side menu.");
	System.out.println("🔹 Product Module Step " + step + ": Navigating to the Catalog option through the side menu.");

	Side_Menu_Navigation("Catalog");

	log.pass("Catalog side-menu navigation flow completed.");
	System.out.println("✅ Catalog side-menu navigation flow completed.");
	step++;

	log.info("Product Module Step " + step + ": Verifying the Product Module top navigation bar.");
	System.out.println("🔹 Product Module Step " + step + ": Verifying the Product Module top navigation bar.");

	p.Top_Navigation_bar();

	log.pass("Product Module top navigation bar verified successfully.");
	System.out.println("✅ Product Module top navigation bar verified successfully.");
	step++;

	log.info("Product Module Step " + step + ": Retrieving the Product Add button.");
	System.out.println("🔹 Product Module Step " + step + ": Retrieving the Product Add button.");

	WebElement Product_Add = p.Product_Add_Button();

	log.pass("Product Add button retrieved successfully.");
	System.out.println("✅ Product Add button retrieved successfully.");
	step++;

	log.info("Product Module Step " + step + ": Clicking the Product Add button.");
	System.out.println("🔹 Product Module Step " + step + ": Clicking the Product Add button.");

	Product_Add.click();

	log.pass("Product Add button clicked successfully.");
	System.out.println("✅ Product Add button clicked successfully.");
	step++;

	log.info("Product Module Step " + step + ": Retrieving the Product Add form input fields.");
	System.out.println("🔹 Product Module Step " + step + ": Retrieving the Product Add form input fields.");

	List<WebElement> Inputs = p.Form_Inputs();

	log.pass("Product Add form input fields retrieved successfully. Total inputs found: " + Inputs.size());
	System.out.println("✅ Product Add form input fields retrieved successfully. Total inputs found: " + Inputs.size());
}
	
	
}
