package Actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		List<WebElement>src=driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box')]"));
		WebElement dest=driver.findElement(By.id("dropBox"));
		for(int i=0; i<=src.size()-1; i++)
		{
			act.clickAndHold(src.get(i)).build().perform();
			Thread.sleep(2000);
			act.moveToElement(src.get(i)).build().perform();
			Thread.sleep(2000);
			act.release(dest).build().perform();
		}
		

	}

}
