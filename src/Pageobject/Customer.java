package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer 
{
WebDriver driver;
@FindBy(xpath = "//a[@class='content tasks']")
private WebElement Tasks;
@FindBy(xpath = "//a[contains(text(), 'Projects & Customers')]")
private WebElement Projects_Customers;
@FindBy(xpath = "//div[@id='ext-gen6']")
private WebElement Create_customer;
@FindBy(xpath = "//input[@name='name']")
private WebElement Customer_name;
@FindBy(xpath = "//textarea[@name='description']")
private WebElement Description;
@FindBy(xpath = "//input[@name='createCustomerSubmit']")
private WebElement Submit;
public WebElement Tasks()
{
	return Tasks;
}
public WebElement Projects_Customers()
{
	return Projects_Customers;
}
public WebElement Create_customer()
{
	return Create_customer;
}
public WebElement Customer_name() 
{
	return Customer_name;
}
public WebElement Description() 
{
	return Description;
}
public WebElement Submit()
{
	return Submit;
}
public Customer(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
