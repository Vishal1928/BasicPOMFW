package Com.EC.TestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.EC.BaseClass.BaseClass;
import Com.EC.PageObject.HomePage;

@Listeners(Com.EC.Utility.ListernersClass.class)
public class HomePageTestCase extends BaseClass{

	HomePage home;
		
	@Test
	private void verifyCompanyImage() throws Throwable {
		home.validateLogo();
	}
	
	@Test
	public void searchProductName() throws Throwable {
		home= new HomePage();
		home.searchProduct(prop.getProperty("productName"));
	}
}
