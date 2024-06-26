package Com.EC.TestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.EC.BaseClass.BaseClass;
import Com.EC.PageObject.SearchProductResultPage;

@Listeners(Com.EC.Utility.ListernersClass.class)
public class SearchProductResultPageTestCase extends BaseClass {
	
	SearchProductResultPage productpage;
	@Test
	public void enterNumberQuantity() {
		productpage = new SearchProductResultPage();
		productpage.clickOnAddToCartBtn();
		productpage.verifyImageLoaded();
	//	productpage.verifyPopMessageOfProduct();
		productpage.closeAlert();
		productpage.clickOnShoppingCart();
	
	}

}
