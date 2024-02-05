package Actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cale {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		WebElement departure=driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']"));
		act.click(departure).perform();
		int i=1;
		while(i<=12)
		{
			try
			{
				driver.findElement(By.xpath("//div[@aria-label='Tue Dec 24 2024']")).click();
			}
			catch (Throwable t) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			i++;
			
		}

	}

}
