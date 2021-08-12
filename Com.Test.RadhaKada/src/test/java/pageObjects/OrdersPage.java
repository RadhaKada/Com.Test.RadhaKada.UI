package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.junit.Assert;

import utilities.Actions;
import utilities.WaitHelper;


public class OrdersPage {
	
public WebDriver ldriver;
WaitHelper waithelper;
	
	public OrdersPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		waithelper = new WaitHelper(ldriver);
	}
	
	By tShirt_tab = By.xpath("//*[contains(@class,'menu-content')]/child::*/a[normalize-space(text())='T-shirts']");
	By tShirt_firstItem = By.xpath("(//*[contains(@class,'product_list grid')]//*[@class='product-container'])[1]");
	By addToCart_button = By.xpath("//span[normalize-space()='Add to cart']");
	By addToCart_successMessage = By.xpath("//div[@id='layer_cart']//following::h2");
	By proceedToCheckout_cart = By.xpath("//span[normalize-space()='Proceed to checkout']");
	By prodName_text = By.xpath("//td[@class='cart_description']//p[@class='product-name']");
	By prodInfo_text = By.xpath("(//td[@class='cart_description']//a)[2]");
	By cartSummaryTitle = By.xpath("//h1[@id='cart_title']");
	By proceedtoCheckoutbtn = By.xpath("//*[contains(@class, 'cart_navigation')]//following::span[normalize-space()='Proceed to checkout']");
	By termConditionCB = By.xpath("//input[@id='cgv' and @type = 'checkbox']");
	By paybyCheckMode = By.xpath("//*[@title='Pay by check.']");
	By confirmOrder = By.xpath("//*[contains(@class, 'cart_navigation')]//following::span[normalize-space()='I confirm my order']");
	By order_successMsg = By.xpath("//p[@class='alert alert-success']");
	By orderConfMessage = By.xpath("//div[@class='box order-confirmation']");
	By backToOrders = By.xpath("//*[contains(@class, 'cart_navigation')]//following::a[normalize-space()='Back to orders']");
	By orderReference = By.xpath("//table[@id= 'order-list']/tbody/tr/td[1]/a");
	By ordersTable = By.xpath("//table[@id= 'order-list']");
	By pageTitle = By.xpath("//h1[contains(@class,'page-heading')]");
	
	
	public void clickOnTshirtTab() {
		waithelper.WaitForElement(tShirt_tab, 30);
		ldriver.findElement(tShirt_tab).click();
	}
	
	public void clickOnTshirtItem() {
		waithelper.WaitForElement(tShirt_firstItem, 30);
		ldriver.findElement(tShirt_firstItem).click();
	}
	
	public void clickOnAddtoCartbtn() {
		waithelper.WaitForElement(addToCart_button, 30);
		ldriver.findElement(addToCart_button).click();
	}
	
	public void addtoCartSuccessMessage() {
		waithelper.WaitForElement(addToCart_successMessage, 30);		
		Assert.assertEquals("Product successfully added to your shopping cart",ldriver.findElement(addToCart_successMessage).getText());		
	}
	
	public void getCartSummartTitle() {
		waithelper.WaitForElement(cartSummaryTitle, 30);		
		Assert.assertEquals("SHOPPING-CART SUMMARY",ldriver.findElement(cartSummaryTitle).getText());		
	}

	public String getProductName() {
		waithelper.WaitForElement(prodName_text, 30);
		String productName = ldriver.findElement(prodName_text).getText();
		return productName;
	}
	
	public String getProductDescription() {
		waithelper.WaitForElement(prodInfo_text, 30);
		String productInfo = ldriver.findElement(prodInfo_text).getText();
		return productInfo;
	}
	
	public void clickonProccedtoCheckoutbtn_cart() {
		waithelper.WaitForElement(proceedToCheckout_cart, 30);
		ldriver.findElement(proceedToCheckout_cart).click();
	}
	
	public void clickonProccedtoCheckoutbtn_cartSummary() {
		waithelper.WaitForElement(proceedtoCheckoutbtn, 30);
		ldriver.findElement(proceedtoCheckoutbtn).click();
	}

	public void clickOnTermCondCB() throws InterruptedException {
		
		Actions.scrollByElement(termConditionCB);
		Thread.sleep(3000);			
		ldriver.findElement(termConditionCB).click();
	}
	
	public void clickOnPaybyCheckOpt() {
		waithelper.WaitForElement(paybyCheckMode, 30);
		ldriver.findElement(paybyCheckMode).click();
	}
	
	public void clickOnConfirmOrder() {
		waithelper.WaitForElement(confirmOrder, 30);
		ldriver.findElement(confirmOrder).click();
	}
	
	public String getPageTitle() {
		waithelper.WaitForElement(pageTitle, 30);
		String pgTitle = ldriver.findElement(pageTitle).getText();
		return pgTitle;
	}
	
	public void orderSuccessMessage() {
		waithelper.WaitForElement(order_successMsg, 30);		
		Assert.assertEquals("Your order on My Store is complete.",ldriver.findElement(order_successMsg).getText());	
		System.out.println(ldriver.findElement(order_successMsg).getText());
	}
	
	public String getOrderRef() {
		
		String ordRefAct = ldriver.findElement(orderConfMessage).getText();	
		String ordRef = ordRefAct.substring(ordRefAct.indexOf("order reference")+("order reference").length(),ordRefAct.indexOf("An email"));
		System.out.println("Order Reference is " + ordRef);
		return ordRef;
	}
	
	public void clickOnBacktoOrder() {
		waithelper.WaitForElement(backToOrders, 30);
		ldriver.findElement(backToOrders).click();
	}
	
	public int getNoOfRows() {
		
		List<WebElement> ordersTableRows = ldriver.findElements(By.xpath("//table[@id= 'order-list']//tbody/tr"));
		return (ordersTableRows.size());
	}
	
	public boolean orderRefValidation() throws InterruptedException{
		
		boolean flag = false;
		
		try 
		{
		String orderRefActual = getOrderRef();			
		

		WebElement table = ldriver.findElement(By.xpath("//table[@id= 'order-list']"));
		
		for (int i = 1; i <= getNoOfRows(); i++) {
			String orderRef = table.findElement(By.xpath("//table[@id= 'order-list']//tbody/tr" + i + "]/td[1]/a"))
					.getText();					
			
			System.out.println(orderRef);

			if (orderRef.contains(orderRefActual)) {
				flag = true;
				break;
			}
		}		
		
		}
		
		catch(Exception e)
		{
			System.out.println("Unable to get order reference");
		}
		
		return flag;
	}
	
}
