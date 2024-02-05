package Actitime;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jo
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement users=driver.findElement(By.xpath("//a[@class='content users']"));
		act.contextClick(users).perform();
		Thread.sleep(2000);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String parent_id=it.next();
		String child_id=it.next();
		driver.switchTo().window(child_id);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='roundedBoxTag graphicButton button']")).click();
		
			

	}

}
