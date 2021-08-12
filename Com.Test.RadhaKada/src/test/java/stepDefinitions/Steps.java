package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.junit.Assert; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import pageObjects.OrdersPage;


public class Steps extends BaseClass {
	
	@Before
	public void setup() throws IOException
	{
		
		//Load properties file
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String br=configProp.getProperty("browser");
		
		//Launching browser
		if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}

		else if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}
		
		/*-----Logging for future use-------*/
		//logger=Logger.getLogger("eCommerceCucumberAutomation");
		//PropertyConfigurator.configure("Log4j.properties");
		//logger.setLevel(Level.DEBUG);	
		
	}
	
	@After
	public void teardown() {		
		login.clickSignout();		
		driver.close();   
		driver.quit();
		
	}

	@Given("user launch the browser")
	public void user_launch_the_browser() {		
		login=new LoginPage(driver);
	}

	@When("user opens URL")
	public void user_opens_URL() {		
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();		
	}
	
	@And("navigate to signin page")
	public void navigate_to_signin_page() {		
		login.signInPage();
	}

	@And("user enter emailId and password")
	public void user_enter_emailId_and_password() {		
		login.setEmailId(configProp.getProperty("emailid"));
		login.setPassword(configProp.getProperty("password"));
	}

	@And("click on login")
	public void click_on_login() {		
		login.clickSignin();
	}

	@Then("page landed to My account on successful login")
	public void page_landed_to_My_account_on_successful_login() throws InterruptedException {		
		
		if(login.homePageValidation().contains("Logged In"))
		{			
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{			
			Assert.assertEquals("MY ACCOUNT",login.homePageValidation());
		}
		
		Thread.sleep(3000);
	}
	
	/* Steps for Scenario :  Order T-Shirt and verify in order history  */
	
	@When("user clicks on T-shirt menu")
	public void user_clicks_on_T_shirt_menu() {
		orders=new OrdersPage(driver);
		orders.clickOnTshirtTab();
	    
	}

	@And("click on T-shirt item")
	public void click_on_T_shirt_item() {
		orders.clickOnTshirtItem();
	    
	}
	
	@And("user clicks on Add to Cart")
	public void user_clicks_on_Add_to_Cart() {
		orders.clickOnAddtoCartbtn();
	}

	@Then("user can view cart success message")
	public void user_can_view_cart_success_message() throws InterruptedException{
		try {
			
			orders.addtoCartSuccessMessage();			
		}
		catch(Exception e) {
			System.out.println("No Product is added to your shopping cart");
		}
	}
	
	@When("user clicks on Proceed to Checkout")
	public void user_clicks_on_Proceed_to_Checkout() {
		 orders.clickonProccedtoCheckoutbtn_cart();
	}
	
	@Then("user can view Shopping-Cart Summary page")
	public void user_can_view_Shopping_Cart_Summary_page() {
	    
	}

	@When("user clicks on Proceed to Checkout from Shopping-Cart Summary page")
	public void user_clicks_on_Proceed_to_Checkout_from_Shopping_Cart_Summary_page() {
		orders.clickonProccedtoCheckoutbtn_cartSummary();
	}

	@And("user clicks on Proceed to Checkout from Addresses page")
	public void user_clicks_on_Proceed_to_Checkout_from_Addresses_page() throws InterruptedException {
		orders.clickonProccedtoCheckoutbtn_cartSummary();
		Thread.sleep(3000);
	}

	@And("user clicks on Terms and Conditions checkbox from Shipping page")
	public void user_clicks_on_Terms_and_Conditions_checkbox_from_Shipping_page() throws InterruptedException {
	    orders.clickOnTermCondCB();
	}

	@And("user clicks on Proceed to Checkout from Shipping page")
	public void user_clicks_on_Proceed_to_Checkout_from_Shipping_page() {
		orders.clickonProccedtoCheckoutbtn_cartSummary();
	}

	@And("user clicks on Pay by Check mode of payment from Payment page")
	public void user_clicks_on_Pay_by_Check_mode_of_payment_from_Payment_page() {
		orders.clickOnPaybyCheckOpt();
	}

	@And("user clicks on Confirm order")
	public void user_clicks_on_Confirm_order() {
		orders.clickOnConfirmOrder();
	}

	@Then("user can view Order Confirmation page")
	public void user_can_view_Order_Confirmation_page() throws InterruptedException{
		try {
			
			Assert.assertEquals("ORDER CONFIRMATION",orders.getPageTitle());	
			System.out.println(orders.getPageTitle());
		}
		catch(Exception e) {
			
			System.out.println("User unable to view Order Confirmation page");
		}
	}

	@And("user can view Order completion message")
	public void user_can_view_Order_completion_message() {
		try {
			
			orders.orderSuccessMessage();			
		}
		catch(Exception e) {
			
			System.out.println("Your order is not completed");
		}
	}

	@When("user get an order reference code from order confirmation page")
	public void user_get_an_order_reference_code_from_order_confirmation_page() {
		System.out.println(orders.getOrderRef());
	}

	@And("user click on back to orders")
	public void user_click_on_back_to_orders() {
		orders.clickOnBacktoOrder();
	}

	@Then("user can view Order history page")
	public void user_can_view_Order_history_page() throws InterruptedException{
		try {
			
			Assert.assertEquals("ORDER HISTORY",orders.getPageTitle());
				
		}
		catch(Exception e) {
			
			System.out.println("User unable to view Order Confirmation page");
		}
	}

	@And("order is displayed in order history table")
	public void order_is_displayed_in_order_history_table() throws InterruptedException {
		try {
			
			boolean status=orders.orderRefValidation();
			Assert.assertEquals(true, status);
		}
		catch(Exception e)
		{
			System.out.println("Order reference found missing!");
		}
	}


	/* Steps for Scenario :  Update First Name from MyAccount  */

	@When("user click on account name")
	public void user_click_on_account_name() {
		account = new MyAccount(driver);
		account.clickOnAccountName();
	}

	@And("clicks on Personal Information")
	public void clicks_on_Personal_Information() {
		account.clickOnPersonalInfo();
	}

	@Then("user can view Account information page")
	public void user_can_view_Account_information_page() throws InterruptedException {
		
		if(account.accountPageValidation().contains("MY ACCOUNT"))
		{					
			Assert.assertTrue(false);
		}
		else
		{			
			Assert.assertEquals("YOUR PERSONAL INFORMATION",account.accountPageValidation());
		}
	}

	@When("user edit first name")
	public void user_edit_first_name() {
	    account.editFirstName(configProp.getProperty("firstName"));
	}
	
	@And("user enter current password")
	public void user_enter_current_password() {
		account.enterCurrentPassword(configProp.getProperty("password"));
	}

	@And("clicks on Save")
	public void clicks_on_Save() {
	    account.clickOnSave();
	}

	@Then("Personal Information is updated successfully")
	public void personal_Information_is_updated_successfully() throws InterruptedException {
		
		try
		{
			
			if(account.updateAccountValidation().contains("ERROR"))
			{				
				Assert.assertTrue(false);
			} 
			else
			{				
				Assert.assertEquals("Your personal information has been successfully updated.",account.updateAccountValidation());
			}			
					
		}
		catch(Exception e)
		{			
			Assert.assertEquals(false,account.updateAccountValidation());
		}		
		
	}

}
