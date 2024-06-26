package Com.EC.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EC.BaseClass.BaseClass;
import actionDriver.Action;

public class SearchProductResultPage extends BaseClass {

	Action action = new Action();
	
	@FindBy(xpath = "//img[@id='main-product-img-4']" )
	private WebElement productImageLoaded;
	
	@FindBy(xpath = "//input[@id='product_enteredQuantity_4']")
	private WebElement enterQuantity;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-4']")
	private WebElement clickOnFinalAddToCart;
	
	@FindBy(xpath = "//p[@class='content']")
	private WebElement messageOfProductGetAdded;
	
	@FindBy(xpath = "//span[@class='close']")
	private WebElement closePopAlert;
	
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	private WebElement shoppingCartList;
	
	public SearchProductResultPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickOnAddToCartBtn() {
		action.scrollByVisibilityOfElement(getDriver(), enterQuantity);
		//action.scrollByVisibilityOfElement(getDriver(), clickOnFinalAddToCart);
		action.type(enterQuantity,prop.getProperty("enterNumber"));
		action.click(getDriver(), clickOnFinalAddToCart);
		
	}
	
	public void verifyImageLoaded() {
		action.isDisplayed(getDriver(), productImageLoaded);
	}
	
	public void verifyPopMessageOfProduct() {
		action.isAlertPresent(getDriver());
	}
	
	public void closeAlert() {
		action.click(getDriver(), closePopAlert);
	}
	
	public CartPage clickOnShoppingCart() {
		action.click(getDriver(), shoppingCartList);
		return new CartPage();
	}
}
