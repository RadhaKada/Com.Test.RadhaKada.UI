package stepDefinitions;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import pageObjects.OrdersPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage login;
	public MyAccount account;
	public OrdersPage orders;
	public static Logger logger;
	public Properties configProp;
	
	

}
