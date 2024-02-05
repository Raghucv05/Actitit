package TestScripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.Customer;
import Utility.Capturescreenshot;

public class Customer1 extends Base1
{
	@Test(dataProvider = "createcustomer",dataProviderClass = 
			Dataprovider.Customer.class)
	public void verify_create_customer(String Customer_name, String Customer_description) throws InterruptedException, IOException
	{
		Customer cust=new Customer(driver);
		cust.Tasks().click();
		Thread.sleep(2000);
		cust.Projects_Customers().click();
		Thread.sleep(2000);
		cust.Create_customer().click();
		Thread.sleep(2000);
		cust.Customer_name().sendKeys(Customer_name);
		Thread.sleep(2000);
		cust.Description().sendKeys(Customer_description);
		Thread.sleep(2000);
		cust.Submit().click();
		new Capturescreenshot().Windowscreenshot("Customercreation_"+Customer_name,driver);
		log.info("Customercreation_"+Customer_name+"Successfull");
		
		
	}
	
}
