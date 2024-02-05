package Actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quiz {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		List<WebElement>elem=driver.findElements(By.xpath("//ul[@id='allItems']/li"));
		for(int i=0; i<=elem.size()-1; i++)
		{
			
			List<WebElement>box=driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']/div/ul"));
			int count=0;
			for(int j=0; j<=box.size()-1; j++)
			{
				act.clickAndHold(elem.get(j)).build().perform();
				act.moveToElement(elem.get(j)).perform();
				Thread.sleep(2000);
				act.release(box.get(i)).perform();
				Thread.sleep(2000);
				if(elem.get(j).getCssValue("Background").contains("rgb(0,255,0)"))
				{
					count++;
					if(count>3)
					{
						break;
					}
					else
					{
						continue;
					}
				}
				else
				{
					act.clickAndHold(elem.get(j)).build().perform();
					act.moveToElement(elem.get(j)).perform();
					Thread.sleep(2000);
					WebElement allitems=driver.findElement(By.xpath("//ul[@id='allItems']"));
					act.release(allitems).perform();
				}
			}
		}

	}

}
