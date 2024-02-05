package TestScripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import Pageobject.Login;

public class Base1 
{
WebDriver driver=null;
public Logger log=Logger.getLogger("devpinoyLogger");
SoftAssert sft=new SoftAssert();
@BeforeMethod
public void login() throws InterruptedException
{

	driver.manage().window().maximize();
	Login lgn=new Login(driver);
	lgn.username().sendKeys("admin");
	lgn.password().sendKeys("manager");
	lgn.loginButton().click();
	//Assert.assertEquals(driver.getTitle(), "actiTIME -  Enter Time-Track");
	Thread.sleep(4000);
}
@AfterMethod
public void logout()
{
	driver.findElement(By.xpath("//a[@class='logout']")).click();
}
@BeforeClass
public void launchbrowser()
{
	driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
}
@AfterClass
public void closebrowser()
{
	driver.close();
}
@BeforeTest
public void verify_dbconnection()
{
	System.out.println("db connection was successfull");
}
@AfterTest
public void close_dbconnection()
{
	System.out.println("close_dbconnection");
}
}
