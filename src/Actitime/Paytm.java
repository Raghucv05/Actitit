package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		WebElement consumer=driver.findElement(By.xpath("//a[contains(text(), 'Paytm for Consumer')]"));
		Actions act=new Actions(driver);
		act.moveToElement(consumer).perform();
		Thread.sleep(2000);
		WebElement ticket=driver.findElement(By.xpath("//div[@class='_3y5vS DK57R']//div[@class='_2dve7']"));
		act.moveToElement(ticket).perform();

	}

}
