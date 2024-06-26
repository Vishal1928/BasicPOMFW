package Com.EC.PageObject;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EC.BaseClass.BaseClass;
import Com.EC.PageObject.SearchProductResultPage;
import actionDriver.Action;

public class HomePage extends BaseClass{

	Action action = new Action();
		
	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//body/div[6]/div[1]//img[1]")
	private WebElement companyLog;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement addTocart;
	
	@FindBy(xpath = "//a[@class='button-1 register-continue-button']")
	private WebElement clicOncontinueBtn;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean validateLogo() throws Throwable {
		return action.isDisplayed(getDriver(), companyLog);
	}
	
	public SearchProductResultPage searchProduct(String productName) throws Throwable {
		action.type(searchTextBox, productName);
		action.click(getDriver(), searchBtn);
		action.scrollByVisibilityOfElement(getDriver(), addTocart);
		Thread.sleep(3000);
		action.click(getDriver(), addTocart);
		Thread.sleep(3000);
		return new SearchProductResultPage();
	}
	
}
