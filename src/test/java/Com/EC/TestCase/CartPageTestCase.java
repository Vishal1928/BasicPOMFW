package Com.EC.TestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.EC.BaseClass.BaseClass;
import Com.EC.PageObject.CartPage;

@Listeners(Com.EC.Utility.ListernersClass.class)
public class CartPageTestCase extends BaseClass{

	CartPage cart;
	@Test
	public void checkOutPage() {
		cart = new CartPage();
		cart.verifyTextPresent();
		cart.checkBoxTermAndCondition();
		cart.clickCheckOutButton();
	}
}
