package Actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sugg 
{
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.sendKeys("cog").perform();
		Thread.sleep(2000);
		Robot rbt=new Robot();
		List<WebElement>l=driver.findElements(By.xpath("//span[contains(text(),'cog')]"));
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_DOWN);
		for(int i=0;i<=l.size()-1; i++)
		{
			if(l.get(i).getText().equals("cognizant news"))
			{
				rbt.keyPress(KeyEvent.VK_ENTER);
				break;
			}
			else
			{
				rbt.keyPress(KeyEvent.VK_DOWN);
			}
		}

	}

}
