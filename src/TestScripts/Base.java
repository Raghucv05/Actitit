package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base 
{
WebDriver driver=null;
@BeforeMethod
public void login() throws InterruptedException
{
	
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
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
