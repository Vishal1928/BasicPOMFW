package Com.EC.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EC.BaseClass.BaseClass;
import actionDriver.Action;


public class IndexPage extends BaseClass{
Action action = new Action();
	
	
	@FindBy(xpath="//a[@class='ico-register']")
	private WebElement registerLink;
	
	@FindBy(xpath="//a[@class='ico-login']")
	private WebElement loginLink;
	
	@FindBy(xpath="//span[@class='wishlist-label']")
	private WebElement wishList;
	
	@FindBy(xpath="//span[@class='cart-label']")
	private WebElement shoppingcart;
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchBtn;
	
	@FindBy(xpath=" //ul[@class='top-menu notmobile']")
	private WebElement mainMenu;
	
	@FindBy(xpath="//body/div[6]/div[1]//img[1]")
	private WebElement companyLog;

	//String firstMenu = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"; 
	//String subMenuOfComputer = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']";
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public LoginPage clickOnSignIn() throws Throwable {
		action.fluentWait(getDriver(), loginLink, 10);
		action.click(getDriver(), loginLink);
		return new LoginPage();
	
	}
	
	public IndexPage verifyRegisterHyperLink() {
		action.isEnabled(getDriver(), registerLink);
		return new IndexPage();
	}
	
	public IndexPage verifyLoginHyperLink() {
		action.isEnabled(getDriver(), loginLink);
		return new IndexPage();
	}
	
	public IndexPage verifyWhisListHyperLink() {
		action.isEnabled(getDriver(), wishList);
		return new IndexPage();
	}
	
	public IndexPage verifyShoppingCartHyperLink() {
		action.isEnabled(getDriver(), shoppingcart);
		return new IndexPage();
	}
	
	
	public boolean validateLogo() throws Throwable {
		return action.isDisplayed(getDriver(), companyLog);
	}
	
	public String getMyStoreTitle() {
		String eCommerceTitel=getDriver().getTitle();
		return eCommerceTitel;
	}
	
	public String getCurrURL() throws Throwable {
		String homePageURL=action.getCurrentURL(getDriver());
		return homePageURL;
	}
	public SearchProductResultPage searchProduct(String productName) throws Throwable {
		action.type(searchTextBox, productName);
		action.scrollByVisibilityOfElement(getDriver(), searchBtn);
		action.click(getDriver(), searchBtn);
		Thread.sleep(3000);
		return new SearchProductResultPage();
	}
	

	public RegisterPage clickOnRegisterLink() throws Throwable {
		action.fluentWait(getDriver(), registerLink, 10);
		action.click(getDriver(), registerLink);
		return new RegisterPage();
	}
}
