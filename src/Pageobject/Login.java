package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
WebDriver driver;
@FindBy(id="username")
private WebElement username;
@FindBy(name="pwd")
private WebElement password;
@FindBy(id="loginButton")
private WebElement loginButton;
public WebElement username()
{
	return username;
}
public WebElement password()
{
	return password;
}
public WebElement loginButton()
{
	return loginButton;
}
public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
