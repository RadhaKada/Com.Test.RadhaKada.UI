package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;


public class LoginPage {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper = new WaitHelper(ldriver);
	}
	
	@FindBy(how = How.XPATH, using = "//a[@title= 'Log in to your customer account']")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'email' and @type ='text']")
	@CacheLookup
	WebElement emailId;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'passwd' and @type ='password']")
	@CacheLookup
	WebElement passwd;
	
	@FindBy(how = How.XPATH, using = "//button[@id = 'SubmitLogin' and @type ='submit']")
	@CacheLookup
	WebElement userSignin;	
	
	@FindBy(how = How.XPATH, using = "//h1[@class='page-heading']")
	@CacheLookup
	WebElement homePageTitle;	
	
	@FindBy(how = How.XPATH, using = "//a[@class = 'logout' and @title = 'Log me out']")
	@CacheLookup
	WebElement signOut;	
	
	public void signInPage() {
		waithelper.WaitForElement(signIn, 30);
		signIn.click();		
	}
	
	public void setEmailId(String email) {
		waithelper.WaitForElement(emailId, 30);
		emailId.clear();
		emailId.sendKeys(email);
	}

	public void setPassword(String password) {
		waithelper.WaitForElement(passwd, 30);
		passwd.clear();
		passwd.sendKeys(password);
	}

	public void clickSignin() {
		waithelper.WaitForElement(userSignin, 30);
		userSignin.click();
	}

	public void clickSignout() {
		waithelper.WaitForElement(signOut, 30);
		signOut.click();
	}
	
		
	public String homePageValidation() {
		
		String homepageTitle = homePageTitle.getText();
		
		return homepageTitle;
		
	}
}
