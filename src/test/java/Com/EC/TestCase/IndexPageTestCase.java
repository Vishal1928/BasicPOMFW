package Com.EC.TestCase;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.EC.BaseClass.BaseClass;
import Com.EC.PageObject.IndexPage;

@Listeners(Com.EC.Utility.ListernersClass.class)
public class IndexPageTestCase extends BaseClass {
	
	IndexPage index;
	
/*	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser); 
	} */
	
	@Test
	public void verifyALLHyperlinkOnIndexPage() throws Throwable {
		index = new IndexPage();
		index.validateLogo();
		index.verifyRegisterHyperLink();
		index.verifyLoginHyperLink();
		index.verifyWhisListHyperLink();
		index.verifyShoppingCartHyperLink();
	}

	@Test
	public void clickOnLoginLink() throws Throwable {
		index = new IndexPage();
		System.out.println("Click on login hyperlink");
		index.clickOnSignIn();
	}
	
}
