package Com.EC.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EC.BaseClass.BaseClass;
import actionDriver.Action;


public class LoginPage extends BaseClass {
	
	Action action = new Action();
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Register')]")
	private WebElement registerLink;
	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(),this);
	}
	
/*	public RegisterPage clickOnRegisterLink() throws Throwable {
		action.fluentWait(getDriver(), registerLink, 10);
		action.click(getDriver(), registerLink);
		return new RegisterPage();
	}*/
	
	public void verifyLogin(String username, String password) throws InterruptedException{

		action.scrollByVisibilityOfElement(getDriver(), emailTextBox);
		action.type(emailTextBox, username);
		action.type(passwordTextBox,password);
		action.fluentWait(getDriver(), passwordTextBox, 10);
		action.JSClick(getDriver(), loginBtn);
		Thread.sleep(2000);
		
	}


		// TODO Auto-generated method stub
		
	

}
