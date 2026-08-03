package AsterMD.Project.AsterMD;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locaters.Login_Locaters;
import Locaters.Logout_locaters;

@Listeners(Listerners.Report_Listen.class)
public class Logout extends Base {

	@Test
	public void logout() throws IOException {
		Login_Locaters lgin = new Login_Locaters(d);
		Logout_locaters lg = new Logout_locaters(d);
		Data_Reader f = new Data_Reader();
		String Login_id = f.Data_Fetcher("Login_id");
		String Pass = f.Data_Fetcher("Pass");

		d.get(Target_url);
		lgin.Landed_in_Login_Page();;
		lgin.id_field().sendKeys(Login_id);
		lgin.password_field().sendKeys(Pass);
		lgin.Login_button().click();
		lgin.login_confirmation();
		lg.logout_button().click();
		lg.logout_confirmation();
	}
}
