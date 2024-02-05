package Actitime;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webele {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement un=driver.findElement(By.id("username"));
		WebElement pw=driver.findElement(By.name("pwd"));
		WebElement lgn=driver.findElement(By.id("loginButton"));
		Thread.sleep(2000);
		un.sendKeys("admin");
//		File src=un.getScreenshotAs(OutputType.FILE);
//		File dest=new File("D:\\Raghu_repet\\SS\\ss1.jpg");
//		FileUtils.copyFile(src, dest);
		
		pw.sendKeys("manager");
		lgn.click();
		Thread.sleep(2000);
//		TakesScreenshot screenshot=(TakesScreenshot)driver;
//		File src=screenshot.getScreenshotAs(OutputType.FILE);
//		File dest=new File("D:\\Raghu_repet\\SS\\ss1.jpg");
//		FileUtils.copyFile(src, dest);
		
//		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("//a[contains(text(), 'Archives')]")).click();
//Enable or not//		if(!driver.findElement(By.xpath("//input[@name='taskSelected[39]']")).isEnabled());
//		{
//			driver.findElement(By.id("//input[@name='taskSelected[39]']")).click();
//			System.out.println(driver.findElement(By.name("//input[@name='taskSelected[39]']")).isEnabled());
//		}
		//WebElement task=driver.findElement(By.xpath("//a[@class='content tasks']"));
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(text(), 'Projects & Customers')]")).click();
//		
//		WebElement project=driver.findElement(By.xpath("//select[@name='selectedCustomer']"));
//		Select sel=new Select(project);
//		//sel.selectByVisibleText("aaaa");
//		List<WebElement>l1=sel.getOptions();
//		for(int i=0; i<=l1.size()-1; i++)
//		{
//			System.out.println(l1.get(i).getText());
//		}
//Actions act=new Actions(driver);
//act.moveToElement(task).perform();
//act.contextClick().perform();
//		driver.findElement(By.xpath("//a[@class='content users']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody[1]/tr[3]/td[4]/div[1]/a[2]/img[1]")).click();
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}

}
