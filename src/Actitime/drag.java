package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/dg-crop/dg-crop.html");
		driver.manage().window().maximize();
		WebElement drg=driver.findElement(By.className("dg-movable"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(drg, 200, 200).perform();

	}

}
