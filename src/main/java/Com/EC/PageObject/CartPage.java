package Com.EC.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EC.BaseClass.BaseClass;
import Com.EC.actionDriver.Action;

public class CartPage extends BaseClass {

	Action action = new Action();
	
	@FindBy(xpath = "//input[@id='itemquantity11228']")
	private WebElement verifyQuantity;
	
	@FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    private WebElement textPresent;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement acceptTermAndCondition;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOutBtn;
	
	public CartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	public void verifyAddedQuantity() {
		
	}
	
	public void verifyTextPresent() {
		action.isDisplayed(getDriver(), textPresent);
	}
	
	public void checkBoxTermAndCondition() {
		action.click(getDriver(), acceptTermAndCondition);
	}
	
	public void clickCheckOutButton() {
		action.click(getDriver(), checkOutBtn);
	}
}
