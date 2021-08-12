package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelper;

public class MyAccount {
	
	public WebDriver ldriver;
	WaitHelper waithelper;
	
	public MyAccount(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper = new WaitHelper(ldriver);
	}
		
	By accountName = By.xpath("//a[@title = 'View my customer account' and @class = 'account']");
	By personalInformation = By.xpath("//a[@title = 'Information']");
	By myAccountPageTitle = By.xpath("//h1[@class='page-subheading']");
	By firstName = By.xpath("//input[@id= 'firstname' and @type = 'text']");
	By save = By.xpath("//button[@name= 'submitIdentity' and @type = 'submit']");
	By acctSuccessMessage = By.xpath("//p[@class='alert alert-success']");
	By acctFailureMessage = By.xpath("//div[@class='alert alert-danger']");
	By currentPassword = By.xpath("//input[@id='old_passwd']");
	
	public void clickOnAccountName() {
		waithelper.WaitForElement(accountName, 30);
		ldriver.findElement(accountName).click();
	}

	public void clickOnPersonalInfo() {
		waithelper.WaitForElement(personalInformation, 30);
		ldriver.findElement(personalInformation).click();
	}
	
	public String accountPageValidation() {
		waithelper.WaitForElement(myAccountPageTitle, 30);
		String accountPageTitle = ldriver.findElement(myAccountPageTitle).getText();
		
		return accountPageTitle;
		
	}
	
	public void editFirstName(String fstName) {
		waithelper.WaitForElement(firstName, 30);
		ldriver.findElement(firstName).sendKeys(fstName);
	}
	
	public void enterCurrentPassword(String currPwd) {
		waithelper.WaitForElement(currentPassword, 30);
		ldriver.findElement(currentPassword).sendKeys(currPwd);
	}
	
	public void clickOnSave() {
		waithelper.WaitForElement(save, 30);
		ldriver.findElement(save).click();
	}	
		
	public String updateAccountValidation() {					
		
	    String successAlertMsg = ldriver.findElement(acctSuccessMessage).getText();
		System.out.println(successAlertMsg);
		
		return successAlertMsg;
			
	}
		
		
}
