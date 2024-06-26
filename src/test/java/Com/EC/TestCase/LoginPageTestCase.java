package Com.EC.TestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.EC.BaseClass.BaseClass;
import Com.EC.PageObject.LoginPage;

@Listeners(Com.EC.Utility.ListernersClass.class)
public class LoginPageTestCase extends BaseClass {
	
	public LoginPage login1;

	@Test
	public void loginFunctionality() throws InterruptedException  {
	login1 = new LoginPage();
	login1.verifyLogin(prop.getProperty("uname"),prop.getProperty("pswd"));
	//	login1.verifyLogin(prop.getProperty("uname"),prop.getProperty("pwsd"));
	}

}
