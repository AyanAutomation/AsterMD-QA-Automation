package Negative_Testcases;

import java.io.IOException;
import java.util.TreeMap;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import AsterMD.Project.AsterMD.Base;
import AsterMD.Project.AsterMD.Data_Reader;
import Locaters.Login_Locaters;

@Listeners(Listerners.Report_Listen.class)
public class Login_negative_testcases extends Base {

	@Test(dataProvider = "login_datas")
	public void login_validation(TreeMap<String,String> val) {
		Login_Locaters l = new Login_Locaters(d);
		String Login_id = val.get("id");
		String Pass = val.get("pass");

		d.get(Target_url);
		l.Landed_in_Login_Page();
		l.id_field().sendKeys(Login_id);
		l.password_field().sendKeys(Pass);
		l.Login_button().click();
		WebElement errorAlert = l.Login_error_alert();
		String Error_message = errorAlert.getText();
		Assert.assertFalse(Error_message.isBlank(), "An error message should be displayed for invalid login data.");
	}

	@DataProvider
	public Object[][] login_datas() throws IOException {
		Data_Reader f = new Data_Reader();

		TreeMap<String,String> lg1 = new TreeMap<String,String>();
		lg1.put("id", f.Data_Fetcher("Login_id"));
		lg1.put("pass", "InvalidPassword22355");

		TreeMap<String,String> lg2 = new TreeMap<String,String>();
		lg2.put("id", "invalid.astermd.user@example.com");
		lg2.put("pass", f.Data_Fetcher("Pass"));

		TreeMap<String,String> lg3 = new TreeMap<String,String>();
		lg3.put("id", "invalid.astermd.user@example.com");
		lg3.put("pass", "InvalidPassword4455");

		return new Object[][] {{lg1}, {lg2}, {lg3}};
	}
}
