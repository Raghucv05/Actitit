package Actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
//		WebElement src=driver.findElement(By.id("box1"));
//		WebElement dest1=driver.findElement(By.id("dropBox"));
//		WebElement dest2=driver.findElement(By.id("dropBox2"));
//		act.dragAndDrop(src, dest1).perform();
//		Thread.sleep(2000);
//		act.dragAndDrop(src, dest2).perform();
		List<WebElement>src=driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id, 'box')]"));
		WebElement dest1=driver.findElement(By.id("dropBox"));
		WebElement dest2=driver.findElement(By.id("dropBox2"));
		for (int i=0; i<=src.size()-1; i++)
		{
			act.dragAndDrop(src.get(i), dest1).perform();
			act.dragAndDrop(src.get(i), dest2).perform();
		}

	}

}
